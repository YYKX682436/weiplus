package wr;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f530261a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f530262b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f530263c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f530264d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f530265e;

    public b(java.lang.String md52, java.lang.String url, java.lang.String aesKey, java.lang.String savingPath, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savingPath, "savingPath");
        this.f530261a = md52;
        this.f530262b = url;
        this.f530263c = aesKey;
        this.f530264d = savingPath;
        this.f530265e = pVar;
    }

    public final void a() {
        yz5.p pVar = this.f530265e;
        if (pVar != null) {
            pVar.mo149xb9724478(b(), java.lang.Boolean.FALSE);
        }
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f530261a);
        sb6.append('_');
        byte[] bytes = this.f530262b.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(uk.k.d(bytes));
        return sb6.toString();
    }
}
