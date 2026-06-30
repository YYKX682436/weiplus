package jh3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381355d = 0;

    public j(jh3.k kVar, jh3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381355d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381355d;
        this.f381355d = i17 + 1;
        if (i17 == 0) {
            return jh3.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
