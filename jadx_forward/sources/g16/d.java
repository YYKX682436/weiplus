package g16;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.g f349134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f349135b;

    public d(g16.g gVar, java.util.HashMap hashMap, g16.q0 q0Var, java.util.HashMap hashMap2, java.util.HashMap hashMap3) {
        this.f349134a = gVar;
        this.f349135b = hashMap;
    }

    public g16.p0 a(n16.g name, java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        java.lang.String h17 = name.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        return new g16.b(this, new g16.u0(h17.concat(desc), null));
    }
}
