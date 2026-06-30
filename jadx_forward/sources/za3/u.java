package za3;

/* loaded from: classes15.dex */
public class u implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 f552556a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f586) {
        this.f552556a = c16286x1df9f586;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
    /* renamed from: onMarkerClick */
    public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiPoint", "onClick.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f586 = this.f552556a;
        za3.v vVar = c16286x1df9f586.C;
        if (vVar == null) {
            return false;
        }
        za3.w wVar = c16286x1df9f586.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.s0 s0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.s0) vVar;
        za3.w wVar2 = za3.w.SIT;
        if (wVar2 == wVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = s0Var.f226426a;
            if (-1 == x1Var.f226465t.f226293f) {
                x1Var.s(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f5862 = x1Var.I1;
            if (c16286x1df9f5862 != null && za3.w.STAND == c16286x1df9f5862.B) {
                c16286x1df9f5862.B = wVar2;
                c16286x1df9f5862.f226172q.reverse();
                c16286x1df9f5862.f226173r.reverse();
                c16286x1df9f5862.f226174s.reverse();
            }
            x1Var.f226443e.mo1001x8873d7af().mo989x42ab093c(c16286x1df9f586.m65942xb5885269(), c16286x1df9f586.m65943xb58853ef());
            x1Var.I1 = c16286x1df9f586;
            c16286x1df9f586.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1.o(x1Var, c16286x1df9f586.m65944xa86cd69f());
            x1Var.f226465t.f226293f = c16286x1df9f586.m65944xa86cd69f();
            x1Var.f226465t.notifyDataSetChanged();
            long m65944xa86cd69f = c16286x1df9f586.m65944xa86cd69f() + 1;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6610x8c4aeff0 c6610x8c4aeff0 = x1Var.f226455l1;
            c6610x8c4aeff0.f139641g = m65944xa86cd69f;
            c6610x8c4aeff0.f139640f = 2;
        }
        return true;
    }
}
