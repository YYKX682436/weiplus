package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 f234811d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 activityC16817xdad885e7) {
        this.f234811d = activityC16817xdad885e7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = this.f234811d.f234779y;
        wVar.getClass();
        android.content.Intent intent = new android.content.Intent(wVar.f234897d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1.class);
        android.app.Activity activity = wVar.f234897d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(4);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "goEditInvoice", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
