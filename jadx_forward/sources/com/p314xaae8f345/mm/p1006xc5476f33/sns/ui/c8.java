package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1 f249646d;

    public c8(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1 c17992x3b5785c1) {
        this.f249646d = c17992x3b5785c1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1.f248131x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1 c17992x3b5785c1 = this.f249646d;
        android.app.Activity activity = c17992x3b5785c1.f248132e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        int i18 = c17992x3b5785c1.f248141q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("KLabel_range_index", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str = c17992x3b5785c1.f248143s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Klabel_name_list", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str2 = c17992x3b5785c1.f248144t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Kother_user_name_list", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str3 = c17992x3b5785c1.f248145u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Kchat_room_name_list", str3);
        intent.putExtra("k_sns_label_ui_style", c17992x3b5785c1.f248147w);
        intent.putExtra("Kis_with_together", c17992x3b5785c1.f247782d);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        android.app.Activity activity2 = c17992x3b5785c1.f248132e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(5);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0 = s0Var.f246492l;
        if (c6969xa989d0b0 != null) {
            int i19 = c6969xa989d0b0.f142771e;
            if (i19 <= 0) {
                c6969xa989d0b0.f142771e = 1;
            } else {
                c6969xa989d0b0.f142771e = i19 + 1;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
    }
}
