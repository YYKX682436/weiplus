package j00;

/* loaded from: classes7.dex */
public final class g0 {
    public final void a(java.lang.String seqId, long j17, java.lang.String finderUsername, java.lang.String giftId) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seqId, "seqId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Gift.Live.EcsGiftInLiveMonitor", "onStartResend, seqId: " + seqId + ", liveId: " + j17 + ", finderUsername: " + finderUsername + ", giftId: " + giftId);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            j00.s1[] s1VarArr = j00.s1.f378418d;
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(1)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, "resend_start"), new jz5.l("seqId", seqId), new jz5.l("liveId", java.lang.String.valueOf(j17)), new jz5.l("finderUsername", finderUsername), new jz5.l("giftId", giftId))).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            y02.v0 a17 = y02.x0.f540167d.a();
            if (a17 != null) {
                a17.p1(bw5.d5.EcsGiftSendFlow, 1, t17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Ecs.Gift.Live.EcsGiftInLiveMonitor", m143898xd4a2fc34, "onStartResend", new java.lang.Object[0]);
        }
    }
}
