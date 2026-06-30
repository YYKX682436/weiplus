package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzgn */
/* loaded from: classes16.dex */
public final class BinderC2249x394c27 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractBinderC2209x394bf5 {

    /* renamed from: zzajp */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 f6758x6f02227;

    /* renamed from: zzanc */
    private java.lang.Boolean f6759x6f02296;

    /* renamed from: zzand */
    private java.lang.String f6760x6f02297;

    public BinderC2249x394c27(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        this(c2331x394c88, null);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzb(c2183x394bd6, false);
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2250x394c28(this, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.lang.String zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzb(c2183x394bd6, false);
        return this.f6758x6f02227.zzh(c2183x394bd6);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzc(c2183x394bd6.f6455x362a8ff1, false);
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2259x394c31(this, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zze(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzc(str, true);
        try {
            return (java.util.List) this.f6758x6f02227.mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2258x394c30(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zzg("Failed to get conditional user properties", e17);
            return java.util.Collections.emptyList();
        }
    }

    private BinderC2249x394c27(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2331x394c88);
        this.f6758x6f02227 = c2331x394c88;
        this.f6760x6f02297 = null;
    }

    private final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2183x394bd6);
        zzc(c2183x394bd6.f6455x362a8ff1, false);
        this.f6758x6f02227.mo19173x394c1b().m19288x394ba4(c2183x394bd6.f6456x6f0216a);
    }

    private final void zzc(java.lang.String str, boolean z17) {
        boolean z18;
        if (android.text.TextUtils.isEmpty(str)) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().log("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z17) {
            try {
                if (this.f6759x6f02296 == null) {
                    if (!"com.google.android.gms".equals(this.f6760x6f02297) && !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18622x6510ccbb(this.f6758x6f02227.mo18960x76847179(), android.os.Binder.getCallingUid()) && !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.m17688x9cf0d20b(this.f6758x6f02227.mo18960x76847179()).m17691x9970fc9b(android.os.Binder.getCallingUid())) {
                        z18 = false;
                        this.f6759x6f02296 = java.lang.Boolean.valueOf(z18);
                    }
                    z18 = true;
                    this.f6759x6f02296 = java.lang.Boolean.valueOf(z18);
                }
                if (this.f6759x6f02296.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e17) {
                this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zzg("Measurement Service called with invalid calling package. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                throw e17;
            }
        }
        if (this.f6760x6f02297 == null && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17687x7093a567(this.f6758x6f02227.mo18960x76847179(), android.os.Binder.getCallingUid(), str)) {
            this.f6760x6f02297 = str;
        }
        if (str.equals(this.f6760x6f02297)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void zze(java.lang.Runnable runnable) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(runnable);
        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6584x6f021f9.get().booleanValue() && this.f6758x6f02227.mo18975x394c1d().m19157x394c81()) {
            runnable.run();
        } else {
            this.f6758x6f02227.mo18975x394c1d().zzc(runnable);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6, boolean z17) {
        zzb(c2183x394bd6, false);
        try {
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> list = (java.util.List) this.f6758x6f02227.mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2265x394c3c(this, c2183x394bd6)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 : list) {
                if (z17 || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(c2339x394c90.f7029x337a8b)) {
                    arrayList.add(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2339x394c90));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zze("Failed to get user attributes. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2183x394bd6.f6455x362a8ff1), e17);
            return null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zza(java.lang.String str, java.lang.String str2, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzb(c2183x394bd6, false);
        try {
            return (java.util.List) this.f6758x6f02227.mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2257x394c2f(this, c2183x394bd6, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zzg("Failed to get conditional user properties", e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf.f6480x6f0218c);
        zzc(c2187x394bdf.f6476x362a8ff1, true);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf(c2187x394bdf);
        zze(c2187x394bdf.f6480x6f0218c.m19277x754a37bb() == null ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2253x394c2b(this, c2187x394bdf2) : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2254x394c2c(this, c2187x394bdf2));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        zzc(str, true);
        try {
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> list = (java.util.List) this.f6758x6f02227.mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2256x394c2e(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 : list) {
                if (z17 || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(c2339x394c90.f7029x337a8b)) {
                    arrayList.add(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2339x394c90));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zze("Failed to get user attributes. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zza(java.lang.String str, java.lang.String str2, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzb(c2183x394bd6, false);
        try {
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> list = (java.util.List) this.f6758x6f02227.mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2255x394c2d(this, c2183x394bd6, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 : list) {
                if (z17 || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(c2339x394c90.f7029x337a8b)) {
                    arrayList.add(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2339x394c90));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zze("Failed to get user attributes. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2183x394bd6.f6455x362a8ff1), e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2267x394c3e(this, str2, str3, str, j17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        zzb(c2183x394bd6, false);
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2266x394c3d(this, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf.f6480x6f0218c);
        zzb(c2183x394bd6, false);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf(c2187x394bdf);
        c2187x394bdf2.f6476x362a8ff1 = c2183x394bd6.f6455x362a8ff1;
        zze(c2187x394bdf.f6480x6f0218c.m19277x754a37bb() == null ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2251x394c29(this, c2187x394bdf2, c2183x394bd6) : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2252x394c2a(this, c2187x394bdf2, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        zzb(c2183x394bd6, false);
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2260x394c32(this, c2204x394bf0, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        zzc(str, true);
        zze(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2261x394c33(this, c2204x394bf0, str));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2337x394c8e);
        zzb(c2183x394bd6, false);
        zze(c2337x394c8e.m19277x754a37bb() == null ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2263x394c3a(this, c2337x394c8e, c2183x394bd6) : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2264x394c3b(this, c2337x394c8e, c2183x394bd6));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4
    public final byte[] zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        zzc(str, true);
        this.f6758x6f02227.mo18976x394c1e().m19114x394c6a().zzg("Log and bundle. event", this.f6758x6f02227.mo19172x394c1a().m19101x394b88(c2204x394bf0.f6530x337a8b));
        long mo18538x6ff6c7a1 = this.f6758x6f02227.mo18962x394b92().mo18538x6ff6c7a1() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f6758x6f02227.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2262x394c39(this, c2204x394bf0, str)).get();
            if (bArr == null) {
                this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zzg("Log and bundle returned null. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                bArr = new byte[0];
            }
            this.f6758x6f02227.mo18976x394c1e().m19114x394c6a().zzd("Log and bundle processed. event, size, time_ms", this.f6758x6f02227.mo19172x394c1a().m19101x394b88(c2204x394bf0.f6530x337a8b), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((this.f6758x6f02227.mo18962x394b92().mo18538x6ff6c7a1() / 1000000) - mo18538x6ff6c7a1));
            return bArr;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.f6758x6f02227.mo18976x394c1e().m19108x394c64().zzd("Failed to log and bundle. appId, event, error", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), this.f6758x6f02227.mo19172x394c1a().m19101x394b88(c2204x394bf0.f6530x337a8b), e17);
            return null;
        }
    }
}
