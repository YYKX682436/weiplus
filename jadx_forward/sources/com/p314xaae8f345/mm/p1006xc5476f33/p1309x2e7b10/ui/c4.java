package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes4.dex */
public class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a f176506d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a) {
        this.f176506d = activityC13058x9cebb75a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.nu nuVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.mu9 && (nuVar = (r45.nu) view.getTag()) != null) {
            float f17 = nuVar.f463214p;
            float f18 = nuVar.f463213o;
            java.lang.String str = nuVar.f463205d;
            java.lang.String str2 = nuVar.f463211m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a = this.f176506d;
            lu1.d.c(activityC13058x9cebb75a, f17, f18, str, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 5, activityC13058x9cebb75a.f176438g.g(), activityC13058x9cebb75a.f176438g.f(), "", nuVar.f463205d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
