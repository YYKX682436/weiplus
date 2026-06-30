package vw3;

/* loaded from: classes.dex */
public final class w0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522697d;

    public w0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f522697d = repairerFileListUI;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522697d;
        g4Var.j(1, "名称排序(A-Z)", com.p314xaae8f345.mm.R.raw.f80008xda567a70, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), false);
        g4Var.j(2, "名称排序(Z-A)", com.p314xaae8f345.mm.R.raw.f80008xda567a70, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), false);
        g4Var.j(3, "时间排序(早到晚)", com.p314xaae8f345.mm.R.raw.f80329xebdaa825, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77770xf2a9a295), false);
        g4Var.j(4, "时间排序(晚到早)", com.p314xaae8f345.mm.R.raw.f80329xebdaa825, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77770xf2a9a295), false);
        g4Var.j(5, "大小排序(小到大)", com.p314xaae8f345.mm.R.raw.f80073xebd34502, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24), false);
        g4Var.j(6, "大小排序(大到小)", com.p314xaae8f345.mm.R.raw.f80073xebd34502, i65.a.d(repairerFileListUI.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24), false);
    }
}
