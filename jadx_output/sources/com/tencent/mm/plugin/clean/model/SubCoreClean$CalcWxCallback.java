package com.tencent.mm.plugin.clean.model;

@com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Idle
@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnLowEnergy
/* loaded from: classes12.dex */
public class SubCoreClean$CalcWxCallback extends ob0.d implements ob0.a {
    private static final java.lang.String SERIAL_LIFECYCLE = "MicroMsg.SubCoreClean.CalcWxCallback";
    private static final java.lang.String SERIAL_SERVICE_TASK = "MicroMsg.SubCoreClean.CalcWxCallback.Task";
    private volatile boolean mIsCanceled;
    private volatile int mWorkerTid;

    public SubCoreClean$CalcWxCallback() {
        super("CalcWx");
        this.mIsCanceled = false;
        this.mWorkerTid = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLowEnergy$3() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-1 onLowEnergy");
            if (this.mWorkerTid > 0) {
                tryRunWithLowEnergyMode(this.mWorkerTid);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onResume$0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-3 prepare");
        bw1.u.wi().requireAccountInitialized();
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.e eVar = mt1.b0.f331195e;
        if (eVar != null) {
            eVar.a();
        }
        synchronized (this) {
            if (this.mIsCanceled) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-4 skip: canceled");
                return;
            }
            this.mWorkerTid = android.os.Process.myTid();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-5 triggerCalc on worker thread: " + this.mWorkerTid);
            tryRunWithLowEnergyMode(this.mWorkerTid);
            b0Var.x();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-* done");
            this.mWorkerTid = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$1() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-1 couldResume");
            this.mIsCanceled = false;
            if (this.mWorkerTid > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-2 skip: running, tid=" + this.mWorkerTid);
            } else {
                ((ku5.t0) ku5.t0.f312615d).A(SERIAL_SERVICE_TASK);
                ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: bw1.t$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback.this.lambda$onResume$0();
                    }
                }, SERIAL_SERVICE_TASK);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onSuspend$2() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 1-1 shouldPause");
            this.mIsCanceled = true;
            this.mWorkerTid = 0;
            ((ku5.t0) ku5.t0.f312615d).A(SERIAL_SERVICE_TASK);
            mt1.b0 b0Var = mt1.b0.f331191a;
            mt1.e eVar = mt1.b0.f331195e;
            if (eVar != null) {
                eVar.a();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 1-* cancelCalc");
        }
    }

    private void tryRunWithLowEnergyMode(int i17) {
        boolean z17;
        ob0.e continuation = getContinuation();
        synchronized (continuation.f343898a) {
            z17 = continuation.a() == 3;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-2 onLowEnergy: tid=" + i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-* onLowEnergy: result=" + getContinuation().b(java.util.Collections.singletonList(java.lang.Integer.valueOf(i17))));
        }
    }

    @Override // ob0.a
    public void onLowEnergy() {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: bw1.t$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback.this.lambda$onLowEnergy$3();
            }
        }, SERIAL_LIFECYCLE);
    }

    @Override // ob0.d
    public void onResume() {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: bw1.t$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback.this.lambda$onResume$1();
            }
        }, SERIAL_LIFECYCLE);
    }

    @Override // ob0.d
    public void onSuspend() {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: bw1.t$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback.this.lambda$onSuspend$2();
            }
        }, SERIAL_LIFECYCLE);
    }
}
