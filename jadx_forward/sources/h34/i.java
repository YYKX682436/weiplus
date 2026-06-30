package h34;

/* loaded from: classes8.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360071d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f360072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f360073f;

    /* renamed from: g, reason: collision with root package name */
    public long f360074g = 0;

    public i(java.lang.String str, java.util.Collection collection, int i17, float f17, float f18, int i18) {
        this.f360073f = 1;
        this.f360073f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tx3();
        lVar.f152198b = new r45.ux3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/ibeaconboardcast";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q0.f33746x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360072e = a17;
        c01.fb a18 = c01.fb.a();
        java.lang.String str2 = a18.f118728i;
        str2 = str2 == null ? "" : str2;
        java.lang.String str3 = a18.f118727h;
        str3 = str3 == null ? "" : str3;
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        r45.tx3 tx3Var = (r45.tx3) a17.f152243a.f152217a;
        tx3Var.f468387d = str == null ? "" : str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"Beacons\":[");
        if (collection != null) {
            collection.size();
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
        }
        sb6.append("],\"Action\":" + i17 + ",\"LBS\":{\"Latitude\":" + f17 + ",\"Longitude\":" + f18 + ",\"Province\":\"" + str2 + "\",\"City\":\"" + str3 + "\"},\"MachineID\":\"" + wo.w0.k() + "\",\"ZBBeaconState\":\"" + ((defaultAdapter != null && defaultAdapter.getState() == 12 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) ? 0 : 1) + "\"}");
        tx3Var.f468388e = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(collection != null ? collection.size() : 0);
        objArr[1] = tx3Var.f468388e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang]beaconCollection.size:%d,json:%s", objArr);
        if (i17 == 1) {
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2008, f18, f17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f360074g = java.lang.System.currentTimeMillis();
        this.f360071d = u0Var;
        return mo9409x10f9447a(sVar, this.f360072e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q0.f33746x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:netId:%s,errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f360071d.mo815x76e0bfae(i18, i19, str, this);
        this.f360074g = java.lang.System.currentTimeMillis() - this.f360074g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11497, java.lang.String.valueOf((int) ((r3 / 1000) + 0.5d)), 1, java.lang.Integer.valueOf((int) this.f360074g));
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360072e;
        if (i18 != 0 || i19 != 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r45.tx3) oVar.f152243a.f152217a).f468388e);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("Beacons");
                int length = jSONArray.length();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("LBS");
                java.lang.String string = jSONObject2.getString("Latitude");
                java.lang.String string2 = jSONObject2.getString("Longitude");
                if (length > 0) {
                    org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                    java.lang.String string3 = jSONObject3.getString("UUID");
                    org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Location");
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length), string3, java.lang.Integer.valueOf(jSONObject4.getInt("Major")), java.lang.Integer.valueOf(jSONObject4.getInt("Minor")), string, string2, 1, java.lang.Integer.valueOf(i19));
                } else {
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length), "", 0, 0, string, string2, 1, java.lang.Integer.valueOf(i19));
                }
                return;
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
                return;
            }
        }
        r45.ux3 ux3Var = (r45.ux3) oVar.f152244b.f152233a;
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject(((r45.tx3) oVar.f152243a.f152217a).f468388e);
            org.json.JSONArray jSONArray2 = jSONObject5.getJSONArray("Beacons");
            int length2 = jSONArray2.length();
            org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("LBS");
            int i27 = jSONObject5.getInt("Action");
            java.lang.String string4 = jSONObject6.getString("Latitude");
            java.lang.String string5 = jSONObject6.getString("Longitude");
            if (length2 > 0) {
                org.json.JSONObject jSONObject7 = jSONArray2.getJSONObject(0);
                java.lang.String string6 = jSONObject7.getString("UUID");
                org.json.JSONObject jSONObject8 = jSONObject7.getJSONObject("Location");
                int i28 = jSONObject8.getInt("Major");
                int i29 = jSONObject8.getInt("Minor");
                r45.xx3 xx3Var = ux3Var.f469250d;
                if (xx3Var == null || xx3Var.f472110d != 0) {
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), string6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f469250d.f472110d));
                } else {
                    java.lang.String str2 = xx3Var.f472112f;
                    if (i27 == 1 && str2 != null && !str2.equals("") && new org.json.JSONObject(str2).getJSONArray("msgs").length() == 0) {
                        g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), string6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f469250d.f472110d));
                    }
                }
            } else {
                g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), "", 0, 0, string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f469250d.f472110d));
            }
        } catch (org.json.JSONException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
        }
    }
}
