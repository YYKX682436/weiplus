package hb2;

/* loaded from: classes8.dex */
public final class b extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.b f361556e = new hb2.b();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361557f = "Finder.FinderAgreeSavePhone";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        byte[] bytes = cmdBufItem.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
    }

    @Override // hb2.w0
    public int i() {
        return 17;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361557f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cmdBufItem, "") && m75939xb282bd08 == 0) {
            g92.b bVar = g92.b.f351302e;
            m92.f fVar = new m92.f();
            r45.ob4 e17 = fVar.e();
            int m75939xb282bd082 = fVar.e().m75939xb282bd08(17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            e17.set(17, java.lang.Integer.valueOf(m75939xb282bd082 | 8));
            bVar.S1(fVar, m92.j.f406536u);
        }
    }
}
