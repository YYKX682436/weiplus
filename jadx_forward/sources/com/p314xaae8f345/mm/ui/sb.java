package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class sb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f291313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f291315f;

    public sb(android.content.SharedPreferences sharedPreferences, android.app.Activity activity, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f291313d = sharedPreferences;
        this.f291314e = activity;
        this.f291315f = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences.Editor edit = this.f291313d.edit();
        edit.putBoolean("gprs_alert", false);
        edit.commit();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273979i = false;
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.ui.vb.b(this.f291314e);
        android.content.DialogInterface.OnClickListener onClickListener = this.f291315f;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
    }
}
