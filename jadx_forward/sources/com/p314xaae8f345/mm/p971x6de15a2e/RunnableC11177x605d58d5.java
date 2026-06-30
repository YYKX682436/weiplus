package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.AccInfo$$d */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC11177x605d58d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af f153449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f153452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f153453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f153454i;

    public /* synthetic */ RunnableC11177x605d58d5(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af, int i17, int i18, int i19, long j17, long j18) {
        this.f153449d = binderC11173x1cfac0af;
        this.f153450e = i17;
        this.f153451f = i18;
        this.f153452g = i19;
        this.f153453h = j17;
        this.f153454i = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f153450e;
        int i18 = this.f153452g;
        long j17 = this.f153453h;
        long j18 = this.f153454i;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153449d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) binderC11173x1cfac0af.f153445y;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(valueOf);
        if (bool == null || java.lang.Boolean.FALSE.equals(bool)) {
            return;
        }
        int i19 = i18 - 1;
        int i27 = this.f153451f;
        if (i27 >= i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "reset axAuthRequesting %s", java.lang.Integer.valueOf(i17));
            jx3.f.INSTANCE.d(28982, "%s", java.lang.Integer.valueOf(i17));
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        } else {
            int i28 = i27 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "index:%s, max:%s, will reset axAuthRequesting", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i18));
            ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p971x6de15a2e.RunnableC11177x605d58d5(binderC11173x1cfac0af, i17, i28, i18, j17, j18), j17, "MicroMsg.AccInfo");
        }
    }
}
