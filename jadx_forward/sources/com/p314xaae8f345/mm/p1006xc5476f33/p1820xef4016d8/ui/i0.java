package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 f228543d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6) {
        this.f228543d = activityC16360x5abdc0d6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6 = this.f228543d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = activityC16360x5abdc0d6.H;
        if (c19088xa4b300c1 != null) {
            boolean b17 = c19088xa4b300c1.b(activityC16360x5abdc0d6, bundle, null, null, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d62 = this.f228543d;
            if (b17) {
                activityC16360x5abdc0d62.H = null;
            } else {
                activityC16360x5abdc0d62.finish();
            }
        } else {
            activityC16360x5abdc0d6.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
