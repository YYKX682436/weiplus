package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class zzhg implements com.google.android.gms.internal.measurement.zzhi {
    protected final com.google.android.gms.internal.measurement.zzgl zzacw;

    public zzhg(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzglVar);
        this.zzacw = zzglVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public android.content.Context getContext() {
        return this.zzacw.getContext();
    }

    public void zzab() {
        this.zzacw.zzgd().zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.common.util.Clock zzbt() {
        return this.zzacw.zzbt();
    }

    public void zzfr() {
        com.google.android.gms.internal.measurement.zzgl.zzfr();
    }

    public void zzfs() {
        this.zzacw.zzgd().zzfs();
    }

    public com.google.android.gms.internal.measurement.zzdu zzft() {
        return this.zzacw.zzft();
    }

    public com.google.android.gms.internal.measurement.zzhk zzfu() {
        return this.zzacw.zzfu();
    }

    public com.google.android.gms.internal.measurement.zzfb zzfv() {
        return this.zzacw.zzfv();
    }

    public com.google.android.gms.internal.measurement.zzeo zzfw() {
        return this.zzacw.zzfw();
    }

    public com.google.android.gms.internal.measurement.zzii zzfx() {
        return this.zzacw.zzfx();
    }

    public com.google.android.gms.internal.measurement.zzif zzfy() {
        return this.zzacw.zzfy();
    }

    public com.google.android.gms.internal.measurement.zzfc zzfz() {
        return this.zzacw.zzfz();
    }

    public com.google.android.gms.internal.measurement.zzfe zzga() {
        return this.zzacw.zzga();
    }

    public com.google.android.gms.internal.measurement.zzka zzgb() {
        return this.zzacw.zzgb();
    }

    public com.google.android.gms.internal.measurement.zzjh zzgc() {
        return this.zzacw.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.internal.measurement.zzgg zzgd() {
        return this.zzacw.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.internal.measurement.zzfg zzge() {
        return this.zzacw.zzge();
    }

    public com.google.android.gms.internal.measurement.zzfr zzgf() {
        return this.zzacw.zzgf();
    }

    public com.google.android.gms.internal.measurement.zzef zzgg() {
        return this.zzacw.zzgg();
    }
}
