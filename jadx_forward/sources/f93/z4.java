package f93;

/* loaded from: classes11.dex */
public final class z4 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f342063a;

    public z4(f93.b5 b5Var) {
        this.f342063a = b5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c0m, viewGroup, false);
        f93.b5 b5Var = this.f342063a;
        f93.u4 u4Var = b5Var.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderLabelDataItem.HeaderLabelViewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d98);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        u4Var.f342012a = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        b5Var.H = java.lang.Integer.valueOf(i65.a.h(u4Var.a().getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565572ct2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        u4Var.f342013b = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dhb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        u4Var.f342014c = (android.widget.TextView) findViewById3;
        u4Var.a();
        f93.b5 b5Var2 = u4Var.f342015d;
        b5Var2.getClass();
        u4Var.a().mo81583x7e4f2d39(new android.text.InputFilter[]{new f93.t4(u4Var)});
        u4Var.a().requestFocus();
        u4Var.a().addTextChangedListener(new f93.v4(b5Var, u4Var));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new f93.w4(u4Var), 0L);
        android.widget.ImageView imageView = u4Var.f342013b;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteBtn");
            throw null;
        }
        imageView.setOnClickListener(new f93.x4(u4Var, b5Var));
        u4Var.b();
        u4Var.b().setOnTouchListener(new f93.y4(u4Var));
        java.lang.String text = b5Var.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        u4Var.a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(text)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = u4Var.a().getContext();
            java.lang.Integer num = b5Var2.H;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            u4Var.a().setText(((ke0.e) xVar).bj(context2, text, num.intValue()));
        }
        u4Var.a().setHint(u4Var.a().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8z));
        inflate.setTag(u4Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
    }
}
