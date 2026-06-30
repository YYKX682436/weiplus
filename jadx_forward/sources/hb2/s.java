package hb2;

/* loaded from: classes2.dex */
public final class s extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.s f361621e = new hb2.s();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361622f = "Finder.FinderModProfileStickySetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.mi2 cmdBufItem = (r45.mi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 12;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361622f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.mi2 cmdBufItem = (r45.mi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361622f, "retcode:" + m75939xb282bd08);
        if (m75939xb282bd08 == 0) {
            int e17 = cmdBufItem.m75939xb282bd08(1) == 0 ? c01.id.e() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(cmdBufItem.m75942xfb822ef2(0));
            if (h17 != null) {
                h17.m59425xd630e258(e17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593();
            c5444xabe18593.f135784g.f88361a = 1000;
            cmdBufItem.m75942xfb822ef2(0);
            c5444xabe18593.e();
        }
    }
}
