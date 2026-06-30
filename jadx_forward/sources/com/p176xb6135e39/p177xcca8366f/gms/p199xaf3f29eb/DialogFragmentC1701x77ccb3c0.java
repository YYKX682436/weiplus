package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.ErrorDialogFragment */
/* loaded from: classes13.dex */
public class DialogFragmentC1701x77ccb3c0 extends android.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;
    private android.app.Dialog zac;

    /* renamed from: newInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.DialogFragmentC1701x77ccb3c0 m17608x6bff0255(android.app.Dialog dialog) {
        return m17609x6bff0255(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            this.zac = new android.app.AlertDialog.Builder((android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(getActivity())).create();
        }
        return this.zac;
    }

    @Override // android.app.DialogFragment
    public void show(android.app.FragmentManager fragmentManager, java.lang.String str) {
        super.show(fragmentManager, str);
    }

    /* renamed from: newInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.DialogFragmentC1701x77ccb3c0 m17609x6bff0255(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.DialogFragmentC1701x77ccb3c0 dialogFragmentC1701x77ccb3c0 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.DialogFragmentC1701x77ccb3c0();
        android.app.Dialog dialog2 = (android.app.Dialog) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1701x77ccb3c0.zaa = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1701x77ccb3c0.zab = onCancelListener;
        }
        return dialogFragmentC1701x77ccb3c0;
    }
}
