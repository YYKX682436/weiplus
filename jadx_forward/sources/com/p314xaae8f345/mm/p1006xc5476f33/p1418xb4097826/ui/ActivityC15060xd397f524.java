package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectDistrictUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI */
/* loaded from: classes8.dex */
public class ActivityC15060xd397f524 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f210222m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f210223d = "Finder.FinderSelectDistrictUI";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f210224e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210225f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210226g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 f210227h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 f210228i;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576412ai;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f3b);
        java.lang.String stringExtra = getIntent().getStringExtra("SelectedCountryCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f210224e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("SelectedProvinceCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        this.f210225f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("SelectedCityCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
        this.f210226g = stringExtra3;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("select_current_district");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db556 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556) h17;
        this.f210227h = c15509x418db556;
        c15509x418db556.N = false;
        c15509x418db556.M = true;
        java.lang.String str = this.f210224e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c15509x418db556.P = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5562 = this.f210227h;
        if (c15509x418db5562 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
            throw null;
        }
        java.lang.String str2 = this.f210225f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        c15509x418db5562.Q = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5563 = this.f210227h;
        if (c15509x418db5563 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
            throw null;
        }
        java.lang.String str3 = this.f210226g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        c15509x418db5563.R = str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5564 = this.f210227h;
        if (c15509x418db5564 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
            throw null;
        }
        c15509x418db5564.M();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("select_current_location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
        this.f210228i = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556) h18;
        r45.ae3 ae3Var = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).f338944e;
        if (ae3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5565 = this.f210228i;
            if (c15509x418db5565 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                throw null;
            }
            c15509x418db5565.N = true;
            java.lang.String Country = ae3Var.f451499d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Country, "Country");
            c15509x418db5565.P = Country;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5566 = this.f210228i;
            if (c15509x418db5566 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                throw null;
            }
            java.lang.String Province = ae3Var.f451500e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Province, "Province");
            c15509x418db5566.Q = Province;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5567 = this.f210228i;
            if (c15509x418db5567 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                throw null;
            }
            java.lang.String City = ae3Var.f451501f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(City, "City");
            c15509x418db5567.R = City;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5568 = this.f210228i;
            if (c15509x418db5568 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                throw null;
            }
            c15509x418db5568.M();
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("select_current_location_title", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("select_current_location", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wf(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xf(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210223d, "init location " + this.f210224e + ' ' + this.f210225f + ' ' + this.f210226g);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb != null) {
            java.lang.String str = c21560x1fce98fb.f279313q;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "select_current_district")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db556 = this.f210227h;
                if (c15509x418db556 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
                    throw null;
                }
                c15509x418db556.M = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5562 = this.f210228i;
                if (c15509x418db5562 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                    throw null;
                }
                c15509x418db5562.M = false;
                if (c15509x418db556 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
                    throw null;
                }
                this.f210224e = c15509x418db556.P;
                if (c15509x418db556 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
                    throw null;
                }
                this.f210225f = c15509x418db556.Q;
                if (c15509x418db556 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
                    throw null;
                }
                this.f210226g = c15509x418db556.R;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "select_current_location")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5563 = this.f210227h;
                if (c15509x418db5563 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentDistrictPref");
                    throw null;
                }
                c15509x418db5563.M = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15509x418db556 c15509x418db5564 = this.f210228i;
                if (c15509x418db5564 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                    throw null;
                }
                c15509x418db5564.M = true;
                if (c15509x418db5564 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                    throw null;
                }
                this.f210224e = c15509x418db5564.P;
                if (c15509x418db5564 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                    throw null;
                }
                this.f210225f = c15509x418db5564.Q;
                if (c15509x418db5564 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentLocationPref");
                    throw null;
                }
                this.f210226g = c15509x418db5564.R;
            }
            if (rVar != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
            }
        }
        return true;
    }
}
