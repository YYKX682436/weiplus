package zj4;

/* loaded from: classes11.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zj4.e f554871a;

    public a(zj4.e eVar) {
        this.f554871a = eVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page_out");
        zj4.e eVar = this.f554871a;
        if (b17) {
            linkedHashMap.put("status_page_exit_type", java.lang.Integer.valueOf(eVar.f554876e.f445459d));
        }
        bi4.d1 P6 = eVar.P6();
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str2 = P6 != null ? P6.G : null;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("status_clipostid", str2);
        java.lang.String str3 = P6 != null ? P6.f436474h : null;
        lVarArr[1] = new jz5.l("status_sessionid", str3 != null ? str3 : "");
        java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), linkedHashMap);
        java.lang.String str4 = eVar.f554875d;
        m17.toString();
        return m17;
    }
}
