package mp3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411984d = 0;

    public c(mp3.d dVar, mp3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411984d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411984d;
        this.f411984d = i17 + 1;
        if (i17 == 0) {
            return lp3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
