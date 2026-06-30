package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzx {
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo zza;
    private final boolean zzb;
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzu zzc;

    private zzx(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzu zzuVar, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo zzoVar, int i17) {
        this.zzc = zzuVar;
        this.zzb = z17;
        this.zza = zzoVar;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo zzoVar) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzu(zzoVar), false, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzn.zza, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator zzh(java.lang.CharSequence charSequence) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzt(this.zzc, this, charSequence);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx zzb() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence charSequence) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzv(this, charSequence);
    }

    public final java.util.List zzf(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator zzh = zzh(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzh.hasNext()) {
            arrayList.add((java.lang.String) zzh.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
