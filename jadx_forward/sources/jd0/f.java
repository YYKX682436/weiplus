package jd0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380586d = 0;

    public f(jd0.g gVar, jd0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380586d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380586d;
        this.f380586d = i17 + 1;
        if (i17 == 0) {
            return jd0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
