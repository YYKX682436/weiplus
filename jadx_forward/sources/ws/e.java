package ws;

/* loaded from: classes.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f530483d = 0;

    public e(ws.f fVar, ws.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f530483d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f530483d;
        this.f530483d = i17 + 1;
        if (i17 == 0) {
            return ws.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
