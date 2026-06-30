package pm5;

/* loaded from: classes12.dex */
public class l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f438438d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.j f438439e;

    /* renamed from: f, reason: collision with root package name */
    public final pm5.k f438440f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f438441g;

    public l(java.lang.Iterable iterable, pm5.j jVar) {
        this(iterable, jVar, null, true);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.m(this.f438438d.iterator(), this.f438439e, this.f438440f, this.f438441g);
    }

    public l(java.lang.Iterable iterable, pm5.j jVar, pm5.k kVar, boolean z17) {
        this.f438438d = iterable;
        this.f438439e = jVar;
        this.f438440f = kVar;
        this.f438441g = z17;
    }
}
