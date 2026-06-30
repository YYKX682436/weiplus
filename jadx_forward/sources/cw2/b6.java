package cw2;

/* loaded from: classes14.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f305128a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f305129b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15187xfb53e8c8 f305130c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f305131d;

    /* renamed from: e, reason: collision with root package name */
    public int f305132e;

    /* renamed from: f, reason: collision with root package name */
    public int f305133f;

    /* renamed from: g, reason: collision with root package name */
    public int f305134g;

    public b6(long j17, int i17, android.os.Handler handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f305128a = j17;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        surfaceTexture.setOnFrameAvailableListener(new cw2.a6(this), handler);
        this.f305129b = surfaceTexture;
        this.f305130c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15187xfb53e8c8(surfaceTexture);
    }
}
