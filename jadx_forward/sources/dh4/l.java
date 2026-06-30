package dh4;

@j95.b
/* loaded from: classes11.dex */
public class l extends i95.w implements fa0.r {

    /* renamed from: d, reason: collision with root package name */
    public dh4.f0 f314074d;

    /* renamed from: f, reason: collision with root package name */
    public dh4.t f314076f;

    /* renamed from: g, reason: collision with root package name */
    public dh4.v f314077g;

    /* renamed from: e, reason: collision with root package name */
    public final dh4.p f314075e = new dh4.p();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f314078h = new dh4.k(this);

    public static dh4.p Ai() {
        return wi().f314075e;
    }

    public static dh4.v Bi() {
        if (wi().f314077g == null) {
            wi().f314077g = new dh4.v();
        }
        return wi().f314077g;
    }

    public static dh4.f0 Di() {
        if (wi().f314074d == null) {
            com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var = wi().f314078h;
            gm0.j1.i();
            gm0.j1.n().a(s0Var);
            wi().f314074d = new dh4.f0();
        }
        return wi().f314074d;
    }

    public static dh4.t Ni() {
        if (wi().f314076f == null) {
            wi().f314076f = new dh4.t();
        }
        return wi().f314076f;
    }

    public static dh4.l wi() {
        return (dh4.l) i95.n0.c(dh4.l.class);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        dh4.t tVar = (dh4.t) p21.l.a();
        synchronized (tVar) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = tVar.f314116b.f102450d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (bh4.a aVar : (bh4.a[]) tVar.f314116b.f102450d.toArray(new bh4.a[0])) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(aVar.f102448e)) {
                        java.util.Iterator it = aVar.f102448e.iterator();
                        boolean z17 = true;
                        while (it.hasNext()) {
                            r45.nk6 nk6Var = (r45.nk6) it.next();
                            java.util.Objects.toString(nk6Var);
                            if (nk6Var.f463007e.equals(c01.z1.r())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomInfoListMgr", "reset list info and remove self location info");
                                z17 = false;
                            }
                        }
                        if (z17) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            bh4.b bVar = new bh4.b();
            bVar.f102450d = linkedList;
            tVar.e(bVar);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var = this.f314078h;
        gm0.j1.i();
        gm0.j1.n().d(s0Var);
        dh4.f0 f0Var = this.f314074d;
        if (f0Var != null) {
            f0Var.i();
            this.f314074d = null;
        }
    }
}
