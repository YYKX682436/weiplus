package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzhk */
/* loaded from: classes16.dex */
public final class C2272x394c43 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzanp */
    protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2291x394c5b f6818x6f022a3;

    /* renamed from: zzanq */
    private com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.EventInterceptor f6819x6f022a4;

    /* renamed from: zzanr */
    private final java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener> f6820x6f022a5;

    /* renamed from: zzans */
    private boolean f6821x6f022a6;

    /* renamed from: zzant */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> f6822x6f022a7;

    /* renamed from: zzanu */
    protected boolean f6823x6f022a8;

    public C2272x394c43(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6820x6f022a5 = new java.util.concurrent.CopyOnWriteArraySet();
        this.f6823x6f022a8 = true;
        this.f6822x6f022a7 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private final java.util.Map<java.lang.String, java.lang.Object> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67;
        java.lang.String str4;
        if (mo18975x394c1d().m19157x394c81()) {
            m19111x394c67 = mo18976x394c1e().m19108x394c64();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            mo18975x394c1d();
            if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()) {
                m19111x394c67 = mo18976x394c1e().m19108x394c64();
                str4 = "Cannot get user properties from main thread";
            } else {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.f6815x6f02155.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2282x394c4d(this, atomicReference, str, str2, str3, z17));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        mo18976x394c1e().m19111x394c67().zzg("Interrupted waiting for get user properties", e17);
                    }
                }
                java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> list = (java.util.List) atomicReference.get();
                if (list != null) {
                    x.b bVar = new x.b(list.size());
                    for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e : list) {
                        bVar.put(c2337x394c8e.f7021x337a8b, c2337x394c8e.m19277x754a37bb());
                    }
                    return bVar;
                }
                m19111x394c67 = mo18976x394c1e().m19111x394c67();
                str4 = "Timed out waiting for get user properties";
            }
        }
        m19111x394c67.log(str4);
        return java.util.Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        mo18961x394b61();
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7343x624f098);
        if (!this.f6815x6f02155.m19162x7d80d2b7()) {
            mo18976x394c1e().m19114x394c6a().log("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        try {
            mo18969x394c12().zzd(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf(conditionalUserProperty.f7339xbdc8caaf, conditionalUserProperty.f7344x134dd5f3, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(conditionalUserProperty.f7343x624f098, 0L, null, null), conditionalUserProperty.f7340x86d0ac0a, conditionalUserProperty.f7338xfa9ba5d3, conditionalUserProperty.f7348x134c07fa, null, conditionalUserProperty.f7349xc5263a56, null, conditionalUserProperty.f7345xcd7a781, mo18973x394c1b().zza(conditionalUserProperty.f7341xf999012d, conditionalUserProperty.f7342xfac95fa8, conditionalUserProperty.f7344x134dd5f3, conditionalUserProperty.f7340x86d0ac0a, true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    private final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty> zzf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str4;
        if (mo18975x394c1d().m19157x394c81()) {
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else {
            mo18975x394c1d();
            if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()) {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.f6815x6f02155.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2281x394c4c(this, atomicReference, str, str2, str3));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        mo18976x394c1e().m19111x394c67().zze("Interrupted waiting for get conditional user properties", str, e17);
                    }
                }
                java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> list = (java.util.List) atomicReference.get();
                if (list == null) {
                    mo18976x394c1e().m19111x394c67().zzg("Timed out waiting for get conditional user properties", str);
                    return java.util.Collections.emptyList();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf : list) {
                    com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty = new com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty();
                    conditionalUserProperty.f7339xbdc8caaf = str;
                    conditionalUserProperty.f7344x134dd5f3 = str2;
                    conditionalUserProperty.f7340x86d0ac0a = c2187x394bdf.f6474xe9ef24f7;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e = c2187x394bdf.f6480x6f0218c;
                    conditionalUserProperty.f7343x624f098 = c2337x394c8e.f7021x337a8b;
                    conditionalUserProperty.f7353xbee9dd04 = c2337x394c8e.m19277x754a37bb();
                    conditionalUserProperty.f7338xfa9ba5d3 = c2187x394bdf.f6473xab2f7f06;
                    conditionalUserProperty.f7348x134c07fa = c2187x394bdf.f6478xed343d6d;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0 = c2187x394bdf.f6481x6f0218d;
                    if (c2204x394bf0 != null) {
                        conditionalUserProperty.f7346xcfb71481 = c2204x394bf0.f6530x337a8b;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed = c2204x394bf0.f6532x6f021ac;
                        if (c2201x394bed != null) {
                            conditionalUserProperty.f7347xc1afedfc = c2201x394bed.m19082x394c5d();
                        }
                    }
                    conditionalUserProperty.f7349xc5263a56 = c2187x394bdf.f6479xbe733089;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf02 = c2187x394bdf.f6482x6f0218e;
                    if (c2204x394bf02 != null) {
                        conditionalUserProperty.f7350xb46d1cfb = c2204x394bf02.f6530x337a8b;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed2 = c2204x394bf02.f6532x6f021ac;
                        if (c2201x394bed2 != null) {
                            conditionalUserProperty.f7351x5105bff6 = c2201x394bed2.m19082x394c5d();
                        }
                    }
                    conditionalUserProperty.f7352xb5d9c1cc = c2187x394bdf.f6480x6f0218c.f7025x6f0230a;
                    conditionalUserProperty.f7345xcd7a781 = c2187x394bdf.f6477x30a5af34;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf03 = c2187x394bdf.f6483x6f0218f;
                    if (c2204x394bf03 != null) {
                        conditionalUserProperty.f7341xf999012d = c2204x394bf03.f6530x337a8b;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed3 = c2204x394bf03.f6532x6f021ac;
                        if (c2201x394bed3 != null) {
                            conditionalUserProperty.f7342xfac95fa8 = c2201x394bed3.m19082x394c5d();
                        }
                    }
                    arrayList.add(conditionalUserProperty);
                }
                return arrayList;
            }
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str4 = "Cannot get conditional user properties from main thread";
        }
        m19108x394c64.log(str4);
        return java.util.Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(boolean z17) {
        mo18961x394b61();
        m19186x394ba5();
        mo18976x394c1e().m19114x394c6a().zzg("Setting app measurement enabled (FE)", java.lang.Boolean.valueOf(z17));
        mo18977x394c1f().m19124x105dbfe7(z17);
        if (!mo18978x394c20().m19031x394b79(mo18967x394c10().m19091x394b67())) {
            mo18969x394c12().m19233x394c9a();
        } else if (!this.f6815x6f02155.m19162x7d80d2b7() || !this.f6823x6f022a8) {
            mo18969x394c12().m19233x394c9a();
        } else {
            mo18976x394c1e().m19114x394c6a().log("Recording app launch after enabling measurement for the first time (FE)");
            m19214x394c97();
        }
    }

    /* renamed from: clearConditionalUserProperty */
    public final void m19188xbf00e759(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza((java.lang.String) null, str, str2, bundle);
    }

    /* renamed from: clearConditionalUserPropertyAs */
    public final void m19189x2647d6b(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo18963x394c0c();
        zza(str, str2, str3, bundle);
    }

    /* renamed from: getAppInstanceId */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.String> m19190x4b6169db() {
        try {
            java.lang.String m19130x394c77 = mo18977x394c1f().m19130x394c77();
            return m19130x394c77 != null ? com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(m19130x394c77) : com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19611x2e7a5e(mo18975x394c1d().m19158x394c82(), new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2276x394c47(this));
        } catch (java.lang.Exception e17) {
            mo18976x394c1e().m19111x394c67().log("Failed to schedule task for getAppInstanceId");
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19613x3867b586(e17);
        }
    }

    /* renamed from: getConditionalUserProperties */
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty> m19191x1c8278ce(java.lang.String str, java.lang.String str2) {
        return zzf(null, str, str2);
    }

    /* renamed from: getConditionalUserPropertiesAs */
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty> m19192x5c785a0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo18963x394c0c();
        return zzf(str, str2, str3);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    /* renamed from: getUserProperties */
    public final java.util.Map<java.lang.String, java.lang.Object> m19193xe45e2054(java.lang.String str, java.lang.String str2, boolean z17) {
        return zzb(null, str, str2, z17);
    }

    /* renamed from: getUserPropertiesAs */
    public final java.util.Map<java.lang.String, java.lang.Object> m19194x455763a6(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo18963x394c0c();
        return zzb(str, str2, str3, z17);
    }

    /* renamed from: logEvent */
    public final void m19195x769949b6(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza(str, str2, bundle, true, this.f6819x6f022a4 == null || com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(str2), false, null);
    }

    /* renamed from: registerOnMeasurementEventListener */
    public final void m19196x37dae114(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener onEventListener) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(onEventListener);
        if (this.f6820x6f022a5.add(onEventListener)) {
            return;
        }
        mo18976x394c1e().m19111x394c67().log("OnEventListener already registered");
    }

    /* renamed from: resetAnalyticsData */
    public final void m19197x5c033741() {
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2278x394c49(this, mo18962x394b92().mo18536x5cbba1cc()));
    }

    /* renamed from: setConditionalUserProperty */
    public final void m19198x929ed9a4(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
        com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty2 = new com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty(conditionalUserProperty);
        if (!android.text.TextUtils.isEmpty(conditionalUserProperty2.f7339xbdc8caaf)) {
            mo18976x394c1e().m19111x394c67().log("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.f7339xbdc8caaf = null;
        zza(conditionalUserProperty2);
    }

    /* renamed from: setConditionalUserPropertyAs */
    public final void m19199x664f08f6(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7339xbdc8caaf);
        mo18963x394c0c();
        zza(new com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty(conditionalUserProperty));
    }

    /* renamed from: setEventInterceptor */
    public final void m19200x9fa973ad(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.EventInterceptor eventInterceptor) {
        com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.EventInterceptor eventInterceptor2;
        mo18961x394b61();
        m19186x394ba5();
        if (eventInterceptor != null && eventInterceptor != (eventInterceptor2 = this.f6819x6f022a4)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(eventInterceptor2 == null, "EventInterceptor already set.");
        }
        this.f6819x6f022a4 = eventInterceptor;
    }

    /* renamed from: setMeasurementEnabled */
    public final void m19201x105dbfe7(boolean z17) {
        m19186x394ba5();
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2287x394c52(this, z17));
    }

    /* renamed from: setMinimumSessionDuration */
    public final void m19202xa37f9b5e(long j17) {
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2288x394c58(this, j17));
    }

    /* renamed from: setSessionTimeoutDuration */
    public final void m19203xa19717a1(long j17) {
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2289x394c59(this, j17));
    }

    /* renamed from: setUserProperty */
    public final void m19204x2e43c042(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
        int m19287x394ba3 = mo18973x394c1b().m19287x394ba3(str2);
        if (m19287x394ba3 != 0) {
            mo18973x394c1b();
            this.f6815x6f02155.mo19173x394c1b().zza(m19287x394ba3, "_ev", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            zza(str, str2, mo18536x5cbba1cc, (java.lang.Object) null);
            return;
        }
        int zzi = mo18973x394c1b().zzi(str2, obj);
        if (zzi != 0) {
            mo18973x394c1b();
            this.f6815x6f02155.mo19173x394c1b().zza(zzi, "_ev", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str2, 24, true), ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? java.lang.String.valueOf(obj).length() : 0);
        } else {
            java.lang.Object zzj = mo18973x394c1b().zzj(str2, obj);
            if (zzj != null) {
                zza(str, str2, mo18536x5cbba1cc, zzj);
            }
        }
    }

    /* renamed from: unregisterOnMeasurementEventListener */
    public final void m19205x89e2096d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener onEventListener) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(onEventListener);
        if (this.f6820x6f022a5.remove(onEventListener)) {
            return;
        }
        mo18976x394c1e().m19111x394c67().log("OnEventListener had not been registered");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    /* renamed from: zzae */
    public final java.lang.String m19206x394b64(long j17) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (atomicReference) {
            mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2277x394c48(this, atomicReference));
            try {
                atomicReference.wait(j17);
            } catch (java.lang.InterruptedException unused) {
                mo18976x394c1e().m19111x394c67().log("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (java.lang.String) atomicReference.get();
    }

    /* renamed from: zzbr */
    public final void m19207x394b90(java.lang.String str) {
        this.f6822x6f022a7.set(str);
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

    /* renamed from: zzhm */
    public final java.lang.String m19208x394c45() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) mo18975x394c1d().zza(atomicReference, 15000L, "String test flag value", new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2283x394c4e(this, atomicReference));
    }

    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zzj(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67;
        java.lang.String str;
        m19186x394ba5();
        mo18976x394c1e().m19114x394c6a().log("Fetching user attributes (FE)");
        if (mo18975x394c1d().m19157x394c81()) {
            m19111x394c67 = mo18976x394c1e().m19108x394c64();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            mo18975x394c1d();
            if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()) {
                m19111x394c67 = mo18976x394c1e().m19108x394c64();
                str = "Cannot get all user properties from main thread";
            } else {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.f6815x6f02155.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2275x394c46(this, atomicReference, z17));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        mo18976x394c1e().m19111x394c67().zzg("Interrupted waiting for get user properties", e17);
                    }
                }
                java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> list = (java.util.List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                m19111x394c67 = mo18976x394c1e().m19111x394c67();
                str = "Timed out waiting for get user properties";
            }
        }
        m19111x394c67.log(str);
        return java.util.Collections.emptyList();
    }

    /* renamed from: zzja */
    public final java.lang.String m19209x394c77() {
        return this.f6822x6f022a7.get();
    }

    /* renamed from: zzjx */
    public final java.lang.Boolean m19210x394c8e() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) mo18975x394c1d().zza(atomicReference, 15000L, "boolean test flag value", new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2273x394c44(this, atomicReference));
    }

    /* renamed from: zzjy */
    public final java.lang.Long m19211x394c8f() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) mo18975x394c1d().zza(atomicReference, 15000L, "long test flag value", new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2284x394c4f(this, atomicReference));
    }

    /* renamed from: zzjz */
    public final java.lang.Integer m19212x394c90() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) mo18975x394c1d().zza(atomicReference, 15000L, "int test flag value", new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2285x394c50(this, atomicReference));
    }

    /* renamed from: zzka */
    public final java.lang.Double m19213x394c96() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) mo18975x394c1d().zza(atomicReference, 15000L, "double test flag value", new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2286x394c51(this, atomicReference));
    }

    /* renamed from: zzkb */
    public final void m19214x394c97() {
        mo18961x394b61();
        m19186x394ba5();
        if (this.f6815x6f02155.m19184x394c8c()) {
            mo18969x394c12().m19232x394c97();
            this.f6823x6f022a8 = false;
            java.lang.String m19133x394c7a = mo18977x394c1f().m19133x394c7a();
            if (android.text.TextUtils.isEmpty(m19133x394c7a)) {
                return;
            }
            mo18968x394c11().m19186x394ba5();
            if (m19133x394c7a.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", m19133x394c7a);
            m19195x769949b6("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        mo18961x394b61();
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7343x624f098);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7344x134dd5f3);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty.f7353xbee9dd04);
        if (!this.f6815x6f02155.m19162x7d80d2b7()) {
            mo18976x394c1e().m19114x394c6a().log("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(conditionalUserProperty.f7343x624f098, conditionalUserProperty.f7352xb5d9c1cc, conditionalUserProperty.f7353xbee9dd04, conditionalUserProperty.f7344x134dd5f3);
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 zza = mo18973x394c1b().zza(conditionalUserProperty.f7350xb46d1cfb, conditionalUserProperty.f7351x5105bff6, conditionalUserProperty.f7344x134dd5f3, 0L, true, false);
            mo18969x394c12().zzd(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf(conditionalUserProperty.f7339xbdc8caaf, conditionalUserProperty.f7344x134dd5f3, c2337x394c8e, conditionalUserProperty.f7340x86d0ac0a, false, conditionalUserProperty.f7348x134c07fa, mo18973x394c1b().zza(conditionalUserProperty.f7346xcfb71481, conditionalUserProperty.f7347xc1afedfc, conditionalUserProperty.f7344x134dd5f3, 0L, true, false), conditionalUserProperty.f7349xc5263a56, zza, conditionalUserProperty.f7345xcd7a781, mo18973x394c1b().zza(conditionalUserProperty.f7341xf999012d, conditionalUserProperty.f7342xfac95fa8, conditionalUserProperty.f7344x134dd5f3, 0L, true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        java.lang.String[] strArr;
        android.os.Bundle bundle2;
        int i17;
        long j18;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(bundle);
        mo18961x394b61();
        m19186x394ba5();
        if (!this.f6815x6f02155.m19162x7d80d2b7()) {
            mo18976x394c1e().m19114x394c6a().log("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.f6821x6f022a6) {
            this.f6821x6f022a6 = true;
            try {
                try {
                    java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", android.content.Context.class).invoke(null, mo18960x76847179());
                } catch (java.lang.Exception e17) {
                    mo18976x394c1e().m19111x394c67().zzg("Failed to invoke Tag Manager's initialize() method", e17);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                mo18976x394c1e().m19113x394c69().log("Tag Manager is not found and thus will not be used");
            }
        }
        if (z19 && !"_iap".equals(str2)) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo19173x394c1b = this.f6815x6f02155.mo19173x394c1b();
            int i18 = 2;
            if (mo19173x394c1b.zzq("event", str2)) {
                if (!mo19173x394c1b.zza("event", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.f7356x6f02156, str2)) {
                    i18 = 13;
                } else if (mo19173x394c1b.zza("event", 40, str2)) {
                    i18 = 0;
                }
            }
            if (i18 != 0) {
                mo18976x394c1e().m19110x394c66().zzg("Invalid public event name. Event will not be logged (FE)", mo18972x394c1a().m19101x394b88(str2));
                this.f6815x6f02155.mo19173x394c1b();
                this.f6815x6f02155.mo19173x394c1b().zza(i18, "_ev", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19222x394c98 = mo18970x394c13().m19222x394c98();
        if (m19222x394c98 != null && !bundle.containsKey("_sc")) {
            m19222x394c98.f6880x6f022bd = true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(m19222x394c98, bundle, z17 && z19);
        boolean equals = "am".equals(str);
        boolean m19282x394ba6 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(str2);
        if (!z17 || this.f6819x6f022a4 == null || m19282x394ba6 || equals) {
            if (this.f6815x6f02155.m19184x394c8c()) {
                int m19285x394ba1 = mo18973x394c1b().m19285x394ba1(str2);
                if (m19285x394ba1 != 0) {
                    mo18976x394c1e().m19110x394c66().zzg("Invalid event name. Event will not be logged (FE)", mo18972x394c1a().m19101x394b88(str2));
                    mo18973x394c1b();
                    this.f6815x6f02155.mo19173x394c1b().zza(str3, m19285x394ba1, "_ev", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                java.util.List<java.lang.String> m18543xbe490b15 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1992x33b9c93.m18543xbe490b15((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"});
                android.os.Bundle zza = mo18973x394c1b().zza(str2, bundle, m18543xbe490b15, z19, true);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c = (zza != null && zza.containsKey("_sc") && zza.containsKey("_si")) ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c(zza.getString("_sn"), zza.getString("_sc"), java.lang.Long.valueOf(zza.getLong("_si")).longValue()) : null;
                if (c2292x394c5c != null) {
                    m19222x394c98 = c2292x394c5c;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(zza);
                long nextLong = mo18973x394c1b().m19291x394cb7().nextLong();
                java.lang.String[] strArr2 = (java.lang.String[]) zza.keySet().toArray(new java.lang.String[bundle.size()]);
                java.util.Arrays.sort(strArr2);
                int length = strArr2.length;
                int i19 = 0;
                int i27 = 0;
                while (i27 < length) {
                    java.lang.String str4 = strArr2[i27];
                    java.lang.Object obj = zza.get(str4);
                    mo18973x394c1b();
                    android.os.Bundle[] zze = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zze(obj);
                    if (zze != null) {
                        java.lang.String str5 = "_eid";
                        zza.putInt(str4, zze.length);
                        int i28 = 0;
                        while (i28 < zze.length) {
                            android.os.Bundle bundle3 = zze[i28];
                            int i29 = i28;
                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(m19222x394c98, bundle3, true);
                            java.lang.String str6 = str5;
                            long j19 = nextLong;
                            android.os.Bundle zza2 = mo18973x394c1b().zza("_ep", bundle3, m18543xbe490b15, z19, false);
                            zza2.putString("_en", str2);
                            zza2.putLong(str6, j19);
                            zza2.putString("_gn", str4);
                            zza2.putInt("_ll", zze.length);
                            zza2.putInt("_i", i29);
                            arrayList.add(zza2);
                            zza = zza;
                            strArr2 = strArr2;
                            str5 = str6;
                            nextLong = j19;
                            i19 = i19;
                            i28 = i29 + 1;
                        }
                        j18 = nextLong;
                        strArr = strArr2;
                        bundle2 = zza;
                        i17 = zze.length + i19;
                    } else {
                        strArr = strArr2;
                        bundle2 = zza;
                        i17 = i19;
                        j18 = nextLong;
                    }
                    i27++;
                    zza = bundle2;
                    strArr2 = strArr;
                    i19 = i17;
                    nextLong = j18;
                }
                android.os.Bundle bundle4 = zza;
                long j27 = nextLong;
                int i37 = i19;
                if (i37 != 0) {
                    bundle4.putLong("_eid", j27);
                    bundle4.putInt("_epc", i37);
                }
                int i38 = 0;
                while (i38 < arrayList.size()) {
                    android.os.Bundle bundle5 = (android.os.Bundle) arrayList.get(i38);
                    java.lang.String str7 = i38 != 0 ? "_ep" : str2;
                    bundle5.putString("_o", str);
                    if (z18) {
                        bundle5 = mo18973x394c1b().zzd(bundle5);
                    }
                    android.os.Bundle bundle6 = bundle5;
                    mo18976x394c1e().m19114x394c6a().zze("Logging event (FE)", mo18972x394c1a().m19101x394b88(str2), mo18972x394c1a().zzb(bundle6));
                    mo18969x394c12().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0(str7, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed(bundle6), str, j17), str3);
                    if (!equals) {
                        java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener> it = this.f6820x6f022a5.iterator();
                        while (it.hasNext()) {
                            it.next().m19501xaf8c47fb(str, str2, new android.os.Bundle(bundle6), j17);
                        }
                    }
                    i38++;
                }
                if (mo18970x394c13().m19222x394c98() == null || !com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.f7355x23e90b71.equals(str2)) {
                    return;
                }
                mo18974x394c1c().zzl(true);
                return;
            }
            return;
        }
        mo18976x394c1e().m19114x394c6a().zze("Passing event to registered event handler (FE)", mo18972x394c1a().m19101x394b88(str2), mo18972x394c1a().zzb(bundle));
        this.f6819x6f022a4.m19500x64af8af8(str, str2, bundle, j17);
    }

    private final void zza(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7343x624f098);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(conditionalUserProperty.f7344x134dd5f3);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty.f7353xbee9dd04);
        conditionalUserProperty.f7340x86d0ac0a = mo18536x5cbba1cc;
        java.lang.String str = conditionalUserProperty.f7343x624f098;
        java.lang.Object obj = conditionalUserProperty.f7353xbee9dd04;
        if (mo18973x394c1b().m19287x394ba3(str) != 0) {
            mo18976x394c1e().m19108x394c64().zzg("Invalid conditional user property name", mo18972x394c1a().m19103x394b8a(str));
            return;
        }
        if (mo18973x394c1b().zzi(str, obj) != 0) {
            mo18976x394c1e().m19108x394c64().zze("Invalid conditional user property value", mo18972x394c1a().m19103x394b8a(str), obj);
            return;
        }
        java.lang.Object zzj = mo18973x394c1b().zzj(str, obj);
        if (zzj == null) {
            mo18976x394c1e().m19108x394c64().zze("Unable to normalize conditional user property value", mo18972x394c1a().m19103x394b8a(str), obj);
            return;
        }
        conditionalUserProperty.f7353xbee9dd04 = zzj;
        long j17 = conditionalUserProperty.f7349xc5263a56;
        if (!android.text.TextUtils.isEmpty(conditionalUserProperty.f7348x134c07fa) && (j17 > 15552000000L || j17 < 1)) {
            mo18976x394c1e().m19108x394c64().zze("Invalid conditional user property timeout", mo18972x394c1a().m19103x394b8a(str), java.lang.Long.valueOf(j17));
            return;
        }
        long j18 = conditionalUserProperty.f7345xcd7a781;
        if (j18 > 15552000000L || j18 < 1) {
            mo18976x394c1e().m19108x394c64().zze("Invalid conditional user property time to live", mo18972x394c1a().m19103x394b8a(str), java.lang.Long.valueOf(j18));
        } else {
            mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2279x394c4a(this, conditionalUserProperty));
        }
    }

    private final void zza(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        android.os.Bundle bundle2;
        if (bundle == null) {
            bundle2 = new android.os.Bundle();
        } else {
            android.os.Bundle bundle3 = new android.os.Bundle(bundle);
            for (java.lang.String str4 : bundle3.keySet()) {
                java.lang.Object obj = bundle3.get(str4);
                if (obj instanceof android.os.Bundle) {
                    bundle3.putBundle(str4, new android.os.Bundle((android.os.Bundle) obj));
                } else {
                    int i17 = 0;
                    if (obj instanceof android.os.Parcelable[]) {
                        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                        while (i17 < parcelableArr.length) {
                            if (parcelableArr[i17] instanceof android.os.Bundle) {
                                parcelableArr[i17] = new android.os.Bundle((android.os.Bundle) parcelableArr[i17]);
                            }
                            i17++;
                        }
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                        while (i17 < arrayList.size()) {
                            java.lang.Object obj2 = arrayList.get(i17);
                            if (obj2 instanceof android.os.Bundle) {
                                arrayList.set(i17, new android.os.Bundle((android.os.Bundle) obj2));
                            }
                            i17++;
                        }
                    }
                }
            }
            bundle2 = bundle3;
        }
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2290x394c5a(this, str, str2, j17, bundle2, z17, z18, z19, str3));
    }

    private final void zza(java.lang.String str, java.lang.String str2, long j17, java.lang.Object obj) {
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2274x394c45(this, str, str2, obj, j17));
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        mo18961x394b61();
        zzb(str, str2, mo18962x394b92().mo18536x5cbba1cc(), bundle, true, this.f6819x6f022a4 == null || com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(str2), false, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17) {
        zza(str, str2, j17, bundle, false, true, true, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zza(str, str2, bundle, true, this.f6819x6f022a4 == null || com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(str2), true, null);
    }

    private final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        zza(str, str2, mo18962x394b92().mo18536x5cbba1cc(), bundle, true, z18, z19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        mo18961x394b61();
        m19186x394ba5();
        if (!this.f6815x6f02155.m19162x7d80d2b7()) {
            mo18976x394c1e().m19114x394c6a().log("User property not set since app measurement is disabled");
        } else if (this.f6815x6f02155.m19184x394c8c()) {
            mo18976x394c1e().m19114x394c6a().zze("Setting user property (FE)", mo18972x394c1a().m19101x394b88(str2), obj);
            mo18969x394c12().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(str2, j17, obj, str));
        }
    }

    private final void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty = new com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty();
        conditionalUserProperty.f7339xbdc8caaf = str;
        conditionalUserProperty.f7343x624f098 = str2;
        conditionalUserProperty.f7340x86d0ac0a = mo18536x5cbba1cc;
        if (str3 != null) {
            conditionalUserProperty.f7341xf999012d = str3;
            conditionalUserProperty.f7342xfac95fa8 = bundle;
        }
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2280x394c4b(this, conditionalUserProperty));
    }
}
