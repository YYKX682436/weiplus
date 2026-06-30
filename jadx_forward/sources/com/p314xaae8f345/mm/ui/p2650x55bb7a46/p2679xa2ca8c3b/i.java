package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j f285680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(2);
        this.f285680d = jVar;
        this.f285681e = f9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zy2.c cVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j jVar = this.f285680d;
        if (booleanValue) {
            jVar.f285746u = c01.id.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseChattingItemAppMsgFinderLiveFeed", "onViewExposedListener false, cancel it");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.f285745t;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            long j17 = jVar.f285746u;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285681e;
            ot0.q v17 = ot0.q.v(f9Var.U1());
            r45.g92 g92Var = (v17 == null || (cVar = (zy2.c) v17.y(zy2.c.class)) == null) ? null : cVar.f558892b;
            if (g92Var != null) {
                r45.l71 Hj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(pm0.v.Z(g92Var.m75945x2fec8307(0)));
                if (Hj != null && Hj.m75933x41a8a7f2(26)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "reportExtReport: server close expose ext report, feedId=" + g92Var.m75945x2fec8307(2) + ", liveId=" + g92Var.m75945x2fec8307(0));
                } else {
                    r45.jn0 jn0Var = new r45.jn0();
                    jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(g92Var.m75945x2fec8307(2))));
                    jn0Var.set(1, g92Var.m75945x2fec8307(1));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("feedActionType", 117);
                    jSONObject.put("value", j17);
                    jSONObject.put("duration", longValue);
                    jSONObject.put("AutoPlayDuration", 0);
                    jSONObject.put("GMsgID", ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(f9Var));
                    yb5.d dVar = jVar.f285749x;
                    jSONObject.put("EntranceScene", dVar != null && dVar.C() ? 3 : 2);
                    yb5.d dVar2 = jVar.f285749x;
                    if (dVar2 != null && dVar2.C()) {
                        yb5.d dVar3 = jVar.f285749x;
                        java.lang.String x17 = dVar3 != null ? dVar3.x() : null;
                        if (x17 == null) {
                            x17 = "";
                        }
                        jSONObject.put("share_chatroom", x17);
                    }
                    jn0Var.set(3, jSONObject.toString());
                    ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
