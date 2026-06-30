package hb2;

/* loaded from: classes8.dex */
public final class j extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.j f361592e = new hb2.j();

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.yh2 cmdBufItem = (r45.yh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 19;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return "Finder.FinderModMessageRedDot";
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.yh2 cmdBufItem = (r45.yh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModMessageRedDot", "handleUpdateResult cmdBufItem retCode:" + m75939xb282bd08 + " username:" + username + " status:" + cmdBufItem.m75942xfb822ef2(0) + " switch:" + cmdBufItem.m75939xb282bd08(1));
        if (m75939xb282bd08 == -1 || (b17 = (gVar = ya2.h.f542017a).b(username)) == null) {
            return;
        }
        b17.f69327x1c739054 = cmdBufItem.m75939xb282bd08(1) == 0 ? b17.f69327x1c739054 & (~cmdBufItem.m75942xfb822ef2(0)) : b17.f69327x1c739054 | cmdBufItem.m75942xfb822ef2(0);
        f361592e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModMessageRedDot", "handleUpdateResult field_messageStatus" + b17.f69327x1c739054);
        gVar.o(b17);
    }
}
