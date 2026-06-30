package c75;

/* loaded from: classes7.dex */
public final class b implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f39635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f39636e;

    public b(org.json.JSONArray jSONArray) {
        this.f39636e = jSONArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39635d < this.f39636e.length();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj = this.f39636e.get(this.f39635d);
        this.f39635d++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
