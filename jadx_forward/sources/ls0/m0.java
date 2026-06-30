package ls0;

/* loaded from: classes10.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ls0.r0 r0Var) {
        super(2);
        this.f402407d = r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        yz5.p pVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuffer, "byteBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402407d.f402449t, "onEncode: " + this.f402407d.Y + ", isDecodeEnd:" + this.f402407d.f402429e0 + ", drawFrameCount:" + this.f402407d.Z + ", decodeFrameCount:" + this.f402407d.X + ", " + bufferInfo.presentationTimeUs);
        ls0.r0 r0Var = this.f402407d;
        r0Var.Y = r0Var.Y + 1;
        ls0.w0 w0Var = r0Var.Q;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (w0Var == null || (pVar = w0Var.f402485l) == null) {
            f0Var = null;
        } else {
            ((ls0.v0) pVar).mo149xb9724478(byteBuffer, bufferInfo);
            f0Var = f0Var2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
        ls0.r0.e(this.f402407d);
        if (this.f402407d.f402421a0 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f402407d.f402421a0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markFrameHandlingTime time:" + currentTimeMillis);
            if (currentTimeMillis < 1000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 130L, 1L);
            } else if (currentTimeMillis < 2000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 131L, 1L);
            } else if (currentTimeMillis < 3000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 132L, 1L);
            } else if (currentTimeMillis < 4000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 133L, 1L);
            } else if (currentTimeMillis < 5000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 134L, 1L);
            } else if (currentTimeMillis < p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 135L, 1L);
            } else if (currentTimeMillis < 7000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 136L, 1L);
            } else if (currentTimeMillis < 8000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 137L, 1L);
            } else if (currentTimeMillis < 9000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 138L, 1L);
            } else if (currentTimeMillis < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 139L, 1L);
            } else if (currentTimeMillis < 15000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 140L, 1L);
            } else if (currentTimeMillis < 20000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 141L, 1L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 142L, 1L);
            }
        }
        this.f402407d.f402421a0 = java.lang.System.currentTimeMillis();
        this.f402407d.f402437i0.b();
        ((ku5.t0) ku5.t0.f394148d).k(this.f402407d.f402437i0, r2.f402427d0);
        return f0Var2;
    }
}
