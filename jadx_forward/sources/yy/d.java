package yy;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549520d = 0;

    public d(yy.e eVar, yy.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549520d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549520d;
        this.f549520d = i17 + 1;
        if (i17 == 0) {
            return yy.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
