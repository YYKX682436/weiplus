package o0;

/* loaded from: classes5.dex */
public final class h implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f423381d;

    /* renamed from: e, reason: collision with root package name */
    public int f423382e;

    public h(java.util.List list, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f423381d = list;
        this.f423382e = i17;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        this.f423381d.add(this.f423382e, obj);
        this.f423382e++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f423382e < this.f423381d.size();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f423382e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423382e;
        this.f423382e = i17 + 1;
        return this.f423381d.get(i17);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f423382e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        int i17 = this.f423382e - 1;
        this.f423382e = i17;
        return this.f423381d.get(i17);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f423382e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17 = this.f423382e - 1;
        this.f423382e = i17;
        this.f423381d.remove(i17);
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        this.f423381d.set(this.f423382e, obj);
    }
}
