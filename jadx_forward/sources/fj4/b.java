package fj4;

/* loaded from: classes11.dex */
public abstract class b {
    public static final mj4.h a(pj4.n1 n1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n1Var, "<this>");
        mj4.j jVar = new mj4.j(new mj4.k(new mj4.a()));
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        jVar.h(a17);
        java.lang.String text_status_id = n1Var.f436732d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text_status_id, "text_status_id");
        jVar.g(text_status_id);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f436737i);
        java.util.HashMap hashMap = jVar.f408599b;
        hashMap.put("field_referenceCount", valueOf);
        jVar.b(n1Var.f436735g);
        hashMap.put("field_CommentCount", java.lang.Integer.valueOf(n1Var.f436739n));
        java.lang.String str = n1Var.f436740o;
        if (!(str == null || str.length() == 0)) {
            jVar.d(android.util.Base64.decode(n1Var.f436740o, 0));
        }
        pj4.b0 b0Var = new pj4.b0();
        try {
            b0Var.mo11468x92b714fd(android.util.Base64.decode(n1Var.f436734f, 0));
            return ((mj4.j) ni4.x.f419309d.f(jVar, b0Var)).a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("TextStatusHistory", th6, "parse TextStatusHistory err id" + n1Var.f436732d, new java.lang.Object[0]);
            return jVar.a();
        }
    }
}
