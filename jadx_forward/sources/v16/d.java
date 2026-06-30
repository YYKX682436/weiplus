package v16;

/* loaded from: classes15.dex */
public final class d extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f514131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f514132b;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar) {
        this.f514131a = h0Var;
        this.f514132b = lVar;
    }

    @Override // o26.e
    public java.lang.Object a() {
        return (o06.d) this.f514131a.f391656d;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.d current = (o06.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        return this.f514131a.f391656d == null;
    }

    @Override // o26.c, o26.e
    public void c(java.lang.Object obj) {
        o06.d current = (o06.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f514131a;
        if (h0Var.f391656d == null && ((java.lang.Boolean) this.f514132b.mo146xb9724478(current)).booleanValue()) {
            h0Var.f391656d = current;
        }
    }
}
