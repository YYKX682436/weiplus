package rc3;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f475612h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f475613i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rc3.w0 w0Var, int i17, int i18, int i19, int i27, int i28) {
        super(0);
        this.f475608d = w0Var;
        this.f475609e = i17;
        this.f475610f = i18;
        this.f475611g = i19;
        this.f475612h = i27;
        this.f475613i = i28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475608d;
        java.lang.String str = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view update ");
        int i17 = this.f475609e;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f475610f;
        sb6.append(i18);
        sb6.append(' ');
        int i19 = this.f475611g;
        sb6.append(i19);
        sb6.append(' ');
        int i27 = this.f475612h;
        sb6.append(i27);
        sb6.append(' ');
        int i28 = this.f475613i;
        sb6.append(i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = w0Var.f475624i;
        jc3.r rVar = c16416x87606a7b != null ? c16416x87606a7b.f229362s : null;
        jc3.p pVar = c16416x87606a7b != null ? c16416x87606a7b.f229363t : null;
        if (rVar != null) {
            cf3.d dVar = (cf3.d) w0Var.f475629q.get(java.lang.Integer.valueOf(i17));
            if (dVar != null) {
                dVar.f122461m = new android.graphics.Rect(i18, i19, i27 + i18, i28 + i19);
                android.os.Handler handler = dVar.f122450b;
                java.lang.Runnable runnable = dVar.f122462n;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
        } else if (pVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewLayout canvasId: " + i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26) w0Var.f475628p.get(java.lang.Integer.valueOf(i17));
            if (textureViewSurfaceTextureListenerC16468xc9008a26 != null) {
                rc3.w0 w0Var2 = this.f475608d;
                w0Var2.S(new rc3.t(w0Var2, this.f475609e, textureViewSurfaceTextureListenerC16468xc9008a26, this.f475610f, this.f475611g, this.f475612h, this.f475613i));
            }
        }
        return jz5.f0.f384359a;
    }
}
