package ks1;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks1.g f393123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f393124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 f393125f;

    public f(ks1.g gVar, zq1.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        this.f393123d = gVar;
        this.f393124e = g0Var;
        this.f393125f = c12965xc9712d2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p944x882e457a.r1 d17;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        ks1.g gVar = this.f393123d;
        gVar.getClass();
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && (d17 = gm0.j1.d()) != null && (sVar = d17.f152297d) != null) {
            sVar.p1(gVar.d(), "", 0);
        }
        zq1.g0 g0Var = this.f393124e;
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            r45.z24 e17 = gVar.e(oVar);
            if (e17 == null) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str4 = "transfer failed invalid jsApiResponse";
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    str4 = str;
                }
                if (g0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                    c12966xaa8af0d6.f175459d = 3;
                    c12966xaa8af0d6.f175460e = "[" + i17 + ", " + i18 + ", " + str4 + ']';
                    g0Var.b(c12966xaa8af0d6);
                }
            } else if (g0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d62 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                c12966xaa8af0d62.f175459d = 0;
                c12966xaa8af0d62.f175460e = "";
                c12966xaa8af0d62.f175461f = e17;
                g0Var.b(c12966xaa8af0d62);
            }
        } else if (i18 == -262 || i18 == -263) {
            ((js1.s) gVar.f393126a).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestTokenManager", "clearToken");
            ((ku5.t0) ku5.t0.f394148d).h(js1.n.f383026d, "TransferRequestTokenManager");
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = this.f393125f;
            if (c12965xc9712d2.f175456q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] transfer failed, token expire and retry failed");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = "transfer failed, token expire and retry failed";
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    str2 = str;
                }
                if (g0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                    c12966xaa8af0d63.f175459d = 4;
                    c12966xaa8af0d63.f175460e = "[" + i17 + ", " + i18 + ", " + str2 + ']';
                    g0Var.b(c12966xaa8af0d63);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] h5Session timeout and retry");
                c12965xc9712d2.f175456q = true;
                ks1.g.a(gVar, c12965xc9712d2);
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new ks1.e(gVar, c12965xc9712d2, g0Var, null), 3, null);
            }
        } else {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                str3 = "transfer failed";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                str3 = str;
            }
            if (g0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d64 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                c12966xaa8af0d64.f175459d = 5;
                c12966xaa8af0d64.f175460e = "[" + i17 + ", " + i18 + ", " + str3 + ']';
                g0Var.b(c12966xaa8af0d64);
            }
        }
        return 0;
    }
}
