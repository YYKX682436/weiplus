package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class e5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f184760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f184761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f184763h;

    public e5(boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var) {
        this.f184759d = z17;
        this.f184760e = c19786x6a1e2862;
        this.f184761f = q6Var;
        this.f184762g = s0Var;
        this.f184763h = z0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "feedId:" + pm0.v.u(req.m75942xfb822ef2(0)) + ", scene:" + req.m75939xb282bd08(1) + ", optype:" + req.m75939xb282bd08(2));
        if (ret.m75939xb282bd08(1) == 0) {
            int i17 = !this.f184759d ? 1 : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f184760e;
            if (c19786x6a1e2862 == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || (str = m76506x42318aa0.m77225xe7ed3fec()) == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[updateOpParams] hideFlag:" + i17 + ", necessaryParams:" + str);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.put("hide_flag", i17);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862 != null ? c19786x6a1e2862.m76506x42318aa0() : null;
                if (m76506x42318aa02 != null) {
                    m76506x42318aa02.m77230x8be9d4f8(jSONObject.toString());
                }
            } catch (org.json.JSONException unused) {
            }
            this.f184761f.x(this.f184762g, this.f184763h.E, true);
        }
    }
}
