package nd1;

/* loaded from: classes7.dex */
public final class i0 extends nd1.n {
    @Override // nd1.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    /* renamed from: B */
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        try {
            if ((env instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) env).p2()) {
                k91.f M1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) env).M1();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("manual", M1 != null ? M1.f387110t : null) && jSONObject != null) {
                    jSONObject.put("ignoreWebviewPreload", true);
                }
            }
            if ((env instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) && (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) env).V0() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.n) && jSONObject != null) {
                jSONObject.put("ignoreWebviewPreload", true);
            }
        } catch (java.lang.Exception unused) {
        }
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("renderingCacheAccepted", false) : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(env);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPageInitReadyWC", "invoke renderingCacheAccepted[" + optBoolean + "] appId[" + env.mo48798x74292566() + "] url[" + a17.X1() + ']');
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(a17.mo32091x9a3f0ba2());
            if (a18 != null) {
                synchronized (a18) {
                    if (a18.P == null) {
                        a18.P = java.lang.Boolean.valueOf(optBoolean);
                    }
                }
            }
        }
        java.lang.String z17 = super.z(env, jSONObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "invoke(...)");
        return z17;
    }
}
