package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b4 f163229e;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b4 b4Var, java.util.ArrayList arrayList) {
        this.f163229e = b4Var;
        this.f163228d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f163228d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = (com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10396xb34a007d.f146295e) || !com.p314xaae8f345.mm.vfs.w6.j(c10396xb34a007d.f146295e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s is not exist", c10396xb34a007d.f146295e);
                } else {
                    if ("image".equals(c10396xb34a007d.f146298h)) {
                        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(c10396xb34a007d.f146295e);
                        if (a17 != 0) {
                            com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = this.f163229e.f163256a.mo50354x59eafec1().mo49614x6665a5c5(c10396xb34a007d.f146296f);
                            if (mo49614x6665a5c5 != null) {
                                boolean y07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(c10396xb34a007d.f146295e, a17, "png".equals(c10396xb34a007d.f146299i) ? android.graphics.Bitmap.CompressFormat.PNG : android.graphics.Bitmap.CompressFormat.JPEG, 100, mo49614x6665a5c5.o());
                                if (y07) {
                                    c10396xb34a007d.f146295e = mo49614x6665a5c5.o();
                                    c10396xb34a007d.f146294d = (int) mo49614x6665a5c5.C();
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMessageFile", "isOk:%b degree:%d msgFile:%s", java.lang.Boolean.valueOf(y07), java.lang.Integer.valueOf(a17), c10396xb34a007d);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMessageFile", "allocTempFile failed");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.a(c10396xb34a007d.f146295e);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(c10396xb34a007d.f146295e)) {
                        java.lang.String Ai = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(c10396xb34a007d.f146295e, 1);
                        c10396xb34a007d.f146295e = Ai;
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(Ai);
                        java.lang.String str = a18.f294812f;
                        if (str != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                            if (!a18.f294812f.equals(l17)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                        long j17 = 0;
                        if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                            j17 = m17.f294766c;
                        }
                        c10396xb34a007d.f146294d = (int) j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMessageFile", "convert wxam to jpg, msgFile = " + c10396xb34a007d);
                    }
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c10396xb34a007d.f146295e);
                    ik1.b0 b0Var = new ik1.b0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = this.f163229e.f163256a.mo50354x59eafec1().mo49619x6aa75256(r6Var, c10396xb34a007d.f146299i, false, b0Var);
                    if (mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, b0Var.f373357a);
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c10396xb34a007d.f146296f);
                        jSONObject.put("size", c10396xb34a007d.f146294d);
                        jSONObject.put("type", c10396xb34a007d.f146298h);
                        jSONObject.put("time", c10396xb34a007d.f146297g);
                        jSONArray.put(jSONObject);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s result:%s", c10396xb34a007d, mo49619x6aa75256);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMessageFile", e17, "", new java.lang.Object[0]);
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errMsg", this.f163229e.f163258c.k() + ":ok");
            jSONObject2.put("tempFiles", jSONArray);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMessageFile", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMessageFile", "chooseMessageFile:%s", jSONObject2.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b4 b4Var = this.f163229e;
        b4Var.f163256a.a(b4Var.f163257b, jSONObject2.toString());
    }
}
