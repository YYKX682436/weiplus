package vf0;

@j95.b
/* loaded from: classes12.dex */
public class l1 extends i95.w implements wf0.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f517751d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f517752e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f517753f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f517754g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final wf0.u1 f517755h = new vf0.k1(this);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        t21.o2.Ui().b(this.f517755h, android.os.Looper.getMainLooper());
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        t21.o2.Ui().A(this.f517755h);
    }
}
