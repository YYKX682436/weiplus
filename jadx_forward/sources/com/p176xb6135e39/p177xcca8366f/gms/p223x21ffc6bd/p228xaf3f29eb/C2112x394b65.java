package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.common.zzaf */
/* loaded from: classes13.dex */
public final class C2112x394b65 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zzc;

    public C2112x394b65(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 abstractC2113x394b66, int i17, int i18) {
        this.zzc = abstractC2113x394b66;
        this.zza = i17;
        this.zzb = i18;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzs.zza(i17, this.zzb, ya.b.f77479x42930b2);
        return this.zzc.get(i17 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final boolean zzf() {
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final java.lang.Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 subList(int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzs.zzc(i17, i18, this.zzb);
        int i19 = this.zza;
        return this.zzc.subList(i17 + i19, i18 + i19);
    }
}
