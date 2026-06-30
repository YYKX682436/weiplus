package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class y7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101624a;

    public y7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f101624a = z7Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.ui.MMActivity mMActivity = this.f101624a.f101655a;
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = mMActivity instanceof com.tencent.mm.plugin.fav.ui.FavoriteIndexUI ? (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) mMActivity : null;
            java.lang.String str = favoriteIndexUI != null ? favoriteIndexUI.Y : null;
            if (str == null) {
                str = "";
            }
            hashMap.put("fav_homepage_sessionid", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_filter_unfold", "view_exp", hashMap, 32903);
        }
    }
}
