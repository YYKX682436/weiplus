package mc4;

/* loaded from: classes4.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f407176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc4.d f407177e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, mc4.d dVar) {
        this.f407176d = c17933xe8d1b226;
        this.f407177e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$showRetryPostAlert$1$1");
        mc4.c cVar = mc4.c.f407178a;
        java.lang.String m70363x51f8f990 = this.f407176d.m70363x51f8f990();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70363x51f8f990, "getLocalid(...)");
        mc4.c.a(cVar, m70363x51f8f990);
        mc4.d dVar = this.f407177e;
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18029xb7ebaebb c18029xb7ebaebb = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18029xb7ebaebb) dVar;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.O2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = c18029xb7ebaebb.f248455a;
            activityC18022x27bfedac.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$refreshSnsSecurityErrorView$4", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            activityC18022x27bfedac.S7(c18029xb7ebaebb.f248456b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$refreshSnsSecurityErrorView$4", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        long j17 = this.f407176d.f38324x142bbdc6;
        o75.b bVar = o75.b.f425114b;
        gVar.h7(j17, o75.b.f425116d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$showRetryPostAlert$1$1");
    }
}
