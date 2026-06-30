package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingMsgUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI */
/* loaded from: classes8.dex */
public final class ActivityC15069x5667c8cb extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f210266h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f210267d;

    /* renamed from: e, reason: collision with root package name */
    public zy2.gc f210268e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f210269f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gh(this));

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210270g;

    public final void V6(long j17, int i17) {
        jz5.f0 f0Var;
        if (j17 == 128 || j17 == 256) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.j9.a(ya2.r.f542058a, i17 == 0, j17 == 128 ? 3 : 4, null, 4, null);
            return;
        }
        android.app.Dialog dialog = this.f210267d;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f210267d = db5.e1.Q(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hh.f210862d);
        }
        this.f210268e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ih(this);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        java.lang.String username = xy2.c.e(mo55332x76847179);
        zy2.gc gcVar = this.f210268e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        hb2.j jVar = hb2.j.f361592e;
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModMessageRedDot", "modifyMessageRedDotSetting username:".concat(username));
        r45.yh2 yh2Var = new r45.yh2();
        yh2Var.set(0, java.lang.Long.valueOf(j17));
        yh2Var.set(1, java.lang.Integer.valueOf(i17));
        hb2.w0.a(jVar, username, yh2Var, gcVar, false, false, null, 56, null);
    }

    public final void W6(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingMsgUI", "[updatePreference] key=" + str + " isEnable=" + z17);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17;
        c21541x1c1b08fe.O(z17);
        c21541x1c1b08fe.f279318v = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576420ao;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210270g;
        if (m2Var != null) {
            m2Var.d(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        android.app.Dialog dialog = this.f210267d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.enf);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m79336x8b97809d, "getPreferenceScreen(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2(mo55332x76847179, m79336x8b97809d);
        this.f210270g = m2Var;
        m2Var.c();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.jh(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        android.app.Dialog dialog = this.f210267d;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f210268e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210270g;
        if (m2Var == null || (fVar = m2Var.f211031e) == null) {
            return;
        }
        fVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210270g;
        if (m2Var != null) {
            m2Var.e(rVar, c21560x1fce98fb);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingMsgUI", "click " + str);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(str);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        int i17 = 0;
        if (c21541x1c1b08fe != null && c21541x1c1b08fe.N()) {
            i17 = 1;
        }
        int i18 = i17 ^ 1;
        if (str != null) {
            switch (str.hashCode()) {
                case -1253701633:
                    if (str.equals("checkbox_preference_like")) {
                        V6(1L, i18);
                        break;
                    }
                    break;
                case -802775703:
                    if (str.equals("checkbox_preference_wx_comment")) {
                        V6(256L, i18);
                        break;
                    }
                    break;
                case 786619639:
                    if (str.equals("checkbox_preference_comment")) {
                        V6(2L, i18);
                        break;
                    }
                    break;
                case 1601531085:
                    if (str.equals("checkbox_preference_wx_like")) {
                        V6(128L, i18);
                        break;
                    }
                    break;
                case 1912347161:
                    if (str.equals("checkbox_preference_follow")) {
                        V6(4L, i18);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((java.lang.Boolean) ((jz5.n) this.f210269f).mo141623x754a37bb()).booleanValue()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_like", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_comment", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_follow", true);
            g92.b bVar = g92.b.f351302e;
            r45.e33 e33Var = (r45.e33) bVar.k2().d().m75936x14adae67(17);
            W6("checkbox_preference_wx_like", e33Var != null ? e33Var.m75933x41a8a7f2(2) : true);
            r45.e33 e33Var2 = (r45.e33) bVar.k2().d().m75936x14adae67(17);
            W6("checkbox_preference_wx_comment", e33Var2 != null ? e33Var2.m75933x41a8a7f2(3) : true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_wx_like", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_wx_comment", true);
            ya2.g gVar = ya2.h.f542017a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ya2.b2 b17 = gVar.b(xy2.c.e(mo55332x76847179));
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingMsgUI", "[updateView] username=" + b17.D0() + " messageStatus=" + b17.f69327x1c739054);
                W6("checkbox_preference_like", (b17.f69327x1c739054 & 1) != 1);
                W6("checkbox_preference_comment", (b17.f69327x1c739054 & 2) != 2);
                W6("checkbox_preference_follow", (b17.f69327x1c739054 & 4) != 4);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210270g;
        if (m2Var != null) {
            m2Var.h();
        }
    }
}
