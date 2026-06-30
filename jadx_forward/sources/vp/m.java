package vp;

/* loaded from: classes16.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f520345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zp.m f520346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.k f520347f;

    public m(vp.k kVar, wp.a aVar, zp.m mVar) {
        this.f520347f = kVar;
        this.f520345d = aVar;
        this.f520346e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f520347f.d(this.f520345d, this.f520346e);
    }
}
