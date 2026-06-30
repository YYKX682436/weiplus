package n06;

/* loaded from: classes15.dex */
public final class i implements q06.c {

    /* renamed from: g, reason: collision with root package name */
    public static final n16.g f415516g;

    /* renamed from: h, reason: collision with root package name */
    public static final n16.b f415517h;

    /* renamed from: a, reason: collision with root package name */
    public final o06.v0 f415518a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f415519b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f415520c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f415514e = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(n06.i.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    public static final n06.g f415513d = new n06.g(null);

    /* renamed from: f, reason: collision with root package name */
    public static final n16.c f415515f = l06.x.f396489k;

    static {
        n16.e eVar = l06.w.f396455d;
        n16.g g17 = eVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "shortName(...)");
        f415516g = g17;
        f415517h = n16.b.l(eVar.h());
    }

    public i(e26.c0 storageManager, o06.v0 moduleDescriptor, yz5.l computeContainingDeclaration, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        computeContainingDeclaration = (i17 & 4) != 0 ? n06.f.f415510d : computeContainingDeclaration;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleDescriptor, "moduleDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f415518a = moduleDescriptor;
        this.f415519b = computeContainingDeclaration;
        this.f415520c = ((e26.u) storageManager).b(new n06.h(this, storageManager));
    }

    @Override // q06.c
    public boolean a(n16.c packageFqName, n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFqName, "packageFqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, f415516g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(packageFqName, f415515f);
    }

    @Override // q06.c
    public java.util.Collection b(n16.c packageFqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFqName, "packageFqName");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(packageFqName, f415515f) ? kz5.o1.c((r06.t) e26.b0.a(this.f415520c, this, f415514e[0])) : kz5.r0.f395535d;
    }

    @Override // q06.c
    public o06.g c(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(classId, f415517h)) {
            return (r06.t) e26.b0.a(this.f415520c, this, f415514e[0]);
        }
        return null;
    }
}
