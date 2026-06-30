package gt4;

/* loaded from: classes.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a f356958d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a) {
        this.f356958d = c19148x59bc9c3a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a = this.f356958d;
        java.lang.String str = c19148x59bc9c3a.f262259p;
        java.lang.String string = c19148x59bc9c3a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kix);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = c19148x59bc9c3a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kiy);
        }
        db5.e1.y(c19148x59bc9c3a.getContext(), str, string, c19148x59bc9c3a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), new gt4.g1(c19148x59bc9c3a));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
