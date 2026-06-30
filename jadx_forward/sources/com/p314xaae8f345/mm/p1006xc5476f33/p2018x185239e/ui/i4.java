package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 f239295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239296e;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var) {
        this.f239296e = activityC17133x39d21883;
        this.f239295d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var = this.f239295d;
        java.lang.String str = g1Var.f238375v.f238546c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239296e;
        int W6 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.W6(activityC17133x39d21883, str, activityC17133x39d21883.f238911x.getWidth());
        int length = g1Var.f238375v.f238546c.length();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (W6 == length) {
            activityC17133x39d21883.A.setText(g1Var.f238375v.f238546c);
            activityC17133x39d21883.B.setText(g1Var.f238375v.f238546c);
        } else {
            java.lang.String string = activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hz_);
            java.lang.String str2 = g1Var.f238375v.f238546c.substring(0, W6) + "... ";
            android.text.SpannableString spannableString = new android.text.SpannableString(str2 + string);
            hp3.b bVar = new hp3.b(activityC17133x39d21883);
            bVar.f364470d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g4(this);
            spannableString.setSpan(bVar, str2.length(), str2.length() + string.length(), 33);
            activityC17133x39d21883.A.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.c());
            activityC17133x39d21883.A.setText(spannableString);
            java.lang.String string2 = activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hz9);
            java.lang.String str3 = g1Var.f238375v.f238546c + "  ";
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str3 + string2);
            hp3.b bVar2 = new hp3.b(activityC17133x39d21883);
            bVar2.f364470d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h4(this);
            spannableString2.setSpan(bVar2, str3.length(), str3.length() + string2.length(), 33);
            activityC17133x39d21883.B.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.c());
            activityC17133x39d21883.B.setText(spannableString2);
        }
        activityC17133x39d21883.A.setVisibility(0);
        activityC17133x39d21883.B.setVisibility(8);
        activityC17133x39d21883.f238910w.setOnLongClickListener(activityC17133x39d21883.f238907t2);
        activityC17133x39d21883.f238910w.setOnTouchListener(activityC17133x39d21883.f238905s2);
    }
}
