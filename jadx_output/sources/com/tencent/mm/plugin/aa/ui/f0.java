package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class f0 implements com.tencent.mm.plugin.aa.ui.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72634a;

    public f0(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72634a = aAQueryListUI;
    }

    @Override // com.tencent.mm.plugin.aa.ui.a
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = this.f72634a;
        com.tencent.mm.wallet_core.ui.r1.V(aAQueryListUI.getContext(), aAQueryListUI.f72451r, true);
    }
}
