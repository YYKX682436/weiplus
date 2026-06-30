package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class lq extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f286062b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f286063c = null;

    public static void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lq lqVar, rd5.d dVar, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kq kqVar, android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (lqVar == null) {
            return;
        }
        java.lang.String y07 = f9Var.y0();
        if (!android.text.TextUtils.isEmpty(y07) && !y07.equals(c01.z1.r())) {
            ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(y07);
        }
        android.widget.ImageView imageView = lqVar.f39499x8eebed7e;
        if (imageView != null) {
            imageView.setVisibility(f9Var.P0() == 6 ? 8 : 0);
        }
        r45.j07 j07Var = null;
        lqVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar, dVar2.D(), lqVar, null));
        lqVar.f39493x8ad70635.setOnClickListener(kqVar);
        lqVar.f39493x8ad70635.setOnLongClickListener(onLongClickListener);
        lqVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar2.f542241c.a(sb5.z.class))).B1);
        java.lang.String str = f9Var.G;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                j07Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.s(f9Var.j());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoip", "parseInviteMsgBubbleMsg error = " + th6.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemVoip", th6, "", new java.lang.Object[0]);
            }
            if (j07Var != null) {
                lqVar.f286062b.setText(j07Var.f459010d);
            } else {
                lqVar.f286062b.setText(str);
            }
        } else if (z17) {
            lqVar.f286062b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574990ka2);
        } else {
            lqVar.f286062b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574991ka3);
        }
        if (lqVar.f286063c == null || f9Var.j() == null) {
            return;
        }
        if (j07Var != null) {
            if (j07Var.f459011e == 1) {
                if (!z17) {
                    lqVar.f286063c.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81346x3d8036b1);
                    return;
                }
                android.view.View view = lqVar.f286063c;
                android.graphics.drawable.Drawable drawable = dVar2.g().getDrawable(com.p314xaae8f345.mm.R.raw.f81346x3d8036b1);
                com.p314xaae8f345.mm.ui.uk.f(drawable, dVar2.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                view.setBackground(drawable);
                return;
            }
            if (!z17) {
                lqVar.f286063c.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81345xdfe72b60);
                return;
            }
            android.view.View view2 = lqVar.f286063c;
            android.graphics.drawable.Drawable drawable2 = dVar2.g().getDrawable(com.p314xaae8f345.mm.R.raw.f81344xc9b09d7a);
            com.p314xaae8f345.mm.ui.uk.f(drawable2, dVar2.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view2.setBackground(drawable2);
            return;
        }
        if (ip.l.h(f9Var.j())) {
            if (!z17) {
                lqVar.f286063c.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81346x3d8036b1);
                return;
            }
            android.view.View view3 = lqVar.f286063c;
            android.graphics.drawable.Drawable drawable3 = dVar2.g().getDrawable(com.p314xaae8f345.mm.R.raw.f81346x3d8036b1);
            com.p314xaae8f345.mm.ui.uk.f(drawable3, dVar2.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view3.setBackground(drawable3);
            return;
        }
        if (ip.l.g(f9Var.j())) {
            if (!z17) {
                lqVar.f286063c.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81345xdfe72b60);
                return;
            }
            android.view.View view4 = lqVar.f286063c;
            android.graphics.drawable.Drawable drawable4 = dVar2.g().getDrawable(com.p314xaae8f345.mm.R.raw.f81344xc9b09d7a);
            com.p314xaae8f345.mm.ui.uk.f(drawable4, dVar2.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view4.setBackground(drawable4);
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f286062b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565237bs3);
        this.f39493x8ad70635 = view.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        this.f286063c = view.findViewById(com.p314xaae8f345.mm.R.id.f565236bs2);
        this.f39499x8eebed7e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        return this;
    }
}
