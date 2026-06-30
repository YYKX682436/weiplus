package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class z extends com.p314xaae8f345.mm.p2802xd031a825.ui.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19044x4ece2457 f260658d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19044x4ece2457 activityC19044x4ece2457) {
        this.f260658d = activityC19044x4ece2457;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.x, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getTag() instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1 o1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1) view.getTag();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19044x4ece2457 activityC19044x4ece2457 = this.f260658d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC19044x4ece2457.mo55332x76847179(), 1, true);
            android.widget.TextView textView = new android.widget.TextView(activityC19044x4ece2457.mo55332x76847179());
            textView.setGravity(17);
            textView.setHeight(i65.a.b(activityC19044x4ece2457.mo55332x76847179(), 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(activityC19044x4ece2457.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            textView.setText(activityC19044x4ece2457.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kto, o1Var.f295491a));
            k0Var.s(textView, false);
            k0Var.Z1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.y(this, o1Var);
            k0Var.v();
        }
    }
}
