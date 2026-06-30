package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f236139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236141f;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var, java.lang.String str, java.lang.String str2) {
        this.f236139d = s4Var;
        this.f236140e = str;
        this.f236141f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d7 d7Var = this.f236139d.f236082c;
        java.lang.String finderUserName = this.f236140e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUserName, "$finderUserName");
        java.lang.String finderNickName = this.f236141f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderNickName, "$finderNickName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) d7Var).f236136a;
        m0Var.getClass();
        gr3.f.f356390a.a(m0Var.M, "click_finder", "", -1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22118, java.lang.Long.valueOf(m0Var.D), m0Var.f235992n.d1(), 2, finderUserName, finderNickName);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_type", 12);
        intent.putExtra("finder_username", finderUserName);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(m0Var.f235989h, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
