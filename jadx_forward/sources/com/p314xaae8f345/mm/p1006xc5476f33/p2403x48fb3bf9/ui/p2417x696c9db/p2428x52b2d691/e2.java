package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class e2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e2 f267582d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = env.f422393a;
        boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context);
        nw4.g gVar = env.f422396d;
        if (!m40080x23b734ff) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, not connected");
            gVar.e(msg.f422546c, "network_type:fail", null);
            return true;
        }
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = env.f422395c;
        if (v0Var != null) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var);
                android.os.Bundle i18 = v0Var.i(110, new android.os.Bundle());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "invokeAsResult(...)");
                int i19 = i18.getInt("sim_card_type", 0);
                if (i19 != 0) {
                    i17 = i19 != 1 ? 2 : 1;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetNetWorkType", "invokeAsResult ex %s", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, type = %s, simType = %d", java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context)), java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 2g");
            hashMap.put("subtype", "2g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f422546c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 3g");
            hashMap.put("subtype", "3g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f422546c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 4g");
            hashMap.put("subtype", "4g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f422546c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 5g");
            hashMap.put("subtype", "5g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f422546c, "network_type:wwan", hashMap);
            return true;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetNetWorkType", "getNetworkType, unknown");
            gVar.e(msg.f422546c, "network_type:fail", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, wifi");
        hashMap.put("simtype", java.lang.Integer.valueOf(i17));
        gVar.e(msg.f422546c, "network_type:wifi", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 16;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return be1.z.f4243x24728b;
    }
}
