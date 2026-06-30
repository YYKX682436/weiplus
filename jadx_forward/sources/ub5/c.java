package ub5;

/* loaded from: classes5.dex */
public final class c implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ub5.j f507738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f507739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f507740c;

    public c(ub5.j jVar, yz5.a aVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f507738a = jVar;
        this.f507739b = aVar;
        this.f507740c = z3Var;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        ub5.j jVar = this.f507738a;
        if (jVar != null) {
            jVar.b(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppCancel, talker: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f507740c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
        ub5.j jVar = this.f507738a;
        if (jVar != null) {
            java.util.Map map = jVar.f507767c;
            map.putAll(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(jVar.f507765a.size())), new jz5.l("selected_msg_list", (java.lang.String) ((jz5.n) jVar.f507768d).mo141623x754a37bb())));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_exp", map, 35480);
        }
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppFail, talker: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f507740c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
        yz5.a aVar = this.f507739b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        ub5.j jVar = this.f507738a;
        if (jVar != null) {
            jVar.b(true);
        }
        yz5.a aVar = this.f507739b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpAppSuccess, talker: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f507740c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        ub5.j jVar = this.f507738a;
        if (jVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("jump_yuanbao_download_end", jVar.f507767c, 35480);
        }
        yz5.a aVar = this.f507739b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpDownloadPage, talker: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f507740c;
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardBottomSheetHelper", sb6.toString());
    }
}
