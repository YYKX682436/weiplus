package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 f242854d;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5) {
        this.f242854d = activityC17415x5f2726f5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5 = this.f242854d;
        intent.setClass(activityC17415x5f2726f5, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.class);
        activityC17415x5f2726f5.startActivityForResult(intent, activityC17415x5f2726f5.f241895x.hashCode());
        java.util.HashMap hashMap = new java.util.HashMap();
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        if (Ui == wd0.g1.f526247f) {
            Di = 100;
        }
        hashMap.put("vocals_enhance_mode", java.lang.Integer.valueOf(Di));
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242412b;
        if (str == null) {
            str = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a).mo141623x754a37bb();
        }
        hashMap.put("care_mode_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("vocals_enhance_btn", "view_clk", hashMap, 35684);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
