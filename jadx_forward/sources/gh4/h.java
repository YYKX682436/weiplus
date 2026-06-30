package gh4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353460d = 0;

    public h(gh4.i iVar, gh4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353460d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353460d;
        this.f353460d = i17 + 1;
        if (i17 == 0) {
            return gh4.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
