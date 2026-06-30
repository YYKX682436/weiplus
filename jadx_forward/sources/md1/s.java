package md1;

/* loaded from: classes7.dex */
public class s extends md1.q0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72860x366c91de = 516;

    /* renamed from: NAME */
    public static final java.lang.String f72861x24728b = "joinVoIPChat";

    /* renamed from: i, reason: collision with root package name */
    public final md1.c1 f407322i = new md1.c1();

    /* renamed from: m, reason: collision with root package name */
    public final md1.d1 f407323m = new md1.d1();

    /* renamed from: n, reason: collision with root package name */
    public final md1.g1 f407324n = new md1.g1();

    /* renamed from: o, reason: collision with root package name */
    public final md1.e1 f407325o = new md1.e1();

    /* renamed from: p, reason: collision with root package name */
    public final md1.f1 f407326p = new md1.f1();

    /* renamed from: q, reason: collision with root package name */
    public final md1.a1 f407327q = new md1.a1();

    /* renamed from: r, reason: collision with root package name */
    public final md1.z0 f407328r = new md1.z0();

    /* renamed from: s, reason: collision with root package name */
    public u81.f f407329s = null;

    /* renamed from: t, reason: collision with root package name */
    public final md1.k1 f407330t = new md1.k1();

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f407331u = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f407332v = "";

    /* renamed from: w, reason: collision with root package name */
    public long f407333w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f407334x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f407335y = false;

    public s() {
        si1.e.a(f72861x24728b);
    }

    @Override // md1.q0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:data is null or nil") ? "fail:jsapi invalid request data" : "fail:data is null or nil";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        fb1.c ec6 = fb1.e.f342369e.ec(fb1.d.f342365g, false, new md1.j(this, c0Var));
        if (ec6 instanceof fb1.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "can not join voip chat now, message:%s", ((fb1.a) ec6).f342360a);
            java.util.HashMap hashMap = new java.util.HashMap();
            C(hashMap, D(-10086, -7));
            java.lang.String format = java.lang.String.format("fail: %d, %d, can not join voip chat now", -10086, -7);
            if (format == null) {
                format = null;
            }
            if (format == null) {
                format = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1107001);
            c0Var.a(i17, t(format, hashMap));
            return;
        }
        this.f407332v = c0Var.mo48798x74292566();
        I(c0Var);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c0Var);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        p0Var.X1 = new md1.k(this, weakReference);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appId:" + c0Var.mo48798x74292566() + ", params:" + jSONObject.toString());
        fw1.b G = G(c0Var, jSONObject);
        if (G == null) {
            java.lang.String str4 = android.text.TextUtils.isEmpty("fail: param error!") ? "fail:jsapi invalid request data" : "fail: param error!";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str4, jSONObject3));
            this.f407335y = false;
            return;
        }
        this.f407334x = 0;
        this.f407333w = android.os.SystemClock.elapsedRealtime();
        G.f348582c = "wx766655dab8fe851b";
        md1.j1 b17 = md1.j1.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f407318g;
        int i18 = this.f407319h;
        b17.f407284a = v5Var;
        b17.f407285b = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "init, roomType:%d", java.lang.Integer.valueOf(i18));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        md1.l lVar = new md1.l(this, G, c0Var, i17);
        md1.m mVar = new md1.m(this, c0Var, G);
        md1.n nVar = new md1.n(this, c0Var);
        md1.o oVar = new md1.o(this, c0Var);
        md1.p pVar = new md1.p(this, c0Var);
        md1.q qVar = new md1.q(this, c0Var);
        md1.r rVar = new md1.r(this, c0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger join room. %s, %s, %s, %d, %s", G.f348581b, G.f348583d, G.f348585f, java.lang.Integer.valueOf(G.f348586g), G.f348584e);
        p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b2(p0Var, G, lVar, mVar, nVar, oVar, pVar, qVar, rVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: JsApiCloudVoiceJoinVoIPChat callbackId:" + i17);
    }

    public java.util.Map H(java.util.ArrayList arrayList) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fw1.d) it.next()).f348603b);
            }
        }
        hashMap.put("openIdList", arrayList2);
        return hashMap;
    }

    public void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        if (this.f407329s == null) {
            this.f407329s = new md1.i(this, c0Var);
        }
        if (c0Var.t3() == null || c0Var.t3().N == null) {
            return;
        }
        c0Var.t3().N.a(this.f407329s);
    }
}
