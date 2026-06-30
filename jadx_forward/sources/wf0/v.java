package wf0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527077d = 0;

    public v(wf0.w wVar, wf0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527077d;
        this.f527077d = i17 + 1;
        if (i17 == 0) {
            return vf0.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
