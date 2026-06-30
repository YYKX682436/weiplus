package vw3;

/* loaded from: classes.dex */
public final class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f522452a;

    public d(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f522452a = baseRepairerPrefUI;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            bm5.o1.f104253b.clear();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bm5.o1.f104254c;
            if (o4Var != null) {
                o4Var.e();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = bm5.o1.f104254c;
            if (o4Var2 != null) {
                o4Var2.d();
            }
            com.tencent.mm.plugin.repairer.ui.RepairerMainUI repairerMainUI = this.f522452a;
            repairerMainUI.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            repairerMainUI.finish();
        }
    }
}
