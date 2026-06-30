package y16;

/* loaded from: classes16.dex */
public abstract class l extends y16.t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f540498d = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y16.l.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f540499b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f540500c;

    public l(e26.c0 storageManager, o06.g containingClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingClass, "containingClass");
        this.f540499b = containingClass;
        this.f540500c = ((e26.u) storageManager).b(new y16.j(this));
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f540500c, this, f540498d[0]);
        if (list.isEmpty()) {
            return kz5.p0.f395529d;
        }
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if ((obj instanceof o06.v1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.v) ((o06.v1) obj)).mo132800xfb82e301(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f540500c, this, f540498d[0]);
        if (list.isEmpty()) {
            return kz5.p0.f395529d;
        }
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if ((obj instanceof o06.o1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((o06.o1) obj).mo132800xfb82e301(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return !kindFilter.a(y16.i.f540487n.f540494b) ? kz5.p0.f395529d : (java.util.List) e26.b0.a(this.f540500c, this, f540498d[0]);
    }

    public abstract java.util.List h();
}
