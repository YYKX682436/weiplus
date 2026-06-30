package bm2;

/* loaded from: classes3.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f103544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f103545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103546f;

    public j5(bm2.m4 m4Var, bm2.b5 b5Var, bm2.n5 n5Var) {
        this.f103544d = m4Var;
        this.f103545e = b5Var;
        this.f103546f = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList m75941xfb821914;
        bm2.m4 m4Var = this.f103544d;
        r45.xn1 xn1Var = m4Var.f103634a;
        boolean z17 = (xn1Var == null || (m75941xfb821914 = xn1Var.m75941xfb821914(11)) == null || m75941xfb821914.isEmpty()) ? false : true;
        bm2.b5 b5Var = this.f103545e;
        if (!z17) {
            b5Var.f103329g.setText("");
            b5Var.f103329g.setVisibility(8);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View view = b5Var.f103326d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.widget.TextView textView = b5Var.f103329g;
        int V0 = r4Var.V0((android.view.ViewGroup) view, new int[]{textView.getId()});
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.widget.TextView textView2 = b5Var.f103329g;
        android.content.Context context = b5Var.f3639x46306858.getContext();
        r45.xn1 xn1Var2 = m4Var.f103634a;
        java.util.LinkedList m75941xfb8219142 = xn1Var2.m75941xfb821914(11);
        int[] iArr = {2, 4, 5, 13, 14, 17, 15, 16, 19, 20};
        int ordinal = this.f103546f.f103674d.ordinal();
        gm2.c2 c2Var = ordinal != 1 ? ordinal != 2 ? gm2.c2.f354883i : gm2.c2.f354882h : gm2.c2.f354881g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        jz5.l d17 = gm2.c1.d(c1Var, textView2, context, " ", m75941xfb8219142, iArr, c2Var, null, 3, java.lang.Integer.valueOf(V0), null, 576, null);
        textView.setText((java.lang.CharSequence) d17.f384366d);
        textView.setVisibility(0);
        if (((java.util.List) d17.f384367e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f410306y6;
            java.util.LinkedList m75941xfb8219143 = xn1Var2.m75941xfb821914(11);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
            sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
            sb6.append(",setRewardMember");
            x0Var.b(m75941xfb8219143, sb6.toString());
        }
    }
}
