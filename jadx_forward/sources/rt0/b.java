package rt0;

/* loaded from: classes9.dex */
public final class b extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public long f480905b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f480906c = "";

    @Override // ot0.h
    public ot0.h a() {
        rt0.b bVar = new rt0.b();
        bVar.f480905b = this.f480905b;
        bVar.f480906c = this.f480906c;
        return bVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(content.f430199i))) {
            this.f480905b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) values.get(".msg.appmsg.appattach.overwrite_newmsgid"), 0L);
            java.lang.String str = (java.lang.String) values.get(".msg.appmsg.appattach.fileuploadtoken");
            if (str == null) {
                str = "";
            }
            this.f480906c = str;
        }
    }

    public final java.lang.String f() {
        return this.f480906c;
    }

    public final long g() {
        return this.f480905b;
    }
}
