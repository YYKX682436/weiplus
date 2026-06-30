package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
abstract class zzj implements java.util.Iterator {
    private java.lang.Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i17 = this.zzb;
        if (i17 == 4) {
            throw new java.lang.IllegalStateException();
        }
        int i18 = i17 - 1;
        if (i17 == 0) {
            throw null;
        }
        if (i18 == 0) {
            return true;
        }
        if (i18 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = 2;
        java.lang.Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract java.lang.Object zza();

    public final java.lang.Object zzb() {
        this.zzb = 3;
        return null;
    }
}
