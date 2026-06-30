package zs1;

/* loaded from: classes7.dex */
public final class e extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts1.o f556772c;

    public e(java.lang.String str, java.lang.String str2, ts1.o oVar) {
        this.f556770a = str;
        this.f556771b = str2;
        this.f556772c = oVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1305x90a29f38.p1306x5b09653.b.c(headers, "fetchRes");
        if (i17 != 200) {
            return false;
        }
        ts1.o oVar = this.f556772c;
        oVar.l().putAll(headers);
        oVar.l().put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f(headers);
        if (f17 == com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175758m) {
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175753e;
        }
        oVar.z(f17, this.f556770a);
        return true;
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        java.lang.String str = this.f556770a;
        if (str.length() > 0) {
            java.lang.String str2 = this.f556771b;
            if (str2.length() > 0) {
                connection.h(ya.b.f77495x8b74a326, r26.i0.y(str2, "https", false) ? "https://".concat(str) : "http://".concat(str));
                connection.h("referer", str2);
            }
        }
    }
}
