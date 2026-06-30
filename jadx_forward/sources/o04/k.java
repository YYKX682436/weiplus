package o04;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423447d = 0;

    public k(o04.l lVar, o04.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423447d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423447d;
        this.f423447d = i17 + 1;
        if (i17 == 0) {
            return o04.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
