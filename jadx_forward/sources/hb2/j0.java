package hb2;

/* loaded from: classes.dex */
public final class j0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.j0 f361593e = new hb2.j0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361594f = "Finder.FinderModifyMentionSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.hi2 cmdBufItem = (r45.hi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 33;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361594f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.hi2 cmdBufItem = (r45.hi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        cmdRef.m75939xb282bd08(1);
        cmdBufItem.m75939xb282bd08(0);
    }

    public final void n(p012xc85e97e9.p093xedfae76a.y yVar, int i17, long j17, java.lang.String str, zy2.gc gcVar) {
        r45.hi2 hi2Var = new r45.hi2();
        hi2Var.set(0, java.lang.Integer.valueOf(i17));
        hi2Var.set(2, java.lang.Long.valueOf(j17));
        hi2Var.set(1, str);
        hb2.w0.h(this, yVar, hi2Var, gcVar, false, false, 24, null);
    }
}
