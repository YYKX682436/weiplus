package ww1;

/* loaded from: classes15.dex */
public class r1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531807d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hw f531808e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531809f;

    public r1() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gw();
        lVar.f152198b = new r45.hw();
        lVar.f152200d = 5174;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fgetqrcodev2";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f531807d = a17;
    }

    public final org.json.JSONObject H(r45.uk4 uk4Var) {
        if (!((uk4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468965e)) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", uk4Var.f468964d);
            jSONObject.put("wording", uk4Var.f468965e);
            jSONObject.put("url", uk4Var.f468966f);
            jSONObject.put("waapp_username", uk4Var.f468967g);
            jSONObject.put("waapp_path", uk4Var.f468968h);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneF2fQrcode", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531809f = u0Var;
        return mo9409x10f9447a(sVar, this.f531807d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5174;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11134x5f9cdc6f(int r3, int r4, int r5, java.lang.String r6, com.p314xaae8f345.mm.p971x6de15a2e.v0 r7, byte[] r8, long r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ww1.r1.mo11134x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[], long):void");
    }
}
