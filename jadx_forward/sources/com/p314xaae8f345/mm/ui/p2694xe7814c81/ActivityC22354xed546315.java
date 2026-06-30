package com.p314xaae8f345.mm.ui.p2694xe7814c81;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/container/MMCommonFullScreenActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.container.MMCommonFullScreenActivity */
/* loaded from: classes8.dex */
public final class ActivityC22354xed546315 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        for (pf5.g gVar : com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8.m80388x72e6bc6d(this, false, 1, null)) {
            if ((gVar instanceof wm3.m) && ((wm3.m) gVar).i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        int i17 = com.p314xaae8f345.mm.ui.bl.i(mo55332x76847179(), -1);
        if (findViewById != null) {
            findViewById.setPadding(0, i17, 0, 0);
        }
        if (vj5.n.f519251k) {
            vj5.n.b(this).d(new wf5.a(findViewById));
            getWindow().getDecorView().requestApplyInsets();
            vj5.o.e(getWindow());
        }
        mo78530x8b45058f();
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
    }
}
