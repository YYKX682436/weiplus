package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class fm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 f191557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f191558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f191559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f191560g;

    public fm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 activityC14098x3560a005, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3) {
        this.f191557d = activityC14098x3560a005;
        this.f191558e = f0Var;
        this.f191559f = f0Var2;
        this.f191560g = f0Var3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 activityC14098x3560a005 = this.f191557d;
        android.text.Editable text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) activityC14098x3560a005.f191098y).mo141623x754a37bb()).getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f191558e;
        if (text != null) {
            if (!(text.length() > 0)) {
                text = null;
            }
            if (text != null && (obj3 = text.toString()) != null) {
                f0Var.f391649d = java.lang.Integer.parseInt(obj3);
            }
        }
        android.text.Editable text2 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) activityC14098x3560a005.f191099z).mo141623x754a37bb()).getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f191559f;
        if (text2 != null) {
            if (!(text2.length() > 0)) {
                text2 = null;
            }
            if (text2 != null && (obj2 = text2.toString()) != null) {
                f0Var2.f391649d = java.lang.Integer.parseInt(obj2);
            }
        }
        android.text.Editable text3 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) activityC14098x3560a005.A).mo141623x754a37bb()).getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = this.f191560g;
        if (text3 != null) {
            android.text.Editable editable = text3.length() > 0 ? text3 : null;
            if (editable != null && (obj = editable.toString()) != null) {
                f0Var3.f391649d = java.lang.Integer.parseInt(obj);
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, java.lang.Integer.valueOf(f0Var.f391649d));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, java.lang.Integer.valueOf(f0Var2.f391649d));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, java.lang.Integer.valueOf(f0Var3.f391649d));
        db5.t7.m123883x26a183b(activityC14098x3560a005, "设置成功", 0).show();
        activityC14098x3560a005.c7();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
