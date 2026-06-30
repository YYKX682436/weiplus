package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f101350e;

    public q1(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f101349d = context;
        this.f101350e = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_cleanui_from", 3);
        o72.x1.L0(this.f101349d, ".ui.FavCleanUI", intent, null);
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f101350e;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
