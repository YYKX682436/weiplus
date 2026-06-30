package ec4;

@j95.b
/* loaded from: classes4.dex */
public final class h0 extends i95.w implements fe0.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f332691d = "MicroMsg.SnsFakeVideoPublishReportApi";

    public void wi(int i17, java.lang.String sessionId, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportFakeVideoResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        ot5.g.c(this.f332691d, "reportFakeVideoResult >> action: " + i17 + ", sessionId: " + sessionId + ", fakePublishTime: " + j17 + ", muxTime: " + j18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246527f;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d c6913xf7b4b00d = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d) hashMap.get(sessionId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportFakeVideoResultAction >> action: ");
        sb6.append(i17);
        sb6.append(", sessionId: ");
        sb6.append(sessionId);
        sb6.append(", fakePublishTime: ");
        sb6.append(j17);
        sb6.append(", muxTime: ");
        sb6.append(j18);
        sb6.append(", isContainStruct: ");
        sb6.append(c6913xf7b4b00d != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", sb6.toString());
        if (c6913xf7b4b00d != null) {
            c6913xf7b4b00d.f142328e = i17;
            c6913xf7b4b00d.f142335l = j17;
            c6913xf7b4b00d.f142334k = j18;
            c6913xf7b4b00d.f142329f = w0Var.a();
            c6913xf7b4b00d.k();
        }
        w0Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFakeVideoResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
    }
}
