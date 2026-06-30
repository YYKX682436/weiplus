package ib;

/* loaded from: classes15.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f371554a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f371555b;

    /* renamed from: c, reason: collision with root package name */
    public final int f371556c;

    public a() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof java.lang.Class)) {
            java.lang.reflect.Type a17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f371555b = a17;
            this.f371554a = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.e(a17);
            this.f371556c = a17.hashCode();
            return;
        }
        throw new java.lang.RuntimeException("Missing type parameter.");
    }

    /* renamed from: equals */
    public final boolean m135003xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof ib.a) {
            if (com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.c(this.f371555b, ((ib.a) obj).f371555b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m135004x8cdac1b() {
        return this.f371556c;
    }

    /* renamed from: toString */
    public final java.lang.String m135005x9616526c() {
        return com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(this.f371555b);
    }

    public a(java.lang.reflect.Type type) {
        type.getClass();
        java.lang.reflect.Type a17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(type);
        this.f371555b = a17;
        this.f371554a = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.e(a17);
        this.f371556c = a17.hashCode();
    }
}
