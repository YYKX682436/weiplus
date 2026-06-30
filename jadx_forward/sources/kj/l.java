package kj;

/* loaded from: classes12.dex */
public class l implements jj.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f389770a = new android.os.Handler(oj.g.b().getLooper());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f389771b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f389772c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj.m f389773d;

    public l(kj.m mVar, kj.e eVar) {
        this.f389773d = mVar;
    }

    @Override // jj.c
    public void a(java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        this.f389770a.post(new kj.k(this, str, frameMetrics, f17, f18));
    }
}
