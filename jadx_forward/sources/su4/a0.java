package su4;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494340d = 0;

    public a0(su4.b0 b0Var, su4.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494340d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494340d;
        this.f494340d = i17 + 1;
        if (i17 == 0) {
            return sg0.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
