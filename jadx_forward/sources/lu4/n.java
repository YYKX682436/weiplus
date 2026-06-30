package lu4;

/* loaded from: classes7.dex */
public final class n implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lu4.q f402977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402978b;

    public n(lu4.q qVar, java.lang.String str) {
        this.f402977a = qVar;
        this.f402978b = str;
    }

    @Override // nw4.e
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        lu4.q qVar = this.f402977a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f402964c, "invoke callback: " + str2 + ", " + this.f402978b + ", " + a17);
        lu4.c cVar = (lu4.c) qVar.f402963b;
        java.lang.String str3 = this.f402978b;
        java.lang.String gVar = new cl0.g(a17).a("__params").toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        lu4.c.u(cVar, str3, gVar, null, 4, null);
    }
}
