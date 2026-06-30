package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class j9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f73953d;

    public j9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f73953d = mMFBLoginUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f73953d.finish();
    }
}
