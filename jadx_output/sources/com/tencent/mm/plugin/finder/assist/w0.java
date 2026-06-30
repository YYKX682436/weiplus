package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.w0 f102642a = new com.tencent.mm.plugin.finder.assist.w0();

    public final en0.g a(en0.g gVar, java.lang.String tag, r45.rp1 rp1Var) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        if (rp1Var != null) {
            gVar.F = rp1Var.getInteger(0);
            gVar.G = rp1Var.getInteger(1);
            gVar.H = rp1Var.getInteger(2);
            gVar.I = rp1Var.getInteger(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveEventInfo ");
            sb6.append(tag);
            sb6.append(", objectId:");
            sb6.append(pm0.v.u(gVar.f255256k));
            sb6.append(", liveId:");
            sb6.append(pm0.v.u(gVar.f255248c));
            sb6.append(", username:");
            sb6.append(gVar.f255251f);
            sb6.append(", ");
            sb6.append("event_id:" + rp1Var.getInteger(0) + ", participant_identity:" + rp1Var.getInteger(1) + ", event_status:" + rp1Var.getInteger(2) + ", stream_status:" + rp1Var.getInteger(3));
            com.tencent.mars.xlog.Log.i("Finder.OlympicsCommon", sb6.toString());
        } else {
            gVar.F = 0;
            com.tencent.mars.xlog.Log.i("Finder.OlympicsCommon", "setLiveEventInfo " + tag + ", objectId:" + pm0.v.u(gVar.f255256k) + ", liveId:" + pm0.v.u(gVar.f255248c) + ", username:" + gVar.f255251f + ", null");
        }
        return gVar;
    }
}
