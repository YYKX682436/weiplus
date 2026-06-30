package c82;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final c82.e f39668a = new c82.e();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f39669b = jz5.h.b(c82.b.f39665d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f39670c = jz5.h.b(c82.c.f39666d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f39671d = jz5.h.b(c82.a.f39664d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f39672e = jz5.h.b(c82.d.f39667d);

    public static final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f39669b).getValue()).booleanValue();
    }

    public l75.k0 a() {
        if (((java.lang.Boolean) ((jz5.n) f39669b).getValue()).booleanValue()) {
            return c();
        }
        jz5.g gVar = f39671d;
        if (((dm.od) ((jz5.n) gVar).getValue()).isOpen()) {
            return (dm.od) ((jz5.n) gVar).getValue();
        }
        return null;
    }

    public final com.tencent.wcdb.core.Database b() {
        return (com.tencent.wcdb.core.Database) ((jz5.n) f39670c).getValue();
    }

    public final d95.z c() {
        return (d95.z) ((jz5.n) f39672e).getValue();
    }
}
