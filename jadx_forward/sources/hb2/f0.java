package hb2;

/* loaded from: classes2.dex */
public final class f0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.f0 f361575e = new hb2.f0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361576f = "Finder.FinderModifyHelpPromotionSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.ci2 cmdBufItem = (r45.ci2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 31;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361576f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ci2 cmdBufItem = (r45.ci2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        cmdRef.m75939xb282bd08(1);
        cmdBufItem.m75939xb282bd08(0);
    }

    public final void n(p012xc85e97e9.p093xedfae76a.y yVar, boolean z17, long j17, zy2.gc gcVar) {
        r45.ci2 ci2Var = new r45.ci2();
        ci2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 2));
        ci2Var.set(1, java.lang.Long.valueOf(j17));
        hb2.w0.h(this, yVar, ci2Var, gcVar, false, false, 24, null);
    }
}
