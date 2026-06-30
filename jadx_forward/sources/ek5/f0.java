package ek5;

/* loaded from: classes.dex */
public final class f0 extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        ne5.a aVar = new ne5.a();
        param.a(aVar);
        aVar.n(param.d());
        aVar.l(intent.getBooleanExtra("Retr_Is_Partial_Text_Select", false));
        intent.getStringExtra("weAppSourceUserName");
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return k50.c0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.o0.class;
    }

    @Override // ek5.b
    public int g() {
        return 1;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return ne5.a.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.c0.i(53, 57, 1);
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(4);
    }
}
