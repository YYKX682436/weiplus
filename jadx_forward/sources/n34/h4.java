package n34;

/* loaded from: classes4.dex */
public final class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 f416152d;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        this.f416152d = c17694x1b4b7a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.SnsStarListUIC$setSnsList$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416152d;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getLastVisiblePosition());
        sb6.append(", ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getLastVisiblePosition() == com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "load data by post");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c17694x1b4b7a7.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.class)).U6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsStarListUIC$setSnsList$1");
    }
}
