package f26;

/* loaded from: classes16.dex */
public final class l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final f26.k1 f340723e = new f26.k1(null);

    /* renamed from: a, reason: collision with root package name */
    public final f26.l1 f340724a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.d2 f340725b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f340726c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f340727d;

    public l1(f26.l1 l1Var, o06.d2 d2Var, java.util.List list, java.util.Map map, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f340724a = l1Var;
        this.f340725b = d2Var;
        this.f340726c = list;
        this.f340727d = map;
    }

    public final boolean a(o06.d2 descriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340725b, descriptor)) {
            f26.l1 l1Var = this.f340724a;
            if (!(l1Var != null ? l1Var.a(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }
}
