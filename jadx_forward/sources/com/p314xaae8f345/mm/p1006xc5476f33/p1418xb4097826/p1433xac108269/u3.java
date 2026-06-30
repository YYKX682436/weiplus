package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u3 f184124a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u3();

    public final void a(mm2.c1 c1Var, java.lang.String tag, r45.rp1 event_info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event_info, "event_info");
        c1Var.f410367l1 = event_info.m75939xb282bd08(0);
        c1Var.f410393p1 = event_info.m75939xb282bd08(2);
        c1Var.f410443x1 = event_info.m75939xb282bd08(1);
        c1Var.C9(event_info.m75939xb282bd08(3));
        java.util.List list = c1Var.f410457z1;
        ((java.util.ArrayList) list).clear();
        java.util.LinkedList m75941xfb821914 = event_info.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRelated_events(...)");
        ((java.util.ArrayList) list).addAll(m75941xfb821914);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEventInfo ");
        sb6.append(tag);
        sb6.append(", id:");
        sb6.append(event_info.m75939xb282bd08(0));
        sb6.append(", event_status:");
        sb6.append(event_info.m75939xb282bd08(2));
        sb6.append(", participant_identity:");
        sb6.append(event_info.m75939xb282bd08(1));
        sb6.append(", stream_status:");
        sb6.append(event_info.m75939xb282bd08(3));
        sb6.append("related_events:");
        java.util.LinkedList m75941xfb8219142 = event_info.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRelated_events(...)");
        sb6.append(kz5.n0.g0(m75941xfb8219142, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t3.f184081d, 31, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.OlympicsLiveRoomUtil", sb6.toString());
    }
}
