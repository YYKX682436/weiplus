package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w0 f184175a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w0();

    public final en0.g a(en0.g gVar, java.lang.String tag, r45.rp1 rp1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (rp1Var != null) {
            gVar.F = rp1Var.m75939xb282bd08(0);
            gVar.G = rp1Var.m75939xb282bd08(1);
            gVar.H = rp1Var.m75939xb282bd08(2);
            gVar.I = rp1Var.m75939xb282bd08(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveEventInfo ");
            sb6.append(tag);
            sb6.append(", objectId:");
            sb6.append(pm0.v.u(gVar.f336789k));
            sb6.append(", liveId:");
            sb6.append(pm0.v.u(gVar.f336781c));
            sb6.append(", username:");
            sb6.append(gVar.f336784f);
            sb6.append(", ");
            sb6.append("event_id:" + rp1Var.m75939xb282bd08(0) + ", participant_identity:" + rp1Var.m75939xb282bd08(1) + ", event_status:" + rp1Var.m75939xb282bd08(2) + ", stream_status:" + rp1Var.m75939xb282bd08(3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.OlympicsCommon", sb6.toString());
        } else {
            gVar.F = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.OlympicsCommon", "setLiveEventInfo " + tag + ", objectId:" + pm0.v.u(gVar.f336789k) + ", liveId:" + pm0.v.u(gVar.f336781c) + ", username:" + gVar.f336784f + ", null");
        }
        return gVar;
    }
}
