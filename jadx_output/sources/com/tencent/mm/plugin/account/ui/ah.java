package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ah extends bb5.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f73727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73728c;

    public ah(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f73728c = regSetInfoUI;
        this.f73727b = m1Var;
    }

    @Override // bb5.k
    public void a() {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73728c;
        regSetInfoUI.hideVKB();
        int i17 = com.tencent.mm.plugin.account.ui.RegSetInfoUI.V;
        int V6 = regSetInfoUI.V6();
        java.lang.String U6 = regSetInfoUI.U6();
        gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff, regSetInfoUI);
        gm0.j1.d().g(new r61.m1(U6, regSetInfoUI.f73637o, V6, "", "", ((r61.l1) ((r61.m1) this.f73727b).f392906d).f392898b.f393003a.f385884f, ""));
    }

    @Override // bb5.k
    public void b() {
    }
}
