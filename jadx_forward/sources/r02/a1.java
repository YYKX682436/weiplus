package r02;

/* loaded from: classes8.dex */
public class a1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 f449818a;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928) {
        this.f449818a = c13250xfa9a7928;
    }

    @Override // vl1.n
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        android.view.View childAt = ((android.view.ViewGroup) view).getChildAt(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f449818a;
        m43.e eVar = c13250xfa9a7928.f178951f2.f449857d;
        if (i17 < 0 || i17 >= eVar.size()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) eVar.get(i17);
        if (r0Var.f178847c == 7) {
            r02.r0 r0Var2 = c13250xfa9a7928.f178951f2;
            if (!r0Var2.f449862i) {
                r0Var2.f449862i = true;
                r0Var2.m8146xced61ae5();
            }
            o02.a.b(10, 1004, 101, 2, "", "", "");
            return;
        }
        if (!c13250xfa9a7928.f178963r2) {
            childAt.setSelected(!r0Var.f178846b);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f178854j)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rawUrl", r0Var.f178854j);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(c13250xfa9a7928.getContext(), bundle);
        o02.a.b(10, o02.a.a(r0Var.f178847c), r0Var.f178848d, 40, r0Var.f178850f, "", "");
    }
}
