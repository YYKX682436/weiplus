package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzj implements com.google.android.gms.auth.zzm<java.util.List<com.google.android.gms.auth.AccountChangeEvent>> {
    private final /* synthetic */ java.lang.String zzu;
    private final /* synthetic */ int zzv;

    public zzj(java.lang.String str, int i17) {
        this.zzu = str;
        this.zzv = i17;
    }

    @Override // com.google.android.gms.auth.zzm
    public final /* synthetic */ java.util.List<com.google.android.gms.auth.AccountChangeEvent> zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        zzd = com.google.android.gms.auth.zzg.zzd(com.google.android.gms.internal.auth.zzi.zzd(iBinder).zzd(new com.google.android.gms.auth.AccountChangeEventsRequest().setAccountName(this.zzu).setEventIndex(this.zzv)));
        return ((com.google.android.gms.auth.AccountChangeEventsResponse) zzd).getEvents();
    }
}
