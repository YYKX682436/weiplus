package fk4;

/* loaded from: classes4.dex */
public final class n implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345176d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f345177e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345178f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f345179g;

    /* renamed from: h, reason: collision with root package name */
    public final long f345180h;

    public n(java.lang.String url, java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f345176d = url;
        this.f345177e = filePath;
        this.f345178f = str;
        this.f345179g = str2;
        this.f345180h = fk4.d.f345130a.f();
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str = this.f345176d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = this.f345177e;
        }
        return str + '_' + this.f345180h + '_' + hashCode();
    }
}
