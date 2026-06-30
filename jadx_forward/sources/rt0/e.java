package rt0;

/* loaded from: classes9.dex */
public final class e extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f480910b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f480911c;

    /* renamed from: d, reason: collision with root package name */
    public int f480912d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480913e;

    @Override // ot0.h
    public ot0.h a() {
        rt0.e eVar = new rt0.e();
        eVar.f480910b = this.f480910b;
        eVar.f480911c = this.f480911c;
        eVar.f480912d = this.f480912d;
        return eVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (this.f480910b != null && sb6 != null) {
            sb6.append("<teenagerModeGuardianTicket>" + this.f480910b + "</teenagerModeGuardianTicket>");
        }
        if (this.f480912d > 0) {
            if (sb6 != null) {
                sb6.append("<teenagerModeTempAccessBizType>" + this.f480912d + "</teenagerModeTempAccessBizType>");
            }
            if (sb6 != null) {
                sb6.append("<teenagerModeTempAccessBizKey>" + this.f480911c + "</teenagerModeTempAccessBizKey>");
            }
            if (sb6 != null) {
                sb6.append("<refermsg>" + this.f480913e + "</refermsg>");
            }
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str;
        this.f480910b = map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeGuardianTicket") : null;
        this.f480912d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeTempAccessBizType") : null, 0);
        this.f480911c = map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeTempAccessBizKey") : null;
        java.lang.String str2 = qVar != null ? qVar.H2 : null;
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            str = str2.substring(r26.n0.L(str2, "<refermsg>", 0, false, 4, null) + 10, r26.n0.P(str2, "</refermsg>", 0, false, 6, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        this.f480913e = str;
    }
}
