package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class zj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f287692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f287693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f287694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287695h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f287696i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk f287697m;

    public zj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk bkVar, java.util.Map map, boolean z17, boolean z18, android.view.View view, java.lang.String str, boolean z19) {
        this.f287697m = bkVar;
        this.f287691d = map;
        this.f287692e = z17;
        this.f287693f = z18;
        this.f287694g = view;
        this.f287695h = str;
        this.f287696i = z19;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.content.res.Resources resources;
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk bkVar = this.f287697m;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = bkVar.f285028e;
        java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
        java.util.Map map = this.f287691d;
        boolean v07 = c21908xb66fd105.v0(map);
        boolean z17 = this.f287693f;
        boolean z18 = this.f287692e;
        android.view.View view = this.f287694g;
        if (v07 && z18 && z17) {
            if (bkVar.f285028e.G.f328615h) {
                g4Var.add(0, 9, 0, view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.peg));
            } else {
                g4Var.add(0, 8, 0, view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pef));
            }
        }
        java.lang.String str2 = this.f287695h;
        if (r01.z.n(str2) && bkVar.f285028e.g1(map) && this.f287696i) {
            if (z18 && z17) {
                if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) bkVar.f285028e.f284708s.f542241c.a(sb5.g.class))).n0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bkVar.f285028e.N)) {
                    g4Var.d(0, bkVar.f285028e.f284708s.s().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31), bkVar.f285028e.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcf));
                } else {
                    g4Var.d(0, bkVar.f285028e.f284708s.s().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31), java.lang.String.format(bkVar.f285028e.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcg), bkVar.f285028e.N));
                }
            } else if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) bkVar.f285028e.f284708s.f542241c.a(sb5.g.class))).n0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bkVar.f285028e.N)) {
                g4Var.f(1, bkVar.f285028e.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hd6));
            } else {
                g4Var.f(1, java.lang.String.format(bkVar.f285028e.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hd7), bkVar.f285028e.N));
            }
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str2)) {
            resources = view.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hcr;
        } else {
            resources = view.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hcp;
        }
        g4Var.add(0, 2, 0, resources.getString(i17));
    }
}
