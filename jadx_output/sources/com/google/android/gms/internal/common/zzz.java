package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
abstract class zzz extends com.google.android.gms.internal.common.zzak {
    private final int zza;
    private int zzb;

    public zzz(int i17, int i18) {
        com.google.android.gms.internal.common.zzs.zzb(i18, i17, ya.b.INDEX);
        this.zza = i17;
        this.zzb = i18;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.zzb;
        this.zzb = i17 + 1;
        return zza(i17);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.zzb - 1;
        this.zzb = i17;
        return zza(i17);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract java.lang.Object zza(int i17);
}
