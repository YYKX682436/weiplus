package com.tencent.mm.game.report;

/* loaded from: classes3.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.game.report.a f68172d;

    public a() {
        gm0.j1.d().a(1223, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMsgReportService", "onSceneEnd, errType : %d, errCode : %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
