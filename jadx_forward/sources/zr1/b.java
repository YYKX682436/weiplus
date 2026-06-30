package zr1;

/* loaded from: classes11.dex */
public abstract class b {
    public static final java.util.LinkedList a(long j17) {
        jz5.g gVar = com.p314xaae8f345.mm.p2621x8fb0427b.o1.f276723a;
        int o17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.mm.p2621x8fb0427b.o1.f276723a).mo141623x754a37bb()).o("RecycleCardMaxMsgCount", 10);
        if (o17 < 2) {
            o17 = 2;
        }
        if (o17 > 50) {
            o17 = 50;
        }
        java.util.List d17 = r01.q3.nj().d1(620757041, o17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : d17) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.s1) obj).f67292x297eb4f7 != j17) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.s1) it.next();
            r45.xl5 xl5Var = new r45.xl5();
            r45.sj6 u07 = s1Var.u0();
            xl5Var.f471748d = u07 != null ? u07.f467331s : null;
            long j18 = s1Var.f67292x297eb4f7;
            xl5Var.f471749e = j18;
            xl5Var.f471752h = java.lang.String.valueOf(j18);
            linkedList.add(xl5Var);
        }
        return linkedList;
    }

    public static final void b(r45.jk resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        jz5.g gVar = com.p314xaae8f345.mm.p2621x8fb0427b.o1.f276723a;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.mm.p2621x8fb0427b.o1.f276723a).mo141623x754a37bb()).A("RecycleCardMaxMsgCount", resp.f459430e);
        pm0.v.L("MicroMsg.BizRecycleCardLogic", true, new zr1.a(resp));
    }
}
