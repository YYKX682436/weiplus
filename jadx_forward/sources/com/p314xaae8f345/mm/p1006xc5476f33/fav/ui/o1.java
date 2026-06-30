package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f182844d;

    public o1(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f182844d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f182844d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
