package zy2;

/* loaded from: classes4.dex */
public final class i extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.kv2 f558944b = new r45.kv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.i iVar = new zy2.i();
        iVar.f558944b = this.f558944b;
        return iVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append(zy2.d5.f(this.f558944b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f558944b = zy2.d5.j(".msg.appmsg", values);
    }

    public final java.lang.String f() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072 = this.f558944b.m75945x2fec8307(16);
        if ((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", this.f558944b.m75945x2fec8307(16))) {
            m75945x2fec8307 = this.f558944b.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                return "";
            }
        } else {
            m75945x2fec8307 = this.f558944b.m75945x2fec8307(16);
            if (m75945x2fec8307 == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    public final java.lang.String g() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072 = this.f558944b.m75945x2fec8307(15);
        if ((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", this.f558944b.m75945x2fec8307(15))) {
            m75945x2fec8307 = this.f558944b.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                return "";
            }
        } else {
            m75945x2fec8307 = this.f558944b.m75945x2fec8307(15);
            if (m75945x2fec8307 == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    public final r45.kv2 h() {
        return this.f558944b;
    }
}
