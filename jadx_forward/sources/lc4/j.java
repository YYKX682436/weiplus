package lc4;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399500d;

    public j(java.util.ArrayList arrayList) {
        this.f399500d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$executeDeleteFeedResource$1");
        for (java.lang.Long l17 : this.f399500d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("executeDeleteFeedResource feed id:");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            sb6.append(ca4.z0.s0(l17.longValue()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(l17.longValue());
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.DataUIC", "can't get sns info");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n2.f247612a.a(W0);
                synchronized (jm0.k.f381803i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                }
                ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).X6(W0.f38324x142bbdc6, l17.longValue(), W0.m70357x3fdd41df());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$executeDeleteFeedResource$1");
    }
}
