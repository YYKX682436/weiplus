package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f295657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f295659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295660g;

    public d0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, boolean z17, int i17, android.widget.EditText editText) {
        this.f295660g = abstractActivityC22902xe37969e;
        this.f295657d = z17;
        this.f295658e = i17;
        this.f295659f = editText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295660g;
        boolean isShown = abstractActivityC22902xe37969e.f39900xbab696ce.isShown();
        boolean z17 = this.f295657d;
        if (!isShown && !z17) {
            abstractActivityC22902xe37969e.m83139x8022ec1f();
            abstractActivityC22902xe37969e.m83128x12a99e7c(this.f295658e);
        } else if (z17) {
            abstractActivityC22902xe37969e.mo48632xd46dd964();
            ((android.view.inputmethod.InputMethodManager) abstractActivityC22902xe37969e.mo55332x76847179().getSystemService("input_method")).showSoftInput(this.f295659f, 0);
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
