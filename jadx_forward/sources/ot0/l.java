package ot0;

/* loaded from: classes9.dex */
public final class l extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f430100b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f430101c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430102d;

    @Override // ot0.h
    public ot0.h a() {
        ot0.l lVar = new ot0.l();
        lVar.f430100b = this.f430100b;
        lVar.f430101c = this.f430101c;
        lVar.f430102d = this.f430102d;
        return lVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q content, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String str2 = this.f430102d;
        if (!(str2 == null || r26.n0.N(str2))) {
            sb6.append("<platform_signature>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430102d));
            sb6.append("</platform_signature>");
        }
        java.lang.String str3 = this.f430100b;
        if (!(str3 == null || r26.n0.N(str3))) {
            sb6.append("<thumbdatahash>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430100b));
            sb6.append("</thumbdatahash>");
        }
        java.lang.String str4 = this.f430101c;
        if (str4 == null || r26.n0.N(str4)) {
            return;
        }
        sb6.append("<hdalbumthumbfilehash>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f430101c));
        sb6.append("</hdalbumthumbfilehash>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f430102d = (java.lang.String) values.get(".msg.appmsg.platform_signature");
        this.f430100b = (java.lang.String) values.get(".msg.appmsg.thumbdatahash");
        this.f430101c = (java.lang.String) values.get(".msg.appmsg.hdalbumthumbfilehash");
    }
}
