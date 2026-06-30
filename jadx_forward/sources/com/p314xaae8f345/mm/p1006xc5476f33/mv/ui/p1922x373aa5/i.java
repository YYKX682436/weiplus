package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f233390f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f233391g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f233392h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f233394j;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a f233398n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b f233399o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.c f233400p;

    /* renamed from: i, reason: collision with root package name */
    public final float f233393i = 50.0f;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h f233395k = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h(this);

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g f233396l = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g(this);

    /* renamed from: m, reason: collision with root package name */
    public int f233397m = -1;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        super.b(c1163xf1deaba4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f233392h;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h hVar = this.f233395k;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.V0(hVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f233392h;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g gVar = this.f233396l;
        if (c1163xf1deaba43 != null && (mo7946xf939df192 = c1163xf1deaba43.mo7946xf939df19()) != null) {
            mo7946xf939df192.mo8165x48eac7b3(gVar);
        }
        this.f233392h = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(hVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f233392h;
        if (c1163xf1deaba44 != null && (mo7946xf939df19 = c1163xf1deaba44.mo7946xf939df19()) != null) {
            mo7946xf939df19.mo8163xed962dec(gVar);
        }
        n();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3)) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f233392h;
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.d(this, layoutManager, c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        android.view.View f17 = super.f(layoutManager);
        android.view.ViewGroup.LayoutParams layoutParams = f17 != null ? f17.getLayoutParams() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        if (this.f233397m != a17) {
            this.f233397m = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a aVar = this.f233398n;
            if (aVar != null) {
                aVar.mo67286x510f45c9(a17);
            }
        }
        return f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var;
        int i19;
        int i27;
        android.graphics.PointF a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        int m8020x7e414b06 = layoutManager.m8020x7e414b06();
        if (m8020x7e414b06 == 0) {
            return -1;
        }
        if (layoutManager.getF204840r()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f233390f;
            if (w1Var2 == null || w1Var2.f93792a != layoutManager) {
                this.f233390f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            w1Var = this.f233390f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var3 = this.f233391g;
            if (w1Var3 == null || w1Var3.f93792a != layoutManager) {
                this.f233391g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
            }
            w1Var = this.f233391g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var);
        }
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 != 0) {
            int k17 = layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
            int i28 = Integer.MAX_VALUE;
            for (int i29 = 0; i29 < m8008x3d79f549; i29++) {
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i29);
                int abs = java.lang.Math.abs((w1Var.e(m8007x6a486239) + (w1Var.c(m8007x6a486239) / 2)) - k17);
                if (abs < i28) {
                    view = m8007x6a486239;
                    i28 = abs;
                }
            }
        }
        if (view == null) {
            return -1;
        }
        int m8032xa86cd69f = layoutManager.m8032xa86cd69f(view);
        if (w1Var.e(view) < w1Var.k()) {
            i27 = m8032xa86cd69f + 1;
            i19 = m8032xa86cd69f;
        } else {
            i19 = m8032xa86cd69f - 1;
            i27 = m8032xa86cd69f;
        }
        if (m8032xa86cd69f == -1) {
            return -1;
        }
        boolean z17 = !layoutManager.mo2416xc6ea780e() ? i18 <= 0 : i17 <= 0;
        if (!((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) && (a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) layoutManager).a(m8020x7e414b06 + (-1))) != null && (a17.x < 0.0f || a17.y < 0.0f)) ? z17 : !z17) {
            i19 = i27;
        }
        int i37 = i19 >= 0 ? i19 : 0;
        if (i37 >= m8020x7e414b06) {
            i37 = m8020x7e414b06 - 1;
        }
        if (i37 != this.f233397m) {
            this.f233397m = i37;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a aVar = this.f233398n;
            if (aVar != null) {
                aVar.mo67286x510f45c9(i37);
            }
        }
        return this.f233397m;
    }

    public final void n() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d;
        android.view.View f17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b bVar;
        if (this.f233399o == null || (c1163xf1deaba4 = this.f233392h) == null || (mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d()) == null || (f17 = f(mo7951xfd37656d)) == null) {
            return;
        }
        int[] c17 = c(mo7951xfd37656d, f17);
        if ((c17[0] == 0 || c17[1] == 0) && (bVar = this.f233399o) != null) {
            bVar.a(this.f233397m);
        }
    }
}
