package yw3;

/* loaded from: classes5.dex */
public final class k3 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f548318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f548319e;

    public k3(android.view.View view, com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI) {
        this.f548318d = view;
        this.f548319e = repairerKeyboardObserverDemoUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        e3.d a17;
        android.view.View view = this.f548318d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.i;
        android.view.View m78513xc2a54588 = this.f548319e.m78513xc2a54588();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a18 = n3.b1.a(m78513xc2a54588);
        view.setPadding(0, 0, 0, (a18 == null || (a17 = a18.a(2)) == null) ? 0 : a17.f328580d);
        return true;
    }
}
