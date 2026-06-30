package k53;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f385866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f385867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f385868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k53.f f385869h;

    public b(k53.f fVar, java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        this.f385869h = fVar;
        this.f385865d = str;
        this.f385866e = j17;
        this.f385867f = j18;
        this.f385868g = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800 = this.f385869h.f385890d.f385891d;
        if (c11149x9c6f800 != null) {
            c11149x9c6f800.e0(this.f385865d, this.f385866e, this.f385867f, this.f385868g.f18114x9330627b);
        }
    }
}
