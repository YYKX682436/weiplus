package jd0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380614d = 0;

    public n(jd0.o oVar, jd0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380614d;
        this.f380614d = i17 + 1;
        if (i17 == 0) {
            return jd0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
