package hb2;

/* loaded from: classes.dex */
public final class k extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.k f361595e = new hb2.k();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361596f = "Finder.FinderModMessageSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.ii2 cmdBufItem = (r45.ii2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 8;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361596f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ii2 cmdBufItem = (r45.ii2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361596f, "opType=" + cmdBufItem.m75939xb282bd08(0) + " retcode:" + m75939xb282bd08);
        if (m75939xb282bd08 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1473L, 10L, 1L);
        }
    }
}
