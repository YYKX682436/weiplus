package hb2;

/* loaded from: classes3.dex */
public final class i extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.i f361587e = new hb2.i();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361588f = "Finder.FinderModPersonalizedSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.gi2 cmdBufItem = (r45.gi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 20;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361588f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.util.LinkedList m75941xfb821914;
        r45.gi2 cmdBufItem = (r45.gi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdateResult: retCode=");
        sb6.append(m75939xb282bd08);
        sb6.append(", no_recommend_to_friend=");
        r45.t62 t62Var = (r45.t62) cmdBufItem.m75936x14adae67(1);
        sb6.append(t62Var != null ? java.lang.Integer.valueOf(t62Var.m75939xb282bd08(0)) : null);
        sb6.append(", no_recommend_to_all_city=");
        r45.t62 t62Var2 = (r45.t62) cmdBufItem.m75936x14adae67(1);
        sb6.append(t62Var2 != null ? java.lang.Boolean.valueOf(t62Var2.m75933x41a8a7f2(1)) : null);
        sb6.append(", cityNameList=");
        r45.t62 t62Var3 = (r45.t62) cmdBufItem.m75936x14adae67(1);
        sb6.append((t62Var3 == null || (m75941xfb821914 = t62Var3.m75941xfb821914(4)) == null) ? null : kz5.n0.g0(m75941xfb821914, "、", null, null, 0, null, null, 62, null));
        sb6.append(", cityCount-");
        r45.t62 t62Var4 = (r45.t62) cmdBufItem.m75936x14adae67(1);
        sb6.append(t62Var4 != null ? java.lang.Integer.valueOf(t62Var4.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361588f, sb6.toString());
    }

    public final void n(r45.t62 config, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        r45.gi2 gi2Var = new r45.gi2();
        gi2Var.set(0, java.lang.Integer.valueOf(config.m75939xb282bd08(0) == 0 ? 1 : 2));
        gi2Var.set(1, config);
        hb2.w0.m(this, gi2Var, gcVar, false, false, null, null, 60, null);
    }
}
