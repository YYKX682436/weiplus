package pm5;

/* loaded from: classes12.dex */
public class e implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f438430d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.d f438431e;

    public e(java.lang.Iterable iterable, pm5.d dVar) {
        this.f438430d = iterable;
        this.f438431e = dVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.f(this.f438430d.iterator(), this.f438431e);
    }
}
