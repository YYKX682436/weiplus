package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class q3 extends com.tencent.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53721k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53722l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53723m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53724n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53725o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53726p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53727q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53728r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53729s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53730t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53731u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53732v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53733w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53734x;

    public q3() {
        super("ext.status");
        this.f53721k = new com.tencent.mm.app.m3(this.f53529j, "xweb", false, true, null, new com.tencent.mm.app.q3$$a(), null);
        this.f53722l = new com.tencent.mm.app.m3(this.f53529j, "xweb_plugin", false, true, null, new com.tencent.mm.app.q3$$b(), null);
        this.f53723m = new com.tencent.mm.app.m3(this.f53529j, "magicbrush", false, true, null, new com.tencent.mm.app.q3$$c(), null);
        this.f53724n = new com.tencent.mm.app.m3(this.f53529j, "url", false, true, null, null, null);
        this.f53725o = new com.tencent.mm.app.m3(this.f53529j, "maas", false, true, null, null, null);
        new com.tencent.mm.app.m3(this.f53529j, "expansion", false, true, null, null, null);
        this.f53726p = new com.tencent.mm.app.m3(this.f53529j, "liteapp", false, true, null, null, null);
        new com.tencent.mm.app.m3(this.f53529j, "flutter", false, true, null, null, null);
        this.f53727q = new com.tencent.mm.app.m3(this.f53529j, "finder", false, false, null, null, null);
        this.f53728r = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53729s = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53730t = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53731u = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53732v = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        new com.tencent.mm.app.m3(this.f53529j, "isFinderLiving", false, true, new com.tencent.mm.app.b() { // from class: com.tencent.mm.app.q3$$d
            @Override // com.tencent.mm.app.b
            public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
                boolean z17;
                java.lang.String str2;
                com.tencent.mm.app.q3 q3Var = com.tencent.mm.app.q3.this;
                q3Var.getClass();
                try {
                    com.tencent.mm.app.m3 m3Var = q3Var.f53729s;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    boolean booleanValue = ((java.lang.Boolean) m3Var.d(false, bool)).booleanValue();
                    long longValue = ((java.lang.Long) q3Var.f53730t.d(false, 0L)).longValue();
                    boolean booleanValue2 = ((java.lang.Boolean) q3Var.f53728r.d(false, bool)).booleanValue();
                    boolean booleanValue3 = ((java.lang.Boolean) q3Var.f53731u.d(false, bool)).booleanValue();
                    boolean booleanValue4 = ((java.lang.Boolean) q3Var.f53732v.d(false, bool)).booleanValue();
                    boolean z18 = booleanValue && longValue != 0 && !booleanValue2 && booleanValue3;
                    boolean z19 = (!booleanValue || longValue == 0 || booleanValue2 || booleanValue3) ? false : true;
                    boolean z27 = z18 || z19 || booleanValue4;
                    if (booleanValue) {
                        if (longValue == 0) {
                            str2 = "0";
                        } else if (longValue > 0) {
                            str2 = java.lang.Long.toString(longValue, 10);
                        } else {
                            char[] cArr = new char[64];
                            long j17 = (longValue >>> 1) / 5;
                            long j18 = 10;
                            char forDigit = java.lang.Character.forDigit((int) (longValue - (j17 * j18)), 10);
                            int i17 = 63;
                            cArr[63] = forDigit;
                            while (j17 > 0) {
                                i17--;
                                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                                j17 /= j18;
                                z18 = z18;
                            }
                            z17 = z18;
                            str2 = new java.lang.String(cArr, i17, 64 - i17);
                        }
                        z17 = z18;
                    } else {
                        z17 = z18;
                        str2 = "";
                    }
                    sb6.append(z27);
                    sb6.append(':');
                    sb6.append(str2);
                    sb6.append(':');
                    sb6.append(z17);
                    sb6.append(':');
                    sb6.append(z19);
                    sb6.append(':');
                    sb6.append(booleanValue4);
                } catch (java.lang.Throwable unused) {
                }
            }
        }, null, null);
        this.f53733w = new com.tencent.mm.app.m3(this.f53529j, "appbrand", false, false, null, null, null);
        this.f53734x = new com.tencent.mm.app.m3(this.f53529j, "wva", false, false, null, null, null);
    }
}
