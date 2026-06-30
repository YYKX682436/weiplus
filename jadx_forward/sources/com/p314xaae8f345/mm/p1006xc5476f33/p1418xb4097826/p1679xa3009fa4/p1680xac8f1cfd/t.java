package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f217481d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f217482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f217483f;

    public t(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa contact, java.lang.String friend_follow_count_text, java.util.List objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friend_follow_count_text, "friend_follow_count_text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        this.f217481d = contact;
        this.f217482e = friend_follow_count_text;
        this.f217483f = objects;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t)) {
            return 0;
        }
        java.lang.String m76197x6c03c64c = this.f217481d.m76197x6c03c64c();
        int hashCode = m76197x6c03c64c != null ? m76197x6c03c64c.hashCode() : 0;
        java.lang.String m76197x6c03c64c2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t) obj).f217481d.m76197x6c03c64c();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(hashCode, m76197x6c03c64c2 != null ? m76197x6c03c64c2.hashCode() : 0);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f217481d.m76197x6c03c64c() != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
