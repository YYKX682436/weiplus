package pw2;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f440218a;

    /* renamed from: b, reason: collision with root package name */
    public long f440219b;

    /* renamed from: c, reason: collision with root package name */
    public long f440220c;

    /* renamed from: d, reason: collision with root package name */
    public long f440221d;

    /* renamed from: e, reason: collision with root package name */
    public long f440222e;

    /* renamed from: f, reason: collision with root package name */
    public long f440223f;

    /* renamed from: g, reason: collision with root package name */
    public long f440224g;

    /* renamed from: h, reason: collision with root package name */
    public long f440225h;

    /* renamed from: i, reason: collision with root package name */
    public long f440226i;

    /* renamed from: j, reason: collision with root package name */
    public long f440227j;

    /* renamed from: k, reason: collision with root package name */
    public long f440228k;

    /* renamed from: l, reason: collision with root package name */
    public int f440229l;

    /* renamed from: m, reason: collision with root package name */
    public int f440230m;

    /* renamed from: n, reason: collision with root package name */
    public long f440231n;

    public final cl0.g a() {
        cl0.g gVar = new cl0.g();
        gVar.p("corePrepareTime", this.f440218a);
        gVar.p("corePreparedTime", this.f440221d);
        gVar.p("firstClipOpenedTime", this.f440219b);
        gVar.p("firstVideoPacketTime", this.f440220c);
        gVar.p("videoDecoderTime", this.f440222e);
        gVar.p("firstFrameRenderTime", this.f440223f);
        gVar.p("startPlayTime", this.f440224g);
        gVar.p("seekTime", this.f440225h);
        gVar.p("seekEndTime", this.f440226i);
        gVar.p("downloaderStartTime", this.f440227j);
        gVar.p("pauseTime", 0L);
        gVar.p("surfaceAvailableTime", this.f440228k);
        gVar.o("urlType", this.f440229l);
        gVar.o("isFocus", this.f440230m);
        gVar.p("targetStartPlayTime", this.f440231n);
        return gVar;
    }

    /* renamed from: toString */
    public java.lang.String m159082x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderPlayerActionStatistics{mCoreApiPrepareTimeMs=");
        sb6.append(this.f440218a);
        sb6.append(", mDownloaderStartTimeMs=(");
        sb6.append(this.f440227j);
        sb6.append(", ");
        long j17 = this.f440227j - this.f440218a;
        if (j17 < 0) {
            j17 = 0;
        }
        sb6.append(j17);
        sb6.append(") mCoreSchedulingThreadOnPreparedTimeMs=(");
        sb6.append(this.f440221d);
        sb6.append(", ");
        long j18 = this.f440221d - this.f440218a;
        sb6.append(j18 >= 0 ? j18 : 0L);
        sb6.append("), mInitFirstClipPositionETimeMs=(");
        sb6.append(this.f440219b);
        sb6.append(", ");
        sb6.append(this.f440219b - this.f440218a);
        sb6.append("), mFirstVideoPacketReadETimeMs=(");
        sb6.append(this.f440220c);
        sb6.append(", ");
        sb6.append(this.f440220c - this.f440218a);
        sb6.append(") mVideoDecoderOpenedTimeMs=(");
        sb6.append(this.f440222e);
        sb6.append(", ");
        sb6.append(this.f440222e - this.f440218a);
        sb6.append(") mFirstVideoFrameRenderETimeMs=(");
        sb6.append(this.f440223f);
        sb6.append(", ");
        sb6.append(this.f440223f - this.f440218a);
        sb6.append("), mStartPlayTimeMs=");
        sb6.append(this.f440224g);
        sb6.append(", mSeekTimeMs=");
        sb6.append(this.f440225h);
        sb6.append(", mSeekEndTimeMs=");
        sb6.append(this.f440226i);
        sb6.append(", mPauseTimeMs=0, urlType=");
        sb6.append(this.f440229l);
        sb6.append(" isFocus=");
        sb6.append(this.f440230m);
        return sb6.toString();
    }
}
