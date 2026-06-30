package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555 f155405e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555 activityC11402x33c6c555, java.lang.String str) {
        this.f155405e = activityC11402x33c6c555;
        this.f155404d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/DisasterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DisasterUI", "summerdiz jump link");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13939, 1);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(this.f155404d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555 activityC11402x33c6c555 = this.f155405e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC11402x33c6c555, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/DisasterUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11402x33c6c555.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC11402x33c6c555, "com/tencent/mm/plugin/account/ui/DisasterUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/DisasterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
