package nt3;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nt3.a0 a0Var) {
        super(3);
        this.f421348d = a0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.q qVar;
        java.nio.ByteBuffer buffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        ls0.w0 w0Var = this.f421348d.B;
        if (w0Var != null && (qVar = w0Var.f402486m) != null) {
            ((ls0.s0) qVar).mo147xb9724478(buffer, bufferInfo, format);
        }
        return jz5.f0.f384359a;
    }
}
