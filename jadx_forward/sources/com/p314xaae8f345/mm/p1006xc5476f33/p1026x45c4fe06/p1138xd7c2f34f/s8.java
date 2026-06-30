package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class s8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166675d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f166676e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166677f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f166678g;

    /* renamed from: h, reason: collision with root package name */
    public long f166679h;

    /* renamed from: i, reason: collision with root package name */
    public long f166680i;

    /* renamed from: m, reason: collision with root package name */
    public long f166681m;

    public s8(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f166675d = str;
        this.f166676e = str2;
        this.f166677f = str3;
        this.f166678g = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t8
    public long a() {
        return this.f166679h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t8
    public long b() {
        return this.f166680i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t8
    public long c() {
        return this.f166681m;
    }

    public android.util.Pair d() {
        k91.v5 n17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f166679h = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f166676e;
        if (str == null || str.length() == 0) {
            k91.a4 a4Var = (k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class);
            java.lang.String str2 = this.f166675d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            n17 = a4Var.n1(str2, new java.lang.String[0]);
        } else {
            n17 = ((k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class)).k1(str, new java.lang.String[0]);
        }
        if (n17 != null && !this.f166678g) {
            java.lang.String field_appId = n17.f68904x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.z.b(field_appId, n17.w0(), this.f166677f, null, 8, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LaunchPreconditionTaskGetBackupWxaAttrs", "callSync for username:" + n17.f68924xdec927b + ", appId:" + n17.f68904x28d45f97 + ", path:" + this.f166677f + ", pathAccessible:" + b17);
            if (!b17) {
                android.util.Pair create = android.util.Pair.create(null, java.lang.Boolean.FALSE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
                return create;
            }
        }
        android.util.Pair create2 = android.util.Pair.create(n17, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create2, "create(...)");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f166680i = currentTimeMillis;
        this.f166681m = currentTimeMillis - this.f166679h;
        return create2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t8
    /* renamed from: name */
    public java.lang.String mo51808x337a8b() {
        return "LaunchPreconditionTaskGetBackupWxaAttrs";
    }
}
