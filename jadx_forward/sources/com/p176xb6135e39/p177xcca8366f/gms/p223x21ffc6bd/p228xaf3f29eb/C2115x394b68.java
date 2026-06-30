package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
@org.jspecify.nullness.NullMarked
/* renamed from: com.google.android.gms.internal.common.zzai */
/* loaded from: classes13.dex */
public final class C2115x394b68 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 {
    static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66 zza = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.C2115x394b68(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    public C2115x394b68(java.lang.Object[] objArr, int i17) {
        this.zzb = objArr;
        this.zzc = i17;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzs.zza(i17, this.zzc, ya.b.f77479x42930b2);
        java.lang.Object obj = this.zzb[i17];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final int zza(java.lang.Object[] objArr, int i17) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final int zzc() {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final boolean zzf() {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2109x394b62
    public final java.lang.Object[] zzg() {
        return this.zzb;
    }
}
