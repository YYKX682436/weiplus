package xt3;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538690d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538691e;

    public a(long j17, java.util.List feedbackList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedbackList, "feedbackList");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.oh4();
        lVar.f152198b = new r45.ph4();
        lVar.f152199c = "/cgi-bin/spr-bin/mmsprreportrecommendedmusicfeedback";
        lVar.f152200d = 3822;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538690d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSPRReportRecommendedMusicFeedbackRequest");
        r45.oh4 oh4Var = (r45.oh4) fVar;
        oh4Var.f463802d = j17;
        oh4Var.f463803e.addAll(feedbackList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStoryAudioReport", "LogStory: report music " + j17 + ' ' + feedbackList.size());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f538691e = callback;
        return mo9409x10f9447a(dispatcher, this.f538690d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3822;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStoryAudioReport", "onGYNetEnd " + i17 + ", " + i18 + ", " + i19 + ", " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f538691e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
