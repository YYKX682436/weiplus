package vz5;

/* loaded from: classes7.dex */
public final class r implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f523336d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz5.s f523338f;

    public r(vz5.s sVar) {
        this.f523338f = sVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f523336d == null && !this.f523337e) {
            java.lang.String readLine = this.f523338f.f523339a.readLine();
            this.f523336d = readLine;
            if (readLine == null) {
                this.f523337e = true;
            }
        }
        return this.f523336d != null;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.f523336d;
        this.f523336d = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
