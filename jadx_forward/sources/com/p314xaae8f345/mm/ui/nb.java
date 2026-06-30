package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class nb implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f290943d;

    public nb(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f290943d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("show_wap_adviser");
        android.content.DialogInterface.OnClickListener onClickListener = this.f290943d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
