package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156184d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156184d = activityC11495xd59e7ca0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156184d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var = activityC11495xd59e7ca0.f155997f;
        if (l1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var);
            if (l1Var.isShowing()) {
                yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var2 = activityC11495xd59e7ca0.f155997f;
        if (l1Var2 != null) {
            l1Var2.dismiss();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11495xd59e7ca0.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89 = activityC11495xd59e7ca0.f156013y;
        if (c11487xdaa53b89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrRegion");
            throw null;
        }
        java.lang.String m48716xfb85ada3 = c11487xdaa53b89.m48716xfb85ada3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x1(activityC11495xd59e7ca0);
        q71.f0 Bi = o71.l.Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "getWalletAddr(...)");
        activityC11495xd59e7ca0.f155997f = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1(mo55332x76847179, m48716xfb85ada3, x1Var, Integer.MAX_VALUE, Bi, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.y1(activityC11495xd59e7ca0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var3 = activityC11495xd59e7ca0.f155997f;
        if (l1Var3 != null) {
            l1Var3.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
