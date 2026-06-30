package iu1;

/* loaded from: classes9.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.r1 f376467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f376468e;

    public p1(iu1.r1 r1Var, yz5.a aVar) {
        this.f376467d = r1Var;
        this.f376468e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iu1.r1 r1Var = this.f376467d;
        r1Var.f376477d = r1Var.f3639x46306858.getHeight();
        r1Var.f376478e = r1Var.f3639x46306858.getWidth();
        this.f376468e.mo152xb9724478();
    }
}
