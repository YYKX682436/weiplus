package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class p implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219179d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar) {
        this.f219179d = lVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.String[] split = str.split(" ");
        if (split.length == 0) {
            return;
        }
        boolean equals = split[0].equals("update");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219179d;
        if (equals) {
            for (int i17 = 1; i17 < split.length; i17++) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h0(lVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i17], 0L)));
            }
        }
        if (split[0].equals("insert")) {
            for (int i18 = 1; i18 < split.length; i18++) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b0(lVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i18], 0L)));
            }
        }
        if (split[0].equals("delete")) {
            for (int i19 = 1; i19 < split.length; i19++) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.z(lVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i19], 0L)));
            }
        }
    }
}
