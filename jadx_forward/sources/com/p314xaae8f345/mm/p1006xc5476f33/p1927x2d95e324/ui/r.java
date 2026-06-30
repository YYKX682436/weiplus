package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be f233878d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be) {
        this.f233878d = activityC16731xe258a4be;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ui_title", com.p314xaae8f345.mm.R.C30867xcad56011.h9u);
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be = this.f233878d;
        com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = activityC16731xe258a4be.f233802g;
        if (c11121x1f1011 != null) {
            intent.putExtra("extra_province", c11121x1f1011.f152746f);
            intent.putExtra("extra_city", activityC16731xe258a4be.f233802g.f152747g);
        }
        j45.l.n(activityC16731xe258a4be.mo55332x76847179(), "address", ".ui.WalletMultiRcptSelectUI", intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
