package fa;

/* loaded from: classes14.dex */
public class x implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2710xed0f221b f342183a;

    public x(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2710xed0f221b c2710xed0f221b) {
        this.f342183a = c2710xed0f221b;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2710xed0f221b c2710xed0f221b = this.f342183a;
        if (c2710xed0f221b.f126054e == null) {
            c2710xed0f221b.f126054e = new android.graphics.Rect();
        }
        c2710xed0f221b.f126054e.set(g3Var.c(), g3Var.e(), g3Var.d(), g3Var.b());
        c2710xed0f221b.a(g3Var);
        n3.d3 d3Var = g3Var.f415871a;
        boolean z17 = true;
        if ((!d3Var.l().m126834xb2c87fbf(e3.d.f328576e)) && c2710xed0f221b.f126053d != null) {
            z17 = false;
        }
        c2710xed0f221b.setWillNotDraw(z17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(c2710xed0f221b);
        return d3Var.c();
    }
}
