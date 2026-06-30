package hb2;

/* loaded from: classes8.dex */
public final class l extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.l f361599e = new hb2.l();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361600f = "Finder.FinderModOverSeaAgree";

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
        return 15;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361600f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361600f, "retcode:" + m75939xb282bd08);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cmdBufItem, "") && m75939xb282bd08 == 0) {
            g92.b bVar = g92.b.f351302e;
            r45.k67 k67Var = (r45.k67) bVar.k2().d().m75936x14adae67(7);
            if (k67Var == null) {
                k67Var = new r45.k67();
            }
            k67Var.set(0, 0);
            m92.f fVar = new m92.f();
            fVar.d().set(7, k67Var);
            bVar.S1(fVar, m92.j.f406539x);
        }
    }
}
