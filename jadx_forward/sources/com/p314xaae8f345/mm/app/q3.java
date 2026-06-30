package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class q3 extends com.p314xaae8f345.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135254k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135255l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135256m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135257n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135258o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135259p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135260q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135261r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135262s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135263t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135264u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135265v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135266w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135267x;

    public q3() {
        super("ext.status");
        this.f135254k = new com.p314xaae8f345.mm.app.m3(this.f135062j, "xweb", false, true, null, new com.p314xaae8f345.mm.app.C5091x6501abf(), null);
        this.f135255l = new com.p314xaae8f345.mm.app.m3(this.f135062j, "xweb_plugin", false, true, null, new com.p314xaae8f345.mm.app.C5092x6501ac0(), null);
        this.f135256m = new com.p314xaae8f345.mm.app.m3(this.f135062j, "magicbrush", false, true, null, new com.p314xaae8f345.mm.app.C5093x6501ac1(), null);
        this.f135257n = new com.p314xaae8f345.mm.app.m3(this.f135062j, "url", false, true, null, null, null);
        this.f135258o = new com.p314xaae8f345.mm.app.m3(this.f135062j, "maas", false, true, null, null, null);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "expansion", false, true, null, null, null);
        this.f135259p = new com.p314xaae8f345.mm.app.m3(this.f135062j, "liteapp", false, true, null, null, null);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "flutter", false, true, null, null, null);
        this.f135260q = new com.p314xaae8f345.mm.app.m3(this.f135062j, "finder", false, false, null, null, null);
        this.f135261r = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135262s = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135263t = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135264u = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135265v = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "isFinderLiving", false, true, new com.p314xaae8f345.mm.app.b() { // from class: com.tencent.mm.app.q3$$d
            @Override // com.p314xaae8f345.mm.app.b
            public final void a(java.lang.Object obj, java.lang.StringBuilder sb6, java.lang.String str) {
                boolean z17;
                java.lang.String str2;
                com.p314xaae8f345.mm.app.q3 q3Var = com.p314xaae8f345.mm.app.q3.this;
                q3Var.getClass();
                try {
                    com.p314xaae8f345.mm.app.m3 m3Var = q3Var.f135262s;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    boolean booleanValue = ((java.lang.Boolean) m3Var.d(false, bool)).booleanValue();
                    long longValue = ((java.lang.Long) q3Var.f135263t.d(false, 0L)).longValue();
                    boolean booleanValue2 = ((java.lang.Boolean) q3Var.f135261r.d(false, bool)).booleanValue();
                    boolean booleanValue3 = ((java.lang.Boolean) q3Var.f135264u.d(false, bool)).booleanValue();
                    boolean booleanValue4 = ((java.lang.Boolean) q3Var.f135265v.d(false, bool)).booleanValue();
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
        this.f135266w = new com.p314xaae8f345.mm.app.m3(this.f135062j, "appbrand", false, false, null, null, null);
        this.f135267x = new com.p314xaae8f345.mm.app.m3(this.f135062j, "wva", false, false, null, null, null);
    }
}
