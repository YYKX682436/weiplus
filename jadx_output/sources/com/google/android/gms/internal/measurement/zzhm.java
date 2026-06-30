package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhm implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String val$name;
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;
    private final /* synthetic */ java.lang.Object zzanx;
    private final /* synthetic */ long zzany;

    public zzhm(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j17) {
        this.zzanw = zzhkVar;
        this.zzanh = str;
        this.val$name = str2;
        this.zzanx = obj;
        this.zzany = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanw.zza(this.zzanh, this.val$name, this.zzanx, this.zzany);
    }
}
