package tb1;

/* loaded from: classes7.dex */
public class k0 extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f76786x366c91de = 329;

    /* renamed from: NAME */
    public static final java.lang.String f76787x24728b = "insertCamera";

    /* renamed from: h, reason: collision with root package name */
    public static tb1.j0 f498439h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f498440g;

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        char c17;
        this.f498440g = false;
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        ((tb1.f) f498439h).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.w7.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610(mo50352x76847179);
        int optInt = jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString("mode", "normal");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, "back");
        java.lang.String optString3 = jSONObject.optString("flash", "auto");
        java.lang.String optString4 = jSONObject.optString("size");
        optString4.getClass();
        int hashCode = optString4.hashCode();
        if (hashCode == -1078030475) {
            if (optString4.equals(ya.b.f77490x87518375)) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != 102742843) {
            if (hashCode == 109548807 && optString4.equals("small")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (optString4.equals("large")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        int i17 = c17 != 0 ? c17 != 1 ? 288 : com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf : 480;
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        java.lang.String optString5 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, ya.b.f77490x87518375);
        c12042x78b65610.mo50749x52b73fda(tVar.mo48798x74292566());
        c12042x78b65610.mo50760x764e9211(tVar);
        c12042x78b65610.mo50750x6da835a2(optInt);
        c12042x78b65610.mo50756x764d6925(optString);
        c12042x78b65610.k(optString2, true);
        c12042x78b65610.mo50754x52fbb0ae(optString3);
        c12042x78b65610.mo50755x7b594071(i17);
        c12042x78b65610.mo50757xc62f4b39(optBoolean);
        c12042x78b65610.mo50764xbd067eae(optString5);
        c12042x78b65610.mo50761xdaac6ff(tVar.S());
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        if (j17 != 0 && j18 != 0) {
            c12042x78b65610.p(j17, j18, true);
        }
        tb1.y yVar = (tb1.y) tVar.q(tb1.y.class);
        if (yVar != null) {
            int[] a17 = ((uf1.h) yVar).a(tVar);
            if (a17.length == 2 && a17[0] > 0 && a17[1] > 0) {
                c12042x78b65610.mo50753xac31fcad(new android.util.Size(a17[0], a17[1]));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCamera", "onInsertView screen width: %d, screen height: %d", java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
            }
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray == null || optJSONArray.length() != 4) {
            c12042x78b65610.n(0, 0, j17, j18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            c12042x78b65610.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        c12042x78b65610.mo50765x41786917(jSONObject.optInt("scanFreq"));
        c12042x78b65610.mo50762x4b0c022b(jSONObject.optBoolean("centerCrop"));
        c12042x78b65610.mo50748xfb86a31b().setContentDescription(mo50352x76847179.getString("normal".equals(optString) ? com.p314xaae8f345.mm.R.C30867xcad56011.f571548ij : com.p314xaae8f345.mm.R.C30867xcad56011.f571549ik));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(mo50352x76847179, c12042x78b65610);
    }

    @Override // gb1.d
    public boolean M() {
        return true;
    }

    @Override // gb1.d
    public void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", java.lang.Integer.valueOf(i17));
        tb1.a0 a0Var = (tb1.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertCamera", "onInsertView(viewId : %d) failed, cameraView is null", java.lang.Integer.valueOf(i17));
            nVar.a(o("fail:internal error"));
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(a0Var);
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(tVar);
        P(tVar, a0Var, nVar);
        tb1.c cVar = tb1.b.f498422a;
        cVar.f498426d.put(a0Var.mo50746x72efd496(), new java.lang.ref.WeakReference(a0Var));
        tVar.U(a0Var);
        tVar.R(a0Var);
        tVar.w(a0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(tVar.mo48798x74292566(), new tb1.g0(this, weakReference, weakReference2));
        a0Var.mo50759x79ac5d68(new tb1.h0(this));
    }

    public final boolean P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, tb1.a0 a0Var, gb1.n nVar) {
        si1.e1.a(java.lang.String.valueOf(lVar.mo48798x74292566()), new tb1.i0(this, new java.lang.ref.WeakReference(a0Var), new java.lang.ref.WeakReference(lVar), nVar));
        android.app.Activity activity = (android.app.Activity) lVar.mo50352x76847179();
        if (activity == null) {
            return false;
        }
        boolean b17 = nf.t.b(activity, lVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        tb1.c cVar = tb1.b.f498422a;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", java.lang.Boolean.valueOf(b17));
        boolean a17 = nf.t.a(activity, lVar, "android.permission.CAMERA", 16, "", "");
        cVar.f498423a = a17;
        if (!a17) {
            return false;
        }
        si1.e1.c(lVar.mo48798x74292566());
        if (!this.f498440g) {
            nVar.a(o("ok"));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).h();
            this.f498440g = true;
        }
        return true;
    }
}
