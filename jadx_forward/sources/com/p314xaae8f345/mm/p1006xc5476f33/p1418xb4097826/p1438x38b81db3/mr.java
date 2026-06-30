package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class mr implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f185558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f185559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f185561e;

    public mr(in5.s0 s0Var, so2.u1 u1Var, int i17, boolean z17, long j17) {
        this.f185557a = s0Var;
        this.f185558b = u1Var;
        this.f185559c = i17;
        this.f185560d = z17;
        this.f185561e = j17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", b17);
        android.content.Context context = this.f185557a.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n));
        so2.u1 u1Var = this.f185558b;
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(u1Var.getFeedObject().m59251x5db1b11()));
        lVarArr[3] = new jz5.l("feed_location_id", java.lang.Integer.valueOf(this.f185559c));
        r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
        lVarArr[4] = new jz5.l("recommend_reason", m76771x17e42f9f != null ? m76771x17e42f9f.m75945x2fec8307(0) : null);
        lVarArr[5] = new jz5.l("follow_type", java.lang.Integer.valueOf(this.f185560d ? 1 : 0));
        lVarArr[6] = new jz5.l("session_buffer", u1Var.getFeedObject().getFeedObject().m76829x97edf6c0());
        lVarArr[7] = new jz5.l("pagein_feedid", pm0.v.u(this.f185561e));
        return kz5.c1.k(lVarArr);
    }
}
