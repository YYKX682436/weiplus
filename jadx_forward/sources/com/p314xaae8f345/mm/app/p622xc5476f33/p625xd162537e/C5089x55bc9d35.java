package com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/app/plugin/worker/MsgRefactorReportWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker */
/* loaded from: classes12.dex */
public final class C5089x55bc9d35 extends p012xc85e97e9.p125x37c711.AbstractC1259xaa333856 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f135239o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5089x55bc9d35(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f135239o = context;
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1259xaa333856
    public java.lang.Object h(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028 = this.f93992e;
        int i17 = c1264xcd547028.f94000c;
        if (i17 >= 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgRefactorReportWorker", "doWork() runAttemptCount reach max: " + i17);
            return new a5.v();
        }
        a5.m mVar = c1264xcd547028.f93999b;
        int b17 = mVar.b("DATA_KEY_CHECK_PERIOD", 0);
        java.lang.Object obj = ((java.util.HashMap) mVar.f82944a).get("DATA_KEY_TARGET_TIME");
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        try {
            boolean i18 = i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "doWork() isNeedRetry: " + i18 + ", runAttemptCount: " + i17 + ", checkPeriod: " + b17 + ", targetTime: " + longValue);
            if (i18) {
                return new a5.w();
            }
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(new yk.z(this));
            return a5.y.a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRefactorReportWorker", th6, "report failed", new java.lang.Object[0]);
            return new a5.v();
        }
    }

    public final boolean i() {
        if (!(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "isNeedRetry() isBackground = false");
            return true;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(15, null);
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null) == 0)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "isNeedRetry() notInit");
        return true;
    }
}
