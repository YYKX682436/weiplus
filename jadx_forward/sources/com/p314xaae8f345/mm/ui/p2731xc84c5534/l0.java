package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes15.dex */
public abstract class l0 {
    public static final void a(boolean z17, boolean z18, long j17, java.lang.String voiceId, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Report25041", "report() called with: isC2C = " + z18 + ", actionType = " + j17 + ", voiceId = " + voiceId + ", totalTime = " + j18 + ", stopReason = " + j19 + ", playTime = " + j27);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7008x3ba55988 c7008x3ba55988 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7008x3ba55988();
        c7008x3ba55988.f143215d = !z17 ? 0L : z18 ? 1L : 2L;
        c7008x3ba55988.f143216e = j17;
        c7008x3ba55988.f143217f = c7008x3ba55988.b("ActionResult", "0", true);
        c7008x3ba55988.f143218g = c7008x3ba55988.b("VoiceId", voiceId, true);
        c7008x3ba55988.f143219h = j18;
        c7008x3ba55988.f143220i = j19;
        c7008x3ba55988.f143221j = j27;
        c7008x3ba55988.k();
    }
}
