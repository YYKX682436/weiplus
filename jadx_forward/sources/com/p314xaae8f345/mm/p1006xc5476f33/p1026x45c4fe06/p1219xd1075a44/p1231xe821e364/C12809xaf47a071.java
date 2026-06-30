package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView */
/* loaded from: classes11.dex */
public class C12809xaf47a071 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public vl1.g f173631b2;

    /* renamed from: c2, reason: collision with root package name */
    public vl1.n f173632c2;

    /* renamed from: d2, reason: collision with root package name */
    public vl1.o f173633d2;

    /* renamed from: e2, reason: collision with root package name */
    public android.view.View f173634e2;

    public C12809xaf47a071(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h1();
    }

    private void h1() {
        vl1.g gVar = new vl1.g();
        this.f173631b2 = gVar;
        gVar.mo8164xbbdced85(true);
        super.mo7960x6cab2c8d(this.f173631b2);
        this.f173631b2.mo8163xed962dec(new vl1.k(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void a1(int i17) {
        super.a1(i17);
    }

    /* renamed from: addFooterView */
    public void mo53680x55dede61(android.view.View view) {
        vl1.g gVar = this.f173631b2;
        ((java.util.LinkedList) gVar.f519331h).add(view);
        gVar.m8151xc67946d3(gVar.mo1894x7e414b06() - 1, 1);
    }

    /* renamed from: addHeaderView */
    public void m53684x77114253(android.view.View view) {
        vl1.g gVar = this.f173631b2;
        ((java.util.LinkedList) gVar.f519330g).add(view);
        gVar.m8151xc67946d3(0, 1);
    }

    public int g1(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        vl1.g gVar = this.f173631b2;
        if (gVar == null) {
            return -1;
        }
        gVar.getClass();
        if (k3Var == null || k3Var.m8183xf806b362() == -1) {
            return -1;
        }
        return k3Var.m8183xf806b362() - (!gVar.f519330g.isEmpty() ? 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: getAdapter */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19() {
        return this.f173631b2;
    }

    /* renamed from: getEmptyView */
    public android.view.View m53685xaacb36dc() {
        return this.f173634e2;
    }

    public void i1(android.view.View view) {
        vl1.g gVar = this.f173631b2;
        ((java.util.LinkedList) gVar.f519331h).remove(view);
        gVar.m8151xc67946d3(gVar.mo1894x7e414b06() - 1, 1);
    }

    public void j1(android.view.View view) {
        vl1.g gVar = this.f173631b2;
        ((java.util.LinkedList) gVar.f519330g).remove(view);
        gVar.m8151xc67946d3(0, 1);
    }

    public boolean k1() {
        return this.f173631b2.mo1894x7e414b06() == 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setAdapter */
    public void mo7960x6cab2c8d(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        vl1.g gVar = this.f173631b2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2 = gVar.f519327d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var = gVar.f519334n;
        if (f2Var2 != null) {
            if (f2Var2.equals(f2Var)) {
                return;
            } else {
                gVar.f519327d.mo8165x48eac7b3(h2Var);
            }
        }
        gVar.f519327d = f2Var;
        if (f2Var != null) {
            f2Var.mo8163xed962dec(h2Var);
        }
    }

    /* renamed from: setEmptyView */
    public void m53686x71ef750(android.view.View view) {
        if (this.f173634e2 == view) {
            return;
        }
        this.f173634e2 = view;
        if (view != null) {
            int i17 = k1() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setOnItemClickListener */
    public void m53687xa1aeda28(vl1.n nVar) {
        this.f173632c2 = nVar;
        this.f173631b2.f519332i = new vl1.l(this);
    }

    /* renamed from: setOnItemLongClickListener */
    public void m53688x1c3e70c(vl1.o oVar) {
        this.f173633d2 = oVar;
        this.f173631b2.f519333m = new vl1.m(this);
    }

    public C12809xaf47a071(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        h1();
    }

    public C12809xaf47a071(android.content.Context context) {
        super(context, null);
        h1();
    }
}
