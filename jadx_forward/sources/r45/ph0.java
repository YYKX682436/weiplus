package r45;

/* loaded from: classes11.dex */
public class ph0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464575d;

    /* renamed from: e, reason: collision with root package name */
    public int f464576e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464577f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f464578g;

    /* renamed from: h, reason: collision with root package name */
    public int f464579h;

    /* renamed from: i, reason: collision with root package name */
    public int f464580i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f464581m;

    /* renamed from: n, reason: collision with root package name */
    public int f464582n;

    /* renamed from: o, reason: collision with root package name */
    public int f464583o;

    /* renamed from: p, reason: collision with root package name */
    public int f464584p;

    /* renamed from: q, reason: collision with root package name */
    public int f464585q;

    /* renamed from: r, reason: collision with root package name */
    public int f464586r;

    /* renamed from: s, reason: collision with root package name */
    public int f464587s;

    /* renamed from: t, reason: collision with root package name */
    public int f464588t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ph0)) {
            return false;
        }
        r45.ph0 ph0Var = (r45.ph0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464575d), java.lang.Integer.valueOf(ph0Var.f464575d)) && n51.f.a(java.lang.Integer.valueOf(this.f464576e), java.lang.Integer.valueOf(ph0Var.f464576e)) && n51.f.a(this.f464577f, ph0Var.f464577f) && n51.f.a(java.lang.Boolean.valueOf(this.f464578g), java.lang.Boolean.valueOf(ph0Var.f464578g)) && n51.f.a(java.lang.Integer.valueOf(this.f464579h), java.lang.Integer.valueOf(ph0Var.f464579h)) && n51.f.a(java.lang.Integer.valueOf(this.f464580i), java.lang.Integer.valueOf(ph0Var.f464580i)) && n51.f.a(java.lang.Boolean.valueOf(this.f464581m), java.lang.Boolean.valueOf(ph0Var.f464581m)) && n51.f.a(java.lang.Integer.valueOf(this.f464582n), java.lang.Integer.valueOf(ph0Var.f464582n)) && n51.f.a(java.lang.Integer.valueOf(this.f464583o), java.lang.Integer.valueOf(ph0Var.f464583o)) && n51.f.a(java.lang.Integer.valueOf(this.f464584p), java.lang.Integer.valueOf(ph0Var.f464584p)) && n51.f.a(java.lang.Integer.valueOf(this.f464585q), java.lang.Integer.valueOf(ph0Var.f464585q)) && n51.f.a(java.lang.Integer.valueOf(this.f464586r), java.lang.Integer.valueOf(ph0Var.f464586r)) && n51.f.a(java.lang.Integer.valueOf(this.f464587s), java.lang.Integer.valueOf(ph0Var.f464587s)) && n51.f.a(java.lang.Integer.valueOf(this.f464588t), java.lang.Integer.valueOf(ph0Var.f464588t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464575d);
            fVar.e(2, this.f464576e);
            java.lang.String str = this.f464577f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f464578g);
            fVar.e(5, this.f464579h);
            fVar.e(6, this.f464580i);
            fVar.a(7, this.f464581m);
            fVar.e(8, this.f464582n);
            fVar.e(10, this.f464583o);
            fVar.e(11, this.f464584p);
            fVar.e(12, this.f464585q);
            fVar.e(13, this.f464586r);
            fVar.e(16, this.f464587s);
            fVar.e(17, this.f464588t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464575d) + 0 + b36.f.e(2, this.f464576e);
            java.lang.String str2 = this.f464577f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.a(4, this.f464578g) + b36.f.e(5, this.f464579h) + b36.f.e(6, this.f464580i) + b36.f.a(7, this.f464581m) + b36.f.e(8, this.f464582n) + b36.f.e(10, this.f464583o) + b36.f.e(11, this.f464584p) + b36.f.e(12, this.f464585q) + b36.f.e(13, this.f464586r) + b36.f.e(16, this.f464587s) + b36.f.e(17, this.f464588t);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.ph0 ph0Var = (r45.ph0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ph0Var.f464575d = aVar2.g(intValue);
                return 0;
            case 2:
                ph0Var.f464576e = aVar2.g(intValue);
                return 0;
            case 3:
                ph0Var.f464577f = aVar2.k(intValue);
                return 0;
            case 4:
                ph0Var.f464578g = aVar2.c(intValue);
                return 0;
            case 5:
                ph0Var.f464579h = aVar2.g(intValue);
                return 0;
            case 6:
                ph0Var.f464580i = aVar2.g(intValue);
                return 0;
            case 7:
                ph0Var.f464581m = aVar2.c(intValue);
                return 0;
            case 8:
                ph0Var.f464582n = aVar2.g(intValue);
                return 0;
            case 9:
            case 14:
            case 15:
            default:
                return -1;
            case 10:
                ph0Var.f464583o = aVar2.g(intValue);
                return 0;
            case 11:
                ph0Var.f464584p = aVar2.g(intValue);
                return 0;
            case 12:
                ph0Var.f464585q = aVar2.g(intValue);
                return 0;
            case 13:
                ph0Var.f464586r = aVar2.g(intValue);
                return 0;
            case 16:
                ph0Var.f464587s = aVar2.g(intValue);
                return 0;
            case 17:
                ph0Var.f464588t = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f464575d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ui_version", valueOf, false);
            eVar.d(jSONObject, "subscribe_count_lower_limit", java.lang.Integer.valueOf(this.f464576e), false);
            eVar.d(jSONObject, "comment_page_query", this.f464577f, false);
            eVar.d(jSONObject, "open_subscribe", java.lang.Boolean.valueOf(this.f464578g), false);
            eVar.d(jSONObject, "request_frequency_time", java.lang.Integer.valueOf(this.f464579h), false);
            eVar.d(jSONObject, "notify_request_frequency_time", java.lang.Integer.valueOf(this.f464580i), false);
            eVar.d(jSONObject, "live_autoplay", java.lang.Boolean.valueOf(this.f464581m), false);
            eVar.d(jSONObject, "request_mass_msg_count", java.lang.Integer.valueOf(this.f464582n), false);
            eVar.d(jSONObject, "notify_msg_request_frequency_time", java.lang.Integer.valueOf(this.f464583o), false);
            eVar.d(jSONObject, "main_tab_request_frequency_time", java.lang.Integer.valueOf(this.f464584p), false);
            eVar.d(jSONObject, "poi_report_frequency_time", java.lang.Integer.valueOf(this.f464585q), false);
            eVar.d(jSONObject, "reliable_notify_request_frequency_time", java.lang.Integer.valueOf(this.f464586r), false);
            eVar.d(jSONObject, "masonry_pre_loadmore_cnt", java.lang.Integer.valueOf(this.f464587s), false);
            eVar.d(jSONObject, "ecs_getrecommendfeeds_cgi_max_buffer_size", java.lang.Integer.valueOf(this.f464588t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
