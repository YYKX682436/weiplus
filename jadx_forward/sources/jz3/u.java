package jz3;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384335d = 0;

    public u(jz3.v vVar, jz3.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384335d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384335d;
        this.f384335d = i17 + 1;
        if (i17 == 0) {
            return jz3.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
