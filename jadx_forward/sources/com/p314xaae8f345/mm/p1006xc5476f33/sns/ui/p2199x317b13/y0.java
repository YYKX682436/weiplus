package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes.dex */
public class y0 implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 f250964a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var) {
        this.f250964a = z0Var;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var = this.f250964a;
        java.lang.String str2 = z0Var.f250971w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "onDestroy UICallback %s, %s", str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            java.lang.String str3 = z0Var.f250971w;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            if (str.equals(str3) && (view = z0Var.f250972x) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "onDestroy show videoStatusIv");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
    }
}
