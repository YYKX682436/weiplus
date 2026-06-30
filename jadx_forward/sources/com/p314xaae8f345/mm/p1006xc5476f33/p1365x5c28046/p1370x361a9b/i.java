package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f179160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j f179161e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j jVar, android.content.Context context) {
        this.f179161e = jVar;
        this.f179160d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(this.f179160d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] network change type:%d", java.lang.Integer.valueOf(m40067xab9ed241));
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = this.f179161e.f179162a;
        if (kVar.f179173k == m40067xab9ed241) {
            return;
        }
        if (kVar.f179163a || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar2 = this.f179161e.f179162a;
            if (!kVar2.f179165c) {
                kVar2.f();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar3 = this.f179161e.f179162a;
            synchronized (kVar3) {
                kVar3.f179164b = false;
                kVar3.f179165c = false;
                kVar3.f179163a = false;
                kVar3.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar = kVar3.f179166d;
                if (lVar != null) {
                    lVar.a();
                }
            }
        }
        this.f179161e.f179162a.f179173k = m40067xab9ed241;
    }
}
