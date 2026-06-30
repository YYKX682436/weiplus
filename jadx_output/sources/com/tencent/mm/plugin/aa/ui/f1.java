package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class f1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72635d;

    public f1(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72635d = aARemittanceUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        double F = com.tencent.mm.sdk.platformtools.t8.F(obj, 0.0d);
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72635d;
        if (!aARemittanceUI.f72459o.n() || F < 0.01d) {
            aARemittanceUI.f72456i.e(false);
            androidx.appcompat.app.AppCompatActivity activity = aARemittanceUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((h61.b) pf5.z.f353948a.a(activity).a(h61.b.class)).setValue("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "");
            return;
        }
        aARemittanceUI.f72456i.e(true);
        androidx.appcompat.app.AppCompatActivity activity2 = aARemittanceUI.getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((h61.b) pf5.z.f353948a.a(activity2).a(h61.b.class)).setValue("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "¥" + obj);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
