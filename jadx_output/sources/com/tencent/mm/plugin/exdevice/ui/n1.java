package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes.dex */
public class n1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99579d;

    public n1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99579d = exdeviceConnectWifiUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable.length();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99579d;
        if (length > 31) {
            android.view.View view = exdeviceConnectWifiUI.f99216f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            exdeviceConnectWifiUI.f99218h.setEnabled(false);
            return;
        }
        android.view.View view2 = exdeviceConnectWifiUI.f99216f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        exdeviceConnectWifiUI.f99218h.setEnabled(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
