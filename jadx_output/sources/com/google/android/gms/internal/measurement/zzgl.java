package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public class zzgl extends com.google.android.gms.internal.measurement.zzjr implements com.google.android.gms.internal.measurement.zzhi {
    private static volatile com.google.android.gms.internal.measurement.zzgl zzame;
    private final long zzaem;
    private final com.google.android.gms.internal.measurement.zzef zzamf;
    private final com.google.android.gms.internal.measurement.zzfr zzamg;
    private final com.google.android.gms.internal.measurement.zzfg zzamh;
    private final com.google.android.gms.internal.measurement.zzgg zzami;
    private final com.google.android.gms.internal.measurement.zzjh zzamj;
    private final com.google.android.gms.measurement.AppMeasurement zzamk;
    private final com.google.firebase.analytics.FirebaseAnalytics zzaml;
    private final com.google.android.gms.internal.measurement.zzka zzamm;
    private final com.google.android.gms.internal.measurement.zzfe zzamn;
    private final com.google.android.gms.internal.measurement.zzif zzamo;
    private final com.google.android.gms.internal.measurement.zzhk zzamp;
    private final com.google.android.gms.internal.measurement.zzdu zzamq;
    private com.google.android.gms.internal.measurement.zzfc zzamr;
    private com.google.android.gms.internal.measurement.zzii zzams;
    private com.google.android.gms.internal.measurement.zzeo zzamt;
    private com.google.android.gms.internal.measurement.zzfb zzamu;
    private com.google.android.gms.internal.measurement.zzfx zzamv;
    private java.lang.Boolean zzamw;
    private long zzamx;
    private int zzamy;
    private int zzamz;
    private final android.content.Context zzqx;
    private final com.google.android.gms.common.util.Clock zzro;
    private boolean zzvo = false;

    private zzgl(com.google.android.gms.internal.measurement.zzhj zzhjVar) {
        com.google.android.gms.internal.measurement.zzfi zzip;
        java.lang.String str;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhjVar);
        zza(this);
        android.content.Context context = zzhjVar.zzqx;
        this.zzqx = context;
        com.google.android.gms.internal.measurement.zzws.init(context);
        this.zzaqs = -1L;
        com.google.android.gms.common.util.Clock defaultClock = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzro = defaultClock;
        this.zzaem = defaultClock.currentTimeMillis();
        this.zzamf = new com.google.android.gms.internal.measurement.zzef(this);
        com.google.android.gms.internal.measurement.zzfr zzfrVar = new com.google.android.gms.internal.measurement.zzfr(this);
        zzfrVar.zzm();
        this.zzamg = zzfrVar;
        com.google.android.gms.internal.measurement.zzfg zzfgVar = new com.google.android.gms.internal.measurement.zzfg(this);
        zzfgVar.zzm();
        this.zzamh = zzfgVar;
        com.google.android.gms.internal.measurement.zzka zzkaVar = new com.google.android.gms.internal.measurement.zzka(this);
        zzkaVar.zzm();
        this.zzamm = zzkaVar;
        com.google.android.gms.internal.measurement.zzfe zzfeVar = new com.google.android.gms.internal.measurement.zzfe(this);
        zzfeVar.zzm();
        this.zzamn = zzfeVar;
        this.zzamq = new com.google.android.gms.internal.measurement.zzdu(this);
        com.google.android.gms.internal.measurement.zzif zzifVar = new com.google.android.gms.internal.measurement.zzif(this);
        zzifVar.zzm();
        this.zzamo = zzifVar;
        com.google.android.gms.internal.measurement.zzhk zzhkVar = new com.google.android.gms.internal.measurement.zzhk(this);
        zzhkVar.zzm();
        this.zzamp = zzhkVar;
        this.zzamk = new com.google.android.gms.measurement.AppMeasurement(this);
        this.zzaml = new com.google.firebase.analytics.FirebaseAnalytics(this);
        com.google.android.gms.internal.measurement.zzjh zzjhVar = new com.google.android.gms.internal.measurement.zzjh(this);
        zzjhVar.zzm();
        this.zzamj = zzjhVar;
        com.google.android.gms.internal.measurement.zzgg zzggVar = new com.google.android.gms.internal.measurement.zzgg(this);
        zzggVar.zzm();
        this.zzami = zzggVar;
        if (context.getApplicationContext() instanceof android.app.Application) {
            com.google.android.gms.internal.measurement.zzhk zzfu = zzfu();
            if (zzfu.getContext().getApplicationContext() instanceof android.app.Application) {
                android.app.Application application = (android.app.Application) zzfu.getContext().getApplicationContext();
                if (zzfu.zzanp == null) {
                    zzfu.zzanp = new com.google.android.gms.internal.measurement.zzid(zzfu, null);
                }
                application.unregisterActivityLifecycleCallbacks(zzfu.zzanp);
                application.registerActivityLifecycleCallbacks(zzfu.zzanp);
                zzip = zzfu.zzge().zzit();
                str = "Registered activity lifecycle callback";
            }
            com.google.android.gms.internal.measurement.zzfk zzfkVar = new com.google.android.gms.internal.measurement.zzfk(this);
            zzfkVar.zzm();
            this.zzaqb = zzfkVar;
            com.google.android.gms.internal.measurement.zzgf zzgfVar = new com.google.android.gms.internal.measurement.zzgf(this);
            zzgfVar.zzm();
            this.zzaqa = zzgfVar;
            zzggVar.zzc(new com.google.android.gms.internal.measurement.zzgm(this, zzhjVar));
        }
        zzip = zzge().zzip();
        str = "Application context is not an Application";
        zzip.log(str);
        com.google.android.gms.internal.measurement.zzfk zzfkVar2 = new com.google.android.gms.internal.measurement.zzfk(this);
        zzfkVar2.zzm();
        this.zzaqb = zzfkVar2;
        com.google.android.gms.internal.measurement.zzgf zzgfVar2 = new com.google.android.gms.internal.measurement.zzgf(this);
        zzgfVar2.zzm();
        this.zzaqa = zzgfVar2;
        zzggVar.zzc(new com.google.android.gms.internal.measurement.zzgm(this, zzhjVar));
    }

    private static void zza(com.google.android.gms.internal.measurement.zzhg zzhgVar) {
        if (zzhgVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private final void zzch() {
        if (!this.zzvo) {
            throw new java.lang.IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public static void zzfr() {
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    public static com.google.android.gms.internal.measurement.zzgl zzg(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzame == null) {
            synchronized (com.google.android.gms.internal.measurement.zzgl.class) {
                if (zzame == null) {
                    zzame = new com.google.android.gms.internal.measurement.zzgl(new com.google.android.gms.internal.measurement.zzhj(context));
                }
            }
        }
        return zzame;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzec
    public final android.content.Context getContext() {
        return this.zzqx;
    }

    public final boolean isEnabled() {
        zzab();
        zzch();
        boolean z17 = false;
        if (zzgg().zzhg()) {
            return false;
        }
        java.lang.Boolean zzas = zzgg().zzas("firebase_analytics_collection_enabled");
        if (zzas != null) {
            z17 = zzas.booleanValue();
        } else if (!com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled()) {
            z17 = true;
        }
        return zzgf().zzg(z17);
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final void start() {
        zzab();
        if (zzgf().zzaju.get() == 0) {
            zzgf().zzaju.set(zzbt().currentTimeMillis());
        }
        if (java.lang.Long.valueOf(zzgf().zzajz.get()).longValue() == 0) {
            zzge().zzit().zzg("Persisting first open", java.lang.Long.valueOf(this.zzaem));
            zzgf().zzajz.set(this.zzaem);
        }
        if (zzjv()) {
            if (!android.text.TextUtils.isEmpty(zzfv().getGmpAppId())) {
                java.lang.String zziz = zzgf().zziz();
                if (zziz == null) {
                    zzgf().zzbq(zzfv().getGmpAppId());
                } else if (!zziz.equals(zzfv().getGmpAppId())) {
                    zzge().zzir().log("Rechecking which service to use due to a GMP App Id change");
                    zzgf().zzjc();
                    this.zzams.disconnect();
                    this.zzams.zzdf();
                    zzgf().zzbq(zzfv().getGmpAppId());
                    zzgf().zzajz.set(this.zzaem);
                    zzgf().zzakb.zzbs(null);
                }
            }
            zzfu().zzbr(zzgf().zzakb.zzjg());
            if (!android.text.TextUtils.isEmpty(zzfv().getGmpAppId())) {
                boolean isEnabled = isEnabled();
                if (!zzgf().zzjf() && !zzgg().zzhg()) {
                    zzgf().zzh(!isEnabled);
                }
                if (!zzgg().zzaz(zzfv().zzah()) || isEnabled) {
                    zzfu().zzkb();
                }
                zzfx().zza(new java.util.concurrent.atomic.AtomicReference<>());
            }
        } else if (isEnabled()) {
            if (!zzgb().zzx("android.permission.INTERNET")) {
                zzge().zzim().log("App is missing INTERNET permission");
            }
            if (!zzgb().zzx("android.permission.ACCESS_NETWORK_STATE")) {
                zzge().zzim().log("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).isCallerInstantApp()) {
                if (!com.google.android.gms.internal.measurement.zzgb.zza(getContext())) {
                    zzge().zzim().log("AppMeasurementReceiver not registered/enabled");
                }
                if (!com.google.android.gms.internal.measurement.zzjc.zza(getContext(), false)) {
                    zzge().zzim().log("AppMeasurementService not registered/enabled");
                }
            }
            zzge().zzim().log("Uploading is not possible. App measurement disabled");
        }
        super.start();
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final void zzab() {
        zzgd().zzab();
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        this.zzamy++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzec
    public final com.google.android.gms.common.util.Clock zzbt() {
        return this.zzro;
    }

    public final com.google.android.gms.internal.measurement.zzdu zzft() {
        zza(this.zzamq);
        return this.zzamq;
    }

    public final com.google.android.gms.internal.measurement.zzhk zzfu() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamp);
        return this.zzamp;
    }

    public final com.google.android.gms.internal.measurement.zzfb zzfv() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamu);
        return this.zzamu;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final com.google.android.gms.internal.measurement.zzeo zzfw() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamt);
        return this.zzamt;
    }

    public final com.google.android.gms.internal.measurement.zzii zzfx() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzams);
        return this.zzams;
    }

    public final com.google.android.gms.internal.measurement.zzif zzfy() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamo);
        return this.zzamo;
    }

    public final com.google.android.gms.internal.measurement.zzfc zzfz() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamr);
        return this.zzamr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final com.google.android.gms.internal.measurement.zzfe zzga() {
        zza((com.google.android.gms.internal.measurement.zzhg) this.zzamn);
        return this.zzamn;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final com.google.android.gms.internal.measurement.zzka zzgb() {
        zza((com.google.android.gms.internal.measurement.zzhg) this.zzamm);
        return this.zzamm;
    }

    public final com.google.android.gms.internal.measurement.zzjh zzgc() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamj);
        return this.zzamj;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzec
    public final com.google.android.gms.internal.measurement.zzgg zzgd() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzami);
        return this.zzami;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzec
    public final com.google.android.gms.internal.measurement.zzfg zzge() {
        zza((com.google.android.gms.internal.measurement.zzhh) this.zzamh);
        return this.zzamh;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final com.google.android.gms.internal.measurement.zzfr zzgf() {
        zza((com.google.android.gms.internal.measurement.zzhg) this.zzamg);
        return this.zzamg;
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final com.google.android.gms.internal.measurement.zzef zzgg() {
        return this.zzamf;
    }

    public final com.google.android.gms.internal.measurement.zzfg zzjo() {
        com.google.android.gms.internal.measurement.zzfg zzfgVar = this.zzamh;
        if (zzfgVar == null || !zzfgVar.isInitialized()) {
            return null;
        }
        return this.zzamh;
    }

    public final com.google.android.gms.internal.measurement.zzfx zzjp() {
        return this.zzamv;
    }

    public final com.google.android.gms.internal.measurement.zzgg zzjq() {
        return this.zzami;
    }

    public final com.google.android.gms.measurement.AppMeasurement zzjr() {
        return this.zzamk;
    }

    public final com.google.firebase.analytics.FirebaseAnalytics zzjs() {
        return this.zzaml;
    }

    public final long zzjt() {
        java.lang.Long valueOf = java.lang.Long.valueOf(zzgf().zzajz.get());
        return valueOf.longValue() == 0 ? this.zzaem : java.lang.Math.min(this.zzaem, valueOf.longValue());
    }

    public final void zzju() {
        this.zzamz++;
    }

    public final boolean zzjv() {
        zzch();
        zzab();
        java.lang.Boolean bool = this.zzamw;
        if (bool == null || this.zzamx == 0 || (bool != null && !bool.booleanValue() && java.lang.Math.abs(zzbt().elapsedRealtime() - this.zzamx) > 1000)) {
            this.zzamx = zzbt().elapsedRealtime();
            boolean z17 = false;
            if (zzgb().zzx("android.permission.INTERNET") && zzgb().zzx("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).isCallerInstantApp() || (com.google.android.gms.internal.measurement.zzgb.zza(getContext()) && com.google.android.gms.internal.measurement.zzjc.zza(getContext(), false)))) {
                z17 = true;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            this.zzamw = valueOf;
            if (valueOf.booleanValue()) {
                this.zzamw = java.lang.Boolean.valueOf(zzgb().zzcg(zzfv().getGmpAppId()));
            }
        }
        return this.zzamw.booleanValue();
    }

    private static void zza(com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        if (zzhhVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (zzhhVar.isInitialized()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhhVar.getClass());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 27);
        sb6.append("Component not initialized: ");
        sb6.append(valueOf);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    public final void zza(com.google.android.gms.internal.measurement.zzhj zzhjVar) {
        java.lang.String concat;
        com.google.android.gms.internal.measurement.zzfi zzfiVar;
        zzab();
        com.google.android.gms.internal.measurement.zzeo zzeoVar = new com.google.android.gms.internal.measurement.zzeo(this);
        zzeoVar.zzm();
        this.zzamt = zzeoVar;
        com.google.android.gms.internal.measurement.zzfb zzfbVar = new com.google.android.gms.internal.measurement.zzfb(this);
        zzfbVar.zzm();
        this.zzamu = zzfbVar;
        com.google.android.gms.internal.measurement.zzfc zzfcVar = new com.google.android.gms.internal.measurement.zzfc(this);
        zzfcVar.zzm();
        this.zzamr = zzfcVar;
        com.google.android.gms.internal.measurement.zzii zziiVar = new com.google.android.gms.internal.measurement.zzii(this);
        zziiVar.zzm();
        this.zzams = zziiVar;
        this.zzamm.zzjw();
        this.zzamg.zzjw();
        this.zzamv = new com.google.android.gms.internal.measurement.zzfx(this);
        this.zzamu.zzjw();
        zzge().zzir().zzg("App measurement is starting up, version", 12451L);
        zzge().zzir().log("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        java.lang.String zzah = zzfbVar.zzah();
        if (zzgb().zzcj(zzah)) {
            zzfiVar = zzge().zzir();
            concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            com.google.android.gms.internal.measurement.zzfi zzir = zzge().zzir();
            java.lang.String valueOf = java.lang.String.valueOf(zzah);
            concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new java.lang.String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
            zzfiVar = zzir;
        }
        zzfiVar.log(concat);
        zzge().zzis().log("Debug-level message logging enabled");
        if (this.zzamy != this.zzamz) {
            zzge().zzim().zze("Not all components initialized", java.lang.Integer.valueOf(this.zzamy), java.lang.Integer.valueOf(this.zzamz));
        }
        super.zza((com.google.android.gms.internal.measurement.zzjw) zzhjVar);
        this.zzvo = true;
    }
}
