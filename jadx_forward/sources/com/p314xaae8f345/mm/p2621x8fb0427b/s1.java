package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class s1 extends dm.l1 {
    public static final l75.e0 W1 = dm.l1.m125188x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.s1.class);
    public r45.sj6 U1 = null;
    public com.p314xaae8f345.mm.p2621x8fb0427b.c1 V1 = null;

    public boolean A0() {
        return this.f67308x2262335f == 620757041;
    }

    public boolean D0() {
        int i17 = this.f67308x2262335f;
        return i17 == 1 || i17 == 11 || i17 == 21 || i17 == 31 || i17 == 36 || i17 == 1107296305;
    }

    @Override // dm.l1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return W1;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.c1 t0() {
        com.p314xaae8f345.mm.p2621x8fb0427b.c1 c1Var = this.V1;
        if (c1Var != null) {
            return c1Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.c1 a17 = eq1.z.f337409a.a(this.f67281xad49e234);
        this.V1 = a17;
        return a17;
    }

    public r45.sj6 u0() {
        if (!A0()) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.N) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67281xad49e234)) {
            return null;
        }
        r45.sj6 sj6Var = this.U1;
        if (sj6Var != null) {
            return sj6Var;
        }
        this.U1 = new r45.sj6();
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67281xad49e234)) {
            try {
                this.U1.mo11468x92b714fd(android.util.Base64.decode(this.f67281xad49e234, 0));
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfo", "[TRACE_BIZRECCARD] getTLRecCard parseFrom content ex %s", e17.getMessage());
            }
        }
        if (!z17) {
            try {
                this.U1.mo11468x92b714fd(this.N);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfo", "getTLRecCard parseFrom ex %s", e18.getMessage());
                this.U1 = null;
            }
        }
        return this.U1;
    }

    public boolean v0() {
        return this.f67308x2262335f == 285212721;
    }

    public boolean w0() {
        return this.f67308x2262335f == 318767153;
    }

    public boolean y0() {
        int i17 = this.f67308x2262335f;
        return i17 == 3 || i17 == 13 || i17 == 23 || i17 == 33 || i17 == 39;
    }

    public boolean z0() {
        return this.f67308x2262335f == 10100;
    }
}
