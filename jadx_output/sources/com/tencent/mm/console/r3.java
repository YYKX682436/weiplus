package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class r3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.appcache.y9 y9Var;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "OpenWeApp not coolassist or monkey env, disable hprof dump cmd.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String stringExtra = intent.getStringExtra("kContent");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            new android.os.Handler().postDelayed(new com.tencent.mm.console.r3$$a(), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            java.lang.String str = new java.lang.String(android.util.Base64.decode(stringExtra, 0));
            com.tencent.mm.plugin.appbrand.debugger.k0 k0Var = (com.tencent.mm.plugin.appbrand.debugger.k0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.k0.class);
            if (k0Var == null) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.debugger.q0) k0Var).getClass();
            if (str.length() == 0) {
                return;
            }
            java.util.Map map = null;
            try {
                map = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
            } catch (java.lang.Exception unused) {
            }
            if (map == null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.debugger.p0(str));
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.$type");
            if ((str2 == null || str2.length() == 0) || (y9Var = (com.tencent.mm.plugin.appbrand.appcache.y9) com.tencent.mm.plugin.appbrand.appcache.aa.f75437d.get(str2)) == null) {
                return;
            }
            y9Var.b(str, map);
        }
    }
}
