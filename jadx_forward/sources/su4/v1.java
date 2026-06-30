package su4;

/* loaded from: classes.dex */
public class v1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494646d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494647e;

    /* renamed from: f, reason: collision with root package name */
    public final int f494648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f494649g;

    /* renamed from: h, reason: collision with root package name */
    public int f494650h = -1;

    /* renamed from: i, reason: collision with root package name */
    public su4.g2 f494651i;

    public v1(java.util.Map map, int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n77();
        lVar.f152198b = new r45.o77();
        lVar.f152199c = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
        lVar.f152200d = 1866;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494646d = a17;
        this.f494649g = i18;
        this.f494648f = i17;
        r45.e64 i19 = su4.r2.i();
        r45.n77 n77Var = (r45.n77) a17.f152243a.f152217a;
        if (i19 != null) {
            n77Var.f462675d = i19.f454580e;
            n77Var.f462676e = i19.f454579d;
        }
        n77Var.f462677f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
        n77Var.f462678g = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3);
        n77Var.f462679h = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "statSessionId");
        n77Var.f462680i = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "extReqParams");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(f17);
                n77Var.f462681m = new java.util.LinkedList();
                for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                    r45.tw6 tw6Var = new r45.tw6();
                    tw6Var.f468370d = jSONObject.optString("key", "");
                    tw6Var.f468371e = jSONObject.optLong("uintValue", 0L);
                    tw6Var.f468372f = jSONObject.optString("textValue", "");
                    n77Var.f462681m.push(tw6Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "weappsearchguide req, version = %d, sessionId = %s, scene = %d, extParam = %s", java.lang.Integer.valueOf(n77Var.f462678g), n77Var.f462679h, java.lang.Integer.valueOf(n77Var.f462680i), f17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494647e = u0Var;
        return mo9409x10f9447a(sVar, this.f494646d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f494646d.f152246d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        su4.g2 g2Var = new su4.g2(this.f494648f, (r45.o77) this.f494646d.f152244b.f152233a, this.f494649g);
        this.f494651i = g2Var;
        java.lang.String a17 = ys3.l.a();
        r45.rh4 rh4Var = new r45.rh4();
        rh4Var.f466404d = g2Var.f494430a;
        rh4Var.f466405e = g2Var.f494431b;
        rh4Var.f466406f = g2Var.f494432c;
        rh4Var.f466407g = g2Var.f494433d;
        rh4Var.f466408h = g2Var.f494434e;
        try {
            bArr2 = rh4Var.mo14344x5f01b1f6();
        } catch (java.io.IOException unused) {
            bArr2 = null;
        }
        if (bArr2 != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17, su4.g2.a(g2Var.f494430a));
            if (!r6Var.s().m()) {
                r6Var.s().J();
            }
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.mm.vfs.w6.S(r6Var.o(), bArr2, 0, bArr2.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj saved, scene:%d", java.lang.Integer.valueOf(g2Var.f494430a));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj toBytes fail, scene:%d!", java.lang.Integer.valueOf(g2Var.f494430a));
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494647e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
