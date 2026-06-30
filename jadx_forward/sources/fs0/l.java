package fs0;

/* loaded from: classes10.dex */
public final class l extends fs0.f {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f347794u;

    /* renamed from: v, reason: collision with root package name */
    public int f347795v;

    /* renamed from: w, reason: collision with root package name */
    public final long f347796w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f347797x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.a f347798y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hs0.a mediaExtractorWrapper, java.lang.String audioId, long j17, long j18, yz5.p pVar, yz5.a aVar) {
        super(mediaExtractorWrapper, audioId, j17, j18, pVar, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioId, "audioId");
        this.f347794u = "MicroMsg.MediaCodecAACDecoderAsync@".concat(audioId);
        this.f347796w = j18;
        fs0.i iVar = new fs0.i(this, audioId, j17, mediaExtractorWrapper);
        wo.i1 i1Var = this.f347751h;
        if (i1Var != null) {
            i1Var.f529252a.setCallback(iVar);
        }
        this.f347798y = new fs0.k(this);
    }

    @Override // fs0.f
    public void d() {
        java.lang.String str = this.f347794u;
        try {
            wo.i1 i1Var = this.f347751h;
            if (i1Var != null) {
                i1Var.x();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startDecoder " + this.f347745b);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "startDecoder error", new java.lang.Object[0]);
        }
    }
}
