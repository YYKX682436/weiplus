package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class v implements com.tencent.mm.ui.tools.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f101087a;

    public v(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI) {
        this.f101087a = favMediaGalleryUI;
    }

    @Override // com.tencent.mm.ui.tools.s5
    public void a() {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f101087a;
        com.tencent.mm.plugin.fav.ui.gallery.r item = favMediaGalleryUI.f100873g.getItem(favMediaGalleryUI.f100870d);
        if (item != null && item.l() == 0 && item.k() != 2 && com.tencent.mm.vfs.w6.j(item.j())) {
            java.util.List<android.view.View> list = (java.util.List) favMediaGalleryUI.f100878o.get(item.j());
            if (list != null && list.size() > 0) {
                for (android.view.View view : list) {
                    if (view instanceof com.tencent.mm.plugin.fav.ui.widget.FavVideoView) {
                        ((com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view).a();
                    }
                }
                return;
            }
        }
        if (!favMediaGalleryUI.U6() || favMediaGalleryUI.f100884u.f101302d == 1) {
            return;
        }
        favMediaGalleryUI.T6();
    }
}
