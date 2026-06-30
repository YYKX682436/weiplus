package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAccountManagent;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent */
/* loaded from: classes8.dex */
public final class ActivityC13930xdbd6d612 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f f190731g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f(null);

    /* renamed from: h, reason: collision with root package name */
    public static boolean f190732h = true;

    /* renamed from: e, reason: collision with root package name */
    public r45.d1 f190734e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f190733d = true;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f190735f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g(this));

    public final void V6(boolean z17) {
        java.util.LinkedList<r45.g1> m75941xfb821914;
        java.util.LinkedList<r45.h1> m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).t();
        }
        r45.d1 d1Var = this.f190734e;
        if ((d1Var == null || (m75941xfb8219143 = d1Var.m75941xfb821914(1)) == null || !(m75941xfb8219143.isEmpty() ^ true)) ? false : true) {
            r45.d1 d1Var2 = this.f190734e;
            if (d1Var2 != null && (m75941xfb8219142 = d1Var2.m75941xfb821914(1)) != null) {
                for (r45.h1 h1Var : m75941xfb8219142) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var);
                    if (!h1Var.m75941xfb821914(1).isEmpty()) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(this, null);
                        c21568x1a71b23b.L(h1Var.m75945x2fec8307(0));
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).d(c21568x1a71b23b, -1);
                        java.util.LinkedList<r45.g1> m75941xfb8219144 = h1Var.m75941xfb821914(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getConfigs(...)");
                        for (r45.g1 g1Var : m75941xfb8219144) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var);
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).d(new sy2.a(g1Var, this), -1);
                        }
                    }
                }
            }
        } else {
            r45.d1 d1Var3 = this.f190734e;
            if (d1Var3 != null && (m75941xfb821914 = d1Var3.m75941xfb821914(0)) != null) {
                for (r45.g1 g1Var2 : m75941xfb821914) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d2 = m79336x8b97809d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var2);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d2).d(new sy2.a(g1Var2, this), -1);
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576409ah;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        V6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.d1 d1Var;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572778mg0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("ACCOUNT_EXTRA_CONFIG");
        if (byteArrayExtra != null) {
            d1Var = new r45.d1();
            d1Var.mo11468x92b714fd(byteArrayExtra);
        } else {
            d1Var = null;
        }
        this.f190734e = d1Var;
        if (d1Var != null) {
            mo43517x10010bd5();
        } else {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManagementUI", "onCreate accountExtConfig is null");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c21560x1fce98fb, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderAccountManagementPref");
        sy2.a aVar = (sy2.a) c21560x1fce98fb;
        r45.g1 g1Var = aVar.L;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = g1Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) g1Var.m75936x14adae67(7) : null;
        android.content.Context context = aVar.f279303d;
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManagementPref", "jumpLiteApp, liteAppId: " + c19786x6a1e2862);
            xc2.y2 y2Var = xc2.y2.f534876a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
        } else {
            r45.g1 g1Var2 = aVar.L;
            java.lang.Integer valueOf = g1Var2 != null ? java.lang.Integer.valueOf(g1Var2.m75939xb282bd08(3)) : null;
            if (valueOf != null && valueOf.intValue() == 2) {
                android.content.Intent intent = new android.content.Intent();
                l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String e17 = xy2.c.e(context);
                r45.g1 g1Var3 = aVar.L;
                intent.putExtra("rawUrl", ((k40.f) eVar).Ai(e17, g1Var3 != null ? g1Var3.m75945x2fec8307(4) : null));
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                l81.b1 b1Var = new l81.b1();
                r45.g1 g1Var4 = aVar.L;
                java.lang.String str2 = "";
                if (g1Var4 == null || (str = g1Var4.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                b1Var.f398545a = str;
                r45.g1 g1Var5 = aVar.L;
                if (g1Var5 != null && (m75945x2fec8307 = g1Var5.m75945x2fec8307(1)) != null) {
                    str2 = m75945x2fec8307;
                }
                b1Var.f398555f = str2;
                r45.g1 g1Var6 = aVar.L;
                b1Var.f398565k = g1Var6 != null ? g1Var6.m75939xb282bd08(5) : 1000;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f190733d) {
            this.f190733d = false;
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(getLifecycleAsyncScope(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j(this, null), 3, null);
        }
    }
}
