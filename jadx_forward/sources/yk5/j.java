package yk5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f544418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f544419e;

    public j(yk5.u uVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f544419e = uVar;
        this.f544418d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.iw5 H = ((tg3.r1) this.f544418d).H();
        int i17 = H.D;
        yk5.u uVar = this.f544419e;
        if (i17 > 0) {
            for (r45.gw5 gw5Var : H.E) {
                int i18 = gw5Var.f457104q;
                java.util.Set set = c01.e2.f118650a;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i18)) {
                    if (uVar.f544443t == null) {
                        uVar.f544443t = new java.util.LinkedList();
                    }
                    uVar.f544443t.add(gw5Var);
                }
            }
        } else {
            java.lang.String g17 = x51.j1.g(H.f458889d);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if ((g17 == null ? "" : g17).length() > 0) {
                r45.gw5 gw5Var2 = new r45.gw5();
                gw5Var2.f457094d = H.f458889d;
                gw5Var2.f457104q = H.f458899q;
                gw5Var2.f457102o = H.f458897o;
                gw5Var2.f457095e = H.f458890e;
                gw5Var2.f457107t = H.f458902t;
                gw5Var2.A = H.A;
                gw5Var2.f457101n = H.f458896n;
                gw5Var2.f457100m = H.f458895m;
                gw5Var2.f457098h = H.f458893h;
                gw5Var2.f457105r = H.f458900r;
                gw5Var2.f457109v = H.f458904v;
                gw5Var2.f457106s = H.f458901s;
                gw5Var2.f457108u = H.f458903u;
                gw5Var2.f457113z = H.f458908z;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().v(g17, x51.j1.d(H.f458894i));
                if (uVar.f544443t == null) {
                    uVar.f544443t = new java.util.LinkedList();
                }
                uVar.f544443t.clear();
                int i19 = gw5Var2.f457104q;
                java.util.Set set2 = c01.e2.f118650a;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i19)) {
                    uVar.f544443t.add(gw5Var2);
                }
                uVar.f544443t.size();
            }
        }
        uVar.f544446w = false;
    }
}
