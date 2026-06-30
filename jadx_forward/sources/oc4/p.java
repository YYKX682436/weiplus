package oc4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 f425888d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 c18250x12aff9a8) {
        this.f425888d = c18250x12aff9a8;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = c50.l0.f120143a;
        java.util.Set stringSet = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getStringSet(str, new java.util.HashSet());
        if (stringSet != null) {
            stringSet.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 c18250x12aff9a8 = this.f425888d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = c18250x12aff9a8.f250545e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        o4Var.putStringSet(str, stringSet);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("SnsSpring2025_ShowPostRedDot", false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove(c50.l0.f120144b);
        db5.t7.h(c18250x12aff9a8.m80379x76847179(), "初始化完毕");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        return true;
    }
}
