package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.c f273783d;

    public b(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.c cVar) {
        this.f273783d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.c cVar = this.f273783d;
        if (cVar.f273784f.equals(m1Var)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.q(m1Var.mo808xfb85f7b0(), cVar.f273785g);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = cVar.f273782e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (m1Var instanceof m65.a) {
                ((m65.a) m1Var).l(cVar.f273781d);
            }
            o65.b bVar = cVar.f273781d;
            if (bVar != null) {
                bVar.a(i17, i18, str, bVar);
            }
            if (i17 == 0 && i18 == 0) {
                o65.b bVar2 = cVar.f273779b;
                if (bVar2 != null) {
                    bVar2.a(i17, i18, str, bVar2);
                    return;
                }
                return;
            }
            o65.b bVar3 = cVar.f273780c;
            if (bVar3 != null) {
                bVar3.a(i17, i18, str, bVar3);
            }
        }
    }
}
