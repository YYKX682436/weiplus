package b92;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100098d = 0;

    public y(b92.z zVar, b92.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100098d;
        this.f100098d = i17 + 1;
        if (i17 == 0) {
            return b92.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
