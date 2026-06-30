package hb2;

/* loaded from: classes10.dex */
public final class y extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.y f361647e = new hb2.y();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361648f = "Finder.FinderModifyBlackListService";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.kh2 cmdBufItem = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 3;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361648f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.kh2 cmdBufItem = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        if (cmdBufItem.m75942xfb822ef2(2) == 0 || cmdBufItem.m75939xb282bd08(0) != 1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361648f, "handle BlackListOpAdd:id:" + cmdBufItem.m75942xfb822ef2(1));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1();
        long m75942xfb822ef2 = cmdBufItem.m75942xfb822ef2(1);
        am.ta taVar = c5457xd6bc6fd1.f135796g;
        taVar.f89526a = m75942xfb822ef2;
        taVar.f89527b = cmdBufItem.m75942xfb822ef2(2);
        taVar.f89528c = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.V;
        c5457xd6bc6fd1.e();
    }

    public void n(long j17, long j18, java.lang.String feedNonceId, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedNonceId, "feedNonceId");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(7, java.lang.Long.valueOf(j17));
        kh2Var.set(1, java.lang.Long.valueOf(j18));
        kh2Var.set(5, feedNonceId);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void o(long j17, long j18, java.lang.String feedNonceId, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedNonceId, "feedNonceId");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(2, java.lang.Long.valueOf(j17));
        kh2Var.set(1, java.lang.Long.valueOf(j18));
        kh2Var.set(5, feedNonceId);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void q(java.lang.String username, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(3, username);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void r(java.lang.String username, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(3, username);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void s(com.p314xaae8f345.mm.p2495xc50a8b8b.g bytes, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        r45.kh2 kh2Var = new r45.kh2();
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        kh2Var.set(9, bytes);
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }
}
