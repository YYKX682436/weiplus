package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes.dex */
public class LaunchAAByPersonAmountSelectRow extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f72479d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f72480e;

    public LaunchAAByPersonAmountSelectRow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bnh, (android.view.ViewGroup) this, true);
        this.f72479d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485969jq1);
        this.f72480e = findViewById(com.tencent.mm.R.id.d0v);
    }

    public double getAmount() {
        java.lang.String str = this.f72479d.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || "".equals(str)) {
            return 0.0d;
        }
        return com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d);
    }

    public com.tencent.mm.wallet_core.ui.formview.WalletFormView getMoneyEdit() {
        return this.f72479d;
    }

    public java.lang.String getUsername() {
        return null;
    }

    public void setDividerVisible(boolean z17) {
        android.view.View view = this.f72480e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setTextWatcher(android.text.TextWatcher textWatcher) {
        this.f72479d.b(textWatcher);
    }

    public LaunchAAByPersonAmountSelectRow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
