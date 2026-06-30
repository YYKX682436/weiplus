package com.google.android.gms.common;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes13.dex */
public class GmsSignatureVerifier {
    private static final com.google.android.gms.common.zzab zza;
    private static final com.google.android.gms.common.zzab zzb;
    private static final java.util.HashMap zzc;

    static {
        com.google.android.gms.common.zzz zzzVar = new com.google.android.gms.common.zzz();
        zzzVar.zzd("com.google.android.gms");
        zzzVar.zza(204200000L);
        com.google.android.gms.common.zzl zzlVar = com.google.android.gms.common.zzn.zzd;
        zzzVar.zzc(com.google.android.gms.internal.common.zzag.zzn(zzlVar.zzf(), com.google.android.gms.common.zzn.zzb.zzf()));
        com.google.android.gms.common.zzl zzlVar2 = com.google.android.gms.common.zzn.zzc;
        zzzVar.zzb(com.google.android.gms.internal.common.zzag.zzn(zzlVar2.zzf(), com.google.android.gms.common.zzn.zza.zzf()));
        zza = zzzVar.zze();
        com.google.android.gms.common.zzz zzzVar2 = new com.google.android.gms.common.zzz();
        zzzVar2.zzd("com.android.vending");
        zzzVar2.zza(82240000L);
        zzzVar2.zzc(com.google.android.gms.internal.common.zzag.zzm(zzlVar.zzf()));
        zzzVar2.zzb(com.google.android.gms.internal.common.zzag.zzm(zzlVar2.zzf()));
        zzb = zzzVar2.zze();
        zzc = new java.util.HashMap();
    }
}
