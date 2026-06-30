package ks1;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final js1.c f393126a;

    public g(js1.c tokenManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenManager, "tokenManager");
        this.f393126a = tokenManager;
    }

    public static final void a(ks1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] needClientCheckData: " + c12965xc9712d2.f175451i);
        if (c12965xc9712d2.f175451i && c12965xc9712d2.f175452m == null) {
            r45.k57 k57Var = new r45.k57();
            java.lang.System.currentTimeMillis();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            java.lang.System.currentTimeMillis();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.mo14344x5f01b1f6());
            c12965xc9712d2.f175452m = cu5Var2;
        }
    }

    public static final void b(ks1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2, zq1.g0 g0Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        sb6.append(gVar.f());
        sb6.append("] method: ");
        r45.y24 y24Var = c12965xc9712d2.f175450h;
        sb6.append(y24Var != null ? java.lang.Integer.valueOf(y24Var.f472262h) : null);
        sb6.append(", h5Url: ");
        sb6.append(c12965xc9712d2.f175447e);
        sb6.append(", reqUrl: ");
        r45.y24 y24Var2 = c12965xc9712d2.f175450h;
        sb6.append(y24Var2 != null ? y24Var2.f472258d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTransferRequest", sb6.toString());
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            java.lang.String str2 = c12965xc9712d2.f175457r;
            if (!(str2 == null || str2.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] cgi: " + gVar.d() + ", debugIP: " + c12965xc9712d2.f175457r);
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                if (d17 != null && (sVar = d17.f152297d) != null) {
                    sVar.p1(gVar.d(), c12965xc9712d2.f175457r, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.z2.d(gVar.c(c12965xc9712d2), new ks1.f(gVar, g0Var, c12965xc9712d2), false);
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.o c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2);

    public abstract java.lang.String d();

    public abstract r45.z24 e(com.p314xaae8f345.mm.p944x882e457a.o oVar);

    public abstract java.lang.String f();
}
