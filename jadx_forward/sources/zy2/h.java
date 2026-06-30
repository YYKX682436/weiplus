package zy2;

/* loaded from: classes9.dex */
public final class h extends ot0.h {

    /* renamed from: g, reason: collision with root package name */
    public int f558929g;

    /* renamed from: j, reason: collision with root package name */
    public int f558932j;

    /* renamed from: b, reason: collision with root package name */
    public r45.jv2 f558924b = new r45.jv2();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f558925c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f558926d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f558927e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f558928f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f558930h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f558931i = "";

    @Override // ot0.h
    public ot0.h a() {
        zy2.h hVar = new zy2.h();
        hVar.m(this.f558925c);
        hVar.j(this.f558926d);
        hVar.l(this.f558927e);
        hVar.i(this.f558928f);
        hVar.h(this.f558929g);
        hVar.f558930h = this.f558930h;
        hVar.f558924b = this.f558924b;
        hVar.k(this.f558932j);
        return hVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append("<findernamecard>");
        sb6.append("<username>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f558925c));
        sb6.append("</username>");
        sb6.append("<avatar>");
        sb6.append(ot0.q.g(this.f558926d));
        sb6.append("</avatar>");
        sb6.append("<nickname>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f558927e));
        sb6.append("</nickname>");
        int i19 = this.f558932j;
        if (i19 == 0) {
            sb6.append("<auth_job>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f558928f));
            sb6.append("</auth_job>");
            sb6.append("<auth_icon>");
            sb6.append(this.f558929g);
            sb6.append("</auth_icon>");
            sb6.append("<auth_icon_url>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f558930h));
            sb6.append("</auth_icon_url>");
        } else if (i19 == 1) {
            sb6.append("<content_type>");
            sb6.append(this.f558932j);
            sb6.append("</content_type>");
        }
        sb6.append("<ecSource>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(this.f558931i));
        sb6.append("</ecSource>");
        sb6.append("<lastGMsgID>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(this.f558924b.m75945x2fec8307(7)));
        sb6.append("</lastGMsgID>");
        sb6.append("</findernamecard>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.findernamecard.username");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        m(str);
        java.lang.String str2 = (java.lang.String) values.get(".msg.appmsg.findernamecard.avatar");
        if (str2 == null) {
            str2 = "";
        }
        j(str2);
        java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.findernamecard.nickname");
        if (str3 == null) {
            str3 = "";
        }
        l(str3);
        java.lang.String str4 = (java.lang.String) values.get(".msg.appmsg.findernamecard.auth_job");
        if (str4 == null) {
            str4 = "";
        }
        i(str4);
        h(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".msg.appmsg.findernamecard.auth_icon"), 0));
        java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.findernamecard.auth_icon_url");
        if (str5 == null) {
            str5 = "";
        }
        this.f558930h = str5;
        java.lang.String str6 = (java.lang.String) values.get(".msg.appmsg.findernamecard.ecSource");
        if (str6 == null) {
            str6 = "";
        }
        this.f558931i = str6;
        k(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".msg.appmsg.findernamecard.content_type"), 0));
        this.f558924b.set(0, this.f558925c);
        this.f558924b.set(2, this.f558926d);
        this.f558924b.set(1, this.f558927e);
        this.f558924b.set(3, this.f558928f);
        this.f558924b.set(4, java.lang.Integer.valueOf(this.f558929g));
        this.f558924b.set(6, this.f558931i);
        r45.jv2 jv2Var = this.f558924b;
        java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.findernamecard.lastGMsgID");
        jv2Var.set(7, str7 != null ? str7 : "");
    }

    public final java.lang.String f() {
        return this.f558927e;
    }

    public final r45.jv2 g() {
        return this.f558924b;
    }

    public final void h(int i17) {
        this.f558924b.set(4, java.lang.Integer.valueOf(i17));
        this.f558929g = i17;
    }

    public final void i(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f558924b.set(3, value);
        this.f558928f = value;
    }

    public final void j(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f558924b.set(2, value);
        this.f558926d = value;
    }

    public final void k(int i17) {
        this.f558924b.set(8, java.lang.Integer.valueOf(i17));
        this.f558932j = i17;
    }

    public final void l(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f558924b.set(1, value);
        this.f558927e = value;
    }

    public final void m(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f558924b.set(0, value);
        this.f558925c = value;
    }
}
