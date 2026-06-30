package gs0;

/* loaded from: classes10.dex */
public final class h extends gs0.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f356519i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f356520j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f356521k;

    /* renamed from: l, reason: collision with root package name */
    public final gs0.e f356522l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f356523m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        super(mediaFormat, frameEncodeCallback, frameEncodeEndCallback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeCallback, "frameEncodeCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f356519i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f356520j = java.util.Collections.synchronizedList(new java.util.ArrayList());
        gs0.e eVar = new gs0.e(this);
        this.f356522l = eVar;
        try {
            this.f356498c.f529252a.setCallback(eVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACEncoderAsync", e17, "", new java.lang.Object[0]);
        }
        this.f356523m = new gs0.g(this);
    }

    @Override // gs0.a
    public void c(byte[] data, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f356519i.add(new gs0.d(data, j17, z17));
        java.util.List list = this.f356520j;
        int size = list.size();
        wo.i1 i1Var = this.f356498c;
        if (size > 0) {
            java.lang.Integer num = (java.lang.Integer) kz5.n0.X(list);
            list.remove(num);
            android.media.MediaCodec mediaCodec = i1Var.f529252a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaCodec, "getMediaCodecImpl(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            this.f356522l.onInputBufferAvailable(mediaCodec, num.intValue());
        }
        if (this.f356521k) {
            return;
        }
        i1Var.x();
        this.f356521k = true;
    }
}
