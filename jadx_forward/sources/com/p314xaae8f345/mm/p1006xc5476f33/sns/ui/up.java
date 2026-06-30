package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class up implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f252123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a f252125f;

    public up(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, java.lang.String str) {
        this.f252125f = activityC18109x7a461b7a;
        this.f252123d = c19807x593d1720;
        this.f252124e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i64.o1 o1Var = i64.o1.Sight;
        int i17 = o1Var.f370802d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f252123d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a = this.f252125f;
        if (i17 != 0) {
            i64.s1.b(i64.n1.DetailInVideo, c19807x593d1720.Id, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a) == null ? "" : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a).f38104xce64ddf1, 1, o1Var.f370802d, c19807x593d1720.f39018xf3f56116, null, c19807x593d1720.Id, 0L, 0, 0);
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", c19807x593d1720.f39040xbd345fc4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 T6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a);
        java.lang.String str = this.f252124e;
        if (T6 != null) {
            str = ca4.z0.b(str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.T6(activityC18109x7a461b7a).f38104xce64ddf1);
        }
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a), 5, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.a7(activityC18109x7a461b7a).f68891x29d1292e, 18, 0));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tp(this, intent));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
    }
}
