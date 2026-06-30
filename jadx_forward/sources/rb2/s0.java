package rb2;

/* loaded from: classes10.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f475280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475283g;

    public s0(rb2.y0 y0Var, in5.s0 s0Var, so2.y0 y0Var2, android.view.ViewGroup viewGroup) {
        this.f475280d = y0Var;
        this.f475281e = s0Var;
        this.f475282f = y0Var2;
        this.f475283g = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindThumbLike$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup llThumbLikeContainer = this.f475283g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(llThumbLikeContainer, "$llThumbLikeContainer");
        rb2.y0 y0Var = this.f475280d;
        y0Var.getClass();
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = y0Var.f475362e;
        long j17 = c14994x9b99c079.f66939xc8a07680;
        so2.y0 y0Var2 = this.f475282f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var2.f492236d;
        int i17 = y0Var.f475363f;
        boolean i18 = n1Var.i(j17, yj0Var, i17);
        boolean m59303x7d1523 = c14994x9b99c079.m59303x7d1523();
        in5.s0 s0Var = this.f475281e;
        if (m59303x7d1523) {
            int i19 = i18 ? com.p314xaae8f345.mm.R.C30867xcad56011.m7l : com.p314xaae8f345.mm.R.C30867xcad56011.m7j;
            android.content.Context context = s0Var.f374654e;
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(i19);
            e4Var.c();
        } else {
            if (!i18) {
                hc2.f1.d(llThumbLikeContainer);
            }
            y0Var.f475365h.mo146xb9724478(java.lang.Integer.valueOf(s0Var.m8183xf806b362()));
            y0Var.r(s0Var, !i18, n1Var.b(c14994x9b99c079.f66939xc8a07680, y0Var2.f492236d, i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindThumbLike$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
