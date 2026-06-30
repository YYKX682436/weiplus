package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class es {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f285464a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285465b;

    /* renamed from: c, reason: collision with root package name */
    public final int f285466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f285467d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f285468e;

    /* renamed from: f, reason: collision with root package name */
    public final yb5.d f285469f;

    public es(java.lang.String weapp_usename, java.lang.String weapp_path, int i17, int i18, java.lang.String templateId, yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weapp_usename, "weapp_usename");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weapp_path, "weapp_path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        this.f285464a = weapp_usename;
        this.f285465b = weapp_path;
        this.f285466c = i17;
        this.f285467d = i18;
        this.f285468e = templateId;
        this.f285469f = ui6;
    }

    /* renamed from: equals */
    public boolean m80041xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es esVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285464a, esVar.f285464a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285465b, esVar.f285465b) && this.f285466c == esVar.f285466c && this.f285467d == esVar.f285467d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285468e, esVar.f285468e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285469f, esVar.f285469f);
    }

    /* renamed from: hashCode */
    public int m80042x8cdac1b() {
        return (((((((((this.f285464a.hashCode() * 31) + this.f285465b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f285466c)) * 31) + java.lang.Integer.hashCode(this.f285467d)) * 31) + this.f285468e.hashCode()) * 31) + this.f285469f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m80043x9616526c() {
        return "TemplateWeappWrap(weapp_usename=" + this.f285464a + ", weapp_path=" + this.f285465b + ", weapp_state=" + this.f285466c + ", weapp_version=" + this.f285467d + ", templateId=" + this.f285468e + ", ui=" + this.f285469f + ')';
    }
}
