package a25;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f916d = 0;

    public j(a25.k kVar, a25.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f916d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f916d;
        this.f916d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.zero.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
