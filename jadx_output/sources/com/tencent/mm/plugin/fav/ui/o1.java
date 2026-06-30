package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f101311d;

    public o1(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f101311d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f101311d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
