package e70;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331385d = 0;

    public n(e70.o oVar, e70.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331385d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331385d;
        this.f331385d = i17 + 1;
        if (i17 == 0) {
            return i70.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
