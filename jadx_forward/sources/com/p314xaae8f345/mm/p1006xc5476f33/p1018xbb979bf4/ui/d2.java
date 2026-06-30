package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156067d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156067d = activityC11495xd59e7ca0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156067d;
        if (!activityC11495xd59e7ca0.X6()) {
            yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        s71.b W6 = activityC11495xd59e7ca0.W6();
        o71.l.Bi().i();
        if (activityC11495xd59e7ca0.f155995d != 0) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC11495xd59e7ca0), null, null, new q71.d0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.U6(activityC11495xd59e7ca0, W6), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b2(activityC11495xd59e7ca0), null), 3, null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC11495xd59e7ca0), null, null, new q71.a0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.U6(activityC11495xd59e7ca0, W6), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.c2(activityC11495xd59e7ca0), null), 3, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC11495xd59e7ca0.D;
        if (c22661xa3a2b3c0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrFinish");
            throw null;
        }
        c22661xa3a2b3c0.setEnabled(false);
        activityC11495xd59e7ca0.F = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC11495xd59e7ca0.mo55332x76847179(), activityC11495xd59e7ca0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.meq), false, 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
