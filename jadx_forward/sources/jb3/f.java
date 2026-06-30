package jb3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380288d = 0;

    public f(jb3.g gVar, jb3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380288d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380288d;
        this.f380288d = i17 + 1;
        if (i17 == 0) {
            return jb3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
