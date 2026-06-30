package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4 f284032e;

    public u4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4 v4Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4 y4Var, android.view.View view) {
        this.f284032e = v4Var;
        this.f284031d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/presenter/PayHistoryListPresenter$HeaderViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayHistoryListPresenter", "click detailLayout");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6 c5331xbad3b2c6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6();
        java.lang.String str = this.f284032e.f284042f.f284075e;
        am.x4 x4Var = c5331xbad3b2c6.f135644g;
        x4Var.f89877a = str;
        x4Var.f89878b = new java.lang.ref.WeakReference(this.f284031d.getContext());
        c5331xbad3b2c6.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 0, 1, 0, 0);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/presenter/PayHistoryListPresenter$HeaderViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
