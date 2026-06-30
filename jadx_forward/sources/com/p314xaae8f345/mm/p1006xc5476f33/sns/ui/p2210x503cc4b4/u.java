package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251387d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251387d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.a(this.f251387d, view);
        if (a17 == null || !a17.m70377x3172ed()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
            return;
        }
        if (a17.m70351xaa22b9ed().m70300x74235b3e().m70130x48976372()) {
            int b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.b(a17.m70351xaa22b9ed().m70300x74235b3e().m70119x2c5d5775(), a17.m70375x338a8cc7());
            int i17 = b17 > 0 ? 1 : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.l(a17.m70351xaa22b9ed().m70300x74235b3e().m70119x2c5d5775(), a17.m70375x338a8cc7(), gm0.j1.b().j(), i17 != 0 ? b17 : 1, i17 ^ 1, "");
            z17 = (i17 ^ 1) == true ? 1 : 0;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = a17.m70371x485d7();
        if (m70371x485d7.f39014x86965dde.f451370e == 15 && m70371x485d7.f39035x65f3785d != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.b(this.f251387d, view, a17, 1001, a17.m70351xaa22b9ed().m70300x74235b3e().m70124xa8480e83(), z17);
        } else if ((a17.m70405x7b43eb28() && m70371x485d7.f39014x86965dde.f451373h.size() == 1) || m70371x485d7.f39014x86965dde.f451370e == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.k(this.f251387d, view, a17, 1001, a17.m70351xaa22b9ed().m70300x74235b3e().m70124xa8480e83(), z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
    }
}
