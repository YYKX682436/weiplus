package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class z7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.d0 f72914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f72915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72916c;

    public z7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, r45.d0 d0Var, android.widget.TextView textView) {
        this.f72916c = paylistAAUI;
        this.f72914a = d0Var;
        this.f72915b = textView;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "launcherTipTv img click");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.y7(this));
    }
}
