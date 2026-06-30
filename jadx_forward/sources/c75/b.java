package c75;

/* loaded from: classes7.dex */
public final class b implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f121168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f121169e;

    public b(org.json.JSONArray jSONArray) {
        this.f121169e = jSONArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f121168d < this.f121169e.length();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj = this.f121169e.get(this.f121168d);
        this.f121168d++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
