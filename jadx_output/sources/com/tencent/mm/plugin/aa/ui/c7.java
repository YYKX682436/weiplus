package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class c7 implements com.tencent.mm.plugin.aa.ui.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.d7 f72596a;

    public c7(com.tencent.mm.plugin.aa.ui.d7 d7Var) {
        this.f72596a = d7Var;
    }

    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.aa.ui.d7 d7Var = this.f72596a;
        if (K0) {
            d7Var.f72617d.f72561z = null;
        } else {
            d7Var.f72617d.f72561z = str;
        }
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = d7Var.f72617d;
        int i17 = com.tencent.mm.plugin.aa.ui.PaylistAAUI.S;
        paylistAAUI.p7();
    }
}
