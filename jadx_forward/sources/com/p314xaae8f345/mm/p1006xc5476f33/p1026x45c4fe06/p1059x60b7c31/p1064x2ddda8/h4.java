package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class h4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 f161103d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff f161104e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 f161105f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f161106g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f161107h;

    /* renamed from: i, reason: collision with root package name */
    public int f161108i;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 apiInstance, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 profileContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiInstance, "apiInstance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileContext, "profileContext");
        this.f161103d = apiInstance;
        this.f161104e = invokeContext;
        this.f161105f = profileContext;
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
            com.tencent.mm.plugin.appbrand.jsapi.ff r1 = r7.f161104e
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r1.f162546b
            java.lang.String r2 = r2.mo48798x74292566()
            java.lang.String r3 = "getAppId(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            r0.f461622d = r2
            java.lang.String r2 = r7.f161106g
            java.lang.String r3 = "cgiRequestJsData"
            r4 = 0
            if (r2 == 0) goto L86
            com.tencent.mm.protobuf.g r2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(r2)
            r0.f461623e = r2
            int r2 = r7.f161108i
            r0.f461626h = r2
            r45.nd7 r2 = new r45.nd7
            r2.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.l r1 = r1.f162546b
            r7.c(r2, r1)
            r0.f461627i = r2
            java.lang.String r2 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            boolean r5 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
            if (r5 == 0) goto L57
            r5 = r1
            com.tencent.mm.plugin.appbrand.jsapi.d0 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.t3()
            boolean r6 = r6 instanceof ze.n
            if (r6 == 0) goto L57
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.t3()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r5, r6)
            ze.n r5 = (ze.n) r5
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r5 = r5.u0()
            java.lang.String r5 = r5.f128809v
            goto L58
        L57:
            r5 = r4
        L58:
            r0.f461629n = r5
            if (r8 != 0) goto L85
            java.lang.String r8 = r7.f161106g
            if (r8 == 0) goto L81
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
            if (r2 == 0) goto L7d
            com.tencent.mm.plugin.appbrand.jsapi.d0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) r1     // Catch: org.json.JSONException -> L7d
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
            r0.f461632q = r8
            goto L85
        L81:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r4
        L85:
            return r0
        L86:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4.a(boolean):r45.m24");
    }

    /* renamed from: equals */
    public boolean m50623xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161103d, h4Var.f161103d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161104e, h4Var.f161104e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161105f, h4Var.f161105f);
    }

    /* renamed from: hashCode */
    public int m50624x8cdac1b() {
        return (((this.f161103d.hashCode() * 31) + this.f161104e.m50941x8cdac1b()) * 31) + this.f161105f.m50636x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m50625x9616526c() {
        return "InvokeActionSharedContext(apiInstance=" + this.f161103d + ", invokeContext=" + this.f161104e + ", profileContext=" + this.f161105f + ')';
    }
}
