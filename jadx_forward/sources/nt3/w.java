package nt3;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nt3.a0 a0Var) {
        super(2);
        this.f421346d = a0Var;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421346d.f421255m, "onEncode: " + this.f421346d.I + ", isDecodeEnd:" + this.f421346d.K + ", drawFrameCount:" + this.f421346d.f421242J + ", decodeFrameCount:" + this.f421346d.H);
        nt3.a0 a0Var = this.f421346d;
        a0Var.I = a0Var.I + 1;
        ls0.w0 w0Var = a0Var.B;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (w0Var == null || (pVar = w0Var.f402485l) == null) {
            f0Var = null;
        } else {
            ((ls0.v0) pVar).mo149xb9724478(byteBuffer, bufferInfo);
            f0Var = f0Var2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
        nt3.a0.e(this.f421346d);
        return f0Var2;
    }
}
