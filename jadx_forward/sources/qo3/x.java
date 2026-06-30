package qo3;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447184d = 0;

    public x(qo3.y yVar, qo3.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447184d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447184d;
        this.f447184d = i17 + 1;
        if (i17 == 0) {
            return qo3.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
