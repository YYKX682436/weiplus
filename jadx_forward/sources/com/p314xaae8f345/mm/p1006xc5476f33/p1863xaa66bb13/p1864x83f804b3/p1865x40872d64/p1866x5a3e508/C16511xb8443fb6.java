package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.p1865x40872d64.p1866x5a3e508;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/messenger/foundation/recover/check/CheckContactWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.recover.check.CheckContactWorker */
/* loaded from: classes12.dex */
public final class C16511xb8443fb6 extends p012xc85e97e9.p125x37c711.AbstractC1259xaa333856 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16511xb8443fb6(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1259xaa333856
    public java.lang.Object h(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17;
        p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028 = this.f93992e;
        int b17 = c1264xcd547028.f93999b.b("DATA_KEY_CHECK_PERIOD", 0);
        java.lang.Object obj = ((java.util.HashMap) c1264xcd547028.f93999b.f82944a).get("DATA_KEY_TARGET_TIME");
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        int i17 = c1264xcd547028.f94000c;
        if (i17 >= 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckContactWorker", "doWork() called runAttemptCount reach max runAttemptCount:" + i17);
            return new a5.v();
        }
        try {
            boolean i18 = i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckContactWorker", "doWork() called isNeedRetry:" + i18 + " runAttemptCount:" + i17 + " targetTime:" + longValue);
            if (i18) {
                a17 = new a5.w();
            } else {
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(new bh3.d(i17, longValue, b17));
                a17 = a5.y.a();
            }
            return a17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CheckContactWorker", th6, "check contact failed", new java.lang.Object[0]);
            return new a5.v();
        }
    }

    public final boolean i() {
        if (!(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckContactWorker", "isNeedRetry() called isBackground = false");
            return true;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(15, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) l17) == 0)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckContactWorker", "isNeedRetry() called notInit");
        return true;
    }
}
