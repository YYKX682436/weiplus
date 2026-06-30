package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class mu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu f251482d;

    public mu(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar) {
        this.f251482d = quVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$createView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = this.f251482d;
        quVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_USER_NAME", quVar.f251892b);
        intent.putExtra("KEY_IS_SELF", quVar.f251893c);
        intent.putExtra("KEY_SNS_SOURCE", quVar.f251896f);
        android.app.Activity activity = quVar.f251891a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumSessionId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17) activity).K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumSessionId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        intent.putExtra("INTENT_SOURCE_PATH", quVar.f251899i);
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18113x5ae4cc1c.class);
        android.app.Activity activity2 = quVar.f251891a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(23);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "goToStarList", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$createView$1");
    }
}
