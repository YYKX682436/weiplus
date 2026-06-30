package m11;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404340d = 0;

    public x(m11.y yVar, m11.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404340d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404340d;
        this.f404340d = i17 + 1;
        if (i17 == 0) {
            return m11.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
