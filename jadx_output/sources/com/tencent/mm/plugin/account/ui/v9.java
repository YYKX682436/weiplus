package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class v9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI f74270d;

    public v9(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        this.f74270d = mMLoginVerifyPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI = this.f74270d;
        mMLoginVerifyPwdUI.hideVKB();
        mMLoginVerifyPwdUI.finish();
        return true;
    }
}
