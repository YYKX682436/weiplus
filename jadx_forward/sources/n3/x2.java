package n3;

/* loaded from: classes14.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final n3.g3 f415971a;

    /* renamed from: b, reason: collision with root package name */
    public e3.d[] f415972b;

    public x2() {
        this(new n3.g3((n3.g3) null));
    }

    public final void a() {
        e3.d[] dVarArr = this.f415972b;
        if (dVarArr != null) {
            e3.d dVar = dVarArr[n3.e3.a(1)];
            e3.d dVar2 = this.f415972b[n3.e3.a(2)];
            n3.g3 g3Var = this.f415971a;
            if (dVar2 == null) {
                dVar2 = g3Var.a(2);
            }
            if (dVar == null) {
                dVar = g3Var.a(1);
            }
            g(e3.d.a(dVar, dVar2));
            e3.d dVar3 = this.f415972b[n3.e3.a(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            e3.d dVar4 = this.f415972b[n3.e3.a(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            e3.d dVar5 = this.f415972b[n3.e3.a(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract n3.g3 b();

    public void c(int i17, e3.d dVar) {
        if (this.f415972b == null) {
            this.f415972b = new e3.d[9];
        }
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0) {
                this.f415972b[n3.e3.a(i18)] = dVar;
            }
        }
    }

    public void d(e3.d dVar) {
    }

    public abstract void e(e3.d dVar);

    public void f(e3.d dVar) {
    }

    public abstract void g(e3.d dVar);

    public void h(e3.d dVar) {
    }

    public x2(n3.g3 g3Var) {
        this.f415971a = g3Var;
    }
}
