package v01;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f513737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f513738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513739f;

    public h(r45.vs2 vs2Var, android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6) {
        this.f513737d = vs2Var;
        this.f513738e = relativeLayout;
        this.f513739f = c11118xe5a619d6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initRedDot$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).Ai(0);
        r45.xs2 xs2Var = new r45.xs2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f513737d.f470021f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f m75932x347fbd55 = xs2Var.m75932x347fbd55(gVar != null ? gVar.g() : null);
        r45.xs2 xs2Var2 = m75932x347fbd55 instanceof r45.xs2 ? (r45.xs2) m75932x347fbd55 : null;
        if (xs2Var2 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
            boolean z18 = c19786x6a1e2862 != null && c19786x6a1e2862.m76503x92bc3c07() == 1;
            com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6 = this.f513739f;
            if (z18) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                if (c19786x6a1e28622 != null && (m76505xea668b3e = c19786x6a1e28622.m76505xea668b3e()) != null) {
                    v01.g gVar2 = new v01.g(c11118xe5a619d6);
                    int i17 = com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.f152398q;
                    c11118xe5a619d6.getClass();
                    java.lang.String m77174x10fbdaef = m76505xea668b3e.m77174x10fbdaef();
                    if (m77174x10fbdaef == null) {
                        m77174x10fbdaef = "";
                    }
                    java.lang.String m77175xf2b998c1 = m76505xea668b3e.m77175xf2b998c1();
                    java.lang.String m77188xfb83cc9b = m76505xea668b3e.m77188xfb83cc9b();
                    if (m77188xfb83cc9b == null) {
                        m77188xfb83cc9b = "";
                    }
                    int m77191x7520bed6 = m76505xea668b3e.m77191x7520bed6();
                    java.lang.String m77192x6a417fbb = m76505xea668b3e.m77192x6a417fbb();
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398547b = m77174x10fbdaef;
                    b1Var.f398545a = m77175xf2b998c1;
                    b1Var.f398555f = m77188xfb83cc9b;
                    b1Var.f398565k = m77191x7520bed6;
                    b1Var.f398567l = m77192x6a417fbb;
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    java.lang.String m77194xac98a158 = m76505xea668b3e.m77194xac98a158();
                    persistableBundle.putString("commonUxInfo", m77194xac98a158 != null ? m77194xac98a158 : "");
                    b1Var.f398563j = persistableBundle;
                    b1Var.f398561i = new v01.j(m76505xea668b3e);
                    b1Var.L = new v01.a(c11118xe5a619d6, gVar2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(c11118xe5a619d6.mo7438x76847179(), b1Var);
                }
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                if (c19786x6a1e28623 != null && c19786x6a1e28623.m76503x92bc3c07() == 2) {
                    z17 = true;
                }
                if (z17) {
                    android.content.Context context = this.f513738e.getContext();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                    java.lang.String m77166xb5887639 = (c19786x6a1e28624 == null || (m76494x46f709d9 = c19786x6a1e28624.m76494x46f709d9()) == null) ? null : m76494x46f709d9.m77166xb5887639();
                    if (context != null && m77166xb5887639 != null) {
                        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).tj(context, m77166xb5887639);
                        int i18 = com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.f152398q;
                        if (!c11118xe5a619d6.u0()) {
                            c11118xe5a619d6.y0();
                        }
                        r2 = jz5.f0.f384359a;
                    }
                    if (r2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileCardFragment", "jumpInfo url is null");
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parse jumpInfo error, type: ");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28625 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                    sb6.append(c19786x6a1e28625 != null ? java.lang.Integer.valueOf(c19786x6a1e28625.m76503x92bc3c07()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileCardFragment", sb6.toString());
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initRedDot$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
