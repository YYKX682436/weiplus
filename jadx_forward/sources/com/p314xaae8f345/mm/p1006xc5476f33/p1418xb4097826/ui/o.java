package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f211096d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f211096d = activityC15007xc74afeba;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f211096d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC15007xc74afeba, 1, true);
        r45.h21 h21Var = activityC15007xc74afeba.Y;
        if (h21Var == null || (string = h21Var.m75945x2fec8307(10)) == null) {
            string = activityC15007xc74afeba.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572788cj3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        k0Var.q(string, 17);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m(activityC15007xc74afeba);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n(activityC15007xc74afeba);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
