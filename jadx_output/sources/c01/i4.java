package c01;

/* loaded from: classes6.dex */
public class i4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37248d = 0;

    public i4(c01.j4 j4Var, c01.h4 h4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37248d;
        this.f37248d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
