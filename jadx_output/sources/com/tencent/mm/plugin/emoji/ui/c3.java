package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.c3 f97916d = new com.tencent.mm.plugin.emoji.ui.c3();

    public c3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.h5 h5Var = com.tencent.mm.storage.h5.f195006d;
        h5Var.Di(false);
        h5Var.Ni(false);
        h5Var.Ri(false);
        com.tencent.mm.smiley.c0.f193225a.e(com.tencent.mm.smiley.z.f193415d);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "setPrivacyPolicyHasShown");
        c01.z1.P(c01.z1.i() | 1048576);
        return jz5.f0.f302826a;
    }
}
