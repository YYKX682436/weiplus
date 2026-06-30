package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100775e;

    public p(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, java.lang.String str) {
        this.f100775e = favoriteFileDetailUI;
        this.f100774d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", this.f100775e.F.R1);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", this.f100774d);
        intent.putExtra("useJs", true);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.fav.ui.detail.d(this, intent));
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
