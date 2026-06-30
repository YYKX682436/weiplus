package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class vg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14059x88678ab1 f192191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f192192e;

    public vg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14059x88678ab1 activityC14059x88678ab1, r45.qt2 qt2Var) {
        this.f192191d = activityC14059x88678ab1;
        this.f192192e = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14059x88678ab1 activityC14059x88678ab1 = this.f192191d;
        if (activityC14059x88678ab1.mo55332x76847179() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Intent intent2 = !(activityC14059x88678ab1.mo55332x76847179() instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.putExtra("KEY_CAN_MODEI_ALIAS", true);
            intent.putExtra("KEY_SOURCE", 2);
            intent.putExtra("KEY_IS_FROM_SETTING", true);
            intent.setClass(activityC14059x88678ab1.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14086xcb6ca654.class);
            activityC14059x88678ab1.mo55332x76847179().startActivityForResult(intent, 1010);
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.W2;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "3"), new jz5.l("type", "1"));
        r45.qt2 qt2Var = this.f192192e;
        zy2.zb.T8(zbVar, t1Var, i17, qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
