package vw3;

/* loaded from: classes.dex */
public final class o0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f522580b;

    public o0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f522579a = repairerFileListUI;
        this.f522580b = r6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522579a;
            repairerFileListUI.e = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(repairerFileListUI, "正在压缩...", true, 0, null);
            pm0.v.K(null, new vw3.n0(this.f522580b, repairerFileListUI));
        }
    }
}
