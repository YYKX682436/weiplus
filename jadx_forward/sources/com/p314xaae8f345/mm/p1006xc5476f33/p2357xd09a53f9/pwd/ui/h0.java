package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 f260539d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 activityC19047xd92a1b55) {
        this.f260539d = activityC19047xd92a1b55;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.text.SpannableString spannableString;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 activityC19047xd92a1b55 = this.f260539d;
        activityC19047xd92a1b55.f260404g.notifyDataSetChanged();
        activityC19047xd92a1b55.getClass();
        if (!"1".equals(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67063x4856f578)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67043xcbe8ad4f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "hy: support bind new directly");
            ((android.view.ViewStub) activityC19047xd92a1b55.findViewById(com.p314xaae8f345.mm.R.id.gct)).inflate();
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) activityC19047xd92a1b55.findViewById(com.p314xaae8f345.mm.R.id.aih)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j0(activityC19047xd92a1b55));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdUI", "hy: support bind new h5");
        ((android.view.ViewStub) activityC19047xd92a1b55.findViewById(com.p314xaae8f345.mm.R.id.gcu)).inflate();
        android.widget.TextView textView = (android.widget.TextView) activityC19047xd92a1b55.findViewById(com.p314xaae8f345.mm.R.id.gcv);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(activityC19047xd92a1b55);
        b4Var.f261679d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i0(activityC19047xd92a1b55);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t()) {
            java.lang.String string = activityC19047xd92a1b55.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktf);
            spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 12, string.length(), 33);
        } else {
            java.lang.String string2 = activityC19047xd92a1b55.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktg);
            spannableString = new android.text.SpannableString(string2);
            spannableString.setSpan(b4Var, 0, string2.length(), 18);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
