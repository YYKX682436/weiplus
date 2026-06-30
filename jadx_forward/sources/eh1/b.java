package eh1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69673x366c91de = 1276;

    /* renamed from: NAME */
    public static final java.lang.String f69674x24728b = "insertMagicBrushFrame";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.a T2;
        fh1.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f162871e = false;
        if (!data.has("frameId")) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str, jSONObject));
            return;
        }
        int optInt = data.optInt("frameId", 0);
        java.lang.String optString = data.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String optString2 = data.optString("fsPath");
        if (optString2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = env.mo50354x59eafec1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2 g2Var = mo50354x59eafec1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2) mo50354x59eafec1 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 a17 = g2Var != null ? g2Var.a(optString2) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) a17 : null;
            java.lang.String str4 = j3Var != null ? j3Var.f157759e : null;
            if (!(str4 == null || str4.length() == 0)) {
                optString2 = r26.i0.w(optString2, str4, "", false);
            }
        } else {
            optString2 = null;
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        int optInt2 = data.optInt("biz");
        int optInt3 = optJSONObject != null ? optJSONObject.optInt("width", 0) : 0;
        int optInt4 = optJSONObject != null ? optJSONObject.optInt("height", 0) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = env.x();
        if (x17 == null) {
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str5 != null ? str5 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            env.a(i17, u(str, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = mo32091x9a3f0ba2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2 : null;
        if (o6Var == null || (T2 = o6Var.T2()) == null) {
            java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str7 != null ? str7 : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            env.a(i17, u(str, jSONObject3));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.b) T2;
        android.util.SparseArray sparseArray = bVar.f167269c;
        int indexOfKey = sparseArray.indexOfKey(optInt2);
        if (indexOfKey >= 0) {
            java.lang.Object valueAt = sparseArray.valueAt(indexOfKey);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueAt);
            iVar = (fh1.i) valueAt;
        } else {
            fh1.z zVar = new fh1.z(bVar.f167267a, optInt2, optString2, x17);
            sparseArray.put(optInt2, zVar);
            iVar = zVar;
        }
        fh1.z zVar2 = (fh1.z) iVar;
        zVar2.e(new fh1.q(zVar2, optInt, optString, optInt3, optInt4));
        java.lang.String optString3 = data.optString("appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(data.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE);
        h0Var.f391656d = a18;
        if (a18 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.DEVELOP) {
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.TRIAL;
        }
        pm0.v.X(new eh1.a(iVar, optString3, h0Var, data.optString("appPath")));
        java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str9 != null ? str9 : "";
        java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        env.a(i17, u(str, jSONObject4));
    }
}
