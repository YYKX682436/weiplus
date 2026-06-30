package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class i implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j f273801d;

    public i(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j jVar) {
        this.f273801d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof m65.a;
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j jVar = this.f273801d;
        if (z17) {
            jVar.getClass();
            ((m65.a) m1Var).l(null);
        }
        jVar.getClass();
        if (i17 == 0 && i18 == 0) {
            o65.b bVar = jVar.f273803b;
            if (bVar != null) {
                bVar.a(i17, i18, str, bVar);
                return;
            }
            return;
        }
        o65.b bVar2 = jVar.f273804c;
        if (bVar2 != null) {
            bVar2.a(i17, i18, str, bVar2);
        }
    }
}
