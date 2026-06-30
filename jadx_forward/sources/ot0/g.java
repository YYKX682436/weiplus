package ot0;

/* loaded from: classes9.dex */
public final class g extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f430008b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f430009c = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.g gVar = new ot0.g();
        gVar.f430008b = this.f430008b;
        gVar.f430009c = this.f430009c;
        return gVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        int i19 = this.f430008b;
        sb6.append("<mpsharetrace>");
        sb6.append("<hasfinderelement>");
        sb6.append(i19);
        sb6.append("</hasfinderelement>");
        sb6.append("<lastgmsgid>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430009c));
        sb6.append("</lastgmsgid>");
        sb6.append("</mpsharetrace>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f430008b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) values.get(".msg.appmsg.mpsharetrace.hasfinderelement"), 0);
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.mpsharetrace.lastgmsgid");
        if (str == null) {
            str = "";
        }
        this.f430009c = str;
    }
}
