package sd0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f488206d = 0;

    public d(sd0.e eVar, sd0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f488206d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f488206d;
        this.f488206d = i17 + 1;
        if (i17 == 0) {
            return sd0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
