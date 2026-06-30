package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19042xfb8a256f f260570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19042xfb8a256f activityC19042xfb8a256f) {
        super(false);
        this.f260570d = activityC19042xfb8a256f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19042xfb8a256f.f260372u;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19042xfb8a256f activityC19042xfb8a256f = this.f260570d;
        java.lang.String string = activityC19042xfb8a256f.V6(16) ? activityC19042xfb8a256f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kku) : activityC19042xfb8a256f.V6(32) ? activityC19042xfb8a256f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kks) : activityC19042xfb8a256f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkz);
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19042xfb8a256f.mo55332x76847179(), 1, 2);
        android.view.View inflate = android.view.View.inflate(activityC19042xfb8a256f.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570698bj2, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
        textView.setText(string);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        z2Var.s(inflate);
        java.lang.String str = activityC19042xfb8a256f.f260381o;
        if (android.text.TextUtils.isEmpty(str)) {
            str = activityC19042xfb8a256f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kky);
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC19042xfb8a256f.mo55332x76847179());
        linearLayout.setOrientation(1);
        android.widget.TextView textView2 = new android.widget.TextView(activityC19042xfb8a256f.mo55332x76847179());
        linearLayout.addView(textView2);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(textView2.getLayoutParams());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = i65.a.f(activityC19042xfb8a256f.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        layoutParams.bottomMargin = i65.a.f(activityC19042xfb8a256f.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView2.setTextColor(activityC19042xfb8a256f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        textView2.setTextSize(1, 15.0f);
        textView2.setText(str);
        textView2.setLayoutParams(layoutParams);
        z2Var.j(linearLayout);
        z2Var.m(activityC19042xfb8a256f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC19042xfb8a256f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        z2Var.o(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o(activityC19042xfb8a256f, z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p(activityC19042xfb8a256f, z2Var);
        z2Var.D = oVar;
        z2Var.E = pVar;
        z2Var.C();
    }
}
