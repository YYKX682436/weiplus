package ls0;

/* loaded from: classes10.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.w0 f402472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ls0.w0 w0Var) {
        super(2);
        this.f402472d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        ls0.w0 w0Var = this.f402472d;
        ls0.b1 b1Var = w0Var.f402476c;
        if (b1Var != null) {
            b1Var.e(data, bufferInfo);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeCost", "onFrameDraw : " + w0Var.f402478e);
        return jz5.f0.f384359a;
    }
}
