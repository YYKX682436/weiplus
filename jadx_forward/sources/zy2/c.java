package zy2;

/* loaded from: classes9.dex */
public final class c extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.g92 f558892b = new r45.g92();

    @Override // ot0.h
    public ot0.h a() {
        zy2.c cVar = new zy2.c();
        cVar.f558892b = this.f558892b;
        return cVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append(zy2.d5.c(this.f558892b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f558892b = zy2.d5.l(".msg.appmsg", values);
    }

    public final r45.g92 f() {
        return this.f558892b;
    }
}
