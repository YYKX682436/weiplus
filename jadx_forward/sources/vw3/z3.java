package vw3;

/* loaded from: classes4.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI f522739d;

    public z3(com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI repairerNewXmlUI) {
        this.f522739d = repairerNewXmlUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.j4 j4Var = new r45.j4();
        j4Var.f459093g = 10002;
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI repairerNewXmlUI = this.f522739d;
        java.lang.String obj = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerNewXmlUI.findViewById(com.p314xaae8f345.mm.R.id.psp)).getText().toString();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = obj;
        du5Var.f454290e = true;
        j4Var.f459094h = du5Var;
        java.lang.String obj2 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerNewXmlUI.findViewById(com.p314xaae8f345.mm.R.id.pwk)).getText().toString();
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = obj2;
        du5Var2.f454290e = true;
        j4Var.f459091e = du5Var2;
        java.lang.Long j17 = r26.h0.j(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerNewXmlUI.findViewById(com.p314xaae8f345.mm.R.id.t2y)).getText().toString());
        long longValue = j17 != null ? j17.longValue() : 0L;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, false, false, false);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new vw3.y3(h0Var), longValue);
        java.lang.String str = com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.d = obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "<set-?>");
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.e = obj2;
        db5.t7.n(repairerNewXmlUI.mo55332x76847179(), "推送成功！");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
