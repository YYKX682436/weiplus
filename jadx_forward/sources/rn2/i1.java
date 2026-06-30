package rn2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479299d;

    public i1(rn2.t2 t2Var) {
        this.f479299d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2 t2Var = this.f479299d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
        t2Var.M = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC21394xb3d2c0cf, 0, 2);
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.der, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.q8_);
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drb));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.q8a);
        if (findViewById != null) {
            findViewById.setOnClickListener(new rn2.m2(t2Var));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = t2Var.M;
        if (z2Var != null) {
            z2Var.s(inflate);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(abstractActivityC21394xb3d2c0cf, null);
        c1163xf1deaba4.m7963x830bc99d(true);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf, 1, false));
        rn2.w2 w2Var = new rn2.w2();
        rn2.f fVar = t2Var.f479387f;
        w2Var.f479440d = fVar != null ? ((rn2.c1) fVar).f479215y.f479236e : null;
        w2Var.f479441e = new rn2.n2(t2Var);
        c1163xf1deaba4.mo7960x6cab2c8d(w2Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = t2Var.M;
        if (z2Var2 != null) {
            z2Var2.j(c1163xf1deaba4);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
        if (layoutParams != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = t2Var.M;
        if (z2Var3 != null) {
            z2Var3.C();
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 19);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 8);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5((zy2.zb) c18, 6L, jSONObject2.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
