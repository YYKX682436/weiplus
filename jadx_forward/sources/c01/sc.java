package c01;

/* loaded from: classes15.dex */
public final class sc {

    /* renamed from: c, reason: collision with root package name */
    public static final int f118993c = 500547758 + 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f118994d = 500547758 + 2;

    /* renamed from: e, reason: collision with root package name */
    public static c01.sc f118995e;

    /* renamed from: a, reason: collision with root package name */
    public long f118996a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f118997b;

    public sc() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f118997b = hashMap;
        hashMap.put(java.lang.Integer.valueOf(f118993c), new c01.fc(this));
        hashMap.put(java.lang.Integer.valueOf(f118994d), new c01.jc(this));
        hashMap.put(24, new c01.kc(this));
        hashMap.put(25, new c01.lc(this));
        hashMap.put(26, new c01.mc(this));
        hashMap.put(10071, new c01.nc(this));
        hashMap.put(10076, new c01.oc(this));
        hashMap.put(19, new c01.pc(this));
        hashMap.put(10112, new c01.qc(this));
        hashMap.put(10113, new c01.vb(this));
        hashMap.put(10114, new c01.wb(this));
        hashMap.put(10115, new c01.xb(this));
        hashMap.put(java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb), new c01.yb(this));
        hashMap.put(10241, new c01.zb(this));
        hashMap.put(15, new c01.ac(this));
        hashMap.put(16, new c01.bc(this));
        hashMap.put(27, new c01.cc(this));
        hashMap.put(38, new c01.dc(this));
        hashMap.put(10090, new c01.ec(this));
        hashMap.put(10237, new c01.gc(this));
        hashMap.put(10238, new c01.hc(this));
        hashMap.put(10239, new c01.ic(this));
    }

    public static void b(int i17, java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.g44 g44Var = new r45.g44();
        g44Var.f456402d = i17;
        g44Var.f456403e = str;
        linkedList.add(g44Var);
        c(linkedList);
    }

    public static void c(java.util.LinkedList linkedList) {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            r45.h44 h44Var = new r45.h44();
            h44Var.f457357e = linkedList;
            h44Var.f457356d = linkedList != null ? linkedList.size() : 0;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(36, h44Var));
        }
    }

    public static c01.sc d() {
        if (f118995e == null) {
            f118995e = new c01.sc();
        }
        return f118995e;
    }

    public void a(int i17, java.lang.Object... objArr) {
        c01.rc rcVar = (c01.rc) ((java.util.HashMap) this.f118997b).get(java.lang.Integer.valueOf(i17));
        if (rcVar == null) {
            return;
        }
        c01.qb e17 = e();
        java.util.LinkedList linkedList = e17.f118935d;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                linkedList.add(rcVar.b(i17, objArr));
                break;
            }
            c01.pb pbVar = (c01.pb) it.next();
            if (pbVar.f118912d == i17) {
                rcVar.c(pbVar, objArr);
                break;
            }
        }
        f(e17);
    }

    public final c01.qb e() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r() && gm0.j1.u().c() != null) {
                byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) gm0.j1.u().c().l(8215, null));
                if (h17.length <= 0) {
                    return new c01.qb();
                }
                try {
                    c01.qb qbVar = new c01.qb();
                    qbVar.mo11468x92b714fd(h17);
                    return qbVar;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatisticsKVReportLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
        return new c01.qb();
    }

    public final void f(c01.qb qbVar) {
        if (qbVar == null || !gm0.j1.b().m() || gm0.j1.u().c() == null) {
            return;
        }
        gm0.j1.b();
        if (gm0.m.r()) {
            return;
        }
        try {
            gm0.j1.u().c().w(8215, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(qbVar.mo14344x5f01b1f6()));
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatisticsKVReportLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
