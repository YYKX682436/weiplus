package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.utils.e1 implements com.tencent.mm.plugin.appbrand.jsapi.auth.o, com.tencent.mm.plugin.appbrand.jsapi.auth.h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MicroMsg.AppBrandAuthJsApiQueue"
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L11
            java.lang.String r4 = "|DUMMY"
            goto L20
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "|"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L20:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.l.<init>(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        l(2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.h
    public void b(com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthJsApiQueue", "execute name[%s], callbackId[%d], appId[%s]", n0Var.k(), java.lang.Integer.valueOf(ffVar.f81016e), lVar.getAppId());
        try {
            jSONObject.put("queueLength", ((java.util.LinkedList) this.f90412m).size());
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.i(this, lVar, n0Var, this, ffVar);
        synchronized (this.f90412m) {
            ((java.util.LinkedList) this.f90412m).offer(iVar);
        }
        l(1);
    }
}
