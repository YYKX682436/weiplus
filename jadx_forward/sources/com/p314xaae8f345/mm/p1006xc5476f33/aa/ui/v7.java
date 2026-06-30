package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f154390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d0 f154392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154393g;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda, android.widget.TextView textView, java.lang.String str, r45.d0 d0Var) {
        this.f154393g = activityC11355x7bcfecda;
        this.f154390d = textView;
        this.f154391e = str;
        this.f154392f = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f154390d;
        if (textView.getMeasuredWidth() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154393g;
            sb6.append(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgw));
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = sb7 + (" " + this.f154391e + " ");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11355x7bcfecda.mo55332x76847179();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, str);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.S;
            activityC11355x7bcfecda.o7(textView, i17, sb7, this.f154392f);
        }
    }
}
