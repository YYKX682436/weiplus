package gh4;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353480d = 0;

    public p(gh4.q qVar, gh4.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353480d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353480d;
        this.f353480d = i17 + 1;
        if (i17 == 0) {
            return gh4.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
