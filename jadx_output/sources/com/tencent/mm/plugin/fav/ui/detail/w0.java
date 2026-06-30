package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class w0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100809d;

    public w0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI) {
        this.f100809d = favoriteImgDetailUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        r45.gp0 gp0Var = (r45.gp0) view.getTag();
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100809d;
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = (com.tencent.mm.plugin.fav.ui.detail.a1) favoriteImgDetailUI.f100628p.get(gp0Var.T);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.Z6(favoriteImgDetailUI, a1Var);
        if (!a1Var.f100686d) {
            favoriteImgDetailUI.getClass();
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
            java.lang.String x17 = o72.x1.x(a1Var.f100683a);
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            aqVar.f6175b = x17;
            aqVar.f6174a = java.lang.System.currentTimeMillis();
            aqVar.f6179f = 2;
            recogQBarOfImageFileEvent.e();
            a1Var.f100686d = true;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
