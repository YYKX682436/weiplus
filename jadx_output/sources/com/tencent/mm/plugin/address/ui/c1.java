package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.model.RcptItem f74528e;

    public c1(com.tencent.mm.plugin.address.ui.l1 l1Var, com.tencent.mm.plugin.address.model.RcptItem rcptItem) {
        this.f74527d = l1Var;
        this.f74528e = rcptItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f74527d.f74577r;
        com.tencent.mm.plugin.address.model.RcptItem item = this.f74528e;
        kotlin.jvm.internal.o.f(item, "$item");
        lVar.invoke(item);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
