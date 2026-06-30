package uz;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513610d = 0;

    public q(uz.r rVar, uz.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513610d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513610d;
        this.f513610d = i17 + 1;
        if (i17 == 0) {
            return uz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
