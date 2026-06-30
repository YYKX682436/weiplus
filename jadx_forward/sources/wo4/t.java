package wo4;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wo4.y yVar) {
        super(2);
        this.f529822d = yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuffer, "byteBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeH264Data  ,bufferInfo.size : ");
        sb6.append(bufferInfo.size);
        sb6.append("  frameCount :");
        wo4.y yVar = this.f529822d;
        int i17 = yVar.f529833g;
        yVar.f529833g = i17 + 1;
        sb6.append(i17);
        sb6.append("  presentationTimeUs:");
        sb6.append(bufferInfo.presentationTimeUs);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", sb6.toString());
        yVar.f529844r.e(byteBuffer, bufferInfo);
        return jz5.f0.f384359a;
    }
}
