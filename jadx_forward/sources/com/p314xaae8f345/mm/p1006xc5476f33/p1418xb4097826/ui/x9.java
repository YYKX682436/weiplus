package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class x9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15044x7990fd7d f211543d;

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15044x7990fd7d activityC15044x7990fd7d) {
        this.f211543d = activityC15044x7990fd7d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15044x7990fd7d activityC15044x7990fd7d = this.f211543d;
        if (activityC15044x7990fd7d.f210152z) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15044x7990fd7d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).ik(mo55332x76847179, null, 1);
        } else {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15044x7990fd7d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c18).mj(mo55332x768471792, null, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
