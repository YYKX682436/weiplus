package pb4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final pb4.g f434731a = new pb4.g();

    public final l75.k0 a() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        jm0.i iVar = jm0.k.f381802h;
        l75.k0 Q4 = ((pb4.f) iVar.a(pb4.f.class)).Q4();
        if (Q4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
            return Q4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        java.lang.String str = gm0.j1.u().h() + "sns_show_teach.db";
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(pb4.f.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(pb4.f.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarTeachStorage", "init >> " + str + ' ' + ((pb4.f) a17).O6(str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        l75.k0 Q42 = ((pb4.f) iVar.a(pb4.f.class)).Q4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q42);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        return Q42;
    }

    public final boolean b(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectIsShow", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        l75.k0 a17 = a();
        p75.i0 i18 = dm.ia.f319191f.i();
        i18.f434190d = dm.ia.f319192g.i(java.lang.Long.valueOf(j17)).c(dm.ia.f319193h.i(java.lang.Integer.valueOf(i17)));
        dm.ia iaVar = (dm.ia) i18.a().o(a17, dm.ia.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarTeachStorage", "selectIsShow >> " + iaVar + ", " + ca4.z0.t0(j17));
        boolean z17 = iaVar != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectIsShow", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        return z17;
    }
}
