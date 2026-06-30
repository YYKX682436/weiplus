package kf2;

/* loaded from: classes3.dex */
public final class q0 extends kf2.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f388825d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f388826e;

    /* renamed from: f, reason: collision with root package name */
    public int f388827f;

    /* renamed from: g, reason: collision with root package name */
    public int f388828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(df2.k controller, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s liteAppStore) {
        super(controller, liteAppStore);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppStore, "liteAppStore");
        this.f388825d = "GamePendantSetSize";
        this.f388826e = true;
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        fo0.n O;
        fo0.q qVar = null;
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject != null) {
            int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.getInt("width"));
            int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.getInt("height"));
            java.lang.String str2 = "width:" + b17 + ", height:" + b18 + ", Density:" + i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.String str3 = this.f388825d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            if (this.f388826e) {
                this.f388827f = b17;
                this.f388828g = b18;
                this.f388826e = false;
            } else if (b17 >= this.f388827f || b18 >= this.f388828g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "ANCHOR_SCREEN_CAST_LITEAPP 2");
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.S1;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", 2);
                zy2.zb.y6(zbVar, z4Var, jSONObject2.toString(), null, 4, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "ANCHOR_SCREEN_CAST_LITEAPP 3");
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.z4 z4Var2 = ml2.z4.S1;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("type", 3);
                zy2.zb.y6(zbVar2, z4Var2, jSONObject3.toString(), null, 4, null);
            }
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (w0Var != null && (O = w0Var.O()) != null) {
                qVar = O.f346359m;
            }
            if (qVar != null) {
                qVar.f346370b = new android.graphics.Point(b17, b18);
            }
            dk2.ef.s0(efVar, -1, null, null, null, false, 30, null);
        }
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "setSize";
    }
}
