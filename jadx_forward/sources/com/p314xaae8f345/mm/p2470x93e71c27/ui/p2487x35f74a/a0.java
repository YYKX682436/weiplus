package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f272695d = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f272696a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f272697b;

    /* renamed from: c, reason: collision with root package name */
    public long f272698c = 0;

    public void a(android.view.View view, r35.m3 m3Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar;
        java.lang.String mo9820x6bf53a6c;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c19;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c27;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c28;
        if (java.lang.System.currentTimeMillis() - this.f272698c <= 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanClickListener", "process pass");
            return;
        }
        this.f272698c = java.lang.System.currentTimeMillis();
        if (m3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
            return;
        }
        if (this.f272696a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
            return;
        }
        java.util.LinkedList linkedList = f272695d;
        if (linkedList == null || linkedList.size() <= 0) {
            zVar = null;
        } else {
            linkedList.size();
            zVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z) linkedList.getLast();
        }
        if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) || (c28 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c()) == null) {
            mo9820x6bf53a6c = (view == null || !(view.getTag() instanceof b45.a)) ? null : ((b45.a) view.getTag()).mo9820x6bf53a6c();
        } else {
            mo9820x6bf53a6c = c28.Q0();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(mo9820x6bf53a6c)) {
                mo9820x6bf53a6c = c01.w9.s(c28.j());
            }
        }
        m3Var.f450730f = mo9820x6bf53a6c;
        m3Var.f450731g = (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) || (c27 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c()) == null || c27.A0() != 1) ? null : c01.z1.r();
        m3Var.f450732h = (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) || (c19 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c()) == null) ? null : c19.j();
        m3Var.f450733i = (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) || (c18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c()) == null) ? null : c18.Q0();
        int i17 = 0;
        m3Var.f450734j = (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) || (c17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c()) == null || c17.mo78013xfb85f7b0() != 10000) ? 0 : c17.X;
        m3Var.f450739o = (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5)) ? null : ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5) view.getTag())).c();
        m3Var.f450740p = (view == null || !(view.getTag() instanceof b45.a)) ? 1 : ((b45.a) view.getTag()).b();
        m3Var.f450741q = (view == null || !(view.getTag() instanceof b45.a)) ? null : ((b45.a) view.getTag()).a();
        if (m3Var.f450738n == 0) {
            if (view != null && (view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5)) {
                i17 = 1;
            } else if (view != null && (view.getTag() instanceof b45.a)) {
                i17 = 2;
            }
            if (i17 != 0) {
                m3Var.f450738n = i17;
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f272697b)) {
            m3Var.f450737m = this.f272697b;
        }
        ((com.p314xaae8f345.mm.app.p622xc5476f33.s) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.n.a()).h(this.f272696a, view, m3Var, zVar);
        if (view != null && (view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l5)) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(m3Var.f450730f, 1);
        }
        m3Var.f450737m = null;
    }
}
