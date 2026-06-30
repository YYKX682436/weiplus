package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f182883e;

    public q1(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f182882d = context;
        this.f182883e = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_cleanui_from", 3);
        o72.x1.L0(this.f182882d, ".ui.FavCleanUI", intent, null);
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f182883e;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
