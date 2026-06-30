package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251370d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251370d = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = (java.lang.String) view.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return true;
        }
        if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj())) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return true;
        }
        java.lang.Object obj = ((com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1) view).f291621i;
        java.lang.String str2 = (obj == null || !(obj instanceof java.lang.String)) ? "" : (java.lang.String) obj;
        new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str2);
        if (k17 != null && k17.m70377x3172ed()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return false;
        }
        int[] iArr = new int[2];
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        }
        new rl5.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(this.f251370d)).h(view, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.j(this, k17), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.l(this, k17, str, str2), iArr[0], iArr[1]);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
        return false;
    }
}
