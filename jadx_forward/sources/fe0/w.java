package fe0;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342982d = 0;

    public w(fe0.x xVar, fe0.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342982d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342982d;
        this.f342982d = i17 + 1;
        if (i17 == 0) {
            return ee0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
