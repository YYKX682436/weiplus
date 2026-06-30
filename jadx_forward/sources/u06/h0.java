package u06;

/* loaded from: classes16.dex */
public final class h0 extends u06.b0 implements e16.r {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f505037a;

    public h0(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        this.f505037a = fqName;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return null;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    /* renamed from: equals */
    public boolean m167309xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u06.h0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505037a, ((u06.h0) obj).f505037a)) {
                return true;
            }
        }
        return false;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public /* bridge */ /* synthetic */ java.util.Collection mo126781xa083c1ee() {
        return kz5.p0.f395529d;
    }

    /* renamed from: hashCode */
    public int m167310x8cdac1b() {
        return this.f505037a.m148885x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m167311x9616526c() {
        return u06.h0.class.getName() + ": " + this.f505037a;
    }
}
