package rc3;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rc3.w0 w0Var, int i17) {
        super(0);
        this.f475588d = w0Var;
        this.f475589e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f475588d.f475638z, "canvas view remove " + this.f475589e);
        rc3.w0 w0Var = this.f475588d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = w0Var.f475624i;
        jc3.r rVar = c16416x87606a7b != null ? c16416x87606a7b.f229362s : null;
        jc3.p pVar = c16416x87606a7b != null ? c16416x87606a7b.f229363t : null;
        if (rVar != null) {
            cf3.d dVar = (cf3.d) w0Var.f475629q.remove(java.lang.Integer.valueOf(this.f475589e));
            if (dVar != null) {
                dVar.f122450b.post(new cf3.a(dVar));
            }
        } else if (pVar != null) {
            int i17 = this.f475589e;
            fh1.r0 r0Var = (fh1.r0) pVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewDestroy canvasId: " + i17);
            fh1.o0 o0Var = (fh1.o0) fh1.x0.f344154J.remove(java.lang.Integer.valueOf(i17));
            java.lang.String str = (java.lang.String) fh1.x0.L.remove(java.lang.Integer.valueOf(i17));
            synchronized (r0Var) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(fh1.x0.K).remove(str);
            }
            if (o0Var != null) {
                ((android.view.Surface) ((jz5.n) o0Var.f344108d).mo141623x754a37bb()).release();
                o0Var.f344105a.release();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26) w0Var.f475628p.remove(java.lang.Integer.valueOf(this.f475589e));
            if (textureViewSurfaceTextureListenerC16468xc9008a26 != null) {
                rc3.w0 w0Var2 = this.f475588d;
                w0Var2.S(new rc3.q(w0Var2, this.f475589e, textureViewSurfaceTextureListenerC16468xc9008a26));
            }
        }
        return jz5.f0.f384359a;
    }
}
