package ns4;

/* loaded from: classes.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f421087d;

    public j1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f421087d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "click close");
        this.f421087d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
