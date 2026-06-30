package yw3;

/* loaded from: classes15.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f548358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f548359e;

    public n3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI, boolean z17) {
        this.f548358d = repairerKeyboardObserverDemoUI;
        this.f548359e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI = this.f548358d;
        repairerKeyboardObserverDemoUI.g = this.f548359e;
        repairerKeyboardObserverDemoUI.V6().a().setText(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.U6(repairerKeyboardObserverDemoUI));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerKeyboardObserverDemoUI", "onKeyboardChangeAfter: " + repairerKeyboardObserverDemoUI.g);
    }
}
