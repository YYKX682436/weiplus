package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI31;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 */
/* loaded from: classes8.dex */
public final class ActivityC14119xff3e467 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f191142d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f191143e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191144f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f191145g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f191146h;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.d_;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.m1i);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ro(this));
        this.f191142d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("checkbox_preference_notrec");
        this.f191143e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("checkbox_preference_blacklist");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        java.lang.String str;
        java.lang.String str2 = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OccupyFinderUI31", "click " + str2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "checkbox_preference_notrec")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f191142d;
            java.lang.Boolean valueOf = c21541x1c1b08fe2 != null ? java.lang.Boolean.valueOf(c21541x1c1b08fe2.N()) : null;
            java.lang.String str3 = this.f191144f;
            if (str3 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.to toVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.to(valueOf, this);
                hb2.l0 l0Var = hb2.l0.f361601e;
                l0Var.getClass();
                r45.xo4 xo4Var = new r45.xo4();
                xo4Var.set(0, java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) ? 2 : 1));
                xo4Var.set(1, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.l0.f361602f, "ModifySingleUserNotRec display_optype:" + xo4Var.m75939xb282bd08(0));
                hb2.w0.m(l0Var, xo4Var, toVar, false, false, null, null, 60, null);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "checkbox_preference_blacklist") && (c21541x1c1b08fe = this.f191143e) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qo qoVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qo(this, c21541x1c1b08fe);
            if (!this.f191146h) {
                java.lang.String str4 = this.f191144f;
                if (str4 != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.y.f361647e.q(str4, c21541x1c1b08fe.N(), qoVar);
                }
            } else if (this.f191144f != null && (str = this.f191145g) != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y yVar = hb2.y.f361647e;
                boolean N = c21541x1c1b08fe.N();
                yVar.getClass();
                r45.kh2 kh2Var = new r45.kh2();
                kh2Var.set(8, str);
                if (N) {
                    kh2Var.set(0, 1);
                } else {
                    kh2Var.set(0, 2);
                }
                hb2.w0.m(yVar, kh2Var, qoVar, false, false, null, null, 60, null);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Bundle extras = getIntent().getExtras();
        this.f191144f = extras != null ? extras.getString("Username", "") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("FromScene_WXPROFILE", 0)) : null;
        this.f191146h = valueOf != null && valueOf.intValue() == 2;
        android.os.Bundle extras3 = getIntent().getExtras();
        this.f191145g = extras3 != null ? extras3.getString("SessionId", "") : null;
        android.os.Bundle extras4 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras4 != null ? java.lang.Integer.valueOf(extras4.getInt("isNotRec", 0)) : null;
        android.os.Bundle extras5 = getIntent().getExtras();
        java.lang.Integer valueOf3 = extras5 != null ? java.lang.Integer.valueOf(extras5.getInt("isBlackList", 0)) : null;
        if (valueOf2 != null && valueOf2.intValue() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_notrec", true);
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f191142d;
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(valueOf2 != null && valueOf2.intValue() == 1);
                c21541x1c1b08fe.f279318v = false;
            }
        }
        if (valueOf3 != null && valueOf3.intValue() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("checkbox_preference_blacklist", true);
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f191143e;
            if (c21541x1c1b08fe2 != null) {
                c21541x1c1b08fe2.O(valueOf3 != null && valueOf3.intValue() == 1);
                c21541x1c1b08fe2.f279318v = false;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }
}
