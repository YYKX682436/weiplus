package mr0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412365d = 0;

    public d(mr0.e eVar, mr0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412365d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412365d;
        this.f412365d = i17 + 1;
        if (i17 == 0) {
            return mr0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
