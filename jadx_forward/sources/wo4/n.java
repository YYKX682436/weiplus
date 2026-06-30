package wo4;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wo4.y yVar) {
        super(3);
        this.f529815d = yVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer buffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        this.f529815d.f529844r.c(buffer, bufferInfo, format);
        return jz5.f0.f384359a;
    }
}
