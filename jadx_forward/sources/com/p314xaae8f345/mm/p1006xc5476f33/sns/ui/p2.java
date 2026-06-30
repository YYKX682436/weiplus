package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q2 f251670d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q2 q2Var) {
        this.f251670d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.kv2 kv2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q2 q2Var = this.f251670d;
        q2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        m21.k kVar = q2Var.f251839q;
        if (kVar != null && (kv2Var = kVar.f404525a) != null) {
            long F0 = ca4.z0.F0(kv2Var.m75945x2fec8307(0));
            long m75942xfb822ef2 = q2Var.f251839q.f404525a.m75942xfb822ef2(9);
            if (F0 != 0 || m75942xfb822ef2 != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 3);
                intent.putExtra("from_user", q2Var.f251839q.f404525a.m75945x2fec8307(1));
                intent.putExtra("feed_object_id", F0);
                intent.putExtra("business_type", 0);
                intent.putExtra("finder_user_name", q2Var.f251839q.f404525a.m75945x2fec8307(1));
                intent.putExtra("feed_object_nonceId", q2Var.f251839q.f404525a.m75945x2fec8307(8));
                intent.putExtra("key_from_user_name", q2Var.f251839q.f404525a.m75945x2fec8307(1));
                intent.putExtra("tab_type", 5);
                intent.putExtra("feed_local_id", m75942xfb822ef2);
                intent.putExtra("key_need_related_list", false);
                if (F0 == 0 && m75942xfb822ef2 != 0) {
                    intent.putExtra("key_posting_scene", true);
                }
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 25, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f542005a.A(q2Var.f251490c, intent, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
    }
}
