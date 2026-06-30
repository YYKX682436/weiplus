package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzv implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx zzb;

    public zzv(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzx zzxVar, java.lang.CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    /* renamed from: toString */
    public final java.lang.String m18817x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('[');
        java.util.Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb6.append((java.lang.CharSequence) ", ");
                    sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzq.zza(it.next(), ", "));
                }
            }
            sb6.append(']');
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
