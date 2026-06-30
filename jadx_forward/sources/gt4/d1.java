package gt4;

/* loaded from: classes.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a f356947d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a) {
        this.f356947d = c19148x59bc9c3a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a = this.f356947d;
        intent.setClassName(c19148x59bc9c3a.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c19148x59bc9c3a.getContext()).startActivityForResult(intent, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55825xa5f977ac);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
