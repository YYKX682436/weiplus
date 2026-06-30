package zy2;

/* loaded from: classes9.dex */
public final class g extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.ev2 f558916b = new r45.ev2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.g gVar = new zy2.g();
        gVar.f558916b = this.f558916b;
        return gVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append(zy2.d5.e(this.f558916b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f558916b = zy2.d5.n(".msg.appmsg", values);
    }

    public final r45.ev2 f() {
        return this.f558916b;
    }
}
