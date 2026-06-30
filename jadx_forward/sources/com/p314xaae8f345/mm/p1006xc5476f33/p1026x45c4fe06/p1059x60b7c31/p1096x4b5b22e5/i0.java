package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 f163769a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0();

    public void a(java.lang.String str, java.lang.String str2) {
    }

    public int b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        return 0;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, str, java.lang.String.format("Network:%s", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(yVar.t3().f156328d)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s) sourceType:%d, callbackId:%d", yVar.mo48798x74292566(), str, java.lang.Integer.valueOf(dVar.f163743g), java.lang.Integer.valueOf(dVar.f163737a));
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("privateExtraData");
        boolean z17 = optJSONObject2 != null && optJSONObject2.optBoolean("isDirectGame", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) yVar).V0();
        java.lang.String Y1 = V0 != null ? V0.Y1() : "";
        ze.n nVar = (ze.n) yVar.t3();
        java.lang.String str3 = yVar.mo48798x74292566() + ":" + nVar.u0().f128809v + ":" + (nVar.u0().f128817z + 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = nVar.l2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        int i18 = dVar.f163738b;
        c12559xbdae8559.f169323f = i18 != 0 ? i18 : 1037;
        c12559xbdae8559.f169326i = l27.f169326i;
        if (i18 != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f163739c)) {
            str3 = java.lang.String.format("%s:%s", str3, dVar.f163739c);
        }
        c12559xbdae8559.f169324g = str3;
        c12559xbdae8559.f169321d = dVar.f163740d;
        c12559xbdae8559.f169322e = dVar.f163741e;
        c12559xbdae8559.f169327m = dVar.f163744h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158856e = yVar.mo48798x74292566();
        c11812xa040dc98.f158857f = optJSONObject == null ? "{}" : optJSONObject.toString();
        c11812xa040dc98.f158858g = optJSONObject2 != null ? optJSONObject2.toString() : "{}";
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158860i = Y1;
        c11812xa040dc98.f158862n = dVar.f163743g;
        c11812xa040dc98.f158861m = dVar.f163742f;
        java.lang.String str4 = dVar.f163745i;
        c11812xa040dc98.f158863o = str4;
        if (!android.text.TextUtils.isEmpty(str4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs openBusinessViewExtraArgs = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs();
            c11812xa040dc98.f158864p = openBusinessViewExtraArgs;
            openBusinessViewExtraArgs.f158869d = dVar.f163747k;
            openBusinessViewExtraArgs.f158870e = dVar.f163748l;
        }
        org.json.JSONObject a17 = ik1.t.a(jSONObject.optJSONObject("externalFileRefs"), yVar.mo50354x59eafec1());
        if (a17 != null) {
            c11812xa040dc98.f158868t = a17.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
        c12362x460991bc.f166434d = null;
        c12362x460991bc.f166435e = str;
        c12362x460991bc.f166436f = 0;
        c12362x460991bc.f166437g = i17;
        if (jSONObject.has("devuin")) {
            c12362x460991bc.f166438h = kk.v.b(jSONObject.optString("devuin"));
        }
        c12362x460991bc.f166439i = str2;
        c12362x460991bc.f166443o = c12559xbdae8559;
        c12362x460991bc.f166444p = c11812xa040dc98;
        c12362x460991bc.f166447q = null;
        c12362x460991bc.d();
        c12362x460991bc.H = c11816x5915d2c1 == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.Y : c11816x5915d2c1;
        c12362x460991bc.V = nVar.u0().H1;
        c12362x460991bc.W = nVar.u0().I1;
        c12362x460991bc.F = b(c11816x5915d2c1);
        c12362x460991bc.f166433J = dVar.f163746j;
        c12362x460991bc.f166459y1 = z17;
        if (nVar.N0()) {
            c12362x460991bc.A1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e(true, nVar.u0().f(), 0.0d, 0.0d);
        }
        ik1.b0 b0Var = new ik1.b0();
        ((km5.q) ((km5.q) km5.u.d()).f(nVar).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.h0(this, b0Var, nVar, mo48798x74292566, str, yVar, c12362x460991bc)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d0(this, yVar, dVar, c12362x460991bc, jSONObject)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.c0(this, b0Var, yVar, gVar, str, c12362x460991bc))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b0(this, gVar, nVar, b0Var));
    }

    public km5.d d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, org.json.JSONObject jSONObject) {
        return km5.u.e(null);
    }

    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.f fVar) {
        return false;
    }
}
