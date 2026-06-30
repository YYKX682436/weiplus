package com.google.gson.internal;

/* loaded from: classes16.dex */
public final class z extends java.util.AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.internal.c0 f44827d;

    public z(com.google.gson.internal.c0 c0Var) {
        this.f44827d = c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f44827d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f44827d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new com.google.gson.internal.y(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.gson.internal.c0 r0 = r3.f44827d
            r0.getClass()
            r1 = 0
            if (r4 == 0) goto Ld
            com.google.gson.internal.b0 r4 = r0.a(r4, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r4 = 0
        Le:
            r2 = 1
            if (r4 == 0) goto L14
            r0.d(r4, r2)
        L14:
            if (r4 == 0) goto L17
            r1 = r2
        L17:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.z.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f44827d.f44803f;
    }
}
