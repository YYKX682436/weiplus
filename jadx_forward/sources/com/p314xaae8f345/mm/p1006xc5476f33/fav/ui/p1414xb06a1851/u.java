package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes8.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182332e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d, java.lang.String str) {
        this.f182332e = activityC13590x9555381d;
        this.f182331d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182332e;
        int i17 = activityC13590x9555381d.E.f67643xc8a07680;
        long j17 = activityC13590x9555381d.E.f67645x88be67a1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f182331d);
        intent.putExtra("is_favorite_item", true);
        intent.putExtra("fav_local_id", activityC13590x9555381d.E.f67645x88be67a1);
        intent.putExtra("geta8key_scene", 14);
        intent.putExtra("geta8key_scene", 14);
        j45.l.j(activityC13590x9555381d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
