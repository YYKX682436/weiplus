package rc5;

/* loaded from: classes5.dex */
public final class c extends com.p314xaae8f345.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rc5.x f475683e;

    public c(rc5.x xVar) {
        this.f475683e = xVar;
    }

    @Override // com.p314xaae8f345.mm.ui.bc
    public int a() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        rc5.x xVar = this.f475683e;
        int t76 = xVar.t7();
        if (valueOf != null && valueOf.intValue() == t76) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ((cy1.a) rVar).Hj("yuanbao_chat_maxmum", "view_clk", ((cy1.a) rVar).bj(xVar.m158354x19263085()), 34004);
            xVar.r7();
            return;
        }
        jz5.g gVar = rc5.x.D;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[-] onRightTopBtnClickCb: unexpected item id: ");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExpandableHalfScreenChattingUIC", sb6.toString());
    }
}
