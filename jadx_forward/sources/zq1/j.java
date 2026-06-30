package zq1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556527d = 0;

    public j(zq1.k kVar, zq1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556527d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556527d;
        this.f556527d = i17 + 1;
        if (i17 == 0) {
            return yq1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
