package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 f232785d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hf2 f232786e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k f232787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232787f = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j6(this);
    }

    public final void O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b84;
        this.f232785d = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.j7q);
        int b17 = i65.a.b(m158354x19263085(), 22);
        int a17 = i65.a.a(m158354x19263085(), 4.0f);
        int a18 = i65.a.a(m158354x19263085(), 4.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b842 = this.f232785d;
        if (c16630x650e2b842 != null) {
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            c16630x650e2b842.f232220n = true;
            c16630x650e2b842.f232219m = align;
            c16630x650e2b842.f232217h.setTextAlign(align);
            c16630x650e2b842.f232217h.setFakeBoldText(false);
            c16630x650e2b842.f232218i.setTextAlign(align);
            c16630x650e2b842.f232217h.setFakeBoldText(false);
            c16630x650e2b842.f232221o = a17;
            c16630x650e2b842.f232222p = b17;
            c16630x650e2b842.f232223q = a18;
            int i17 = a17 + b17 + a18;
            c16630x650e2b842.f232227u = i17;
            c16630x650e2b842.f232228v = i17;
            float f17 = b17;
            c16630x650e2b842.f232217h.setTextSize(f17);
            c16630x650e2b842.f232218i.setTextSize(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b843 = this.f232785d;
        if (c16630x650e2b843 != null) {
            c16630x650e2b843.m67234x764d6925(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b844 = this.f232785d;
        android.view.ViewGroup.LayoutParams layoutParams = c16630x650e2b844 != null ? c16630x650e2b844.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (m158354x19263085().getResources().getDisplayMetrics().heightPixels * 0.37f);
        r45.hf2 hf2Var = this.f232786e;
        if (hf2Var != null) {
            java.lang.String m75945x2fec8307 = hf2Var.m75945x2fec8307(6);
            r45.hf2 hf2Var2 = (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ^ true ? hf2Var : null;
            if (hf2Var2 != null) {
                ll3.h1 f18 = ll3.h1.f(hf2Var2.m75945x2fec8307(6), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4r), "", ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var2.m75945x2fec8307(4), hf2Var2.m75945x2fec8307(2)), hf2Var2.m75945x2fec8307(1), false, false);
                if (f18.e() > 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b845 = this.f232785d;
                    if (c16630x650e2b845 != null) {
                        c16630x650e2b845.m67233x12e1de9a(f18);
                    }
                    if (((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var2.m75945x2fec8307(4), hf2Var2.m75945x2fec8307(2)) || (c16630x650e2b84 = this.f232785d) == null) {
                        return;
                    }
                    c16630x650e2b84.m67231x9411da24(1L);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        kl3.t.g().f(this.f232787f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        kl3.t g17 = kl3.t.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar = this.f232787f;
        rl3.b bVar = (rl3.b) g17.a();
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f478768j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }
}
