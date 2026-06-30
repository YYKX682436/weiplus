package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class k5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f72712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.aa.ui.n5 n5Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(false);
        this.f72712d = y1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f72712d.q();
    }
}
