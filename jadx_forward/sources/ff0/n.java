package ff0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343125d = 0;

    public n(ff0.o oVar, ff0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343125d;
        this.f343125d = i17 + 1;
        if (i17 == 0) {
            return r35.h4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
