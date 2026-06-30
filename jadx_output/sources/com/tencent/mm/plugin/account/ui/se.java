package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class se implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI f74199d;

    public se(com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI regByFacebookSetPwdUI) {
        this.f74199d = regByFacebookSetPwdUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f74199d.finish();
    }
}
