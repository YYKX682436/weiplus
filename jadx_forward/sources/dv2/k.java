package dv2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public long f325413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.v f325414b;

    public k(dv2.v vVar) {
        this.f325414b = vVar;
    }

    public final void a(java.lang.String eventId, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u3.f206916a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f325414b.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        r45.qt2 b17 = u3Var.b(activity);
        java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", 403), new jz5.l("follow_frequently_viewed_tab", java.lang.Integer.valueOf(i17)));
        l17.putAll(u3Var.a(b17));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventId, "page_out")) {
            l17.put("stay_time", java.lang.Long.valueOf(j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] page_event event=");
        sb6.append(eventId);
        sb6.append(" page_id=50457 comment_scene=403 follow_frequently_viewed_tab=");
        sb6.append(i17);
        sb6.append(" stay_time=");
        sb6.append(j17);
        sb6.append(" ref_commentscene=");
        sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.m75939xb282bd08(7)) : null);
        sb6.append(" finder_context_id=");
        sb6.append(b17 != null ? b17.m75945x2fec8307(1) : null);
        sb6.append(" finder_tab_context_id=");
        sb6.append(b17 != null ? b17.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfReporter", sb6.toString());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Aj(50457, eventId, l17, 1, false);
    }
}
