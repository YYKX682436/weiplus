package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public final class q1 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74615a;

    public q1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74615a = walletAddAddressUI;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74615a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = walletAddAddressUI.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        boolean canScrollVertically = mMEditText.canScrollVertically(-1);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = walletAddAddressUI.f74474s;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        boolean canScrollVertically2 = mMEditText2.canScrollVertically(1);
        android.view.View view = walletAddAddressUI.f74478w;
        if (view == null) {
            kotlin.jvm.internal.o.o("addrCaptureETTopMask");
            throw null;
        }
        int i17 = canScrollVertically ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = walletAddAddressUI.f74479x;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureETBottomMask");
            throw null;
        }
        int i18 = canScrollVertically2 ? 0 : 4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$10", "onScrollChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
