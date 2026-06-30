package oq3;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.kc5 f428914d;

    public e(r45.kc5 kc5Var) {
        this.f428914d = kc5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.kc5 kc5Var = this.f428914d;
        long max = java.lang.Math.max(kc5Var.f460121e, c01.id.c() + 240000) + (e06.p.j(new e06.k(0, 30), c06.e.f119249d) * 1000);
        sq3.f cj6 = ((fq3.n) i95.n0.c(fq3.n.class)).cj();
        java.util.LinkedList<r45.cm> biz_resps = kc5Var.f460120d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(biz_resps, "biz_resps");
        long min = java.lang.Math.min(max, c01.id.c() + 3600000);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = cj6.f492894f;
        if (o4Var != null) {
            o4Var.B(cj6.f492895g, min);
            for (r45.cm cmVar : biz_resps) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = cj6.f492896h;
                sb6.append(str);
                sb6.append(cmVar.f453193d);
                o4Var.W(sb6.toString());
                java.lang.String str2 = str + cmVar.f453193d;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = cmVar.f453194e;
                o4Var.H(str2, gVar != null ? gVar.g() : null);
                o4Var.B(cj6.f492897i + cmVar.f453193d, cmVar.f453195f);
                o4Var.B(cj6.f492898m + cmVar.f453193d, 0L);
            }
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        if (c4446x11b6e6e0 != null) {
            c4446x11b6e6e0.m37772x5157bd8e(((fq3.n) i95.n0.c(fq3.n.class)).cj().T6(1), java.lang.Math.min(max - c01.id.c(), 3600000L));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(biz_resps, "biz_resps");
        java.util.Iterator it = biz_resps.iterator();
        while (it.hasNext()) {
            if (((r45.cm) it.next()).f453193d == 1) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.m134976x2690a4ac();
                nVar.B.h(true);
            }
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        kq3.l lVar = nVar2.f347069u;
        long min2 = java.lang.Math.min(max - c01.id.c(), 3600000L);
        kq3.k kVar = lVar.f392812b;
        if (kVar != null) {
            kVar.mo50307xb9e94560(2, min2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreDownloadCheckPLC", "pre download check end, get c2c quota:" + ((fq3.n) i95.n0.c(fq3.n.class)).cj().T6(1));
    }
}
