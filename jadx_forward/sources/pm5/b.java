package pm5;

/* loaded from: classes12.dex */
public class b implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f438423d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.a f438424e;

    public b(java.lang.Iterable iterable, pm5.a aVar) {
        this.f438423d = iterable;
        this.f438424e = aVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.c(this.f438423d.iterator(), this.f438424e);
    }
}
