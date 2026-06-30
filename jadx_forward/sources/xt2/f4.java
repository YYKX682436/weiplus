package xt2;

/* loaded from: classes3.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j31 f538277e;

    public f4(xt2.b5 b5Var, r45.j31 j31Var) {
        this.f538276d = b5Var;
        this.f538277e = j31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.c33 c33Var;
        java.lang.String m75945x2fec8307;
        r45.c33 c33Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initFlashSaleSettings$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.b5 b5Var = this.f538276d;
        gk2.e eVar = b5Var.f538170i;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = b5Var.f538169h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.j31 j31Var = this.f538277e;
        java.lang.String str2 = "";
        if (j31Var == null || (c33Var2 = (r45.c33) j31Var.m75936x14adae67(1)) == null || (str = c33Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (j31Var != null && (c33Var = (r45.c33) j31Var.m75936x14adae67(1)) != null && (m75945x2fec8307 = c33Var.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398555f = str2;
        b1Var.f398565k = 1205;
        b1Var.f398561i = new hg2.p(eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashSaleUtil", "open flash sale record with appId = " + str + ", path = " + str2);
        dk2.q4.m(dk2.q4.f315471a, context, eVar, b1Var, false, null, 16, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initFlashSaleSettings$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
