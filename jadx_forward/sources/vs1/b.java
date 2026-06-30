package vs1;

/* loaded from: classes7.dex */
public final class b extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ us1.b f521394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ us1.a f521395b;

    public b(us1.b bVar, us1.a aVar) {
        this.f521394a = bVar;
        this.f521395b = aVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        us1.b bVar = this.f521394a;
        bVar.f511994b.l().putAll(headers);
        boolean c17 = vs1.d.f521398a.c(bVar.f511993a, bVar.f511994b, bVar.f511995c, i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h2) this.f521395b).a(c17, i17, headers);
        return c17;
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        java.util.Map map = this.f521394a.f511996d;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (((java.lang.CharSequence) entry.getKey()).length() > 0) {
                    entry.getKey();
                    entry.getValue();
                    connection.h((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
        }
    }
}
