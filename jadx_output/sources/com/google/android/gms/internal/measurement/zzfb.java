package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfb extends com.google.android.gms.internal.measurement.zzhh {
    private java.lang.String zzadm;
    private java.lang.String zzadt;
    private long zzadx;
    private int zzaen;
    private int zzaie;
    private long zzaif;
    private java.lang.String zztg;
    private java.lang.String zzth;
    private java.lang.String zzti;

    public zzfb(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
    }

    private final java.lang.String zzgj() {
        zzab();
        if (zzgg().zzay(this.zzti) && !this.zzacw.isEnabled()) {
            return null;
        }
        try {
            com.google.firebase.iid.FirebaseInstanceId.b().i();
            return com.google.firebase.iid.FirebaseInstanceId.j();
        } catch (java.lang.IllegalStateException unused) {
            zzge().zzip().log("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final java.lang.String getGmpAppId() {
        zzch();
        return this.zzadm;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final java.lang.String zzah() {
        zzch();
        return this.zzti;
    }

    public final com.google.android.gms.internal.measurement.zzdz zzbi(java.lang.String str) {
        zzab();
        java.lang.String zzah = zzah();
        java.lang.String gmpAppId = getGmpAppId();
        zzch();
        java.lang.String str2 = this.zzth;
        long zzij = zzij();
        zzch();
        java.lang.String str3 = this.zzadt;
        zzch();
        zzab();
        if (this.zzaif == 0) {
            this.zzaif = this.zzacw.zzgb().zzd(getContext(), getContext().getPackageName());
        }
        long j17 = this.zzaif;
        boolean isEnabled = this.zzacw.isEnabled();
        boolean z17 = !zzgf().zzakn;
        java.lang.String zzgj = zzgj();
        zzch();
        long zzjt = this.zzacw.zzjt();
        int zzik = zzik();
        java.lang.Boolean zzas = zzgg().zzas("google_analytics_adid_collection_enabled");
        boolean booleanValue = java.lang.Boolean.valueOf(zzas == null || zzas.booleanValue()).booleanValue();
        java.lang.Boolean zzas2 = zzgg().zzas("google_analytics_ssaid_collection_enabled");
        return new com.google.android.gms.internal.measurement.zzdz(zzah, gmpAppId, str2, zzij, str3, 12451L, j17, str, isEnabled, z17, zzgj, 0L, zzjt, zzik, booleanValue, java.lang.Boolean.valueOf(zzas2 == null || zzas2.booleanValue()).booleanValue(), zzgf().zzje());
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:3)(6:44|45|(1:47)(2:62|(1:64))|48|49|(16:51|(1:53)(1:60)|54|55|5|(1:43)(1:9)|(1:(1:12)(1:13))|(3:15|(1:17)(1:(1:(1:27)(1:26))(1:22))|18)|28|29|30|(1:32)(1:40)|33|(1:35)|37|38))|4|5|(1:7)|43|(0)|(0)|28|29|30|(0)(0)|33|(0)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        zzge().zzim().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(r0), r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a A[Catch: IllegalStateException -> 0x015c, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x015c, blocks: (B:30:0x013a, B:33:0x0146, B:35:0x014a), top: B:29:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    @Override // com.google.android.gms.internal.measurement.zzhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzih() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.zzih():void");
    }

    public final java.lang.String zzii() {
        byte[] bArr = new byte[16];
        zzgb().zzlc().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    public final int zzij() {
        zzch();
        return this.zzaie;
    }

    public final int zzik() {
        zzch();
        return this.zzaen;
    }
}
