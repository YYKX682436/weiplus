package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef f234849d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef) {
        this.f234849d = activityC16818xbff037ef;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        xq3.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = this.f234849d.f234795w;
        wq3.j jVar = wVar.f234900g;
        int i17 = jVar.f530086f;
        boolean z17 = (i17 <= 0 || jVar.f530082b == null || i17 > jVar.g() || (cVar = jVar.f530082b.f530132e) == null || cVar.f537605t == null) ? false : true;
        android.app.Activity activity = wVar.f234897d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "goSelectSku", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallProductHelper", "goSelectSku", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11008, jVar.j(), jVar.f530082b.f530128a, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w.f234896m), 1);
        } else {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.grp, 1).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
