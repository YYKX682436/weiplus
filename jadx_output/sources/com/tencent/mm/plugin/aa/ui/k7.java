package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class k7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72716a;

    public k7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72716a = paylistAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click AlertMsgTips");
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72716a;
        int i17 = !com.tencent.mm.storage.z3.R4(paylistAAUI.I) ? com.tencent.mm.R.string.k4b : com.tencent.mm.R.string.k4_;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(paylistAAUI);
        u1Var.u(paylistAAUI.getString(com.tencent.mm.R.string.k4c));
        android.view.View inflate = com.tencent.mm.ui.id.b(paylistAAUI).inflate(com.tencent.mm.R.layout.f489594d33, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h88);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o3b);
        imageView.setImageResource(com.tencent.mm.R.drawable.ccp);
        textView.setText(i17);
        u1Var.d(inflate);
        u1Var.m(com.tencent.mm.R.string.f490551ya);
        u1Var.j(paylistAAUI.getString(com.tencent.mm.R.string.f490347sg));
        u1Var.c(new com.tencent.mm.plugin.aa.ui.z6(this), new com.tencent.mm.plugin.aa.ui.a7(this));
        u1Var.q(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 7, java.lang.Integer.valueOf(paylistAAUI.R));
    }
}
