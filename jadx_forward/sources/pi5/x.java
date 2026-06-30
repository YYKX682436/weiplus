package pi5;

/* loaded from: classes.dex */
public final class x implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f436427d;

    public x(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f436427d = h0Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f436427d;
        java.lang.String str3 = (java.lang.String) ((java.util.HashMap) h0Var.f391656d).get(str);
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) h0Var.f391656d).get(str2);
        if (!(str3 == null || r26.n0.N(str3))) {
            str = str3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        char A0 = r26.p0.A0(str);
        if (!(str4 == null || r26.n0.N(str4))) {
            str2 = str4;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(A0, r26.p0.A0(str2));
    }
}
