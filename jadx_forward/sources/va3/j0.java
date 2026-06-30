package va3;

@j95.b
/* loaded from: classes12.dex */
public class j0 extends i95.w implements fa0.s {

    /* renamed from: d, reason: collision with root package name */
    public va3.s f515848d;

    /* renamed from: e, reason: collision with root package name */
    public va3.v0 f515849e = null;

    /* renamed from: f, reason: collision with root package name */
    public va3.z0 f515850f = null;

    /* renamed from: g, reason: collision with root package name */
    public va3.f0 f515851g = null;

    /* renamed from: h, reason: collision with root package name */
    public va3.i0 f515852h = null;

    /* renamed from: i, reason: collision with root package name */
    public va3.g0 f515853i = null;

    public static va3.s Ai() {
        gm0.j1.b().c();
        if (wi().f515848d == null) {
            wi().f515848d = new va3.s();
        }
        return wi().f515848d;
    }

    public static va3.f0 Bi() {
        if (wi().f515851g == null) {
            wi().f515851g = new va3.f0();
        }
        return wi().f515851g;
    }

    public static va3.g0 Di() {
        gm0.j1.b().c();
        if (wi().f515853i == null) {
            wi().f515853i = new va3.g0();
        }
        return wi().f515853i;
    }

    public static va3.i0 Ni() {
        gm0.j1.b().c();
        if (wi().f515852h == null) {
            wi().f515852h = new va3.i0();
        }
        return wi().f515852h;
    }

    public static va3.v0 Ri() {
        if (wi().f515849e == null) {
            wi().f515849e = new va3.v0();
        }
        return wi().f515849e;
    }

    public static va3.z0 Ui() {
        if (wi().f515850f == null) {
            wi().f515850f = new va3.z0();
        }
        return wi().f515850f;
    }

    public static va3.j0 wi() {
        return (va3.j0) i95.n0.c(va3.j0.class);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        va3.z0 z0Var = (va3.z0) q21.d.a();
        synchronized (z0Var) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = z0Var.f515930b.f507508d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (ua3.a aVar : (ua3.a[]) z0Var.f515930b.f507508d.toArray(new ua3.a[0])) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(aVar.f507503e)) {
                        java.util.Iterator it = aVar.f507503e.iterator();
                        boolean z17 = true;
                        while (it.hasNext()) {
                            if (((java.lang.String) it.next()).equals(c01.z1.r())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackRoomListMgr", "reset list info and remove self location info");
                                z17 = false;
                            }
                        }
                        if (z17) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            ua3.b bVar = new ua3.b();
            bVar.f507508d = linkedList;
            bVar.f507509e = z0Var.f515930b.f507509e;
            z0Var.d(bVar);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        va3.v0 v0Var = this.f515849e;
        if (v0Var != null) {
            v0Var.f515900y = null;
            v0Var.h();
            this.f515849e.b(1);
        }
        va3.f0 f0Var = this.f515851g;
        if (f0Var != null) {
            f0Var.b();
            f0Var.f515813c.clear();
        }
        va3.i0 i0Var = this.f515852h;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "stop static map server");
            gm0.j1.d().q(me1.b.f72880x366c91de, i0Var);
        }
        va3.g0 g0Var = this.f515853i;
        if (g0Var != null) {
            Ni().c(g0Var);
        }
    }
}
