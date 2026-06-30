package c01;

/* loaded from: classes6.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37084d = 0;

    public c5(c01.d5 d5Var, c01.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37084d;
        this.f37084d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fts.logic.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
