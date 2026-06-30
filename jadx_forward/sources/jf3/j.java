package jf3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380951d = 0;

    public j(jf3.k kVar, jf3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380951d;
        this.f380951d = i17 + 1;
        if (i17 == 0) {
            return jf3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
