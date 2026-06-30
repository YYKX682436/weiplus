package is;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.p f375881d;

    public k(is.p pVar) {
        this.f375881d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f375881d.getClass();
        am5.c cVar = am5.c.f90353b;
        cVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) cVar.f90354a;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            am5.a aVar = (am5.a) hashMap.get((am5.b) it.next());
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        boolean z17 = false;
        while (it6.hasNext()) {
            am5.a aVar2 = (am5.a) it6.next();
            if (aVar2.a()) {
                if (aVar2.f90347a.equals("HEAVY_USER_CONTACT")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 10L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428848l);
                } else if (aVar2.f90347a.equals("HEAVY_USER_SESSION")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 11L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428847k);
                } else if (aVar2.f90347a.equals("HEAVY_USER_STORAGE")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 12L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428849m);
                } else if (aVar2.f90347a.equals("HEAVY_USER_GAME")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 13L, 1L);
                    ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428850n);
                }
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 2L, 1L);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1987L, 1L, 1L);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428846j);
    }
}
