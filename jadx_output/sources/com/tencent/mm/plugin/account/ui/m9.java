package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class m9 extends com.tencent.mm.plugin.account.ui.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f74040d;

    public m9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f74040d = mMFBLoginUI;
    }

    @Override // com.tencent.mm.plugin.account.ui.j
    public com.tencent.mm.modelbase.m1 c(com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
        return new com.tencent.mm.modelsimple.v0("facebook@wechat_auth", this.f74040d.f73461e, v0Var.N(), str, v0Var.M(), v0Var.L(), 0, "", true, false);
    }
}
