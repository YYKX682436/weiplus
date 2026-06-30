package ot0;

/* loaded from: classes4.dex */
public final class e0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.e0 f429981a = new ot0.e0();

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ot0.f0.f430005a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ot0.f0.f430005a = null;
        ot0.f0.f430006b = false;
        if (obj instanceof ot0.p0) {
            ot0.p0 p0Var = (ot0.p0) obj;
            int i17 = p0Var.f430161a;
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 15, 1L, false);
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 12, 1L, false);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 14, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgBizClickHandler", p0Var.f430162b);
        }
    }
}
