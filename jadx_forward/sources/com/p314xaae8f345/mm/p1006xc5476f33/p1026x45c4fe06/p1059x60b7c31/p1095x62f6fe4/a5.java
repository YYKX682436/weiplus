package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class a5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34471x366c91de = 36;

    /* renamed from: NAME */
    public static final java.lang.String f34472x24728b = "chooseVideo";

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f163230g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (f163230g) {
            lVar.a(i17, o("cancel"));
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967 c12166x73aec967 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        java.lang.String optString = jSONObject.optString("maxDuration");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, maxDuration = %s", optJSONArray, optString);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            c12166x73aec967.f163200f = true;
            c12166x73aec967.f163201g = true;
        } else {
            c12166x73aec967.f163200f = optJSONArray.toString().contains("camera");
            c12166x73aec967.f163201g = optJSONArray.toString().contains(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        }
        c12166x73aec967.f163202h = jSONObject.optBoolean("compressed", true);
        if (c12166x73aec967.f163200f) {
            si1.e1.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t4(this, lVar, jSONObject, i17));
            android.content.Context mo50352x768471792 = lVar.mo50352x76847179();
            if (mo50352x768471792 == null || !(mo50352x768471792 instanceof android.app.Activity)) {
                lVar.a(i17, o("fail"));
                z17 = false;
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                z17 = j35.u.a((android.app.Activity) mo50352x768471792, "android.permission.CAMERA", 115, "", "");
                if (z17) {
                    si1.e1.c(lVar.mo48798x74292566());
                }
            }
            if (!z17) {
                return;
            }
        }
        f163230g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r4(this, lVar));
        c12166x73aec967.f163199e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString, 60);
        c12166x73aec967.f163198d = lVar.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(mo50352x76847179, c12166x73aec967, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s4(this, lVar, i17));
    }
}
