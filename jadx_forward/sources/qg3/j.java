package qg3;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f444356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444358f;

    public j(byte[] bArr, int i17, int i18) {
        this.f444356d = bArr;
        this.f444357e = i17;
        this.f444358f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f444357e;
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.mo11468x92b714fd(this.f444356d);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d2725, i17, null);
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(0, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
            qt2Var.set(5, java.lang.Integer.valueOf(i17));
            ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            qt2Var.set(1, b17);
            ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
            qt2Var.set(2, b52.b.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q;
            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0.b(o0Var, qt2Var, m76784x5db1b11, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null, 14, java.lang.String.valueOf(this.f444358f), 0L, null, null, null, 480, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLegacyJavaStatic", "parse pb error:" + e17.getMessage());
        }
    }
}
