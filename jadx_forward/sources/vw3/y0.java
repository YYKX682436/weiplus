package vw3;

/* loaded from: classes.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f522721d = repairerFileListUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ix3.a2 a2Var;
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522721d;
        j75.f m67437x4bd5310 = repairerFileListUI.m67437x4bd5310();
        if (m67437x4bd5310 != null && (a2Var = (ix3.a2) m67437x4bd5310.mo140437x75286adb()) != null) {
            com.p314xaae8f345.mm.vfs.w6.f(a2Var.f376894f);
        }
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17 = repairerFileListUI.V6().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getRecyclerView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(a17);
        if (a18 != null) {
            a18.v(kz5.p0.f395529d, true);
        }
        pm0.v.X(new vw3.x0(repairerFileListUI));
        return jz5.f0.f384359a;
    }
}
