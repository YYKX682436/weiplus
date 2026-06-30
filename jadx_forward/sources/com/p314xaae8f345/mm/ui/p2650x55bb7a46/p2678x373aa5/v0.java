package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f284643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f284645f;

    public v0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var, java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0) {
        this.f284643d = c1Var;
        this.f284644e = list;
        this.f284645f = c22661xa3a2b3c0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = this.f284643d;
        c1Var.f284431n.f140729g = 1L;
        c1Var.c(this.f284644e, this.f284645f, 1, 10);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
