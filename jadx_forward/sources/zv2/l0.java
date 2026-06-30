package zv2;

/* loaded from: classes10.dex */
public final class l0 extends zv2.b {

    /* renamed from: i, reason: collision with root package name */
    public static final zv2.h0 f557941i = new zv2.h0(null);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f557942m = jz5.h.b(zv2.g0.f557938d);

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f557943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557943h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        char c17;
        if (f557941i.b()) {
            r45.n74 n74Var = (r45.n74) ((jz5.n) f557942m).mo141623x754a37bb();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.ta.f(ya2.e1.f542005a, this.f557928d, n74Var.f462663d, n74Var.f462664e, n74Var.f462665f, false, false, false, null, new zv2.i0(this), 240, null);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f557928d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ry2.o k76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).k7();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderTencentVideoChooseLink");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            d17 = "https://m.v.qq.com/video/selection/index.html";
        }
        r45.tn2 tn2Var = k76.f482944J;
        boolean z17 = true;
        char c18 = '&';
        if (tn2Var != null && tn2Var.m75939xb282bd08(0) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append("?" + ("businessType=" + tn2Var + "?.businessType"));
            d17 = sb6.toString();
            c17 = '&';
        } else {
            c17 = '?';
        }
        java.lang.String m75945x2fec8307 = tn2Var != null ? tn2Var.m75945x2fec8307(1) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(d17);
            sb7.append(c17 + ("cid=" + tn2Var + "?.cid"));
            d17 = sb7.toString();
            c17 = '&';
        }
        java.lang.String m75945x2fec83072 = tn2Var != null ? tn2Var.m75945x2fec8307(2) : null;
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c18 = c17;
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(d17);
            sb8.append(c17 + ("lid=" + tn2Var + "?.lid"));
            d17 = sb8.toString();
        }
        java.lang.String str = d17 + c18 + "callBackKey=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(d17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // zv2.b
    public boolean c() {
        return f557941i.a(this.f557928d);
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String m76523x98b23862 = jumpInfo.m76523x98b23862();
        if (m76523x98b23862 == null) {
            m76523x98b23862 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(this.f557929e, m76523x98b23862, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        boolean b17 = f557941i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        if (!b17) {
            c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.C30861xcebc809e.f563425c70);
            c15305x8b2e5786.m62141xb8c4b266(0);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f557928d;
        java.lang.String string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c15305x8b2e5786.m62140x6fd9aa19(string);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79907xdf05f6fe);
        c15305x8b2e5786.m62141xb8c4b266(activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
    }

    @Override // zv2.b
    public void g() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
            k17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
        }
        java.lang.Object element = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if ((k17 != null ? (android.app.Activity) k17.get() : null) != null) {
            element = k17.get();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 != null) {
            xc2.y2 y2Var = xc2.y2.f534876a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534789r = 6;
            p0Var.f534790s = 2;
            p0Var.f534786o = "commentScene=" + this.f557943h.m75939xb282bd08(5);
            xc2.y2.i(y2Var, (android.content.Context) element, p0Var, 0, null, 12, null);
        }
    }

    @Override // zv2.b
    public void k() {
        this.f557943h.set(5, 74);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, this.f557943h, "button_post_choose_tencentVideo", 0, null, false, null, 56, null);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.j0(this), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new zv2.k0(this), null, 20, null)), null);
    }

    public final r45.wf6 m(int i17, int i18, org.json.JSONObject jSONObject) {
        r45.wf6 wf6Var = new r45.wf6();
        wf6Var.set(1, java.lang.Integer.valueOf(i17));
        wf6Var.set(2, java.lang.Integer.valueOf(i18));
        r45.c74 c74Var = new r45.c74();
        c74Var.set(0, jSONObject.optString("iconUrl"));
        c74Var.set(1, jSONObject.optString("wording"));
        wf6Var.set(5, c74Var);
        wf6Var.set(0, 1);
        return wf6Var;
    }
}
