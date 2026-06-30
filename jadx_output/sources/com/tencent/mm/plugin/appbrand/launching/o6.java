package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class o6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84851d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84852e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84853f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84854g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.w6 f84855h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84856i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f84857m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f84858n;

    public o6(java.lang.String appId, java.lang.String str, int i17, int i18, com.tencent.mm.plugin.appbrand.launching.w6 version, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(version, "version");
        this.f84851d = appId;
        this.f84852e = str;
        this.f84853f = i17;
        this.f84854g = i18;
        this.f84855h = version;
        this.f84856i = z17;
        this.f84857m = jz5.h.b(new com.tencent.mm.plugin.appbrand.launching.m6(this));
        this.f84858n = jz5.h.b(new com.tencent.mm.plugin.appbrand.launching.n6(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (((com.tencent.mm.plugin.appbrand.launching.v6) r0).f85263a == ((com.tencent.mm.plugin.appbrand.launching.v6) r2).f85263a) goto L18;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(com.tencent.mm.plugin.appbrand.launching.o6 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = r4.f84851d
            java.lang.String r1 = r5.f84851d
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 == 0) goto L55
            java.lang.String r0 = r4.f84852e
            java.lang.String r1 = r5.f84852e
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 == 0) goto L55
            int r0 = r4.f84853f
            int r1 = r5.f84853f
            if (r0 != r1) goto L55
            int r0 = r4.f84854g
            int r1 = r5.f84854g
            if (r0 != r1) goto L55
            com.tencent.mm.plugin.appbrand.launching.w6 r0 = r4.f84855h
            java.lang.Class r1 = r0.getClass()
            com.tencent.mm.plugin.appbrand.launching.w6 r2 = r5.f84855h
            java.lang.Class r3 = r2.getClass()
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 == 0) goto L55
            boolean r1 = r4.f84856i
            boolean r3 = r5.f84856i
            if (r1 != r3) goto L55
            boolean r1 = r0 instanceof com.tencent.mm.plugin.appbrand.launching.v6
            r3 = 0
            if (r1 == 0) goto L54
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.ICommonPkgFetcher.VERSION.SPECIFIED"
            kotlin.jvm.internal.o.e(r2, r1)
            r1 = r2
            com.tencent.mm.plugin.appbrand.launching.v6 r1 = (com.tencent.mm.plugin.appbrand.launching.v6) r1
            com.tencent.mm.plugin.appbrand.launching.v6 r0 = (com.tencent.mm.plugin.appbrand.launching.v6) r0
            int r0 = r0.f85263a
            com.tencent.mm.plugin.appbrand.launching.v6 r2 = (com.tencent.mm.plugin.appbrand.launching.v6) r2
            int r1 = r2.f85263a
            if (r0 != r1) goto L55
        L54:
            return r3
        L55:
            java.lang.String r0 = r4.toString()
            java.lang.String r5 = r5.toString()
            int r5 = r0.compareTo(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.o6.compareTo(com.tencent.mm.plugin.appbrand.launching.o6):int");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.launching.o6.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.ICommonPkgFetcher.Request");
        return kotlin.jvm.internal.o.b(toString(), ((com.tencent.mm.plugin.appbrand.launching.o6) obj).toString());
    }

    public final com.tencent.mm.plugin.appbrand.appcache.a6 h() {
        return (com.tencent.mm.plugin.appbrand.appcache.a6) ((jz5.n) this.f84857m).getValue();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request{ appId=");
        sb6.append(this.f84851d);
        sb6.append(", module_name=");
        java.lang.String str = this.f84852e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", package_type=");
        sb6.append(this.f84853f);
        sb6.append(", version_type=");
        sb6.append(this.f84854g);
        sb6.append(" app_version=");
        sb6.append(this.f84855h);
        sb6.append(" forceNoEncrypt=");
        sb6.append(this.f84856i);
        sb6.append('}');
        return sb6.toString();
    }
}
