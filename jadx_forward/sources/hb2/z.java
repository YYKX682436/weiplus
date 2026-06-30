package hb2;

/* loaded from: classes10.dex */
public final class z extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.z f361651e = new hb2.z();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361652f = "Finder.FinderModifyCommentService";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.nh2 modComment = (r45.nh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modComment, "modComment");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(modComment.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 26;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361652f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        int i17;
        r45.nh2 cmdBufItem = (r45.nh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361652f, "retCode %d", java.lang.Integer.valueOf(m75939xb282bd08));
        if (m75939xb282bd08 != 0) {
            android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            ll6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwg);
            return;
        }
        if ((cmdBufItem.m75939xb282bd08(0) == 1 || cmdBufItem.m75939xb282bd08(0) == 2) && (h17 = bu2.j.f106067a.h(cmdBufItem.m75942xfb822ef2(1))) != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : h17.m59217x57341267()) {
                if (cmdBufItem.m75939xb282bd08(0) == 2 && c19781xd1c47b87.m76058xa6514d24() == cmdBufItem.m75942xfb822ef2(2)) {
                    c19781xd1c47b87.m76119xd664158c(c19781xd1c47b87.m76068x3ffea218() & (-257));
                }
                if (cmdBufItem.m75939xb282bd08(0) == 1) {
                    if (c19781xd1c47b87.m76058xa6514d24() == cmdBufItem.m75942xfb822ef2(2)) {
                        c19781xd1c47b87.m76119xd664158c(c19781xd1c47b87.m76068x3ffea218() | 256);
                    } else {
                        c19781xd1c47b87.m76119xd664158c(c19781xd1c47b87.m76068x3ffea218() & (-257));
                    }
                }
            }
            bu2.j.f106067a.n(h17, bu2.i.f106063k);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l Ij = ((c61.l7) i95.n0.c(c61.l7.class)).Ij();
        long m75942xfb822ef2 = cmdBufItem.m75942xfb822ef2(1);
        long m75942xfb822ef22 = cmdBufItem.m75942xfb822ef2(2);
        int m75939xb282bd082 = cmdBufItem.m75939xb282bd08(0);
        if (m75939xb282bd082 == 1) {
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.T;
        } else if (m75939xb282bd082 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("modOpTypeToActionType", "Unhandled opType: " + m75939xb282bd082);
            i17 = -1;
        } else {
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.U;
        }
        Ij.D0(m75942xfb822ef2, m75942xfb822ef22, -1L, i17, null);
    }
}
