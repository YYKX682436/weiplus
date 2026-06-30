package jd0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380601d = 0;

    public j(jd0.k kVar, jd0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380601d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380601d;
        this.f380601d = i17 + 1;
        if (i17 == 0) {
            return jd0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
