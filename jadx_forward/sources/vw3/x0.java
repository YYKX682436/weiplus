package vw3;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f522707d = repairerFileListUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522707d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(repairerFileListUI);
        e4Var.f293309c = "处理完成";
        e4Var.c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = repairerFileListUI.e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
