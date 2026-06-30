package fj1;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f344672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fj1.y yVar) {
        super(0);
        this.f344672d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fj1.y yVar = this.f344672d;
        fj1.t tVar = yVar.f344685l;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgReader");
            throw null;
        }
        java.io.InputStream i17 = tVar.f344671b.i("/app-config.json");
        java.lang.String d17 = i17 != null ? s46.d.d(i17, java.nio.charset.StandardCharsets.UTF_8) : null;
        boolean z17 = true;
        if (d17 == null || d17.length() == 0) {
            java.lang.String str = yVar.f344676c.f165779h;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                if (!r26.i0.o(str, "/", false, 2, null)) {
                    str = str.concat("/");
                }
                fj1.t tVar2 = yVar.f344685l;
                if (tVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgReader");
                    throw null;
                }
                java.io.InputStream i18 = tVar2.f344671b.i(str + "app-config.json");
                d17 = i18 != null ? s46.d.d(i18, java.nio.charset.StandardCharsets.UTF_8) : null;
            }
        }
        java.lang.String str2 = yVar.f344679f;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = yVar.c();
        nf.y yVar2 = nf.x.f418149b;
        return k91.r.h(str2, d17, "", false, yVar2 != null ? yVar2.i(c17) : false);
    }
}
