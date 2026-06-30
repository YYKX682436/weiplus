package yo2;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final yo2.b f545667d = new yo2.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        xs5.c cVar = xs5.c.f537949a;
        if (intValue == 0) {
            xs5.c.g(cVar, xs5.b.f537945e, true, true, false, 8, null);
        } else if (intValue == 1) {
            xs5.c.g(cVar, xs5.b.f537945e, true, false, false, 8, null);
        } else if (intValue == 2) {
            xs5.c.g(cVar, xs5.b.f537945e, false, false, false, 8, null);
        } else if (intValue == 3) {
            xs5.c.g(cVar, xs5.b.f537945e, false, true, false, 8, null);
        } else if (intValue == 4) {
            cVar.f(xs5.b.f537945e, true, false, true);
        } else if (intValue == 5) {
            cVar.f(xs5.b.f537945e, true, true, true);
        }
        return jz5.f0.f384359a;
    }
}
