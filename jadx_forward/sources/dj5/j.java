package dj5;

/* loaded from: classes.dex */
public final class j implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f314604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj5.m f314605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f314606f;

    public j(java.util.HashMap hashMap, dj5.m mVar, wi5.z zVar) {
        this.f314604d = hashMap;
        this.f314605e = mVar;
        this.f314606f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list;
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f314604d;
        hashMap.put(num, vVar);
        dj5.m mVar = this.f314605e;
        j75.f Q6 = mVar.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) ((jz5.n) mVar.f314617h).mo141623x754a37bb();
            if (a3Var != null) {
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f432736u = vVar.f432692d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f432729n) != null) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        p13.l lVar = (p13.l) next;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(lVar.f432647e, true);
                        if (!n17.s2()) {
                            ui5.b bVar = new ui5.b(a3Var, lVar, vVar.f432692d, i17, 0, null, 48, null);
                            ri5.h hVar = ri5.j.I;
                            int i19 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                            arrayList.add(ui5.b.f509674g.b(mVar.m158354x19263085(), hVar.a(d17, i19, 0), n17, i19, bVar));
                        }
                        i17 = i18;
                    }
                }
            }
            Q6.B3(new wi5.v(this.f314606f, hashMap, arrayList));
        }
        return jz5.f0.f384359a;
    }
}
