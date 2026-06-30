package hb2;

/* loaded from: classes.dex */
public final class x0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.x0 f361645e = new hb2.x0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361646f = "Finder.FinderSwitchAccountSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.gy2 cmdBufItem = (r45.gy2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 21;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361646f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.gy2 cmdBufItem = (r45.gy2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361646f, "[handleUpdateResult], retCode:" + cmdRef.m75939xb282bd08(1) + ", username: " + cmdBufItem.m75945x2fec8307(0));
    }
}
