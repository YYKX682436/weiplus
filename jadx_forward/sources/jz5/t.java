package jz5;

/* loaded from: classes7.dex */
public final class t implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f384380d;

    public /* synthetic */ t(byte[] bArr) {
        this.f384380d = bArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof jz5.r)) {
            return false;
        }
        return kz5.z.D(this.f384380d, ((jz5.r) obj).f384377d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0016->B:17:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsAll(java.util.Collection r5) {
        /*
            r4 = this;
            java.lang.String r0 = "elements"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L37
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof jz5.r
            r3 = 0
            if (r2 == 0) goto L33
            jz5.r r0 = (jz5.r) r0
            byte r0 = r0.f384377d
            byte[] r2 = r4.f384380d
            boolean r0 = kz5.z.D(r2, r0)
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L16
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz5.t.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.t) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384380d, ((jz5.t) obj).f384380d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f384380d);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f384380d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new jz5.s(this.f384380d);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public int size() {
        return this.f384380d.length;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    /* renamed from: toString */
    public java.lang.String m141649x9616526c() {
        return "UByteArray(storage=" + java.util.Arrays.toString(this.f384380d) + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
