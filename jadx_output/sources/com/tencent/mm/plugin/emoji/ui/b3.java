package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f97901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f97902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2) {
        super(0);
        this.f97901d = mMSwitchBtn;
        this.f97902e = mMSwitchBtn2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f97901d.setCheck(true);
        this.f97902e.setCheck(true);
        com.tencent.mm.storage.h5 h5Var = com.tencent.mm.storage.h5.f195006d;
        h5Var.Di(true);
        h5Var.Ni(true);
        h5Var.Ri(true);
        com.tencent.mm.smiley.c0.f193225a.d(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "setPrivacyPolicyHasShown");
        c01.z1.P(c01.z1.i() | 1048576);
        return jz5.f0.f302826a;
    }
}
