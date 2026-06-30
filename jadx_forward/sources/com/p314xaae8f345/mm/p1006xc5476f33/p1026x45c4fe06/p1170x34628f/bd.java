package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class bd extends android.widget.FrameLayout implements al1.i {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f167975d;

    /* renamed from: e, reason: collision with root package name */
    public al1.l f167976e;

    /* renamed from: f, reason: collision with root package name */
    public al1.b f167977f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f167978g;

    public bd(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        super(context);
        this.f167978g = false;
        this.f167975d = v5Var;
        k91.f M1 = v5Var.M1();
        if (M1 == null) {
            return;
        }
        if (M1.a()) {
            al1.l lVar = new al1.l(getContext());
            this.f167976e = lVar;
            lVar.m2239xb6ab3395(false);
            al1.b bVar = (al1.b) v5Var.A1().a(getContext(), al1.b.class);
            this.f167977f = bVar;
            bVar.m2222xad580900(false);
            this.f167977f.l(true, al1.h0.PageConfig);
            try {
                mi1.v vVar = v5Var.mo32091x9a3f0ba2().f156354z;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c = this.f167977f.m2209x716f693c();
                if (m2209x716f693c != null) {
                    mi1.i iVar = vVar.f408237c;
                    if (iVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                        throw null;
                    }
                    m2209x716f693c.m52134x81bbe4b4(iVar.m147347xbe6f1d74().getMeasuredWidth());
                } else {
                    vVar.getClass();
                }
            } catch (java.lang.NullPointerException unused) {
            }
            b();
            this.f167976e.addView(this.f167977f);
            addView(this.f167976e, -1, -2);
        }
        java.lang.String str = M1.f387251g;
        int i17 = v5Var.mo32091x9a3f0ba2().m0().g() ? -15132391 : -1;
        try {
            i17 = ik1.w.l(str);
        } catch (java.lang.Exception unused2) {
        }
        setBackgroundColor(i17);
    }

    public final void a() {
        if (this.f167977f != null) {
            if (getVisibility() == 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (n3.x0.b(this)) {
                    this.f167977f.mo2223x5b5c5185(true);
                    this.f167976e.m2239xb6ab3395(true);
                    return;
                }
            }
            this.f167977f.mo2223x5b5c5185(false);
            this.f167976e.m2239xb6ab3395(false);
        }
    }

    public final void b() {
        if (this.f167977f == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f167975d;
        if (android.text.TextUtils.isEmpty(v5Var.r1().m2212xefd74969())) {
            this.f167977f.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
        } else {
            this.f167977f.mo2224x4c2b09dd(v5Var.r1().m2212xefd74969());
        }
        this.f167977f.mo2227x506dbe6b(v5Var.r1().f87278v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        if (i17 == 0) {
            setWillNotDraw(true);
            return;
        }
        int i18 = i17 | (-16777216);
        setWillNotDraw(false);
        super.setBackgroundColor(i18);
        al1.b bVar = this.f167977f;
        if (bVar != null) {
            bVar.m2216x67d2e40e(1.0d);
            this.f167977f.mo134899x67f06213(i18);
            boolean z17 = !com.p314xaae8f345.mm.ui.uk.g(i18);
            this.f167977f.m2221xf5e6816c(z17);
            al1.l lVar = this.f167976e;
            if (lVar != null) {
                lVar.m2243xf1b0d7af(z17);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        a();
    }
}
