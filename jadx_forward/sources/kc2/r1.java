package kc2;

/* loaded from: classes15.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f388017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388018f;

    public r1(java.lang.String str, kc2.v1 v1Var, int i17) {
        this.f388016d = str;
        this.f388017e = v1Var;
        this.f388018f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f388016d;
        boolean z17 = str == null || str.length() == 0;
        int i17 = this.f388018f;
        kc2.v1 v1Var = this.f388017e;
        if (z17) {
            kc2.a2.a(v1Var.b(), i17, false, 2, null);
            return;
        }
        kc2.a2.a(v1Var.a(), i17, false, 2, null);
        v1Var.f388042k = i17;
        kc2.h1.f387938a.b(v1Var.f388040i, v1Var.f388041j, v1Var.f388043l, i17);
    }
}
