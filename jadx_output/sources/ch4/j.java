package ch4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41516d = 0;

    public j(ch4.k kVar, ch4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41516d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41516d;
        this.f41516d = i17 + 1;
        if (i17 == 0) {
            return ch4.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
