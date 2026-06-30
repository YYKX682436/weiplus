package yw;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f547920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f547921g;

    public l(yw.y yVar, int i17, boolean z17, boolean z18) {
        this.f547918d = yVar;
        this.f547919e = i17;
        this.f547920f = z17;
        this.f547921g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.g(new yw.k(this.f547918d, this.f547919e, this.f547920f, this.f547921g, e17));
        }
    }
}
