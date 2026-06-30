package qa4;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f442602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f442603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f442604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.jj4 jj4Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442603e = jj4Var;
        this.f442604f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        qa4.a aVar = new qa4.a(this.f442603e, this.f442604f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        java.lang.Object mo150x989b7ca4 = ((qa4.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f442602d;
        boolean z17 = this.f442604f;
        r45.jj4 jj4Var = this.f442603e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f442602d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new qa4.e(z17, jj4Var, null), this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            if (g17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
                return aVar;
            }
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return null;
        }
        if (z17) {
            android.graphics.Bitmap s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).s(jj4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return s17;
        }
        android.graphics.Bitmap p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).p(str, jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return p17;
    }
}
