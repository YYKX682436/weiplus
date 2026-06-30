package x0;

/* loaded from: classes13.dex */
public final class b1 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f532398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.c1 f532399e;

    public b1(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, x0.c1 c1Var) {
        this.f532398d = f0Var;
        this.f532399e = c1Var;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        java.lang.Object obj2 = x0.j0.f532432a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f532398d.f391649d < this.f532399e.f532405g - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f532398d.f391649d >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f532398d;
        int i17 = f0Var.f391649d + 1;
        x0.c1 c1Var = this.f532399e;
        x0.j0.a(i17, c1Var.f532405g);
        f0Var.f391649d = i17;
        return c1Var.get(i17);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f532398d.f391649d + 1;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f532398d;
        int i17 = f0Var.f391649d;
        x0.c1 c1Var = this.f532399e;
        x0.j0.a(i17, c1Var.f532405g);
        f0Var.f391649d = i17 - 1;
        return c1Var.get(i17);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f532398d.f391649d;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        java.lang.Object obj = x0.j0.f532432a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        java.lang.Object obj2 = x0.j0.f532432a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
