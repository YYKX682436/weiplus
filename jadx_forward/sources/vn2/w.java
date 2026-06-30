package vn2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f519933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f519934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f519935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519937h;

    public w(android.app.Activity activity, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.qt2 qt2Var) {
        this.f519933d = activity;
        this.f519934e = z17;
        this.f519935f = z18;
        this.f519936g = abstractC14490x69736cb5;
        this.f519937h = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        android.app.Activity activity = this.f519933d;
        java.lang.String string2 = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lql);
        boolean z17 = this.f519934e;
        if (z17) {
            string = this.f519935f ? activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqj) : activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = "";
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(string2, string, activity, new vn2.v(this.f519934e, this.f519936g, this.f519937h, this.f519935f, this.f519933d), null);
        java.lang.String str = z17 ? "open_topstory_bar" : "set_watch_later_describe";
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519936g;
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        r45.qt2 qt2Var = this.f519937h;
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        java.lang.String m76829x97edf6c0 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0();
        lVarArr[5] = new jz5.l("session_buffer", m76829x97edf6c0 != null ? m76829x97edf6c0 : "");
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
    }
}
