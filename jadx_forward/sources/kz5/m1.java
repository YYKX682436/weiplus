package kz5;

/* loaded from: classes14.dex */
public final class m1 extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public int f395519f;

    /* renamed from: g, reason: collision with root package name */
    public int f395520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kz5.n1 f395521h;

    public m1(kz5.n1 n1Var) {
        this.f395521h = n1Var;
        this.f395519f = n1Var.d();
        this.f395520g = n1Var.f395524g;
    }

    @Override // kz5.c
    public void b() {
        int i17 = this.f395519f;
        if (i17 == 0) {
            this.f395495d = 2;
            return;
        }
        kz5.n1 n1Var = this.f395521h;
        java.lang.Object[] objArr = n1Var.f395522e;
        int i18 = this.f395520g;
        this.f395496e = objArr[i18];
        this.f395495d = 1;
        this.f395520g = (i18 + 1) % n1Var.f395523f;
        this.f395519f = i17 - 1;
    }
}
