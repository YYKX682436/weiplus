package r35;

/* loaded from: classes11.dex */
public class s1 implements lz.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.u1 f450786a;

    public s1(r35.u1 u1Var) {
        this.f450786a = u1Var;
    }

    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        r35.v1 v1Var;
        r35.u1 u1Var = this.f450786a;
        r35.d2 d2Var = u1Var.f450810i;
        if (d2Var == null || (v1Var = u1Var.f450807f) == null) {
            return;
        }
        boolean z17 = v1Var.f450837w;
        if (!z17 ? v1Var.f450826i || i17 != v1Var.f450835u + 1 : v1Var.f450826i || i17 != v1Var.f450835u + 2) {
            d2Var.b(viewGroup, view, i17);
            return;
        }
        boolean z18 = v1Var.f450826i;
        if (!z18 && i17 == v1Var.f450835u) {
            if (v1Var.f450838x) {
                d2Var.c(viewGroup, view, i17);
                return;
            }
            return;
        }
        if (!z18 && i17 == v1Var.f450835u + 1) {
            if (z17) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(u1Var.f450811j)) {
                    u1Var.f450810i.a(viewGroup, view, i17);
                    return;
                } else {
                    u1Var.f450807f.a(0);
                    return;
                }
            }
            return;
        }
        if (z18 && v1Var.g(i17)) {
            u1Var.f450810i.a(viewGroup, view, i17);
            return;
        }
        r35.v1 v1Var2 = u1Var.f450807f;
        if (v1Var2.f450826i && !v1Var2.g(i17)) {
            u1Var.f450810i.d(viewGroup, view, i17);
            return;
        }
        r35.v1 v1Var3 = u1Var.f450807f;
        if (v1Var3.f450826i || !v1Var3.g(i17)) {
            return;
        }
        u1Var.f450810i.e(viewGroup, view, i17);
    }
}
