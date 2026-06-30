package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class gb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290219d;

    public gb(android.app.Activity activity) {
        this.f290219d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.ui.vb.d(this.f290219d, true, 3);
    }
}
