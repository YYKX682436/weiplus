package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes.dex */
public final class d2 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f234950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234951f;

    public d2(android.content.Intent intent, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        this.f234949d = intent;
        this.f234950e = z3Var;
        this.f234951f = str;
        mo63036x52d2f021(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.ahd));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ProfileUtilsKt$getPhoneSpan$1$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(this.f234949d, 17, 1, this.f234950e.d1());
        android.content.Context context = widget.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, false, 1);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.l2(context);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.m2(this.f234951f, context);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ProfileUtilsKt$getPhoneSpan$1$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
