package el2;

/* loaded from: classes3.dex */
public final class s1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335441d;

    public s1(el2.c2 c2Var) {
        this.f335441d = c2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        byte[] g17;
        r45.y42 y42Var = (r45.y42) obj;
        el2.c2 c2Var = this.f335441d;
        java.lang.String str = c2Var.f335296f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive info = ");
        sb6.append(y42Var != null ? pm0.b0.g(y42Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) c2Var.f335297g).mo141623x754a37bb();
        android.view.ViewGroup viewGroup = c2Var.f335294d;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(viewGroup.getContext(), com.p314xaae8f345.mm.R.raw.f80477x7898ed47, 0));
        java.lang.Integer valueOf = y42Var != null ? java.lang.Integer.valueOf(y42Var.m75939xb282bd08(1)) : null;
        bf2.c cVar = bf2.c.f101131a;
        if (valueOf != null && valueOf.intValue() == 4) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y42Var);
            r45.k92 k92Var = new r45.k92();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = y42Var.m75934xbce7f2f(2);
            g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    k92Var.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            bf2.c.c(cVar, c2Var.l(), 1, 4, pm0.v.u(k92Var.m75942xfb822ef2(0)), 0, null, 0, 2, null, 0, nd1.y0.f72985x366c91de, null);
            viewGroup.setOnClickListener(new el2.w1(c2Var, k92Var, y42Var));
        } else {
            if (((valueOf != null && valueOf.intValue() == 999) || (valueOf != null && valueOf.intValue() == 15)) || (valueOf != null && valueOf.intValue() == 18)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y42Var);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = y42Var.m75934xbce7f2f(2);
                g17 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                if (g17 != null) {
                    try {
                        c19786x6a1e2862.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                    }
                }
                cm2.b0 b0Var = new cm2.b0(c19786x6a1e2862, y42Var.m75939xb282bd08(1));
                b0Var.f124930s = y42Var.m75934xbce7f2f(5);
                b0Var.f124931t = y42Var.m75934xbce7f2f(6);
                java.lang.String m75945x2fec8307 = y42Var.m75945x2fec8307(4);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                b0Var.f124920f = m75945x2fec8307;
                java.lang.Integer g18 = b0Var.g();
                if (g18 != null) {
                    int intValue = g18.intValue();
                    gk2.e l17 = c2Var.l();
                    java.lang.String m76501xf2fd2296 = b0Var.f124864v.m76501xf2fd2296();
                    bf2.c.c(cVar, l17, 1, intValue, m76501xf2fd2296 == null ? "" : m76501xf2fd2296, 0, null, 0, 2, null, 0, nd1.y0.f72985x366c91de, null);
                }
                viewGroup.setOnClickListener(new el2.a2(b0Var, c2Var, y42Var));
            } else {
                viewGroup.setVisibility(8);
                viewGroup.setOnClickListener(null);
            }
        }
        jf2.k0 k0Var = (jf2.k0) c2Var.f335295e.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("promoteEntranceInfo", false);
        }
    }
}
