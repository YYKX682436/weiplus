package le2;

/* loaded from: classes8.dex */
public final class a extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final le2.a f399672e = new le2.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f399673f = "Finder.FinderLiveCustomNotifyRejectService";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.ph2 cmdBufItem = (r45.ph2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 28;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f399673f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ph2 cmdBufItem = (r45.ph2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f399673f, "retcode:" + cmdRef.m75939xb282bd08(1));
    }
}
