package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class a2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a2 f267468d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("appId");
        if (str == null) {
            str = "";
        }
        boolean z17 = str.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail. invalid appId", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLiteAppPackageInfo", "appid:%s", str);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Cj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Cj(str);
        if (Cj == null) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail. cannot find app", null);
            return true;
        }
        java.lang.String Ej = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Cj.f14369x346425, str, Cj.f14372xa8503287);
        java.lang.String m65339x5d154995 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65339x5d154995(Cj.f14369x346425, Cj.f14359x58b7f1c, Cj.f14372xa8503287);
        java.lang.String str2 = m65339x5d154995 != null ? m65339x5d154995 : "";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("patchId", Cj.f14368xd0d13783);
        hashMap.put("type", Cj.f14373x368f3a);
        hashMap.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(Cj.f14374xee5c7336));
        hashMap.put("version", Ej);
        hashMap.put("versionType", str2);
        gVar.e(msg.f422546c, msg.f422552i + ":success", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 524;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getLiteAppPackageInfo";
    }
}
