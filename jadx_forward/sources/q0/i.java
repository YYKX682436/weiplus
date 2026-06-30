package q0;

/* loaded from: classes14.dex */
public final class i extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f440767f;

    /* renamed from: g, reason: collision with root package name */
    public final q0.m f440768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Object[] root, java.lang.Object[] tail, int i17, int i18, int i19) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tail, "tail");
        this.f440767f = tail;
        int i27 = (i18 - 1) & (-32);
        this.f440768g = new q0.m(root, i17 > i27 ? i27 : i17, i27, i19);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        q0.m mVar = this.f440768g;
        if (mVar.hasNext()) {
            this.f440749d++;
            return mVar.next();
        }
        int i17 = this.f440749d;
        this.f440749d = i17 + 1;
        return this.f440767f[i17 - mVar.f440750e];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f440749d;
        q0.m mVar = this.f440768g;
        int i18 = mVar.f440750e;
        if (i17 <= i18) {
            this.f440749d = i17 - 1;
            return mVar.previous();
        }
        int i19 = i17 - 1;
        this.f440749d = i19;
        return this.f440767f[i19 - i18];
    }
}
