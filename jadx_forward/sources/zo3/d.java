package zo3;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556388d = 0;

    public d(zo3.e eVar, zo3.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556388d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556388d;
        this.f556388d = i17 + 1;
        if (i17 == 0) {
            return zo3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
