package bb0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100290d = 0;

    public t(bb0.u uVar, bb0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100290d;
        this.f100290d = i17 + 1;
        if (i17 == 0) {
            return bb0.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
