package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class s8 implements com.tencent.mm.plugin.appbrand.launching.t8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85142d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85143e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f85144f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85145g;

    /* renamed from: h, reason: collision with root package name */
    public long f85146h;

    /* renamed from: i, reason: collision with root package name */
    public long f85147i;

    /* renamed from: m, reason: collision with root package name */
    public long f85148m;

    public s8(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f85142d = str;
        this.f85143e = str2;
        this.f85144f = str3;
        this.f85145g = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long a() {
        return this.f85146h;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long b() {
        return this.f85147i;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public long c() {
        return this.f85148m;
    }

    public android.util.Pair d() {
        k91.v5 n17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f85146h = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f85143e;
        if (str == null || str.length() == 0) {
            k91.a4 a4Var = (k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class);
            java.lang.String str2 = this.f85142d;
            kotlin.jvm.internal.o.d(str2);
            n17 = a4Var.n1(str2, new java.lang.String[0]);
        } else {
            n17 = ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).k1(str, new java.lang.String[0]);
        }
        if (n17 != null && !this.f85145g) {
            java.lang.String field_appId = n17.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            boolean b17 = com.tencent.mm.plugin.appbrand.launching.precondition.z.b(field_appId, n17.w0(), this.f85144f, null, 8, null);
            com.tencent.mars.xlog.Log.i("LaunchPreconditionTaskGetBackupWxaAttrs", "callSync for username:" + n17.field_username + ", appId:" + n17.field_appId + ", path:" + this.f85144f + ", pathAccessible:" + b17);
            if (!b17) {
                android.util.Pair create = android.util.Pair.create(null, java.lang.Boolean.FALSE);
                kotlin.jvm.internal.o.f(create, "create(...)");
                return create;
            }
        }
        android.util.Pair create2 = android.util.Pair.create(n17, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.f(create2, "create(...)");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f85147i = currentTimeMillis;
        this.f85148m = currentTimeMillis - this.f85146h;
        return create2;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.t8
    public java.lang.String name() {
        return "LaunchPreconditionTaskGetBackupWxaAttrs";
    }
}
