package yw3;

/* loaded from: classes15.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f548341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f548342e;

    public m3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI, int i17) {
        this.f548341d = repairerKeyboardObserverDemoUI;
        this.f548342e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI = this.f548341d;
        repairerKeyboardObserverDemoUI.h = this.f548342e;
        repairerKeyboardObserverDemoUI.V6().a().setText(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.U6(repairerKeyboardObserverDemoUI));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerKeyboardObserverDemoUI", "onKeyboardChangeHeight: " + repairerKeyboardObserverDemoUI.h);
    }
}
