package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class h1 implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.x1 f100969d;

    public h1(com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var) {
        this.f100969d = x1Var;
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var = this.f100969d;
            if (i17 >= x1Var.f101103f.size()) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var = (com.tencent.mm.plugin.fav.ui.gallery.o1) x1Var.f101103f.get(i17);
            if (o1Var.f101037c != Integer.MAX_VALUE) {
                java.lang.String str2 = o1Var.f101036b.f100898b.T;
                java.lang.String str3 = e2Var.field_dataId;
                if (str3 == null || !str3.endsWith("_t")) {
                    str = str3;
                } else {
                    java.lang.String[] split = str3.split("_");
                    str = (split == null || split.length != 2) ? "" : split[0];
                }
                if (str2 != null && str != null && str2.equals(str) && e2Var.w0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "sameDataId, filedDataId:%s, truePath:%s", str3, com.tencent.mm.vfs.w6.i(o1Var.f101035a, false));
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.gallery.g1(this, i17));
                }
            }
            i17++;
        }
    }
}
