package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q0 f163794b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0
    public void a(java.lang.String sessionId, java.lang.String appId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class));
        u0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di = u0Var.Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getInt(b17, -1) + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).putInt(b17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).putString(a17 + i17, appId);
        u0Var.Ri().putString(appId, "");
        long g17 = u0Var.Ri().g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "pushAppId: sessionId:" + sessionId + " appId:" + appId + " count:" + g17);
        if (g17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173688f) {
                ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j.f173746d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0
    public int b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        if (c11816x5915d2c1 != null && c11816x5915d2c1.c()) {
            return c11816x5915d2c1.D == k91.x2.f387350e ? 3 : 2;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0
    public km5.d d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, org.json.JSONObject jSONObject) {
        if (yVar.t3() == null || yVar.t3().S || yVar.t3().L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig but component not working, targetAppId:%s, callbackId:%d", c12362x460991bc.f166435e, java.lang.Integer.valueOf(dVar.f163737a));
            return pq5.h.b(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a;
        if (g5Var.d(c12362x460991bc.f166435e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig %s->%s, force versionType=1", yVar.mo48798x74292566(), c12362x460991bc.f166435e);
            c12362x460991bc.f166437g = 1;
        }
        if (g5Var.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig %s->%s, force versionType=2", yVar.mo48798x74292566(), c12362x460991bc.f166435e);
            c12362x460991bc.f166437g = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(yVar.mo48798x74292566()).f167244d = c12362x460991bc.f166435e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(yVar.mo48798x74292566()).f167245e = c12362x460991bc.f166439i;
        java.lang.String optString = jSONObject.optString("adUxInfo", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (c12362x460991bc.f166453w == null) {
                c12362x460991bc.f166453w = new android.os.PersistableBundle();
            }
            c12362x460991bc.f166453w.putString("adUxInfo", optString);
        }
        qp3.a.c("AppBrandRuntime", "navigateToMiniProgram", optString, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String optString2 = jSONObject.optString("commonUxInfo");
        if (!android.text.TextUtils.isEmpty(optString2)) {
            if (c12362x460991bc.f166453w == null) {
                c12362x460991bc.f166453w = new android.os.PersistableBundle();
            }
            c12362x460991bc.f166453w.putString("commonUxInfo", optString2);
        }
        qp3.a.d("AppBrandRuntime", "navigateToMiniProgram", optString2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (k01.j.f384572a.b(c12362x460991bc.f166434d, c12362x460991bc.f166435e) && c12362x460991bc.F != 1) {
            new oa1.d();
            c12362x460991bc.S = oa1.d.class.getName();
        }
        return pq5.h.a().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.p0(this, yVar, c12362x460991bc, dVar, jSONObject));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0
    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.e.PROCEED;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g0) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.h0 h0Var = g0Var.f163761b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s), navigation performOverride(%s)", h0Var.f163764c, h0Var.f163765d, eVar);
        g0Var.f163760a.c(java.lang.Boolean.TRUE);
        return true;
    }
}
