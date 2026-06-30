package qd1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f443161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f443164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f443165i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f443166m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qd1.h f443167n;

    public f(qd1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject, java.util.ArrayList arrayList) {
        this.f443167n = hVar;
        this.f443160d = e9Var;
        this.f443161e = v5Var;
        this.f443166m = i17;
        this.f443162f = i18;
        this.f443163g = str;
        this.f443164h = jSONObject;
        this.f443165i = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443160d;
        if (e9Var.mo50262x39e05d35()) {
            this.f443161e.I1().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb.ACTION_SHEET);
            android.app.Activity Z0 = e9Var.Z0();
            if (Z0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowActionSheet", "run: page context is null, activity may have been destroyed");
                e9Var.a(this.f443166m, this.f443167n.o("fail:internal error invalid android context"));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 w07 = e9Var.t3().w0();
            w07.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createBottomSheet id:");
            int i17 = this.f443162f;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ActionSheetManager", sb6.toString());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) Z0, 1, false);
            w07.f173280a.put(i17, k0Var);
            java.lang.String str = this.f443163g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                qd1.h.C(Z0, k0Var, str);
            }
            org.json.JSONObject jSONObject = this.f443164h;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("newTipsList");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (optJSONArray != null) {
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    if (optJSONObject != null) {
                        hashMap.put(java.lang.Integer.valueOf(optJSONObject.optInt(ya.b.f77479x42930b2, -1)), java.lang.Integer.valueOf(optJSONObject.optInt("type", -1)));
                    }
                }
            }
            java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
            nf.y yVar = nf.x.f418149b;
            boolean i19 = yVar != null ? yVar.i(mo48798x74292566) : false;
            int i27 = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
            try {
                if (i19) {
                    java.lang.String optString = jSONObject.optString("itemColorDark", "");
                    Z0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                    i27 = ik1.w.l(optString);
                } else {
                    java.lang.String optString2 = jSONObject.optString("itemColor", "");
                    Z0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                    i27 = ik1.w.l(optString2);
                }
            } catch (java.lang.Exception unused) {
            }
            k0Var.f293405n = new qd1.c(this, k0Var, hashMap, i27);
            k0Var.f293414s = new qd1.d(this, hashMap);
            k0Var.f293387d = new qd1.e(this, w07);
            k0Var.v();
        }
    }
}
