package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class bi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI f73757d;

    public bi(com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI) {
        this.f73757d = shareToFacebookRedirectUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI shareToFacebookRedirectUI = this.f73757d;
        android.content.Intent intent = new android.content.Intent(shareToFacebookRedirectUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        shareToFacebookRedirectUI.getContext().startActivityForResult(intent, 0);
    }
}
