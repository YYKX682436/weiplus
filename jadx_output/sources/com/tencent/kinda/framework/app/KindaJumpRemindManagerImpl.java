package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaJumpRemindManagerImpl implements com.tencent.kinda.gen.KindaJumpRemindManager {
    private com.tencent.mm.wallet_core.model.p0 jumpRemind = new com.tencent.mm.wallet_core.model.p0();

    @Override // com.tencent.kinda.gen.KindaJumpRemindManager
    public void jumpRemindImpl(com.tencent.kinda.gen.KJumpRemindInfo kJumpRemindInfo, int i17, int i18, final com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback, final com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback2) {
        r45.q34 q34Var = new r45.q34();
        q34Var.f383624d = kJumpRemindInfo.mJumpType;
        q34Var.f383625e = kJumpRemindInfo.mIsPopUpWindows;
        q34Var.f383626f = kJumpRemindInfo.mWording;
        q34Var.f383627g = kJumpRemindInfo.mLeftButtonWording;
        q34Var.f383628h = kJumpRemindInfo.mRightButtonWording;
        r45.dn5 dn5Var = new r45.dn5();
        com.tencent.kinda.gen.KRedirectUrl kRedirectUrl = kJumpRemindInfo.mUrl;
        dn5Var.f372598d = kRedirectUrl.mType;
        dn5Var.f372599e = kRedirectUrl.mAppid;
        dn5Var.f372600f = kRedirectUrl.mAppVersion;
        dn5Var.f372601g = kRedirectUrl.mPath;
        dn5Var.f372602h = kRedirectUrl.mBtnName;
        q34Var.f383629i = dn5Var;
        q34Var.f383630m = kJumpRemindInfo.mTitle;
        com.tencent.mm.wallet_core.model.p0 d17 = com.tencent.mm.wallet_core.model.p0.d(q34Var);
        this.jumpRemind = d17;
        d17.f213974m = true;
        d17.a();
        this.jumpRemind.i((android.app.Activity) com.tencent.kinda.framework.widget.tools.KindaContext.get(), new com.tencent.mm.wallet_core.model.r() { // from class: com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.1
            @Override // com.tencent.mm.wallet_core.model.r
            public void onCancel() {
                if (com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.b()) {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback3 = voidBoolStringCallback2;
                    if (voidBoolStringCallback3 != null) {
                        voidBoolStringCallback3.call(false, null);
                    }
                } else {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback4 = voidBoolStringCallback;
                    if (voidBoolStringCallback4 != null) {
                        voidBoolStringCallback4.call(false, null);
                    }
                }
                com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.f();
            }

            @Override // com.tencent.mm.wallet_core.model.r
            public void onEnter() {
            }

            @Override // com.tencent.mm.wallet_core.model.r
            public void onUrlCancel() {
                if (com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.b()) {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback3 = voidBoolStringCallback2;
                    if (voidBoolStringCallback3 != null) {
                        voidBoolStringCallback3.call(false, null);
                    }
                } else {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback4 = voidBoolStringCallback;
                    if (voidBoolStringCallback4 != null) {
                        voidBoolStringCallback4.call(false, null);
                    }
                }
                com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.f();
            }

            @Override // com.tencent.mm.wallet_core.model.r
            public void onUrlOk() {
                if (com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.b()) {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback3 = voidBoolStringCallback2;
                    if (voidBoolStringCallback3 != null) {
                        voidBoolStringCallback3.call(true, null);
                    }
                } else {
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback4 = voidBoolStringCallback;
                    if (voidBoolStringCallback4 != null) {
                        voidBoolStringCallback4.call(true, null);
                    }
                }
                com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.this.jumpRemind.f();
            }
        });
    }

    @Override // com.tencent.kinda.gen.KindaJumpRemindManager
    public void onDestroyJumpRemindManager() {
        com.tencent.mm.wallet_core.model.p0 p0Var = this.jumpRemind;
        if (p0Var != null) {
            p0Var.f();
        }
    }
}
