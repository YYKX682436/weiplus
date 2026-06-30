package i33;

/* loaded from: classes10.dex */
public final class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u1 f369798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 f369799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i33.o1 f369800f;

    public t1(i33.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0, i33.o1 o1Var) {
        this.f369798d = u1Var;
        this.f369799e = c15632xfc4fd0d0;
        this.f369800f = o1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        i33.u1 u1Var = this.f369798d;
        u1Var.f369807d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f369799e;
        u1Var.f369808e = c15632xfc4fd0d0;
        e33.C28267x625d43e c28267x625d43e = (e33.C28267x625d43e) this.f369800f;
        c28267x625d43e.getClass();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
        c28267x625d43e.f328919a.j7(true);
        fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
        java.lang.String livePhotoVideo = c15632xfc4fd0d0.f219960y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(livePhotoVideo, "livePhotoVideo");
        byte[] bytes = livePhotoVideo.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        ((ee0.r4) m4Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLivePhotoClose", "com.tencent.mm.feature.sns.SnsReportHelperService");
        ke4.a.f388558a.a(g17, Bi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLivePhotoClose", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }
}
