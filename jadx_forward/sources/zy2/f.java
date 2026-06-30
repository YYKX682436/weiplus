package zy2;

/* loaded from: classes4.dex */
public final class f extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.dv2 f558915b = new r45.dv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.f fVar = new zy2.f();
        fVar.f558915b = this.f558915b;
        return fVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append(zy2.d5.d(this.f558915b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f558915b = zy2.d5.k(".msg.appmsg", values);
    }

    public final r45.dv2 f() {
        return this.f558915b;
    }
}
