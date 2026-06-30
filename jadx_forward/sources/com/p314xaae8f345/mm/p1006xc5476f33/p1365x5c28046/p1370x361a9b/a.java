package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b f179148d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b bVar) {
        this.f179148d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> d17 = gr.t.g().d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_group_sync_min_count, 20);
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 : d17) {
            if (c21051xbc71d247.f68402x2261bec0 != 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c21051xbc71d247.f68396x5bec8145, java.lang.String.valueOf(17))) {
                java.lang.Object bVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c21051xbc71d247.f68396x5bec8145, java.lang.String.valueOf(17)) ? new b22.b("com.tencent.xin.emoticon.tusiji") : new b22.a(c21051xbc71d247.f68396x5bec8145);
                if (c21051xbc71d247.f68379x4b6e59f8 < Ni) {
                    arrayList2.add(bVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b bVar2 = this.f179148d;
        bVar2.f179149a.e();
        bVar2.f179149a.a(arrayList2);
        bVar2.f179149a.b(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = bVar2.f179149a;
        if (kVar.f179165c) {
            return;
        }
        kVar.f();
    }
}
