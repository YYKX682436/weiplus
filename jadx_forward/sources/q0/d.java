package q0;

/* loaded from: classes14.dex */
public final class d extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f440752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.Object[] buffer, int i17, int i18) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f440752f = buffer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f440749d;
        this.f440749d = i17 + 1;
        return this.f440752f[i17];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f440749d - 1;
        this.f440749d = i17;
        return this.f440752f[i17];
    }
}
