package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f182978d;

    public t1(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f182978d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f182978d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
