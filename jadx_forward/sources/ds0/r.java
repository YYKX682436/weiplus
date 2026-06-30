package ds0;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f324360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ds0.d0 d0Var) {
        super(3);
        this.f324360d = d0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer pcmData = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat desMediaFormat = (android.media.MediaFormat) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcmData, "pcmData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desMediaFormat, "desMediaFormat");
        ds0.d0.a(this.f324360d, pcmData, bufferInfo, desMediaFormat);
        return jz5.f0.f384359a;
    }
}
