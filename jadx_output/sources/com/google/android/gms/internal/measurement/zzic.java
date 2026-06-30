package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzic implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String val$name;
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ long zzany;
    private final /* synthetic */ android.os.Bundle zzaoe;
    private final /* synthetic */ boolean zzaof;
    private final /* synthetic */ boolean zzaog;
    private final /* synthetic */ boolean zzaoh;

    public zzic(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        this.zzanw = zzhkVar;
        this.zzanh = str;
        this.val$name = str2;
        this.zzany = j17;
        this.zzaoe = bundle;
        this.zzaof = z17;
        this.zzaog = z18;
        this.zzaoh = z19;
        this.zzanj = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zzb(this.zzanh, this.val$name, this.zzany, this.zzaoe, this.zzaof, this.zzaog, this.zzaoh, this.zzanj);
    }
}
