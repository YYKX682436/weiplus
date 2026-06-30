package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class b0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f270342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270347i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f270348m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f270349n;

    public b0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a0 a0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, int i18) {
        this.f270342d = j17;
        this.f270343e = str;
        this.f270344f = str2;
        this.f270345g = str3;
        this.f270346h = i17;
        this.f270347i = f9Var;
        this.f270348m = z17;
        this.f270349n = i18;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.String str3 = this.f270343e;
        long j17 = this.f270342d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: msgid:%d startRet:%d thumbUrl:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str3);
            return i17;
        }
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        java.lang.String str4 = this.f270344f;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: msgid:%d sceneResult.field_retCode:%d thumbUrl:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), str3);
            com.p314xaae8f345.mm.vfs.w6.h(str4);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
            java.lang.String str5 = this.f270345g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = g9Var.o2(str5, j17);
            if (o27 == null || o27.I0() != j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessageExtension", "hy: appmsg %d has been deleted", java.lang.Long.valueOf(j17));
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "hy: %d current msg type is %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(o27.mo78013xfb85f7b0()));
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str4, 0, -1);
            int i19 = this.f270346h;
            if (i19 == 33 || i19 == 36 || i19 == 46 || i19 == 44 || i19 == 48 || i19 == 101 || i19 == 76 || i19 == 92 || i19 == 93) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String K3 = m11.b1.Di().K3(o27, "", N, 100, android.graphics.Bitmap.CompressFormat.JPEG);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String D2 = m11.b1.Di().D2(o27, K3, true);
                zz.b Zi = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D2, 33, null, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", D2, java.lang.Integer.valueOf(Zi.f559224a), java.lang.Boolean.valueOf(Zi.f559225b), java.lang.Boolean.valueOf(Zi.f559226c), java.lang.Boolean.valueOf(Zi.f559227d), java.lang.Long.valueOf(Zi.f559228e));
                com.p314xaae8f345.mm.vfs.w6.h(str4);
                str2 = K3;
            } else {
                java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1.a(this.f270347i);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    boolean m27 = o27.m2();
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.l0 Di = m11.b1.Di();
                    android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.PNG;
                    Di.getClass();
                    boolean z18 = this.f270348m;
                    str2 = Di.v4(o27, N, compressFormat, m27, z18 ? 128 : 120, z18 ? 128 : 120);
                } else {
                    int[] b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1.b(a17);
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    str2 = m11.b1.Di().v4(o27, N, android.graphics.Bitmap.CompressFormat.PNG, false, b17[0], b17[1]);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                o27.i1(str2);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).nb(o27.I0(), o27);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageExtension", "getThumbByCdn finished msgid:%d talker:%s thumbUrl:%s path:%s", java.lang.Long.valueOf(j17), str5, str3, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(198L, 16L, this.f270349n, false);
            g0Var.mo68477x336bdfd8(198L, 17L, 1L, false);
            g0Var.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str5) ? 19L : 18L, 1L, false);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().m142058xf35bbb4();
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
