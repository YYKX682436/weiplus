package zv2;

/* loaded from: classes10.dex */
public final class q extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final ya2.b2 f557955h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f557956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557956i = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        this.f557955h = ya2.h.f542017a.b(xy2.c.e(activity));
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        ya2.b2 b2Var = this.f557955h;
        java.lang.String str = b2Var != null ? b2Var.f69347xdec927b : null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f557928d;
        if (str == null) {
            str = xy2.c.e(activity);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13945xb319c50.class);
        intent.putExtra("finder_username", str);
        activity.startActivityForResult(intent, 20004);
    }

    @Override // zv2.b
    public boolean c() {
        return ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).oj(this.f557955h);
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String string = this.f557928d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.evg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(this.f557929e, string + (char) 65306 + jumpInfo.m76523x98b23862(), false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        java.lang.String string = this.f557928d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.evg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.m62140x6fd9aa19(string);
        c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f80318x77fc94e5);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f80318x77fc94e5);
    }

    @Override // zv2.b
    public void g() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        java.lang.String m77225xe7ed3fec;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || (m77225xe7ed3fec = m76506x42318aa0.m77225xe7ed3fec()) == null) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(m77225xe7ed3fec).optString("productId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            qk.c0 c0Var = new qk.c0(optString);
            c0Var.f445731g = 0;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class))).wi(this.f557928d, c0Var);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // zv2.b
    public void k() {
        this.f557956i.set(5, 74);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, this.f557956i, "button_post_choose_emoji", 0, null, false, null, 56, null);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.o(this), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new zv2.p(this), null, 20, null)), null);
    }
}
