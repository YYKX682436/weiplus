package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x5 f252266d;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x5 x5Var) {
        this.f252266d = x5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.ek4 ek4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x5 x5Var = this.f252266d;
        x5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        m21.p pVar = x5Var.f253024q;
        if (pVar != null && (ek4Var = pVar.f404530a) != null) {
            long F0 = ca4.z0.F0(ek4Var.m75945x2fec8307(0));
            if (F0 != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 3);
                intent.putExtra("from_user", x5Var.f253024q.f404530a.m75945x2fec8307(1));
                intent.putExtra("feed_object_id", F0);
                intent.putExtra("business_type", 1);
                intent.putExtra("finder_user_name", x5Var.f253024q.f404530a.m75945x2fec8307(1));
                intent.putExtra("feed_object_nonceId", x5Var.f253024q.f404530a.m75945x2fec8307(7));
                intent.putExtra("key_from_user_name", x5Var.f253024q.f404530a.m75945x2fec8307(1));
                intent.putExtra("tab_type", 5);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 25, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f542005a.A(x5Var.f251490c, intent, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
    }
}
