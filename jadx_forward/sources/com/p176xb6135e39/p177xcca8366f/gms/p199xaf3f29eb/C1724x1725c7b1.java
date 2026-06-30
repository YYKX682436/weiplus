package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.SupportErrorDialogFragment */
/* loaded from: classes13.dex */
public class C1724x1725c7b1 extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;
    private android.app.Dialog zac;

    /* renamed from: newInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1724x1725c7b1 m17699x6bff0255(android.app.Dialog dialog) {
        return m17700x6bff0255(dialog, null);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        m7411x6191803c(false);
        if (this.zac == null) {
            this.zac = new android.app.AlertDialog.Builder((android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(mo7438x76847179())).create();
        }
        return this.zac;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: show */
    public void mo7414x35dafd(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.lang.String str) {
        super.mo7414x35dafd(abstractC1104xc1ad431d, str);
    }

    /* renamed from: newInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1724x1725c7b1 m17700x6bff0255(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1724x1725c7b1 c1724x1725c7b1 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1724x1725c7b1();
        android.app.Dialog dialog2 = (android.app.Dialog) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1724x1725c7b1.zaa = dialog2;
        if (onCancelListener != null) {
            c1724x1725c7b1.zab = onCancelListener;
        }
        return c1724x1725c7b1;
    }
}
