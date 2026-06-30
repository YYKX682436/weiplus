package te2;

/* loaded from: classes3.dex */
public final class u7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f500008e;

    public u7(te2.p8 p8Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f500007d = p8Var;
        this.f500008e = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String m75945x2fec8307;
        int itemId = menuItem.getItemId();
        te2.p8 p8Var = this.f500007d;
        if (itemId == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_SET pick");
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.f(m80379x76847179, 1000, 9, 0, null, false);
        } else if (itemId == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_DEL_IMG pick");
            p8Var.t7("");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.y2 y2Var = ml2.y2.f409794q;
            r45.h32 h32Var = p8Var.A1.f499924b;
            zy2.zb.qg(zbVar, y2Var, "", (h32Var == null || (m75945x2fec8307 = h32Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307, null, 8, null);
        }
        p8Var.g7().m82040x7541828(p8Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
        this.f500008e.u();
    }
}
