package bm2;

/* loaded from: classes3.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f103599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.q4 f103600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103601f;

    public l5(bm2.m4 m4Var, bm2.q4 q4Var, bm2.n5 n5Var) {
        this.f103599d = m4Var;
        this.f103600e = q4Var;
        this.f103601f = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.util.LinkedList m75941xfb821914;
        bm2.m4 m4Var = this.f103599d;
        r45.xn1 xn1Var = m4Var.f103634a;
        boolean z17 = (xn1Var == null || (m75941xfb821914 = xn1Var.m75941xfb821914(11)) == null || m75941xfb821914.isEmpty()) ? false : true;
        r45.xn1 xn1Var2 = m4Var.f103634a;
        bm2.n5 n5Var = this.f103601f;
        java.lang.String str = null;
        bm2.q4 q4Var = this.f103600e;
        if (!z17) {
            q4Var.f103787p.setText("");
            q4Var.f103787p.setVisibility(8);
            java.lang.String str2 = n5Var.f103682o;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                str = c19782x23db1cfa.m76184x8010e5e4();
            }
            sb6.append(str);
            sb6.append(" badge_infos is empty!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6j, "");
            return;
        }
        android.view.ViewParent parent = q4Var.f103787p.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.widget.TextView textView = q4Var.f103787p;
        java.lang.Integer valueOf = viewGroup != null ? java.lang.Integer.valueOf(zl2.r4.f555483a.V0(viewGroup, new int[]{textView.getId(), q4Var.f103789r.getId()})) : null;
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.widget.TextView textView2 = q4Var.f103787p;
        android.content.Context context = q4Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.LinkedList m75941xfb8219142 = xn1Var2.m75941xfb821914(11);
        int[] iArr = {2, 4, 5, 10, 13, 14, 17, 15, 16, 9, 12, 19, 20};
        int ordinal = n5Var.f103674d.ordinal();
        jz5.l d17 = gm2.c1.d(c1Var, textView2, context, " ", m75941xfb8219142, iArr, ordinal != 1 ? ordinal != 2 ? gm2.c2.f354883i : gm2.c2.f354882h : gm2.c2.f354881g, null, 4, valueOf, null, 576, null);
        java.lang.Object obj = d17.f384366d;
        textView.setText((java.lang.CharSequence) obj);
        textView.setVisibility(0);
        if (((java.util.List) d17.f384367e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f410306y6;
            java.util.LinkedList m75941xfb8219143 = xn1Var2.m75941xfb821914(11);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (xn1Var2 != null && (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                str = c19782x23db1cfa2.m76184x8010e5e4();
            }
            sb7.append(str);
            sb7.append(",setUserItem");
            x0Var.b(m75941xfb8219143, sb7.toString());
        }
        q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6j, obj);
    }
}
