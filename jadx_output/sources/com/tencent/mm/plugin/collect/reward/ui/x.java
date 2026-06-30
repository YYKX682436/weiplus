package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.z f96336d;

    public x(com.tencent.mm.plugin.collect.reward.ui.z zVar) {
        this.f96336d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96336d.f96338a;
        if (!qrRewardMainUI.G) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) ((android.view.ViewStub) qrRewardMainUI.findViewById(com.tencent.mm.R.id.lg9)).inflate();
            qrRewardMainUI.f96242u = scrollView;
            android.widget.TextView textView = (android.widget.TextView) scrollView.findViewById(com.tencent.mm.R.id.lge);
            java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(qrRewardMainUI.I), 10);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = qrRewardMainUI.getString(com.tencent.mm.R.string.hp9, I);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(qrRewardMainUI, string, textSize));
            qrRewardMainUI.G = true;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) qrRewardMainUI.f96242u.findViewById(com.tencent.mm.R.id.lgb);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) qrRewardMainUI.f96242u.findViewById(com.tencent.mm.R.id.lgu);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qrRewardMainUI.B)) {
            android.widget.TextView textView2 = (android.widget.TextView) qrRewardMainUI.f96242u.findViewById(com.tencent.mm.R.id.lgd);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = qrRewardMainUI.getString(com.tencent.mm.R.string.hpj, qrRewardMainUI.B);
            float textSize2 = qrRewardMainUI.f96238q.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(qrRewardMainUI, string2, textSize2));
        }
        qrRewardMainUI.f96242u.setVisibility(4);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.collect.reward.ui.r(qrRewardMainUI, viewGroup, imageView), 250L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 5);
    }
}
