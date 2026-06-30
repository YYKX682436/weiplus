package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class xh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI f74327d;

    public xh(com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI) {
        this.f74327d = shareToFacebookRedirectUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f74327d.finish();
    }
}
