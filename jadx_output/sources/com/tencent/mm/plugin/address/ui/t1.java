package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74627d;

    public t1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74627d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI lifecycleOwner = this.f74627d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = lifecycleOwner.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        java.lang.String obj = mMEditText.getText().toString();
        androidx.appcompat.app.AppCompatActivity context = lifecycleOwner.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = lifecycleOwner.getString(com.tencent.mm.R.string.ezh);
        e4Var.f211780g = 2;
        e4Var.f211778e = true;
        com.tencent.mm.plugin.address.ui.s1 s1Var = new com.tencent.mm.plugin.address.ui.s1(e4Var.c(), lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        if (obj == null || r26.n0.N(obj)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AnalyseRcptInfoCgi", "doCgi addr is empty");
            s1Var.invoke(null);
        } else {
            v65.i.b(new com.tencent.mm.sdk.coroutines.LifecycleScope("AnalyseRcptInfoCgi", lifecycleOwner, 0, 4, null), null, new q71.c(obj, s1Var, null), 1, null);
        }
        lifecycleOwner.hideVKB();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("recognize_address_edit", "view_clk", lifecycleOwner.f74467i, 33328);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
