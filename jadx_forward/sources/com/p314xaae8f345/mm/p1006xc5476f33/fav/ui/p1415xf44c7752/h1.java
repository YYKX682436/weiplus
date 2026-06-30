package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class h1 implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 f182502d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var) {
        this.f182502d = x1Var;
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var = this.f182502d;
            if (i17 >= x1Var.f182636f.size()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1) x1Var.f182636f.get(i17);
            if (o1Var.f182570c != Integer.MAX_VALUE) {
                java.lang.String str2 = o1Var.f182569b.f182431b.T;
                java.lang.String str3 = e2Var.f67085xf604e54a;
                if (str3 == null || !str3.endsWith("_t")) {
                    str = str3;
                } else {
                    java.lang.String[] split = str3.split("_");
                    str = (split == null || split.length != 2) ? "" : split[0];
                }
                if (str2 != null && str != null && str2.equals(str) && e2Var.w0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "sameDataId, filedDataId:%s, truePath:%s", str3, com.p314xaae8f345.mm.vfs.w6.i(o1Var.f182568a, false));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g1(this, i17));
                }
            }
            i17++;
        }
    }
}
