package te2;

/* loaded from: classes3.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499783d;

    public n5(te2.p8 p8Var) {
        this.f499783d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        r45.m94 m94Var;
        r45.m94 m94Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f499783d;
        r45.l32 l32Var = p8Var.Z;
        if ((l32Var == null || (m94Var2 = (r45.m94) l32Var.m75936x14adae67(12)) == null) ? false : m94Var2.m75933x41a8a7f2(0)) {
            android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
            r45.l32 l32Var2 = p8Var.Z;
            if (l32Var2 == null || (m94Var = (r45.m94) l32Var2.m75936x14adae67(12)) == null || (string = m94Var.m75945x2fec8307(1)) == null) {
                string = p8Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.osz);
            }
            db5.t7.g(m80379x76847179, string);
        } else {
            p8Var.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) p8Var.m80379x76847179(), 0, true);
            k0Var.X1 = false;
            k0Var.U1 = true;
            k0Var.f293388d2 = false;
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Di(p8Var.m158354x19263085(), k0Var, 2, null, new te2.v4(k0Var, p8Var));
            k0Var.f293405n = new te2.p4(k0Var, p8Var);
            k0Var.f293407o = new te2.q4(p8Var);
            k0Var.f293414s = new te2.r4(p8Var, k0Var);
            k0Var.f293417v = new te2.s4(k0Var, p8Var);
            k0Var.v();
            if (p8Var.A1.f499923a) {
                ml2.c3[] c3VarArr = ml2.c3.f408864d;
                p8Var.o7(6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
