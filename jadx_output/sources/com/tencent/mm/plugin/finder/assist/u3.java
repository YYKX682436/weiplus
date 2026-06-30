package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.u3 f102591a = new com.tencent.mm.plugin.finder.assist.u3();

    public final void a(mm2.c1 c1Var, java.lang.String tag, r45.rp1 event_info) {
        kotlin.jvm.internal.o.g(c1Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(event_info, "event_info");
        c1Var.f328834l1 = event_info.getInteger(0);
        c1Var.f328860p1 = event_info.getInteger(2);
        c1Var.f328910x1 = event_info.getInteger(1);
        c1Var.C9(event_info.getInteger(3));
        java.util.List list = c1Var.f328924z1;
        ((java.util.ArrayList) list).clear();
        java.util.LinkedList list2 = event_info.getList(4);
        kotlin.jvm.internal.o.f(list2, "getRelated_events(...)");
        ((java.util.ArrayList) list).addAll(list2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEventInfo ");
        sb6.append(tag);
        sb6.append(", id:");
        sb6.append(event_info.getInteger(0));
        sb6.append(", event_status:");
        sb6.append(event_info.getInteger(2));
        sb6.append(", participant_identity:");
        sb6.append(event_info.getInteger(1));
        sb6.append(", stream_status:");
        sb6.append(event_info.getInteger(3));
        sb6.append("related_events:");
        java.util.LinkedList list3 = event_info.getList(4);
        kotlin.jvm.internal.o.f(list3, "getRelated_events(...)");
        sb6.append(kz5.n0.g0(list3, null, null, null, 0, null, com.tencent.mm.plugin.finder.assist.t3.f102548d, 31, null));
        com.tencent.mars.xlog.Log.i("Finder.OlympicsLiveRoomUtil", sb6.toString());
    }
}
