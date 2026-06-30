package ls0;

/* loaded from: classes10.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.w0 f402457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ls0.w0 w0Var) {
        super(3);
        this.f402457d = w0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        ls0.b1 b1Var = this.f402457d.f402476c;
        if (b1Var != null) {
            b1Var.c(data, bufferInfo, format);
        }
        return jz5.f0.f384359a;
    }
}
