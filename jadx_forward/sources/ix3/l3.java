package ix3;

/* loaded from: classes.dex */
public final class l3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final ex3.e f377021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f377022e;

    public l3(ix3.o3 o3Var, ex3.e dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f377022e = o3Var;
        this.f377021d = dataItem;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        j75.f m67437x4bd5310;
        hx3.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2;
        j75.f m67437x4bd53102;
        hx3.b bVar2;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            ex3.e eVar = this.f377021d;
            ix3.o3 o3Var = this.f377022e;
            if (itemId == 0) {
                bm5.o1 o1Var = bm5.o1.f104252a;
                bm5.h0 h0Var = bm5.h0.RepairerConfig_Inner_TopKey_String;
                java.lang.String k17 = o1Var.k(h0Var, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: ".concat(k17));
                java.util.List f07 = r26.n0.f0(k17, new java.lang.String[]{","}, false, 0, 6, null);
                if (kz5.n0.O(f07, eVar.f338742f.m75945x2fec8307(0))) {
                    return;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList(f07);
                linkedList.add(0, eVar.f338742f.m75945x2fec8307(0));
                o1Var.o(h0Var, kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null));
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = o3Var.P6();
                if (!((P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null || (bVar = (hx3.b) m67437x4bd5310.mo140437x75286adb()) == null || !bVar.f367191e) ? false : true) || (c16718x7059cefe = o3Var.f377049d) == null) {
                    return;
                }
                c16718x7059cefe.o(new ex3.e(0, 0, eVar.f338742f, eVar.f338743g), false);
                return;
            }
            if (itemId != 1) {
                return;
            }
            bm5.o1 o1Var2 = bm5.o1.f104252a;
            bm5.h0 h0Var2 = bm5.h0.RepairerConfig_Inner_TopKey_String;
            java.lang.String k18 = o1Var2.k(h0Var2, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: ".concat(k18));
            java.util.List f08 = r26.n0.f0(k18, new java.lang.String[]{","}, false, 0, 6, null);
            if (kz5.n0.O(f08, eVar.f338742f.m75945x2fec8307(0))) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList(f08);
                linkedList2.remove(eVar.f338742f.m75945x2fec8307(0));
                o1Var2.o(h0Var2, kz5.n0.g0(linkedList2, ",", null, null, 0, null, null, 62, null));
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = o3Var.P6();
                if (!((P62 == null || (m67437x4bd53102 = P62.m67437x4bd5310()) == null || (bVar2 = (hx3.b) m67437x4bd53102.mo140437x75286adb()) == null || !bVar2.f367191e) ? false : true) || (c16718x7059cefe2 = o3Var.f377049d) == null) {
                    return;
                }
                c16718x7059cefe2.u(new ex3.e(0, 0, eVar.f338742f, eVar.f338743g));
            }
        }
    }
}
