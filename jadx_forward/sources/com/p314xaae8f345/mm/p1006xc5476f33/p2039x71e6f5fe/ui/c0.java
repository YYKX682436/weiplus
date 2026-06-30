package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a f241046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0 f241047f;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0 f0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar) {
        this.f241047f = f0Var;
        this.f241045d = str;
        this.f241046e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f241045d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = this.f241046e;
        java.lang.String str2 = aVar.f240327n;
        int i17 = aVar.f240314a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0 f0Var = this.f241047f;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h0(str, str2, i17, str, f0Var.getCount(), 11294, aVar.f240321h, null));
        java.lang.String str3 = this.f241045d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_Product_ID", str3);
            j45.l.j(f0Var.f241078h.f279303d, "scanner", ".ui.ProductUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
