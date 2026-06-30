package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzdy {
    private final com.google.android.gms.internal.measurement.zzgl zzacw;
    private java.lang.String zzadl;
    private java.lang.String zzadm;
    private java.lang.String zzadn;
    private java.lang.String zzado;
    private long zzadp;
    private long zzadq;
    private long zzadr;
    private long zzads;
    private java.lang.String zzadt;
    private long zzadu;
    private long zzadv;
    private boolean zzadw;
    private long zzadx;
    private boolean zzady;
    private boolean zzadz;
    private long zzaea;
    private long zzaeb;
    private long zzaec;
    private long zzaed;
    private long zzaee;
    private long zzaef;
    private java.lang.String zzaeg;
    private boolean zzaeh;
    private long zzaei;
    private long zzaej;
    private java.lang.String zzth;
    private final java.lang.String zzti;

    public zzdy(com.google.android.gms.internal.measurement.zzgl zzglVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzglVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzacw = zzglVar;
        this.zzti = str;
        zzglVar.zzab();
    }

    public final java.lang.String getAppInstanceId() {
        this.zzacw.zzab();
        return this.zzadl;
    }

    public final java.lang.String getGmpAppId() {
        this.zzacw.zzab();
        return this.zzadm;
    }

    public final boolean isMeasurementEnabled() {
        this.zzacw.zzab();
        return this.zzadw;
    }

    public final void setAppVersion(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzth, str);
        this.zzth = str;
    }

    public final void setMeasurementEnabled(boolean z17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadw != z17;
        this.zzadw = z17;
    }

    public final void zzaa(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadx != j17;
        this.zzadx = j17;
    }

    public final java.lang.String zzag() {
        this.zzacw.zzab();
        return this.zzth;
    }

    public final java.lang.String zzah() {
        this.zzacw.zzab();
        return this.zzti;
    }

    public final void zzal(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzadl, str);
        this.zzadl = str;
    }

    public final void zzam(java.lang.String str) {
        this.zzacw.zzab();
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzadm, str);
        this.zzadm = str;
    }

    public final void zzan(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzadn, str);
        this.zzadn = str;
    }

    public final void zzao(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzado, str);
        this.zzado = str;
    }

    public final void zzap(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzadt, str);
        this.zzadt = str;
    }

    public final void zzaq(java.lang.String str) {
        this.zzacw.zzab();
        this.zzaeh |= !com.google.android.gms.internal.measurement.zzka.zzs(this.zzaeg, str);
        this.zzaeg = str;
    }

    public final void zzd(boolean z17) {
        this.zzacw.zzab();
        this.zzaeh = this.zzady != z17;
        this.zzady = z17;
    }

    public final void zze(boolean z17) {
        this.zzacw.zzab();
        this.zzaeh = this.zzadz != z17;
        this.zzadz = z17;
    }

    public final void zzgh() {
        this.zzacw.zzab();
        this.zzaeh = false;
    }

    public final java.lang.String zzgi() {
        this.zzacw.zzab();
        return this.zzadn;
    }

    public final java.lang.String zzgj() {
        this.zzacw.zzab();
        return this.zzado;
    }

    public final long zzgk() {
        this.zzacw.zzab();
        return this.zzadq;
    }

    public final long zzgl() {
        this.zzacw.zzab();
        return this.zzadr;
    }

    public final long zzgm() {
        this.zzacw.zzab();
        return this.zzads;
    }

    public final java.lang.String zzgn() {
        this.zzacw.zzab();
        return this.zzadt;
    }

    public final long zzgo() {
        this.zzacw.zzab();
        return this.zzadu;
    }

    public final long zzgp() {
        this.zzacw.zzab();
        return this.zzadv;
    }

    public final long zzgq() {
        this.zzacw.zzab();
        return this.zzadp;
    }

    public final long zzgr() {
        this.zzacw.zzab();
        return this.zzaei;
    }

    public final long zzgs() {
        this.zzacw.zzab();
        return this.zzaej;
    }

    public final void zzgt() {
        this.zzacw.zzab();
        long j17 = this.zzadp + 1;
        if (j17 > 2147483647L) {
            this.zzacw.zzge().zzip().zzg("Bundle index overflow. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(this.zzti));
            j17 = 0;
        }
        this.zzaeh = true;
        this.zzadp = j17;
    }

    public final long zzgu() {
        this.zzacw.zzab();
        return this.zzaea;
    }

    public final long zzgv() {
        this.zzacw.zzab();
        return this.zzaeb;
    }

    public final long zzgw() {
        this.zzacw.zzab();
        return this.zzaec;
    }

    public final long zzgx() {
        this.zzacw.zzab();
        return this.zzaed;
    }

    public final long zzgy() {
        this.zzacw.zzab();
        return this.zzaef;
    }

    public final long zzgz() {
        this.zzacw.zzab();
        return this.zzaee;
    }

    public final java.lang.String zzha() {
        this.zzacw.zzab();
        return this.zzaeg;
    }

    public final java.lang.String zzhb() {
        this.zzacw.zzab();
        java.lang.String str = this.zzaeg;
        zzaq(null);
        return str;
    }

    public final long zzhc() {
        this.zzacw.zzab();
        return this.zzadx;
    }

    public final boolean zzhd() {
        this.zzacw.zzab();
        return this.zzady;
    }

    public final boolean zzhe() {
        this.zzacw.zzab();
        return this.zzadz;
    }

    public final void zzm(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadq != j17;
        this.zzadq = j17;
    }

    public final void zzn(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadr != j17;
        this.zzadr = j17;
    }

    public final void zzo(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzads != j17;
        this.zzads = j17;
    }

    public final void zzp(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadu != j17;
        this.zzadu = j17;
    }

    public final void zzq(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzadv != j17;
        this.zzadv = j17;
    }

    public final void zzr(long j17) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j17 >= 0);
        this.zzacw.zzab();
        this.zzaeh |= this.zzadp != j17;
        this.zzadp = j17;
    }

    public final void zzs(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaei != j17;
        this.zzaei = j17;
    }

    public final void zzt(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaej != j17;
        this.zzaej = j17;
    }

    public final void zzu(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaea != j17;
        this.zzaea = j17;
    }

    public final void zzv(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaeb != j17;
        this.zzaeb = j17;
    }

    public final void zzw(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaec != j17;
        this.zzaec = j17;
    }

    public final void zzx(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaed != j17;
        this.zzaed = j17;
    }

    public final void zzy(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaef != j17;
        this.zzaef = j17;
    }

    public final void zzz(long j17) {
        this.zzacw.zzab();
        this.zzaeh |= this.zzaee != j17;
        this.zzaee = j17;
    }
}
