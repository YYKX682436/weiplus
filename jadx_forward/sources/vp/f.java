package vp;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f520301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zp.m f520302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d f520303f;

    public f(vp.d dVar, wp.a aVar, zp.m mVar) {
        this.f520303f = dVar;
        this.f520301d = aVar;
        this.f520302e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f520303f.d(this.f520301d, this.f520302e);
    }
}
