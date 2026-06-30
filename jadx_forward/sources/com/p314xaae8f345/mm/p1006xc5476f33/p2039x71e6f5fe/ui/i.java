package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a f241095d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a activityC17295x7fb3825a) {
        this.f241095d = activityC17295x7fb3825a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a activityC17295x7fb3825a = this.f241095d;
        android.widget.EditText editText = activityC17295x7fb3825a.f240822g;
        if (editText != null) {
            java.lang.String obj = editText.getEditableText().toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            activityC17295x7fb3825a.finish();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6 c5960xee159aa6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6();
            am.ps psVar = c5960xee159aa6.f136259g;
            psVar.f89190b = 1;
            psVar.f89189a = obj;
            psVar.f89191c = activityC17295x7fb3825a.f240819d;
            c5960xee159aa6.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
