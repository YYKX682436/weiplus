package oa2;

/* loaded from: classes2.dex */
public final class i extends x92.e {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public float H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B = jz5.h.b(new oa2.g(activity));
        this.C = jz5.h.b(new oa2.b(activity));
        this.D = jz5.h.b(new oa2.a(this));
        jz5.i iVar = jz5.i.f384364f;
        this.E = jz5.h.a(iVar, new oa2.c(this));
        this.F = jz5.h.a(iVar, new oa2.d(this));
        this.G = jz5.h.a(iVar, new oa2.e(this));
        this.H = -1.0f;
        this.I = jz5.h.b(oa2.h.f425352d);
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.r6w);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new oa2.f(this));
        }
        android.widget.TextView textView = (android.widget.TextView) this.G.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-designerTextView>(...)");
        com.p314xaae8f345.mm.ui.fk.b(textView);
        a7();
    }

    @Override // x92.e, x92.r
    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.r03 r03Var = (r45.r03) fVar;
        super.T6(r03Var);
        if (r03Var != null) {
            v92.g gVar = this.f534218u;
            pa2.g gVar2 = gVar instanceof pa2.g ? (pa2.g) gVar : null;
            if (gVar2 != null) {
                gVar2.f434509c = r03Var;
            }
            a7();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.E.mo141623x754a37bb();
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // x92.e
    public void W6(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / ((java.lang.Number) ((jz5.n) this.B).mo141623x754a37bb()).intValue();
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (this.H == abs) {
            return;
        }
        this.H = abs;
        ((android.view.View) ((jz5.n) this.D).mo141623x754a37bb()).setTranslationY((1.0f - abs) * ((java.lang.Number) ((jz5.n) this.C).mo141623x754a37bb()).intValue());
    }

    @Override // x92.e
    public v92.g X6() {
        return new pa2.g(m158354x19263085(), (r45.r03) this.f534252d);
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r03 r03Var = (r45.r03) this.f534252d;
        java.lang.String str = (r03Var == null || (r23Var = (r45.r23) r03Var.m75936x14adae67(23)) == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) ? null : b70Var.f452115d;
        return str == null ? "" : str;
    }

    public final void a7() {
        java.lang.String str;
        java.lang.String str2;
        r45.r23 r23Var;
        r45.r03 r03Var = (r45.r03) this.f534252d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (r03Var == null || (r23Var = (r45.r23) r03Var.m75936x14adae67(23)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r23Var.m75936x14adae67(6);
        if (c19786x6a1e2862 == null || (str = c19786x6a1e2862.m76523x98b23862()) == null) {
            str = "";
        }
        if (c19786x6a1e2862 == null || (str2 = c19786x6a1e2862.m76497x4fe38a1f()) == null) {
            str2 = "";
        }
        boolean z17 = true;
        boolean z18 = str.length() == 0;
        jz5.g gVar = this.I;
        if (z18) {
            bw5.a00 a00Var = ((ey2.c0) ((xy2.g) ((jz5.n) gVar).mo141623x754a37bb())).f338862e;
            str = a00Var != null ? a00Var.f106494g[3] ? a00Var.f106493f : "" : null;
        }
        if (!(str == null || str.length() == 0)) {
            ((android.widget.TextView) this.G.mo141623x754a37bb()).setText(str);
        }
        if (str2.length() == 0) {
            bw5.a00 a00Var2 = ((ey2.c0) ((xy2.g) ((jz5.n) gVar).mo141623x754a37bb())).f338862e;
            str2 = a00Var2 != null ? a00Var2.f106494g[2] ? a00Var2.f106492e : "" : null;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        jz5.g gVar2 = this.F;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) gVar2.mo141623x754a37bb()).m82040x7541828(b3.l.m9702x7444d5ad(m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) gVar2.mo141623x754a37bb()).m82037xa10c26f6(false);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) gVar2.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-designerIconView>(...)");
        e17.c(q3Var, c22699x3dcdb352, g1Var.h(mn2.f1.B));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        jz5.g gVar = this.D;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setTranslationY(((java.lang.Number) ((jz5.n) this.C).mo141623x754a37bb()).intValue());
    }
}
