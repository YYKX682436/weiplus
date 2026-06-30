package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes16.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f297138a;

    /* loaded from: classes8.dex */
    public class b extends com.tencent.tmsqmsp.oaid2.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1 f297139a;

        public b(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1 n1Var) {
            this.f297139a = n1Var;
        }

        @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i
        public void a(int i17, long j17, boolean z17, float f17, double d17, java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i
        public void a(int i17, android.os.Bundle bundle) {
            if (bundle == null) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor get oaid,bundle is null");
            } else {
                java.lang.String string = bundle.getString("oa_id_flag");
                this.f297139a.f297156e.f297150a = string;
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("honor got oaid is ".concat(java.lang.String.valueOf(string)));
            }
            this.f297139a.f297155d.countDown();
        }
    }

    /* loaded from: classes8.dex */
    public class c extends com.tencent.tmsqmsp.oaid2.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1 f297140a;

        public c(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1 n1Var) {
            this.f297140a = n1Var;
        }

        @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i
        public void a(int i17, long j17, boolean z17, float f17, double d17, java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i
        public void a(int i17, android.os.Bundle bundle) {
            if (bundle == null) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor get oaid_limit_state,bundle is null");
            } else {
                boolean z17 = bundle.getBoolean("oa_id_limit_state");
                this.f297140a.f297156e.f297151b = z17;
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("honor got oaid_limit_state is ".concat(java.lang.String.valueOf(z17)));
            }
            this.f297140a.f297155d.countDown();
        }
    }

    static {
        int[] iArr = new int[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.c().length];
        f297138a = iArr;
        try {
            iArr[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297095b.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297096c.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297097d.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297098e.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297099f.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297100g.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297101h.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297102i.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297103j.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297104k.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297105l.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.f297094a.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
