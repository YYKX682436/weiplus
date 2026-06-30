package mz2;

/* loaded from: classes9.dex */
public class p1 extends mz2.a {
    @Override // pz2.a
    public java.util.Map C() {
        return this.f414618d.C();
    }

    @Override // mz2.a, pz2.a
    public boolean D() {
        return this.f414618d.D();
    }

    @Override // pz2.a
    public boolean Ge(boolean z17, boolean z18, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b, extInfo: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), bundle);
        this.f414618d.Mf(z17, z18, mz2.d2.IML.f414646f, bundle);
        return false;
    }

    @Override // mz2.a, pz2.a
    public boolean H4() {
        return this.f414618d.E2();
    }

    @Override // pz2.a
    public boolean Ic() {
        return this.f414618d.Lf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // pz2.a
    public boolean L2() {
        boolean mf6 = this.f414618d.mf();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "py: hasAuthKey: %b", java.lang.Boolean.valueOf(mf6));
        if (!mf6 && this.f414618d.wh()) {
            ((nz2.a) this.f414618d).getClass();
            if ((mz2.m0.a() && this.f414618d.ja()) || (((nz2.a) this.f414618d).a() && this.f414618d.h1())) {
                m05.i.f404103a.a("5", "4", "1", "key invalid when pay");
            }
        }
        return mf6;
    }

    @Override // pz2.a
    public boolean Nh() {
        return false;
    }

    @Override // pz2.a
    public void O(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
        c5820xc13f26f8.f136129h.f89172e = Uh();
        am.pn pnVar = c5820xc13f26f8.f136129h;
        pnVar.f89168a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pnVar.f89172e) ? 1 : 0;
        am.pn pnVar2 = c5820xc13f26f8.f136129h;
        pnVar2.f89173f = 2;
        pnVar2.f89169b = "";
        pnVar2.f89170c = "";
        java.lang.Runnable runnable = c5820xc13f26f8.f136128g.f89098c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // pz2.a
    public int Q7(pz2.c cVar, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "start face auth: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new mz2.n1(this, i17, cVar), false);
        long j17 = i17;
        b4Var.c(j17, j17);
        this.f414618d.C3(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new nz2.f(mz2.d2.IML.f414644d, i18 == 2 ? 3 : 1), new mz2.o1(this, b4Var, cVar));
        return 0;
    }

    @Override // pz2.a
    public boolean Rb() {
        return this.f414618d.uf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // mz2.a, pz2.a
    public java.lang.String Uh() {
        zt5.s sVar = mz2.d2.IML.f414647g;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", sVar.f557162j);
            jSONObject.put("signature", sVar.f557163k);
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SoterAuthMgrImp", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // pz2.a
    public boolean a1() {
        boolean h17 = this.f414618d.h1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFaceID:%s", java.lang.Boolean.valueOf(h17));
        return h17;
    }

    @Override // pz2.a
    public void af() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
        this.f414618d.mo150321xed060d07();
    }

    @Override // pz2.a
    public void dc(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
    }

    @Override // pz2.a
    public int dg(pz2.c cVar, int i17, boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
            return 0;
        }
        this.f414618d.g9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new nz2.f(mz2.d2.IML.f414644d, 1), new mz2.m1(this, cVar));
        return 0;
    }

    @Override // pz2.a
    /* renamed from: isRoot */
    public boolean mo148657xb9a85d2c() {
        return false;
    }

    @Override // pz2.a
    /* renamed from: type */
    public int mo148658x368f3a() {
        return 2;
    }

    @Override // pz2.a
    /* renamed from: userCancel */
    public void mo148659x428ac225() {
        this.f414618d.mo150320xae7a2e7a();
    }

    @Override // pz2.a
    public boolean wc() {
        return this.f414618d.Je();
    }

    @Override // pz2.a
    public boolean yh() {
        boolean ja6 = this.f414618d.ja();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(ja6));
        return ja6;
    }
}
