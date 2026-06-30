package fo;

/* loaded from: classes.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346325d = 0;

    public q(fo.r rVar, fo.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346325d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346325d;
        this.f346325d = i17 + 1;
        if (i17 == 0) {
            return fo.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
