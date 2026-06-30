package n06;

/* loaded from: classes15.dex */
public final class y extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f415549b;

    public y(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f415548a = str;
        this.f415549b = h0Var;
    }

    @Override // o26.e
    public java.lang.Object a() {
        n06.r rVar = (n06.r) this.f415549b.f391656d;
        return rVar == null ? n06.r.f415538g : rVar;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.g javaClassDescriptor = (o06.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaClassDescriptor, "javaClassDescriptor");
        java.lang.String a17 = g16.v0.a(g16.a1.f349124a, javaClassDescriptor, this.f415548a);
        boolean contains = n06.e0.f415504c.contains(a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f415549b;
        if (contains) {
            h0Var.f391656d = n06.r.f415535d;
        } else if (n06.e0.f415506e.contains(a17)) {
            h0Var.f391656d = n06.r.f415536e;
        } else if (n06.e0.f415505d.contains(a17)) {
            h0Var.f391656d = n06.r.f415537f;
        } else if (n06.e0.f415503b.contains(a17)) {
            h0Var.f391656d = n06.r.f415539h;
        }
        return h0Var.f391656d == null;
    }
}
