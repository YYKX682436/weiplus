package rq2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.p f480391a = new rq2.p();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f480392b = "94";

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, long j18) {
        java.lang.String str;
        java.lang.String m59299x6bf53a6c = abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c();
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        boolean z17 = false;
        if (m59258xd0557130 == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long m76784x5db1b11 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11();
        ((m30.m) rVar).getClass();
        java.lang.String q17 = b52.b.q(m76784x5db1b11);
        java.lang.String str2 = f480392b;
        java.lang.String m76829x97edf6c0 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0();
        if (m76829x97edf6c0 == null) {
            m76829x97edf6c0 = "";
        }
        long m75939xb282bd08 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130() != null ? r7.m75939xb282bd08(10) : 0L;
        r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        if (m59258xd05571302 != null && m59258xd05571302.m75939xb282bd08(2) == 1) {
            z17 = true;
        }
        long j19 = z17 ? 1L : 2L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6530xcc9fbb1f c6530xcc9fbb1f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6530xcc9fbb1f();
        c6530xcc9fbb1f.f138821d = c6530xcc9fbb1f.b("UserName", m59299x6bf53a6c, true);
        c6530xcc9fbb1f.f138822e = c6530xcc9fbb1f.b("LiveID", str, true);
        c6530xcc9fbb1f.f138823f = c6530xcc9fbb1f.b("FeedID", q17, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        c6530xcc9fbb1f.f138824g = c6530xcc9fbb1f.b("sessionid", Ri != null ? Ri : "", true);
        c6530xcc9fbb1f.f138825h = c01.id.c();
        c6530xcc9fbb1f.f138826i = j18;
        c6530xcc9fbb1f.f138827j = c6530xcc9fbb1f.b("CommentScene", str2, true);
        c6530xcc9fbb1f.f138828k = j17;
        c6530xcc9fbb1f.f138829l = j19;
        c6530xcc9fbb1f.f138830m = c6530xcc9fbb1f.b("ContextId", rq2.x.f480448b, true);
        c6530xcc9fbb1f.f138831n = c6530xcc9fbb1f.b("ClickTabContextId", "1001-" + c01.id.c(), true);
        c6530xcc9fbb1f.f138832o = c6530xcc9fbb1f.b("SessionBuffer", m76829x97edf6c0, true);
        c6530xcc9fbb1f.f138833p = m75939xb282bd08;
        c6530xcc9fbb1f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayFeedEntranceLogReporter", c6530xcc9fbb1f.n());
    }
}
