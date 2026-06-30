package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class o0 extends i95.w implements pp0.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f549791d = "MicroMsg.MJPublisherReporterFeatureService";

    public void Ai(java.lang.String templateId, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.o4(m7Var, templateId, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("template_id", templateId);
        Ai.put("template_position", java.lang.Integer.valueOf(i17));
        try {
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.f273689a, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f549791d, "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        Ai.put("template_type", 1);
        Ai.put("view_id", "mc_template_expose");
        ((cy1.a) rVar).yj("mc_template_expose", null, Ai, 6, false);
    }

    public void Bi(java.lang.String templateId, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.q4(m7Var, templateId, null), 3, null);
        yy0.m7 m7Var2 = (yy0.m7) l0Var;
        m7Var2.uj(templateId);
        m7Var2.xj(i17);
        m7Var2.yj(gVar);
        m7Var2.Aj(1);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var2.Ai();
        Ai.put("view_id", "mc_start_preview");
        ((cy1.a) rVar).yj("mc_start_preview", null, Ai, 6, false);
    }

    public void Di() {
        long j17;
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        java.util.Map Ai = m7Var.Ai();
        synchronized (yy0.m7.class) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c = m7Var.f549761g;
            if (c4082xa6fd740c != null) {
                j17 = c4082xa6fd740c.b();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m7Var.f549758d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
                j17 = 0;
            }
        }
        if (j17 <= 7) {
            Ai.put("view_id", "exit_no_operation");
            ((cy1.a) rVar).yj("exit_no_operation", null, Ai, 6, false);
        }
        Ai.put("view_id", "post_out");
        Ai.put("post_state", "0");
        ((cy1.a) rVar).yj("post_out", null, Ai, 6, false);
        m7Var.cj("UserExit");
        m7Var.fj("UserExit");
        m7Var.bj("UserExit");
        m7Var.mj();
    }

    public void Ni(java.lang.String cancelReason, java.lang.String cancelMessage, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelReason, "cancelReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelMessage, "cancelMessage");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.y1(m7Var, cancelReason, cancelMessage, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("record_duration", java.lang.Long.valueOf(j17));
        Ai.put("cancel_reason", cancelReason);
        Ai.put("cancel_message", cancelMessage);
        Ai.put("view_id", "sc_end_record");
        ((cy1.a) rVar).yj("sc_end_record", null, Ai, 6, false);
    }

    public void Ri(long j17) {
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.d2(m7Var, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("preview_duration", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "sc_end_preview");
        ((cy1.a) rVar).yj("sc_end_preview", null, Ai, 6, false);
    }

    public void Ui(java.lang.String templateId, long j17, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        java.lang.String templateTabID = java.lang.String.valueOf(j17);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateTabID, "templateTabID");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.m2(m7Var, templateId, templateTabID, i17, z17, "", z18, !z19, z27, z28, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        yy0.m7 m7Var2 = (yy0.m7) l0Var;
        m7Var2.uj(templateId);
        m7Var2.zj(java.lang.String.valueOf(j17));
        m7Var2.xj(i17);
        if (gVar != null) {
            m7Var2.yj(gVar);
        }
        m7Var2.Aj(i18);
        m7Var2.wj(z27);
        m7Var2.vj(z28);
        java.util.Map Ai = m7Var2.Ai();
        Ai.put("active_click", z17 ? "0" : "1");
        Ai.put("view_id", "sc_start_preview");
        ((cy1.a) rVar).yj("sc_start_preview", null, Ai, 6, false);
    }

    public void wi(long j17) {
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("State", "Succeed");
        jSONObject.put("TimeCost", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.oj("PS_AIGCRequestEvent", r26.i0.t(jSONObject2, ",", ";", false));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("time_cost", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "aigc_request_succeed");
        ((cy1.a) rVar).yj("aigc_request_succeed", null, Ai, 6, false);
    }
}
