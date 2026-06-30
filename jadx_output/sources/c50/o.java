package c50;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38614d = 0;

    public o(c50.p pVar, c50.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38614d;
        this.f38614d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.j5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
