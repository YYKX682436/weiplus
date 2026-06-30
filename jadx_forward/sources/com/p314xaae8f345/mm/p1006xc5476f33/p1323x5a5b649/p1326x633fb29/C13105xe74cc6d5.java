package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29;

@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10652xb225492
@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10646xad458faa
/* renamed from: com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback */
/* loaded from: classes12.dex */
public class C13105xe74cc6d5 extends ob0.d implements ob0.a {

    /* renamed from: SERIAL_LIFECYCLE */
    private static final java.lang.String f35425x1a2a02bf = "MicroMsg.SubCoreClean.CalcWxCallback";

    /* renamed from: SERIAL_SERVICE_TASK */
    private static final java.lang.String f35426xd5162d5a = "MicroMsg.SubCoreClean.CalcWxCallback.Task";

    /* renamed from: mIsCanceled */
    private volatile boolean f35427xa5922430;

    /* renamed from: mWorkerTid */
    private volatile int f35428xbc0aa644;

    public C13105xe74cc6d5() {
        super("CalcWx");
        this.f35427xa5922430 = false;
        this.f35428xbc0aa644 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onLowEnergy$3 */
    public /* synthetic */ void m54494x5768b70f() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-1 onLowEnergy");
            if (this.f35428xbc0aa644 > 0) {
                m54498xb3288aa9(this.f35428xbc0aa644);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onResume$0 */
    public void m54495xd0001575() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-3 prepare");
        bw1.u.wi().m134976x2690a4ac();
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.e eVar = mt1.b0.f412728e;
        if (eVar != null) {
            eVar.a();
        }
        synchronized (this) {
            if (this.f35427xa5922430) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-4 skip: canceled");
                return;
            }
            this.f35428xbc0aa644 = android.os.Process.myTid();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-5 triggerCalc on worker thread: " + this.f35428xbc0aa644);
            m54498xb3288aa9(this.f35428xbc0aa644);
            b0Var.x();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-* done");
            this.f35428xbc0aa644 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onResume$1 */
    public /* synthetic */ void m54496xd0001576() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-1 couldResume");
            this.f35427xa5922430 = false;
            if (this.f35428xbc0aa644 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 2-2 skip: running, tid=" + this.f35428xbc0aa644);
            } else {
                ((ku5.t0) ku5.t0.f394148d).A(f35426xd5162d5a);
                ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: bw1.t$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29.C13105xe74cc6d5.this.m54495xd0001575();
                    }
                }, f35426xd5162d5a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onSuspend$2 */
    public void m54497x3965e54e() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 1-1 shouldPause");
            this.f35427xa5922430 = true;
            this.f35428xbc0aa644 = 0;
            ((ku5.t0) ku5.t0.f394148d).A(f35426xd5162d5a);
            mt1.b0 b0Var = mt1.b0.f412724a;
            mt1.e eVar = mt1.b0.f412728e;
            if (eVar != null) {
                eVar.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 1-* cancelCalc");
        }
    }

    /* renamed from: tryRunWithLowEnergyMode */
    private void m54498xb3288aa9(int i17) {
        boolean z17;
        ob0.e m150908x33dd08ad = m150908x33dd08ad();
        synchronized (m150908x33dd08ad.f425431a) {
            z17 = m150908x33dd08ad.a() == 3;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-2 onLowEnergy: tid=" + i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "CalcWxCallback 3-* onLowEnergy: result=" + m150908x33dd08ad().b(java.util.Collections.singletonList(java.lang.Integer.valueOf(i17))));
        }
    }

    @Override // ob0.a
    /* renamed from: onLowEnergy */
    public void mo54499xa8ad2fdd() {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: bw1.t$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29.C13105xe74cc6d5.this.m54494x5768b70f();
            }
        }, f35425x1a2a02bf);
    }

    @Override // ob0.d
    /* renamed from: onResume */
    public void mo46781x57429eec() {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: bw1.t$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29.C13105xe74cc6d5.this.m54496xd0001576();
            }
        }, f35425x1a2a02bf);
    }

    @Override // ob0.d
    /* renamed from: onSuspend */
    public void mo46783xe142a15d() {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: bw1.t$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29.C13105xe74cc6d5.this.m54497x3965e54e();
            }
        }, f35425x1a2a02bf);
    }
}
