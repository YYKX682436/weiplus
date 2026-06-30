package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class of extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f291007d;

    public of(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f291007d = c21427xe5bb8a3;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab interfaceC21384xb1a4d3ab;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.e().o();
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f291007d;
        c21427xe5bb8a3.f278547a.mo2326xb052149b(1.0f);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = c21427xe5bb8a3.f278549c;
        if (c22559x35245a10 != null) {
            c22559x35245a10.c();
        }
        interfaceC21384xb1a4d3ab = c21427xe5bb8a3.f39391x6a280707;
        interfaceC21384xb1a4d3ab.mo78434x27949de2();
        c21427xe5bb8a3.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "doJobOnChattingAnimEnd cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: toString */
    public java.lang.String m80877x9616526c() {
        return super.toString() + "|chattingView_onAnimationEnd";
    }
}
