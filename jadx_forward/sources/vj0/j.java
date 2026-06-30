package vj0;

/* loaded from: classes11.dex */
public final class j implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonLiteAppGuidanceNewXmlReceiver", "CommonLiteAppGuidanceNewXmlReceiver: onNewXmlReceived: " + mo40975xf7b3660d);
        if (mo40975xf7b3660d) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (subType.equals("CommonLiteAppGuidance")) {
                w15.a aVar = new w15.a();
                aVar.m126732x88c2ee0f(values);
                vj0.i iVar = vj0.i.f519182a;
                vj0.i.f519183b = aVar;
                if (!ot5.h.f430410a.a(aVar.m173113xfb865c31(), wo.w0.k(), "MicroMsg.CommonLiteAppGuidanceManager", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CommonLiteAppGuidanceManager", "ignore onReceiveInfo: not my info");
                    return;
                }
                if (aVar.m173112x7520bed6() == null) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", aVar.m173111x74292946());
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, aVar.k());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String c17 = c01.z1.c();
                jSONObject.put(dm.i4.f66875xa013b0d5, c17 == null || c17.length() == 0 ? c01.z1.r() : c01.z1.c());
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, aVar.m173112x7520bed6());
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                bundle.putString("query", jSONObject2);
                bundle.putBoolean("forbidRightGesture", true);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, true, new vj0.g(bundle));
            }
        }
    }
}
