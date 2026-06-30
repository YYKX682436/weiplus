package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px1 f200183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80 f200184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 f200185f;

    public i80(r45.px1 px1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80 j80Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 k80Var) {
        this.f200183d = px1Var;
        this.f200184e = j80Var;
        this.f200185f = k80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.LinkedList m75941xfb821914;
        r45.px1 px1Var = this.f200183d;
        r45.xn1 xn1Var = px1Var.f464985d;
        boolean z17 = (xn1Var == null || (m75941xfb821914 = xn1Var.m75941xfb821914(11)) == null || m75941xfb821914.isEmpty()) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80 j80Var = this.f200184e;
        if (!z17) {
            j80Var.f200270i.setText("");
            j80Var.f200270i.setVisibility(8);
            java.lang.String str = j80Var.f200265d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
            sb6.append(" badge_infos is empty!");
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7, null);
            j80Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6j, "");
            return;
        }
        java.util.List k17 = kz5.c0.k(2, 4, 5, 10, 13, 14, 17, 16, 12, 20);
        r45.xn1 xn1Var2 = px1Var.f464985d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zl2.r4.f555483a.B1(xn1Var2));
        if (valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            k17.add(15);
        }
        java.lang.Object parent = j80Var.f200270i.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((android.view.View) parent).getWidth() - j80Var.f200267f.getWidth();
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.widget.TextView textView = j80Var.f200270i;
        android.content.Context context = j80Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.xn1 xn1Var3 = px1Var.f464985d;
        java.util.LinkedList m75941xfb8219142 = xn1Var3 != null ? xn1Var3.m75941xfb821914(11) : null;
        int[] R0 = kz5.n0.R0(k17);
        zl2.u4 u4Var = this.f200185f.f200355d;
        j80Var.getClass();
        int ordinal = u4Var.ordinal();
        jz5.l d17 = gm2.c1.d(c1Var, textView, context, " ", m75941xfb8219142, R0, ordinal != 1 ? ordinal != 2 ? gm2.c2.f354883i : gm2.c2.f354882h : gm2.c2.f354881g, null, 4, java.lang.Integer.valueOf(width), null, 576, null);
        android.widget.TextView textView2 = j80Var.f200270i;
        java.lang.Object obj = d17.f384366d;
        textView2.setText((java.lang.CharSequence) obj);
        j80Var.f200270i.setVisibility(0);
        if (((java.util.List) d17.f384367e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f410306y6;
            java.util.LinkedList m75941xfb8219143 = xn1Var2.m75941xfb821914(11);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
            sb8.append(c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76184x8010e5e4() : null);
            sb8.append(",setUserItem");
            x0Var.b(m75941xfb8219143, sb8.toString());
        }
        j80Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6j, obj);
    }
}
