package r0;

/* loaded from: classes14.dex */
public final class w extends r0.v {
    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449527f + 2;
        this.f449527f = i17;
        java.lang.Object[] objArr = this.f449525d;
        return new r0.b(objArr[i17 - 2], objArr[i17 - 1]);
    }
}
