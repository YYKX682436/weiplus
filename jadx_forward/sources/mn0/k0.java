package mn0;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f411297a = jz5.h.b(mn0.j0.f411295d);

    /* renamed from: b, reason: collision with root package name */
    public long f411298b;

    /* renamed from: c, reason: collision with root package name */
    public long f411299c;

    /* renamed from: d, reason: collision with root package name */
    public long f411300d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f411301e;

    public final void a(java.lang.String step, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(step, "step");
        b().add(new jz5.l(step, java.lang.Long.valueOf(j17)));
    }

    public final java.util.ArrayList b() {
        return (java.util.ArrayList) ((jz5.n) this.f411297a).mo141623x754a37bb();
    }

    /* renamed from: toString */
    public java.lang.String m148064x9616526c() {
        if (b().isEmpty()) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PlayStep:");
        for (jz5.l lVar : b()) {
            sb6.append("(" + ((java.lang.String) lVar.f384366d) + ',' + ((java.lang.Number) lVar.f384367e).longValue() + ')');
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
