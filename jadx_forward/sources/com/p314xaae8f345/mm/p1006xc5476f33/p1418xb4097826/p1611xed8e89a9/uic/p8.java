package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205653d;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205653d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205653d;
        android.app.Activity context = obVar.m80379x76847179();
        ya2.b2 m58740xf5e37f2d = obVar.m58740xf5e37f2d();
        int i17 = m58740xf5e37f2d != null ? m58740xf5e37f2d.f69308x26b1b2e8 : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = (i17 & 64) != 0;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eo6));
            u1Var.a(true);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
            u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v6.f205822a);
            u1Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.w6.f205850d);
            u1Var.q(false);
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g;
            kVar.c(xy2.c.e(obVar.m80379x76847179()), "", obVar.m58741x6c03c64c());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(kVar, obVar.m58738xfe9224be(), 3L, 2L, null, 8, null);
            android.content.Intent intent = new android.content.Intent();
            xy2.c.c(obVar.m158354x19263085(), intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.app.Activity m80379x76847179 = obVar.m80379x76847179();
            java.lang.String m58741x6c03c64c = obVar.m58741x6c03c64c();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(obVar.m158359x1e885992().getIntExtra("key_enter_profile_type", 0));
            android.app.Activity context2 = obVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            i0Var.Zi(m80379x76847179, m58741x6c03c64c, 2, intent, null, valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(7)) : null, java.lang.Long.valueOf(obVar.P1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
