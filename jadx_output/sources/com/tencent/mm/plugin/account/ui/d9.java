package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class d9 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.h1 f73800d;

    public d9(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI, r61.h1 h1Var) {
        this.f73800d = h1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.u().c().w(65829, 1);
        gm0.j1.d().g(this.f73800d);
        return false;
    }
}
