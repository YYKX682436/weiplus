package ma2;

/* loaded from: classes2.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e f406736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f406737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f406740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406741f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e activityC13661xea07466e, long j17, java.lang.String str, java.lang.String str2, long j18, java.lang.String str3) {
        this.f406736a = activityC13661xea07466e;
        this.f406737b = j17;
        this.f406738c = str;
        this.f406739d = str2;
        this.f406740e = j18;
        this.f406741f = str3;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e activity = this.f406736a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        jz5.l lVar = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
        jz5.l lVar2 = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
        jz5.l lVar3 = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        jz5.l lVar4 = new jz5.l("source_comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(7)));
        jz5.l lVar5 = new jz5.l("cluster_id", pm0.v.u(this.f406737b));
        jz5.l lVar6 = new jz5.l("cluster_name", this.f406738c);
        jz5.l lVar7 = new jz5.l("cluster_reason_recommendation", this.f406739d);
        jz5.l lVar8 = new jz5.l("source_feedid", pm0.v.u(this.f406740e));
        jz5.l lVar9 = new jz5.l("source_session_buffer", this.f406741f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((java.lang.Number) activity.f183333u.get(0)).longValue());
        sb6.append('#');
        sb6.append(((java.lang.Number) activity.f183333u.get(1)).longValue());
        jz5.l lVar10 = new jz5.l("cluster_tab_staytime", sb6.toString());
        long longValue = ((java.lang.Number) activity.f183333u.get(0)).longValue();
        java.lang.Object obj = activity.f183333u.get(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, new jz5.l("stay_time_ms", java.lang.Long.valueOf(longValue + ((java.lang.Number) obj).longValue())));
    }
}
