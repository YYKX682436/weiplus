package t30;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496905d = 0;

    public h(t30.i iVar, t30.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496905d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496905d;
        this.f496905d = i17 + 1;
        if (i17 == 0) {
            return t30.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
