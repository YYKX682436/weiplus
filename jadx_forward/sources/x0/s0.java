package x0;

/* loaded from: classes14.dex */
public final class s0 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final x0.i0 f532477d;

    /* renamed from: e, reason: collision with root package name */
    public int f532478e;

    /* renamed from: f, reason: collision with root package name */
    public int f532479f;

    public s0(x0.i0 list, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f532477d = list;
        this.f532478e = i17 - 1;
        this.f532479f = list.h();
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        b();
        int i17 = this.f532478e + 1;
        x0.i0 i0Var = this.f532477d;
        i0Var.add(i17, obj);
        this.f532478e++;
        this.f532479f = i0Var.h();
    }

    public final void b() {
        if (this.f532477d.h() != this.f532479f) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f532478e < this.f532477d.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f532478e >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f532478e + 1;
        x0.i0 i0Var = this.f532477d;
        x0.j0.a(i17, i0Var.size());
        java.lang.Object obj = i0Var.get(i17);
        this.f532478e = i17;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f532478e + 1;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f532478e;
        x0.i0 i0Var = this.f532477d;
        x0.j0.a(i17, i0Var.size());
        this.f532478e--;
        return i0Var.get(this.f532478e);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f532478e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        int i17 = this.f532478e;
        x0.i0 i0Var = this.f532477d;
        i0Var.remove(i17);
        this.f532478e--;
        this.f532479f = i0Var.h();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f532478e;
        x0.i0 i0Var = this.f532477d;
        i0Var.set(i17, obj);
        this.f532479f = i0Var.h();
    }
}
