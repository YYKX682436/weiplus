package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class h4 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.j4 f79570d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.ff f79571e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.o0 f79572f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f79573g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f79574h;

    /* renamed from: i, reason: collision with root package name */
    public int f79575i;

    public h4(com.tencent.mm.plugin.appbrand.jsapi.auth.j4 apiInstance, com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o0 profileContext) {
        kotlin.jvm.internal.o.g(apiInstance, "apiInstance");
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        kotlin.jvm.internal.o.g(profileContext, "profileContext");
        this.f79570d = apiInstance;
        this.f79571e = invokeContext;
        this.f79572f = profileContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.m24 a(boolean r8) {
        /*
            r7 = this;
            r45.m24 r0 = new r45.m24
            r0.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.ff r1 = r7.f79571e
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r1.f81013b
            java.lang.String r2 = r2.getAppId()
            java.lang.String r3 = "getAppId(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r0.f380089d = r2
            java.lang.String r2 = r7.f79573g
            java.lang.String r3 = "cgiRequestJsData"
            r4 = 0
            if (r2 == 0) goto L86
            com.tencent.mm.protobuf.g r2 = com.tencent.mm.protobuf.g.c(r2)
            r0.f380090e = r2
            int r2 = r7.f79575i
            r0.f380093h = r2
            r45.nd7 r2 = new r45.nd7
            r2.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.l r1 = r1.f81013b
            r7.c(r2, r1)
            r0.f380094i = r2
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.o.g(r1, r2)
            boolean r5 = r1 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0
            if (r5 == 0) goto L57
            r5 = r1
            com.tencent.mm.plugin.appbrand.jsapi.d0 r5 = (com.tencent.mm.plugin.appbrand.jsapi.d0) r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.t3()
            boolean r6 = r6 instanceof ze.n
            if (r6 == 0) goto L57
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.t3()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            kotlin.jvm.internal.o.e(r5, r6)
            ze.n r5 = (ze.n) r5
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r5 = r5.u0()
            java.lang.String r5 = r5.f47276v
            goto L58
        L57:
            r5 = r4
        L58:
            r0.f380096n = r5
            if (r8 != 0) goto L85
            java.lang.String r8 = r7.f79573g
            if (r8 == 0) goto L81
            kotlin.jvm.internal.o.g(r1, r2)
            boolean r2 = r1 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0
            if (r2 == 0) goto L7d
            com.tencent.mm.plugin.appbrand.jsapi.d0 r1 = (com.tencent.mm.plugin.appbrand.jsapi.d0) r1     // Catch: org.json.JSONException -> L7d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.t3()     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d
            r2.<init>(r8)     // Catch: org.json.JSONException -> L7d
            java.lang.String r8 = "api_name"
            java.lang.String r8 = r2.optString(r8)     // Catch: org.json.JSONException -> L7d
            boolean r8 = r1.V0(r8)     // Catch: org.json.JSONException -> L7d
            goto L7e
        L7d:
            r8 = 0
        L7e:
            r0.f380099q = r8
            goto L85
        L81:
            kotlin.jvm.internal.o.o(r3)
            throw r4
        L85:
            return r0
        L86:
            kotlin.jvm.internal.o.o(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.h4.a(boolean):r45.m24");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.h4)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.h4) obj;
        return kotlin.jvm.internal.o.b(this.f79570d, h4Var.f79570d) && kotlin.jvm.internal.o.b(this.f79571e, h4Var.f79571e) && kotlin.jvm.internal.o.b(this.f79572f, h4Var.f79572f);
    }

    public int hashCode() {
        return (((this.f79570d.hashCode() * 31) + this.f79571e.hashCode()) * 31) + this.f79572f.hashCode();
    }

    public java.lang.String toString() {
        return "InvokeActionSharedContext(apiInstance=" + this.f79570d + ", invokeContext=" + this.f79571e + ", profileContext=" + this.f79572f + ')';
    }
}
