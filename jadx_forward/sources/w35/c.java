package w35;

/* loaded from: classes8.dex */
public final class c implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w35.d f524260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w f524261b;

    public c(w35.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        this.f524260a = dVar;
        this.f524261b = wVar;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        w35.d dVar = this.f524260a;
        kb0.g gVar = dVar.f524262e;
        if (gVar != null) {
            gVar.f(false);
        }
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(dVar.f524256a.f270848h);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = this.f524261b;
        if (Bi && (p3Var = dVar.f524256a.f270852l) != null && (k0Var = p3Var.f270939c) != null) {
            ((kb0.f) k0Var).a(false, wVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppCancel, itemType: " + wVar.h());
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        w35.d dVar = this.f524260a;
        kb0.g gVar = dVar.f524262e;
        if (gVar != null) {
            java.util.HashMap i17 = kz5.c1.i(new jz5.l("has_install_yuanbao", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) gVar.f387737h).mo141623x754a37bb()).intValue())));
            i17.putAll(gVar.f387734e);
            java.util.Map map = gVar.f387731b;
            if (map != null) {
                i17.putAll(map);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_exp", i17, 35480);
        }
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = dVar.f524256a;
        if (!((jb0.g) xVar).Bi(g2Var.f270848h) || (p3Var = g2Var.f270852l) == null || (k0Var = p3Var.f270939c) == null) {
            return;
        }
        ((kb0.f) k0Var).b(this.f524261b);
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        w35.a aVar = this.f524260a.f524257b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppFail, itemType: " + this.f524261b.h());
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        java.lang.String str;
        w35.d dVar = this.f524260a;
        w35.a aVar = dVar.f524257b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
        }
        kb0.g gVar = dVar.f524262e;
        if (gVar != null) {
            gVar.f(true);
        }
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(dVar.f524256a.f270848h);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = this.f524261b;
        if (Bi) {
            xj.m mVar = wVar.f272555o;
            if (mVar != null && (str = mVar.f536291f) != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a.a(str, dVar.f524258c);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = dVar.f524256a.f270852l;
            if (p3Var != null && (k0Var = p3Var.f270939c) != null) {
                ((kb0.f) k0Var).a(true, wVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppSuccess, itemType: " + wVar.h());
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        w35.d dVar = this.f524260a;
        kb0.g gVar = dVar.f524262e;
        if (gVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("jump_yuanbao_download_end", gVar.f387734e, 35480);
        }
        w35.a aVar = dVar.f524257b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "onJumpDownloadPage, itemType: " + this.f524261b.h());
    }
}
