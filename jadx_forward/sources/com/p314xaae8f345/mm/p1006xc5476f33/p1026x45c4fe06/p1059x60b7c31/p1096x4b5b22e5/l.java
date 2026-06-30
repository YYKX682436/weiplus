package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34521x366c91de = 166;

    /* renamed from: NAME */
    public static final java.lang.String f34522x24728b = "launchMiniProgram";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) lVar;
        java.lang.String optString = jSONObject.optString("appId", null);
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66875xa013b0d5);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && yVar.t3().u0().f128817z == 7;
        if (!z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!z17 && optString.equals(yVar.mo48798x74292566())) {
            yVar.a(i17, o("fail target appId is the same as the caller appId"));
            return;
        }
        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, null);
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, null);
        java.lang.String optString5 = jSONObject.optString("privateExtraData", null);
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        java.lang.String optString6 = jSONObject.optString("sceneNote", null);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(jSONObject.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE).f163727d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
        if (z17) {
            c12362x460991bc.f166434d = optString2;
        } else {
            c12362x460991bc.f166435e = optString;
        }
        c12362x460991bc.f166437g = i18;
        c12362x460991bc.f166439i = optString3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        if (optInt != -1) {
            c12559xbdae8559.f169323f = optInt;
        } else {
            c12559xbdae8559.f169323f = 1037;
        }
        if (android.text.TextUtils.isEmpty(optString6)) {
            c12559xbdae8559.f169324g = yVar.mo48798x74292566() + ":" + yVar.t3().u0().f128809v;
        } else {
            c12559xbdae8559.f169324g = optString6;
        }
        if (jSONObject.has("preScene")) {
            c12559xbdae8559.f169321d = jSONObject.optInt("preScene", 0);
            c12559xbdae8559.f169322e = jSONObject.optString("preSceneNote");
        }
        c12362x460991bc.f166433J = jSONObject.optBoolean("noRelaunchIfPathUnchanged", false);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0 = yVar.V0();
        java.lang.String Y1 = V0 != null ? V0.Y1() : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158856e = yVar.mo48798x74292566();
        c11812xa040dc98.f158857f = optString4;
        c11812xa040dc98.f158858g = optString5;
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158860i = Y1;
        c12362x460991bc.f166443o = c12559xbdae8559;
        c12362x460991bc.f166444p = c11812xa040dc98;
        c12362x460991bc.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.k(this, yVar, i17);
        if (C(yVar, jSONObject, i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(yVar.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).a(yVar.mo50352x76847179(), c12362x460991bc);
        }
    }

    public boolean C(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, org.json.JSONObject jSONObject, int i17) {
        return true;
    }
}
