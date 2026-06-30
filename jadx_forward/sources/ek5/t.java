package ek5;

/* loaded from: classes.dex */
public final class t extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        jd5.a aVar = new jd5.a();
        param.a(aVar);
        java.lang.String stringExtra = intent.getStringExtra("Retr_File_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.p(stringExtra);
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return k50.s.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.h.class;
    }

    @Override // ek5.b
    public int g() {
        return 3;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return jd5.a.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.c0.i(0, 16);
    }
}
