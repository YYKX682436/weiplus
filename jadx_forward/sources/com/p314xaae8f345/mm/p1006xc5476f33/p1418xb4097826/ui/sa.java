package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f211333d;

    public sa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f) {
        this.f211333d = activityC15047x3a53ff1f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (hz2.d.f367846a.a("personalInfo")) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "doClick create contact btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f211333d;
        android.widget.EditText editText = activityC15047x3a53ff1f.f210162u;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        ya2.b2 b2Var = activityC15047x3a53ff1f.G;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, b2Var != null ? b2Var.w0() : null)) {
            activityC15047x3a53ff1f.finish();
        } else {
            int i17 = activityC15047x3a53ff1f.H;
            if (i17 == 1) {
                java.lang.String t17 = r26.i0.t(activityC15047x3a53ff1f.E, activityC15047x3a53ff1f.F, obj, true);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC15047x3a53ff1f);
                u1Var.g(t17);
                u1Var.a(true);
                u1Var.n(activityC15047x3a53ff1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572848cq4));
                u1Var.j(activityC15047x3a53ff1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572849cq5));
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ra(activityC15047x3a53ff1f, obj));
                u1Var.q(false);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.c7(activityC15047x3a53ff1f, obj);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
