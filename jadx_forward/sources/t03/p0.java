package t03;

/* loaded from: classes15.dex */
public final class p0 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t03.r0 f496029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.h f496030b;

    public p0(t03.r0 r0Var, kk4.h hVar) {
        this.f496029a = r0Var;
        this.f496030b = hVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        java.lang.String str = this.f496029a.f496038b0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCdnDownload() #onStop:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(oVar != null ? oVar.f69601xaca5bdda : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        nk4.s sVar;
        t03.r0 r0Var = this.f496029a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.f496038b0, "startCdnDownload()#onStart " + r0Var.w() + ' ' + i17);
        if (i17 == 0) {
            r0Var.S(true);
            ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            if (bVar == null || (sVar = r0Var.f390121m) == null) {
                return;
            }
            sVar.a(new nk4.b(bVar.f124067d2, android.os.SystemClock.uptimeMillis(), null, 4, null), ((ck4.b) oVar).f69601xaca5bdda);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kk4.h hVar = r0Var.f390113e;
        r0Var.N = com.p314xaae8f345.mm.vfs.w6.k(hVar != null ? hVar.f390079e : null);
        ck4.b bVar2 = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar2 != null) {
            kk4.h hVar2 = r0Var.f390113e;
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(hVar2 != null ? hVar2.f390079e : null);
            bVar2.f124079p2 = k17;
            bVar2.f124080q2 = k17;
        }
        kk4.h hVar3 = this.f496030b;
        hVar3.f390081g = true;
        hVar3.f390080f = true;
        yz5.p pVar = hVar3.f390084m;
        if (pVar != null) {
            dn.o oVar2 = r0Var.f390114f;
            pVar.mo149xb9724478(oVar2 != null ? oVar2.f69591xf9dbbe9c : null, 0);
        }
        r0Var.y(4);
    }
}
