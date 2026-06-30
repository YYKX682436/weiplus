package lz5;

/* loaded from: classes14.dex */
public final class p extends kz5.k {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f403953d;

    public p(lz5.m backing) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backing, "backing");
        this.f403953d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f403953d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f403953d.containsValue(obj);
    }

    @Override // kz5.k
    public int d() {
        return this.f403953d.f403946o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f403953d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        lz5.m mVar = this.f403953d;
        mVar.getClass();
        return new lz5.l(mVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int i17;
        lz5.m mVar = this.f403953d;
        mVar.c();
        int i18 = mVar.f403943i;
        while (true) {
            i17 = -1;
            i18--;
            if (i18 < 0) {
                break;
            }
            if (mVar.f403940f[i18] >= 0) {
                java.lang.Object[] objArr = mVar.f403939e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(objArr[i18], obj)) {
                    i17 = i18;
                    break;
                }
            }
        }
        if (i17 < 0) {
            return false;
        }
        mVar.l(i17);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        this.f403953d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        this.f403953d.c();
        return super.retainAll(elements);
    }
}
