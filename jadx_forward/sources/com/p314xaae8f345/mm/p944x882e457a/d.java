package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class d implements km5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f152138a;

    public d(com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        this.f152138a = iVar;
    }

    @Override // km5.c
    /* renamed from: call */
    public java.lang.Object mo47949x2e7a5e() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f152138a;
        boolean z17 = iVar.f152180g.get();
        com.p314xaae8f345.mm.p944x882e457a.g gVar = iVar.f152177d;
        if (z17) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = (gVar == null || (oVar = gVar.f152159g) == null) ? "" : java.lang.Integer.valueOf(oVar.f152246d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Cgi", "[call] has cancel. cgi=%s", objArr);
        } else {
            km5.b c17 = km5.u.c();
            gVar.getClass();
            gVar.f152160h = new java.lang.ref.WeakReference(c17);
            if (!((gm0.n) com.p314xaae8f345.mm.p944x882e457a.z2.f152380b).f354793a.f354821b.h(gVar, 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Cgi", "RunCgi doScene failed!");
                if (c17 == null) {
                    jm5.b.c("Vending.QuickAccess", "dummy mario", new java.lang.Object[0]);
                } else {
                    c17.a(null);
                }
            }
        }
        return null;
    }
}
