package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes.dex */
public class LaunchAAByPersonRow extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f72501d;

    public LaunchAAByPersonRow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bnk, this);
        this.f72501d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.hth);
    }

    public com.tencent.mm.wallet_core.ui.formview.WalletFormView getAmountEditView() {
        return this.f72501d;
    }

    public double getMoneyAmount() {
        java.lang.String str = this.f72501d.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || "".equals(str)) {
            return 0.0d;
        }
        return com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d);
    }

    public java.lang.String getUsername() {
        return null;
    }

    public void setAmountTextChangeWatcher(android.text.TextWatcher textWatcher) {
        if (textWatcher != null) {
            this.f72501d.b(textWatcher);
        }
    }

    public LaunchAAByPersonRow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
