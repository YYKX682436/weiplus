package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class b2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity f72577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity) {
        super(false);
        this.f72577d = baseAAPresenterActivity;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f72577d.hideTenpayKB();
    }
}
