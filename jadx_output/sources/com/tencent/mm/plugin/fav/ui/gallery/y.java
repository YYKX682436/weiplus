package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes8.dex */
public class y implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101116e;

    public y(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, java.util.List list, java.util.List list2) {
        this.f101115d = list;
        this.f101116e = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f101115d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f101116e.get(i17));
            i17++;
        }
    }
}
