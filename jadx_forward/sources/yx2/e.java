package yx2;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx2.f f549373e;

    public e(java.lang.String str, yx2.f fVar) {
        this.f549372d = str;
        this.f549373e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(this.f549372d, null, 2, null), this.f549373e.f549375a, g1Var.h(mn2.f1.f411490h));
    }
}
