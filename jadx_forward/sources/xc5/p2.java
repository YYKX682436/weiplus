package xc5;

/* loaded from: classes12.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f535083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f535084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(xc5.s2 s2Var, mf3.k kVar) {
        super(1);
        this.f535083d = s2Var;
        this.f535084e = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xc5.v2 v2Var;
        mf3.s sVar;
        mf3.k kVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        xc5.s2 s2Var = this.f535083d;
        s2Var.f535100y = false;
        mf3.k kVar2 = this.f535084e;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoBottomBarLayer", "download origin video success. mediaId: " + kVar2.mo2110x5db1b11());
            lg3.a aVar = s2Var.f535098w;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).h(kVar2, new vf3.f(vf3.e.f517914h, null, 0, 0.0f, 14, null));
            }
            kVar2.f(mf3.w.f407661d);
            s2Var.i0();
            xc5.u2 u2Var = (xc5.u2) s2Var.g(xc5.u2.class);
            if (u2Var != null && (sVar = (v2Var = (xc5.v2) u2Var).f407643m) != null && (kVar = sVar.f407650a) != null) {
                v2Var.B = ((java.lang.Number) ((ig3.i) v2Var.U()).a().f384366d).intValue();
                v2Var.C = ((ig3.i) v2Var.U()).b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoPreviewLayer", "reload, savedProgressMs:" + v2Var.B + " wasPlaying:" + v2Var.C);
                v2Var.A = true;
                gg3.b bVar = (gg3.b) v2Var.H(gg3.b.class);
                if (bVar != null) {
                    bVar.a5(kVar, v2Var);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoBottomBarLayer", "download origin video failed. mediaId: " + kVar2.mo2110x5db1b11());
            kVar2.f(mf3.w.f407661d);
            lg3.a aVar2 = s2Var.f535098w;
            if (aVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar2, new vf3.f(vf3.e.f517915i, null, 0, 0.0f, 14, null));
            }
        }
        s2Var.a0();
        return jz5.f0.f384359a;
    }
}
