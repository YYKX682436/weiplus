package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public class r1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f101365d;

    public r1(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f101365d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f101365d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
