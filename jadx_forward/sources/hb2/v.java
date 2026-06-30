package hb2;

/* loaded from: classes.dex */
public final class v extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.v f361635e = new hb2.v();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361636f = "FinderModTeenagerSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.qn2 cmdBufItem = (r45.qn2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 25;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361636f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.qn2 cmdBufItem = (r45.qn2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdateResult: ret=");
        sb6.append(cmdRef.m75939xb282bd08(1));
        sb6.append(", flag=");
        long m75942xfb822ef2 = cmdBufItem.m75942xfb822ef2(2);
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(m75942xfb822ef2, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", birth_year=");
        sb6.append(cmdBufItem.m75939xb282bd08(0));
        sb6.append(", birth_month=");
        sb6.append(cmdBufItem.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361636f, sb6.toString());
    }
}
