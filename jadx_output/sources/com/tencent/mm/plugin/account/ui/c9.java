package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class c9 extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f73771d;

    public c9(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI) {
        this.f73771d = mMFBFriendUI;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        super.a(i17, str);
        if (i17 == 3) {
            int i18 = com.tencent.mm.plugin.account.ui.MMFBFriendUI.f73450o;
            com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f73771d;
            mMFBFriendUI.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.FacebookFriendUI", "dealWithRefreshTokenFail");
            db5.e1.u(mMFBFriendUI, mMFBFriendUI.getString(com.tencent.mm.R.string.c8h), mMFBFriendUI.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.x8(mMFBFriendUI), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
