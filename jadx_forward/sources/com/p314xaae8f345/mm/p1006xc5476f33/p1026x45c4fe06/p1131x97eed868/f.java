package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868;

/* loaded from: classes7.dex */
public class f implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f165623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j f165624e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f165624e = jVar;
        this.f165623d = c11510xdd90c2f2;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j jVar = this.f165624e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f165623d;
                jVar.getClass();
                if (c11510xdd90c2f2.N.d() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(c11510xdd90c2f2.f156336n) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM && jVar.f165628d.add(c11510xdd90c2f2)) {
                    java.lang.String a17 = bm5.f1.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveManager", "keepAlive processName:%s, rt:%s", a17, c11510xdd90c2f2.f156336n);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(a17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.h.class, null);
                    return;
                }
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j jVar2 = this.f165624e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f165623d;
        if (jVar2.f165628d.remove(c11510xdd90c2f22)) {
            java.lang.String a18 = bm5.f1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveManager", "stopKeepAlive processName:%s, rt:%s", a18, c11510xdd90c2f22.f156336n);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(a18), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.i.class, null);
        }
    }
}
