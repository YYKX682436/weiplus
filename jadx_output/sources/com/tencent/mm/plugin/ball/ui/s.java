package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.FloatBallProxyUI f93353d;

    public s(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI) {
        this.f93353d = floatBallProxyUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI = this.f93353d;
        g4Var.d(0, -65536, floatBallProxyUI.getString(com.tencent.mm.R.string.fas));
        g4Var.d(1, -16777216, floatBallProxyUI.getString(com.tencent.mm.R.string.faq));
    }
}
