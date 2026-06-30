package mq1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412194d = 0;

    public f(mq1.g gVar, mq1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412194d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412194d;
        this.f412194d = i17 + 1;
        if (i17 == 0) {
            return mq1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
