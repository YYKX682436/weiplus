package sr1;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492997d = 0;

    public f(sr1.g gVar, sr1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492997d;
        this.f492997d = i17 + 1;
        if (i17 == 0) {
            return sr1.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
