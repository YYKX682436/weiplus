package x0;

/* loaded from: classes14.dex */
public abstract class c0 implements java.util.Set, zz5.g {

    /* renamed from: d, reason: collision with root package name */
    public final x0.l0 f532401d;

    public c0(x0.l0 map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f532401d = map;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f532401d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f532401d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f532401d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
