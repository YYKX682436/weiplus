package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class yj extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211602d;

    public yj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        this.f211602d = activityC15076x7a6c76b6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.rb
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211602d;
        java.lang.String str = activityC15076x7a6c76b6.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MENU_ID_PROFILE] red=");
        sb6.append(z9Var != null && z9Var.f186860a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!(z9Var != null && z9Var.f186860a)) {
            activityC15076x7a6c76b6.B7().f516208k.setVisibility(4);
            return;
        }
        r45.f03 f03Var = z9Var.f186861b;
        int i17 = f03Var != null ? f03Var.f455421e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPersonalCenter");
        if (I0 != null) {
            i17 = I0.f455421e;
        }
        r45.f03 f03Var2 = z9Var.f186861b;
        if (!(f03Var2 != null && f03Var2.f455420d == 2) || i17 <= 0) {
            activityC15076x7a6c76b6.B7().f516208k.setVisibility(4);
            return;
        }
        android.widget.TextView personalCenterRedCount = activityC15076x7a6c76b6.B7().f516208k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(personalCenterRedCount, "personalCenterRedCount");
        personalCenterRedCount.setVisibility(0);
        personalCenterRedCount.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.a(i17));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15076x7a6c76b6.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        personalCenterRedCount.setBackgroundResource(java.lang.Float.compare(i65.a.q(mo55332x76847179), i65.a.z(mo55332x76847179)) > 0 ? i17 < 10 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b5b : com.p314xaae8f345.mm.R.C30861xcebc809e.b5e : i17 < 10 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b5c : com.p314xaae8f345.mm.R.C30861xcebc809e.b5d);
        android.view.ViewGroup.LayoutParams layoutParams = personalCenterRedCount.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (i17 < 10) {
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd((int) activityC15076x7a6c76b6.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
            layoutParams2.gravity = 8388613;
        } else {
            layoutParams2.gravity = 8388611;
            layoutParams2.setMarginStart((int) activityC15076x7a6c76b6.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            layoutParams2.setMarginEnd(0);
        }
        personalCenterRedCount.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6.v7(activityC15076x7a6c76b6, 1);
    }
}
