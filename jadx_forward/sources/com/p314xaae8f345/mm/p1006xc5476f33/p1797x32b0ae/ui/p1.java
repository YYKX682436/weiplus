package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes11.dex */
public class p1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 f225993d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285) {
        this.f225993d = activityC16255xf01eb285;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285 = this.f225993d;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 item = activityC16255xf01eb285.f225875f.getItem(i17);
        if (item == null) {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285.f225872m;
        } else {
            if (item.f14359x58b7f1c.equals("TestFragment")) {
                android.content.Intent intent = new android.content.Intent(activityC16255xf01eb285.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16264xb71bcee9.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16255xf01eb285.mo55332x76847179();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$5", "onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$5", "onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", item.f14359x58b7f1c);
            bundle.putBoolean("isHalfScreen", true);
            bundle.putDouble("heightPercent", 0.75d);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466.equals(item.f14359x58b7f1c)) {
                dp.a.m125854x26a183b(activityC16255xf01eb285.mo55332x76847179(), "Is Base Lib ", 0).show();
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, null);
            }
        }
        return false;
    }
}
