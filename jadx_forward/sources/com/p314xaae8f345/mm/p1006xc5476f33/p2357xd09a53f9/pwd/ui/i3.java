package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class i3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c f260549a;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c) {
        this.f260549a = activityC19056xd4c1806c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c = this.f260549a;
        android.app.Dialog dialog = activityC19056xd4c1806c.f260501q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC19056xd4c1806c.mo55332x76847179(), "");
            return null;
        }
        r45.sh5 sh5Var = (r45.sh5) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(sh5Var.f467269d), ((r45.sh5) fVar.f152151d).f467270e);
        if (sh5Var.f467269d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(sh5Var.f467270e);
            return null;
        }
        r45.rr6 rr6Var = sh5Var.f467271f;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rr6Var.f466687d)) {
            activityC19056xd4c1806c.f260495h.setText(rr6Var.f466687d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rr6Var.f466688e)) {
            activityC19056xd4c1806c.f260496i.setText(rr6Var.f466688e);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rr6Var.f466689f)) {
            activityC19056xd4c1806c.f260497m.setText(rr6Var.f466689f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rr6Var.f466690g)) {
            activityC19056xd4c1806c.f260499o.setText(rr6Var.f466690g);
        }
        activityC19056xd4c1806c.f260498n.m81392x52cfa5c6(rr6Var.f466693m == 1);
        activityC19056xd4c1806c.f260498n.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.d3(activityC19056xd4c1806c, rr6Var));
        r45.b74 b74Var = rr6Var.f466691h;
        if (b74Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b74Var.f452135d)) {
            activityC19056xd4c1806c.f260500p.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.e3(activityC19056xd4c1806c, rr6Var));
            android.text.SpannableString spannableString = new android.text.SpannableString(rr6Var.f466691h.f452135d);
            spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
            activityC19056xd4c1806c.f260500p.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC19056xd4c1806c.mo55332x76847179()));
            activityC19056xd4c1806c.f260500p.setClickable(true);
            activityC19056xd4c1806c.f260500p.setText(spannableString);
            activityC19056xd4c1806c.f260500p.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o3 o3Var = activityC19056xd4c1806c.f260492e;
        o3Var.f260579e = rr6Var.f466692i;
        o3Var.notifyDataSetChanged();
        return null;
    }
}
