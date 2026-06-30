package ru1;

/* loaded from: classes13.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.t f481257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ru1.t tVar) {
        super(2);
        this.f481257d = tVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        ru1.t.b(this.f481257d, bufferInfo, data);
        return jz5.f0.f384359a;
    }
}
