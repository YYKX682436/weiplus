package u06;

/* loaded from: classes16.dex */
public final class i0 extends u06.k0 implements e16.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f505041a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f505042b;

    public i0(java.lang.Class reflectType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reflectType, "reflectType");
        this.f505041a = reflectType;
        this.f505042b = kz5.p0.f395529d;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f505041a;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        return this.f505042b;
    }
}
