package n74;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f416856s;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f416857a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f416858b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f416859c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416860d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f416861e;

    /* renamed from: f, reason: collision with root package name */
    public s34.y f416862f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t f416863g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2121xb73a0fae.C17755x55cb6279 f416864h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f416865i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f416866j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f416867k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f416868l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f416869m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f416870n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f416871o;

    /* renamed from: p, reason: collision with root package name */
    public final w64.k f416872p;

    /* renamed from: q, reason: collision with root package name */
    public final int f416873q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f416874r;

    public d(android.content.Context context, int i17, w64.k kVar) {
        this.f416857a = context;
        this.f416873q = i17;
        this.f416872p = kVar;
    }

    public static java.lang.String a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (f416856s == null) {
            f416856s = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (f416856s == null) {
            f416856s = "";
        }
        if (i17 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "0";
        }
        if (i17 <= 999) {
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return valueOf;
        }
        if (!f416856s.equals("zh_CN") && !f416856s.equals("zh_HK") && !f416856s.equals("zh_TW")) {
            if (i17 <= 999000) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574759jd5, java.lang.Double.valueOf(((i17 * 1.0f) / 1000.0f) - 0.05d));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                return string;
            }
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jd7, 999);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string2;
        }
        if (i17 <= 9999) {
            java.lang.String valueOf2 = java.lang.String.valueOf(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return valueOf2;
        }
        if (i17 <= 990000) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574758jd4, java.lang.Double.valueOf(((i17 * 1.0f) / 10000.0f) - 0.05d));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string3;
        }
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jd6, 99);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        return string4;
    }

    public java.lang.String b() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        s34.y yVar = this.f416862f;
        if (yVar == null || (str = yVar.f484362a) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        return str;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f416859c;
        if (u3Var != null && u3Var.isShowing()) {
            this.f416859c.dismiss();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActionBtnFollowFinderHelper", "hideProgressDlg");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }

    public void d(s34.y yVar, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f416858b;
        android.content.Context context = this.f416857a;
        if (k0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bj_, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
            this.f416866j = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gac);
            this.f416867k = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            this.f416868l = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbf);
            this.f416869m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            this.f416870n = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566565gb0);
            this.f416871o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dzz);
            this.f416865i = inflate;
            findViewById.setOnClickListener(new n74.a(this));
            this.f416866j.setOnClickListener(new n74.b(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, true, 0);
            this.f416858b = k0Var2;
            k0Var2.s(this.f416865i, true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f416858b;
            k0Var3.V1 = true;
            k0Var3.e(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        this.f416868l.setText(yVar.f484364c);
        this.f416869m.setText(yVar.f484365d);
        if (this.f416873q == 1000) {
            this.f416866j.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f416874r) ? "关注视频号" : this.f416874r);
        }
        if (i17 > 0) {
            this.f416870n.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j76, a(i17)));
            this.f416870n.setVisibility(0);
        } else {
            this.f416870n.setVisibility(8);
        }
        if (i18 > 0) {
            this.f416871o.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574710j75, a(i18)));
            this.f416871o.setVisibility(0);
        } else {
            this.f416871o.setVisibility(8);
        }
        a84.z.c(yVar.f484363b, this.f416867k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (!this.f416858b.i()) {
            this.f416858b.v();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }
}
