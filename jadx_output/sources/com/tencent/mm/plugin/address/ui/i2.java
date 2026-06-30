package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public final class i2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74560d;

    public i2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74560d = walletAddAddressUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74560d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = walletAddAddressUI.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        walletAddAddressUI.getClass();
        int scrollY = mMEditText.getScrollY();
        int height = mMEditText.getLayout().getHeight() - ((mMEditText.getHeight() - mMEditText.getCompoundPaddingTop()) - mMEditText.getCompoundPaddingBottom());
        if (height != 0 && (scrollY > 0 || scrollY < height - 1)) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getAction() == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
