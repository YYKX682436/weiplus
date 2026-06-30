package tq1;

/* loaded from: classes10.dex */
public class b implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2;
        java.lang.Object obj;
        if (!str.equals("functionmsg") || (str2 = (java.lang.String) map.get(".sysmsg.functionmsg.businessid")) == null) {
            return;
        }
        ((rq1.m0) i95.n0.c(rq1.m0.class)).f480296d.getClass();
        if (!str2.equals("20002") || (obj = p0Var.f152265g) == null) {
            return;
        }
        byte[] g17 = ((com.p314xaae8f345.mm.p944x882e457a.m0) obj).f152220a.f468170e.g();
        ((rq1.m0) i95.n0.c(rq1.m0.class)).f480296d.getClass();
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(rq1.e0.d()), "blackWhite").o();
        if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
            com.p314xaae8f345.mm.vfs.w6.h(o17);
        }
        com.p314xaae8f345.mm.vfs.w6.e(o17);
        com.p314xaae8f345.mm.vfs.w6.S(o17, g17, 0, g17.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxNewXmlReceived", "[onNewXmlReceived] bytesLen: %s", java.lang.Integer.valueOf(g17.length));
        ((ku5.t0) ku5.t0.f394148d).h(new tq1.a(this, g17), "box.HotWordSearchModel");
    }
}
