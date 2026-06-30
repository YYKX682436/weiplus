package jf5;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f381050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77) {
        super(2);
        this.f381050d = c22095x76baed77;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77 = this.f381050d;
        if (c22095x76baed77.f286206t == null) {
            c22095x76baed77.f286206t = c22095x76baed77.A;
            c22095x76baed77.D = null;
            c22095x76baed77.E = null;
            c22095x76baed77.F = null;
        }
        c22095x76baed77.f286207u = new android.graphics.PointF(floatValue, floatValue2);
        c22095x76baed77.k();
        jf5.i iVar = c22095x76baed77.f286206t;
        if (iVar == null) {
            iVar = c22095x76baed77.A;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77.c(c22095x76baed77, iVar, floatValue, floatValue2);
        jf5.q0 q0Var = c22095x76baed77.f286193d;
        jf5.n0 n0Var = q0Var.f381032b;
        jf5.i iVar2 = c22095x76baed77.A;
        jf5.i iVar3 = jf5.i.f381000e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22096x6bae5f79 c22096x6bae5f79 = c22095x76baed77.f286197h;
        if (iVar2 == iVar3) {
            c22096x6bae5f79.m80151xce4e722a(n0Var != null ? n0Var.f381018b : 0);
        } else {
            jf5.n0 n0Var2 = q0Var.f381031a;
            c22096x6bae5f79.m80151xce4e722a(n0Var2 != null ? n0Var2.f381018b : 0);
        }
        jf5.p pVar = c22095x76baed77.R;
        c22095x76baed77.removeCallbacks(pVar);
        c22095x76baed77.postOnAnimation(pVar);
        return jz5.f0.f384359a;
    }
}
