package ui1;

/* loaded from: classes7.dex */
public class h implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.t f509589c;

    public h(ui1.t tVar, java.lang.String str, java.lang.String str2) {
        this.f509589c = tVar;
        this.f509587a = str;
        this.f509588b = str2;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        ui1.t.f509615d.f(this.f509587a, this.f509588b);
        ui1.r rVar = this.f509589c.f509616a;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = obj == null ? "" : obj.toString();
        rVar.b(java.lang.String.format(locale, "cgi failed %s", objArr));
    }
}
