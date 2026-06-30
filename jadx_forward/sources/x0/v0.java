package x0;

/* loaded from: classes14.dex */
public abstract class v0 {

    /* renamed from: d, reason: collision with root package name */
    public final x0.l0 f532485d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f532486e;

    /* renamed from: f, reason: collision with root package name */
    public int f532487f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map.Entry f532488g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map.Entry f532489h;

    public v0(x0.l0 map, java.util.Iterator iterator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterator, "iterator");
        this.f532485d = map;
        this.f532486e = iterator;
        this.f532487f = map.b().f532435d;
        b();
    }

    public final void b() {
        this.f532488g = this.f532489h;
        java.util.Iterator it = this.f532486e;
        this.f532489h = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
    }

    /* renamed from: hasNext */
    public final boolean m174772x2987b4ad() {
        return this.f532489h != null;
    }

    /* renamed from: remove */
    public final void m174773xc84af884() {
        x0.l0 l0Var = this.f532485d;
        if (l0Var.b().f532435d != this.f532487f) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Map.Entry entry = this.f532488g;
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        l0Var.remove(entry.getKey());
        this.f532488g = null;
        this.f532487f = l0Var.b().f532435d;
    }
}
