package fq3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347052d = 0;

    public f(fq3.g gVar, fq3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347052d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347052d;
        this.f347052d = i17 + 1;
        if (i17 == 0) {
            return fq3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
