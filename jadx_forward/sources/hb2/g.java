package hb2;

/* loaded from: classes2.dex */
public final class g extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.g f361577e = new hb2.g();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361578f = "Finder.FinderModHelpPromotion";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.bi2 cmdBufItem = (r45.bi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 36;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361578f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.bi2 cmdBufItem = (r45.bi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361578f, "retCode:" + cmdRef.m75939xb282bd08(1));
    }
}
