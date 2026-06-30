package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzabe implements java.util.Iterator {
    private int pos;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzaay zzbuf;
    private boolean zzbug;
    private java.util.Iterator zzbuh;

    private zzabe(com.google.android.gms.internal.measurement.zzaay zzaayVar) {
        this.zzbuf = zzaayVar;
        this.pos = -1;
    }

    private final java.util.Iterator zzup() {
        java.util.Map map;
        if (this.zzbuh == null) {
            map = this.zzbuf.zzbtz;
            this.zzbuh = map.entrySet().iterator();
        }
        return this.zzbuh;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        java.util.Map map;
        int i17 = this.pos + 1;
        list = this.zzbuf.zzbty;
        if (i17 >= list.size()) {
            map = this.zzbuf.zzbtz;
            if (map.isEmpty() || !zzup().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.List list;
        java.lang.Object next;
        java.util.List list2;
        this.zzbug = true;
        int i17 = this.pos + 1;
        this.pos = i17;
        list = this.zzbuf.zzbty;
        if (i17 < list.size()) {
            list2 = this.zzbuf.zzbty;
            next = list2.get(this.pos);
        } else {
            next = zzup().next();
        }
        return (java.util.Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.List list;
        if (!this.zzbug) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzbug = false;
        this.zzbuf.zzul();
        int i17 = this.pos;
        list = this.zzbuf.zzbty;
        if (i17 >= list.size()) {
            zzup().remove();
            return;
        }
        com.google.android.gms.internal.measurement.zzaay zzaayVar = this.zzbuf;
        int i18 = this.pos;
        this.pos = i18 - 1;
        zzaayVar.zzai(i18);
    }

    public /* synthetic */ zzabe(com.google.android.gms.internal.measurement.zzaay zzaayVar, com.google.android.gms.internal.measurement.zzaaz zzaazVar) {
        this(zzaayVar);
    }
}
