package km1;

/* loaded from: classes16.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f390541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f390542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f390543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f390544h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf.f f390545i;

    public k(km1.s sVar, byte[] bArr, int i17, int i18, int i19, sf.f fVar) {
        this.f390540d = sVar;
        this.f390541e = bArr;
        this.f390542f = i17;
        this.f390543g = i18;
        this.f390544h = i19;
        this.f390545i = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km1.s sVar = this.f390540d;
        sVar.getClass();
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame();
        v2TXLiveVideoFrame.f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        v2TXLiveVideoFrame.f15417x2eefaa = this.f390541e;
        v2TXLiveVideoFrame.f15422x6be2dc6 = this.f390542f;
        v2TXLiveVideoFrame.f15418xb7389127 = this.f390543g;
        v2TXLiveVideoFrame.f15420xfd990f7e = this.f390544h;
        sVar.f390561e.d(v2TXLiveVideoFrame);
        this.f390545i.a(jc1.f.f380445a);
    }
}
