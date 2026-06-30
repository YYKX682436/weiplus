package ls0;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ls0.r0 r0Var) {
        super(1);
        this.f402346d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a aVar;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 19L, 1L);
        }
        ls0.r0 r0Var = this.f402346d;
        r0Var.Z++;
        r0Var.f402431f0 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402346d.f402449t, "onFrameDraw, drawFrameCount:" + this.f402346d.Z + ", encodeFrameCount:" + this.f402346d.Y + ", isDecodeEnd:" + this.f402346d.f402429e0);
        ls0.w0 w0Var = this.f402346d.Q;
        if (w0Var != null && (aVar = w0Var.f402488o) != null) {
            ((ls0.t0) aVar).mo152xb9724478();
        }
        ls0.r0 r0Var2 = this.f402346d;
        if (r0Var2.f402441l) {
            android.opengl.GLES20.glFinish();
            ls0.r0 r0Var3 = this.f402346d;
            gs0.w wVar = r0Var3.D;
            if (wVar != null) {
                ls0.k kVar = r0Var3.F;
                wVar.b(kVar != null ? kVar.f402400u : 0L);
            }
            ls0.r0 r0Var4 = this.f402346d;
            gs0.w wVar2 = r0Var4.D;
            r0Var4.Y = wVar2 != null ? wVar2.f356578o : 0;
            ls0.r0.e(this.f402346d);
        } else {
            gs0.b bVar = r0Var2.C;
            if (bVar != null) {
                bVar.a(0L);
            }
        }
        fs0.g gVar = this.f402346d.B;
        if (gVar != null) {
            gVar.d(false);
        }
        return jz5.f0.f384359a;
    }
}
