package qa4;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f442615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f442616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f442617f;

    /* renamed from: g, reason: collision with root package name */
    public int f442618g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f442619h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f442620i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z17, r45.jj4 jj4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442619h = z17;
        this.f442620i = jj4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        qa4.e eVar = new qa4.e(this.f442619h, this.f442620i, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        java.lang.Object mo150x989b7ca4 = ((qa4.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f442618g;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f442619h;
            r45.jj4 jj4Var = this.f442620i;
            java.lang.String U = z17 ? ca4.z0.U(jj4Var) : ca4.z0.J(jj4Var);
            if (z17) {
                i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.t(jj4Var);
            } else {
                i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + U, false);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageLoader", "getImagePathFromMedia fileExists path:" + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return i17;
            }
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            if (z17) {
                s0Var.d(1);
                i18 = jj4Var.f459389e == 6 ? 5 : 1;
            } else {
                s0Var.d(3);
                i18 = 2;
            }
            s0Var.e(jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageLoader", "start downloading mediaId=" + jj4Var.f459388d);
            Cj.d(jj4Var, i18, s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276836g);
            this.f442615d = i17;
            this.f442616e = Cj;
            this.f442617f = jj4Var;
            this.f442618g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            qa4.d dVar = new qa4.d(jj4Var, i17, Cj, rVar);
            Cj.c(dVar);
            rVar.m(new qa4.c(Cj, dVar));
            obj = rVar.j();
            if (obj == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return aVar;
            }
        } else {
            if (i19 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return obj;
    }
}
