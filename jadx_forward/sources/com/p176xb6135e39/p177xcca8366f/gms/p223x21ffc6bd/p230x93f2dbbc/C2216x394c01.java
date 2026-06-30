package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfg */
/* loaded from: classes16.dex */
public final class C2216x394c01 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzadu */
    private long f6604x6f02172;

    /* renamed from: zzaim */
    private char f6605x6f02205;

    /* renamed from: zzain */
    private java.lang.String f6606x6f02206;

    /* renamed from: zzaio */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6607x6f02207;

    /* renamed from: zzaip */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6608x6f02208;

    /* renamed from: zzaiq */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6609x6f02209;

    /* renamed from: zzair */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6610x6f0220a;

    /* renamed from: zzais */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6611x6f0220b;

    /* renamed from: zzait */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6612x6f0220c;

    /* renamed from: zzaiu */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6613x6f0220d;

    /* renamed from: zzaiv */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6614x6f0220e;

    /* renamed from: zzaiw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 f6615x6f0220f;

    public C2216x394c01(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6605x6f02205 = (char) 0;
        this.f6604x6f02172 = -1L;
        this.f6607x6f02207 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 6, false, false);
        this.f6608x6f02208 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 6, true, false);
        this.f6609x6f02209 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 6, false, true);
        this.f6610x6f0220a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 5, false, false);
        this.f6611x6f0220b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 5, true, false);
        this.f6612x6f0220c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 5, false, true);
        this.f6613x6f0220d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 4, false, false);
        this.f6614x6f0220e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 3, false, false);
        this.f6615x6f0220f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03(this, 2, false, false);
    }

    /* renamed from: zzbm */
    public static java.lang.Object m19104x394b8b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2219x394c04(str);
    }

    /* renamed from: zzbn */
    private static java.lang.String m19105x394b8c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: zziu */
    private final java.lang.String m19106x394c6c() {
        java.lang.String str;
        synchronized (this) {
            if (this.f6606x6f02206 == null) {
                this.f6606x6f02206 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6540x6f021c3.get();
            }
            str = this.f6606x6f02206;
        }
        return str;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    /* renamed from: isLoggable */
    public final boolean m19107x492678c7(int i17) {
        return android.util.Log.isLoggable(m19106x394c6c(), i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final /* bridge */ /* synthetic */ void mo18964x394c0d() {
        super.mo18964x394c0d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return false;
    }

    /* renamed from: zzim */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64() {
        return this.f6607x6f02207;
    }

    /* renamed from: zzin */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19109x394c65() {
        return this.f6608x6f02208;
    }

    /* renamed from: zzio */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19110x394c66() {
        return this.f6609x6f02209;
    }

    /* renamed from: zzip */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67() {
        return this.f6610x6f0220a;
    }

    /* renamed from: zziq */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19112x394c68() {
        return this.f6612x6f0220c;
    }

    /* renamed from: zzir */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19113x394c69() {
        return this.f6613x6f0220d;
    }

    /* renamed from: zzis */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19114x394c6a() {
        return this.f6614x6f0220e;
    }

    /* renamed from: zzit */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19115x394c6b() {
        return this.f6615x6f0220f;
    }

    /* renamed from: zziv */
    public final java.lang.String m19116x394c6d() {
        android.util.Pair<java.lang.String, java.lang.Long> m19138x394c03 = mo18977x394c1f().f6647x6f0222b.m19138x394c03();
        if (m19138x394c03 == null || m19138x394c03 == com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c.f6645x6f0222a) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(m19138x394c03.second);
        java.lang.String str = (java.lang.String) m19138x394c03.first;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(valueOf);
        sb6.append(":");
        sb6.append(str);
        return sb6.toString();
    }

    public static /* synthetic */ long zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, long j17) {
        c2216x394c01.f6604x6f02172 = 12451L;
        return 12451L;
    }

    private static java.lang.String zza(boolean z17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            if (!z17) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.Long l17 = (java.lang.Long) obj;
            if (java.lang.Math.abs(l17.longValue()) < 100) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.String str2 = java.lang.String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Math.abs(l17.longValue()));
            long round = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length() - 1));
            long round2 = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length()) - 1.0d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str2.length() + 43 + str2.length());
            sb6.append(str2);
            sb6.append(round);
            sb6.append("...");
            sb6.append(str2);
            sb6.append(round2);
            return sb6.toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.String.valueOf(obj);
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2219x394c04)) {
                return z17 ? "-" : java.lang.String.valueOf(obj);
            }
            str = ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2219x394c04) obj).f6626x6f0221d;
            return str;
        }
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(z17 ? th6.getClass().getName() : th6.toString());
        java.lang.String m19105x394b8c = m19105x394b8c(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.class.getCanonicalName());
        java.lang.String m19105x394b8c2 = m19105x394b8c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.class.getCanonicalName());
        for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                java.lang.String m19105x394b8c3 = m19105x394b8c(className);
                if (m19105x394b8c3.equals(m19105x394b8c) || m19105x394b8c3.equals(m19105x394b8c2)) {
                    sb7.append(": ");
                    sb7.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb7.toString();
    }

    public static java.lang.String zza(boolean z17, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.lang.String zza = zza(z17, obj);
        java.lang.String zza2 = zza(z17, obj2);
        java.lang.String zza3 = zza(z17, obj3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(zza)) {
            sb6.append(str2);
            sb6.append(zza);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb6.append(str2);
            sb6.append(zza2);
        }
        if (!android.text.TextUtils.isEmpty(zza3)) {
            sb6.append(str3);
            sb6.append(zza3);
        }
        return sb6.toString();
    }

    public final void zza(int i17, java.lang.String str) {
        android.util.Log.println(i17, m19106x394c6c(), str);
    }

    public final void zza(int i17, boolean z17, boolean z18, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2;
        if (!z17 && m19107x492678c7(i17)) {
            zza(i17, zza(false, str, obj, obj2, obj3));
        }
        if (z18 || i17 < 5) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 m19179x394c87 = this.f6815x6f02155.m19179x394c87();
        if (m19179x394c87 == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (m19179x394c87.m19185xf582434a()) {
                if (i17 < 0) {
                    i17 = 0;
                }
                if (i17 >= 9) {
                    i17 = 8;
                }
                m19179x394c87.zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2217x394c02(this, i17, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        zza(6, str2);
    }
}
