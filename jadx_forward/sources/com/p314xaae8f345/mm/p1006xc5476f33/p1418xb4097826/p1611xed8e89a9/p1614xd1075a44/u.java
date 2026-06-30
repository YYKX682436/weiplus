package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206317a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f206318b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f206319c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f206320d;

    public u(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206317a = activity;
        this.f206318b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.t(header));
        this.f206319c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.r(this));
        this.f206320d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s(this));
    }

    public final void a(java.lang.String username) {
        java.lang.String str;
        r45.sf2 sf2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(username);
        java.lang.String str2 = "";
        if (l2Var == null || (sf2Var = l2Var.f205460p) == null || (str = sf2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "[handleIPAndMcn] agencyName:".concat(str));
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209573ya).mo141623x754a37bb()).r()).intValue() == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str2 = "" + this.f206317a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ez7, str);
        }
        boolean z17 = str2.length() > 0;
        jz5.g gVar = this.f206319c;
        if (!z17) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        } else {
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) this.f206320d).mo141623x754a37bb()).setText(r26.n0.u0(str2).toString());
        }
    }
}
