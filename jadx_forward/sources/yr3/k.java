package yr3;

/* loaded from: classes11.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.o f546425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.m f546426e;

    public k(yr3.o oVar, yr3.m mVar) {
        this.f546425d = oVar;
        this.f546426e = mVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.s5 s5Var;
        r45.p5 p5Var;
        r45.l5 l5Var;
        int i18;
        r45.o5 o5Var;
        int i19;
        r45.o5 o5Var2;
        r45.o5 o5Var3;
        r45.z5 z5Var;
        r45.s5 s5Var2;
        r45.p5 p5Var2;
        r45.l5 l5Var2;
        r45.o5 o5Var4;
        r45.z5 z5Var2;
        if (i17 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this.f546425d.f546494d, "", "", true, true, yr3.j.f546406d);
            android.widget.TextView textView = Q.f293537d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            yr3.f fVar = this.f546426e.f546462e;
            if (!(fVar != null && fVar.f546339e)) {
                if (fVar != null && (s5Var = fVar.f546335a) != null && (p5Var = s5Var.f467047i) != null && (l5Var = p5Var.f464286d) != null) {
                    i18 = l5Var.f460671d;
                }
                i18 = 0;
            } else if (fVar == null || (o5Var4 = fVar.f546336b) == null || (z5Var2 = o5Var4.R) == null) {
                if (fVar != null && (s5Var2 = fVar.f546335a) != null && (p5Var2 = s5Var2.f467047i) != null && (l5Var2 = p5Var2.f464286d) != null) {
                    i18 = l5Var2.f460671d;
                }
                i18 = 0;
            } else {
                i18 = z5Var2.f473251e;
            }
            if (!(fVar != null && fVar.f546339e)) {
                if (fVar != null && (o5Var = fVar.f546336b) != null) {
                    i19 = o5Var.f463449g;
                }
                i19 = -1;
            } else if (fVar == null || (o5Var3 = fVar.f546336b) == null || (z5Var = o5Var3.R) == null) {
                if (fVar != null && (o5Var2 = fVar.f546336b) != null) {
                    i19 = o5Var2.f463449g;
                }
                i19 = -1;
            } else {
                i19 = z5Var.f473252f;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class);
            yr3.i iVar = new yr3.i(Q, this.f546426e, i18, i19, this.f546425d);
            sVar.getClass();
            sVar.Ai().a(i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.i(iVar));
        }
    }
}
