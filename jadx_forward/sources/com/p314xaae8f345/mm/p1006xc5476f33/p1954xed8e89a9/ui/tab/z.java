package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f236239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 f236240e;

    public z(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var) {
        this.f236239d = c0Var;
        this.f236240e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var = this.f236240e;
        boolean z17 = b0Var.f235775k.getVisibility() == 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f236239d;
        c0Var.f391645d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, cur status = " + c0Var.f391645d);
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to cancel!");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(b0Var.f235777m, 1, true);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.x(b0Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.y(b0Var);
            k0Var.v();
        } else {
            java.lang.String UserName = b0Var.f235766b.f470766d.f464598d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
            gr3.e.d(UserName, 1702, b0Var.f235768d, b0Var.f235765a.getIntent(), b0Var.f235781q, 0, 0, null, null, null, 0, 0, 4064, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to reserve!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0.d(b0Var, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
