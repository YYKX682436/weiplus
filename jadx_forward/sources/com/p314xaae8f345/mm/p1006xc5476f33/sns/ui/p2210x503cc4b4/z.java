package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251398d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251398d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) view.getTag();
            if (c17933xe8d1b226.m70373x5384133c() == 21 && c01.z1.r().equals(c17933xe8d1b226.m70374x6bf53a6c())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                java.lang.String str = c17933xe8d1b226.m70371x485d7().Id;
                java.lang.ThreadLocal threadLocal = ha4.k.f361531a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                ha4.k.e(c17933xe8d1b226, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                ha4.k.d(c17933xe8d1b226);
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                ha4.b.a(24);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_sendid", c17933xe8d1b226.m70367x7525eefd());
            intent.putExtra("key_feedid", c17933xe8d1b226.m70363x51f8f990());
            intent.setClassName(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(this.f251398d), "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
            android.app.Activity e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(this.f251398d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            e17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
            c17933xe8d1b226.m70367x7525eefd();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(m70363x51f8f990).f68891x29d1292e);
            if (W0 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
                if (m70371x485d7 != null) {
                    java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
                    if (linkedList.size() > 0) {
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(W0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.LinkedList linkedList2 = e18.f38998xb2b52717.f453808e;
                if (linkedList2 != null) {
                    for (int i17 = 0; i17 < linkedList2.size(); i17++) {
                        r45.b96 b96Var = (r45.b96) linkedList2.get(i17);
                        cb3.a aVar = new cb3.a();
                        aVar.f121876a = b96Var.f452172d;
                        aVar.f121877b = b96Var.f452173e;
                        aVar.f121878c = b96Var.f452174f;
                        arrayList3.add(aVar);
                    }
                }
                synchronized (cb3.b.class) {
                    cb3.b.f121880b = m70363x51f8f990;
                    cb3.b.f121879a = arrayList3;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
    }
}
