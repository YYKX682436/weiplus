package f26;

/* loaded from: classes16.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f340662a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340663b;

    /* renamed from: c, reason: collision with root package name */
    public final i26.o f340664c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.m f340665d;

    /* renamed from: e, reason: collision with root package name */
    public final f26.n f340666e;

    /* renamed from: f, reason: collision with root package name */
    public int f340667f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayDeque f340668g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f340669h;

    public b2(boolean z17, boolean z18, boolean z19, i26.o typeSystemContext, f26.m kotlinTypePreparator, f26.n kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeSystemContext, "typeSystemContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f340662a = z17;
        this.f340663b = z18;
        this.f340664c = typeSystemContext;
        this.f340665d = kotlinTypePreparator;
        this.f340666e = kotlinTypeRefiner;
    }

    public final void a() {
        java.util.ArrayDeque arrayDeque = this.f340668g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayDeque);
        arrayDeque.clear();
        java.util.Set set = this.f340669h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        ((o26.u) set).clear();
    }

    public boolean b(i26.i subType, i26.i superType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        return true;
    }

    public final void c() {
        if (this.f340668g == null) {
            this.f340668g = new java.util.ArrayDeque(4);
        }
        if (this.f340669h == null) {
            this.f340669h = o26.u.f424147f.a();
        }
    }

    public final i26.i d(i26.i type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return ((g26.j) this.f340665d).a(type);
    }

    public final i26.i e(i26.i type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        ((g26.k) this.f340666e).getClass();
        return (f26.o0) type;
    }
}
