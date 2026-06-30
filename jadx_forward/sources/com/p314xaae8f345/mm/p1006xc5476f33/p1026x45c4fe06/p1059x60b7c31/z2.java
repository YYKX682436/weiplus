package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class z2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35030x366c91de = 800;

    /* renamed from: NAME */
    public static final java.lang.String f35031x24728b = "addToFavorites";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString3 = jSONObject.optString("imageUrl");
        boolean optBoolean = jSONObject.optBoolean("disableForward", false);
        int optInt = jSONObject.optInt("cardSubType", 0);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b3(this, V0, optString2, optString, optBoolean, optInt, xi1.o.b(c0Var.mo50261xee5260a9().mo51612x60543150().a()), i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(V0, optString3, null, b3Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot");
        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = V0.mo50354x59eafec1().mo49614x6665a5c5("addFavoriteSnapShot_" + java.lang.System.currentTimeMillis());
        if (mo49614x6665a5c5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot failed for allocTempFile");
            b3Var.a(null);
            return;
        }
        final java.lang.String o17 = mo49614x6665a5c5.o();
        ce.g gVar = (ce.g) V0.B1(ce.g.class);
        if (gVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.z2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z2 z2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z2.this;
                    z2Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = V0;
                    z2Var.C(b3Var, n7Var, n7Var.R1(), o17);
                }
            });
            return;
        }
        try {
            C(b3Var, V0, ((ce.o) gVar).f122219g.m34856x4a42b983().f130124o.a(((ce.o) gVar).f122219g.getVirtualElementId(), -1, true), o17);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiAddToFavorites", e17, "hy: can not get snapshot!", new java.lang.Object[0]);
            b3Var.a("");
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        try {
            if (bitmap != null) {
                try {
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiAddToFavorites", "save temp bitmap to file failed, . exception : %s", e17);
                    c0Var.a("");
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                }
                if (!bitmap.isRecycled()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToFavorites", "saveFile(appId : %s, pageView : %s, saveFileCost : %sms)", v5Var.mo48798x74292566(), java.lang.Integer.valueOf(v5Var.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    c0Var.a(str);
                    if (bitmap != null || bitmap.isRecycled()) {
                    }
                    bitmap.recycle();
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiAddToFavorites", "snapshot can not be taken");
            c0Var.a("");
            if (bitmap != null) {
            }
        } catch (java.lang.Throwable th6) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th6;
        }
    }
}
