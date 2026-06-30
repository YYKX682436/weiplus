package lg0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400074d = 0;

    public j(lg0.k kVar, lg0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400074d;
        this.f400074d = i17 + 1;
        if (i17 == 0) {
            return p05.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
