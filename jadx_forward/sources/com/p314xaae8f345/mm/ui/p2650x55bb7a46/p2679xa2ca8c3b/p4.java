package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class p4 {
    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var, ot0.q qVar, boolean z17) {
        android.view.View view = k4Var.f39493x8ad70635;
        android.widget.ImageView imageView = k4Var.f285836f;
        android.widget.ImageView imageView2 = k4Var.f285837g;
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        if (qVar != null) {
            ot0.b bVar = (ot0.b) qVar.y(ot0.b.class);
            java.lang.String str = z17 ? bVar.f429922o : bVar.f429925r;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background name: %s", str);
                int identifier = view.getResources().getIdentifier(str, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                if (identifier > 0) {
                    view.setBackgroundResource(identifier);
                    view.setPadding(0, 0, 0, 0);
                    k4Var.m80054x4906274a(view, k4Var.f285838h);
                    return;
                }
            }
            java.lang.String str2 = z17 ? (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429924q)) ? bVar.f429923p : bVar.f429924q : (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429927t)) ? bVar.f429926s : bVar.f429927t;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                if (z17) {
                    view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77947x559eb15f);
                } else {
                    view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77945x464ec7e5);
                }
            } else {
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                if (z17) {
                    view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.by9);
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.k_);
                } else {
                    view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562609by0);
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562608k7);
                }
                view.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j4(str2, view, imageView, imageView2, str2, z17));
            }
        }
        view.setPadding(0, 0, 0, 0);
        k4Var.m80054x4906274a(view, k4Var.f285838h);
    }

    public static void b(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.b bVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f285833c;
        if (textView == null) {
            return;
        }
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        java.lang.String str = f9Var.A0() == 1 ? bVar.f429914g : bVar.f429913f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = qVar.f430191g;
            k4Var.f285833c.setSingleLine(false);
            k4Var.f285833c.setMaxLines(3);
        } else {
            k4Var.f285833c.setSingleLine(true);
        }
        k4Var.f285833c.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar.g(), str, k4Var.f285839i));
        k4Var.f285833c.setTextSize(0, k4Var.f285839i);
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f429915h, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429929v) ? bVar.f429929v : bVar.f429928u);
        if (Di != -1) {
            k4Var.f285833c.setTextColor(Di);
        } else {
            k4Var.f285833c.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
    }

    public static void c(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.b bVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f285834d;
        if (textView == null) {
            return;
        }
        textView.setText(f9Var.A0() == 1 ? bVar.f429918k : bVar.f429919l);
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f429920m, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429931x) ? bVar.f429931x : bVar.f429930w);
        if (Di != -1) {
            k4Var.f285834d.setTextColor(Di);
        } else {
            k4Var.f285834d.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
    }

    public static void d(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.b bVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var, ot0.q qVar) {
        android.widget.TextView textView = k4Var.f285835e;
        if (textView == null) {
            return;
        }
        textView.setText(f9Var.A0() == 1 ? bVar.f429916i : bVar.f429917j);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429933z) && bVar.f429933z.equals("#888888")) {
            k4Var.f285835e.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                k4Var.f285835e.setAlpha(0.5f);
                return;
            } else {
                k4Var.f285835e.setAlpha(0.8f);
                return;
            }
        }
        int Di = ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).Di(bVar.f429933z, bVar.f429932y);
        if (Di != -1) {
            k4Var.f285835e.setTextColor(Di);
            k4Var.f285835e.setAlpha(1.0f);
        } else {
            k4Var.f285835e.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            k4Var.f285835e.setAlpha(0.7f);
        }
    }

    public static void e(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.b bVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var, ot0.q qVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = k4Var.f285832b;
        if (c19659x677e0913 == null) {
            return;
        }
        c19659x677e0913.setImageBitmap(null);
        java.lang.String str = (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429912e)) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429911d) ? bVar.f429911d : "" : bVar.f429912e;
        int b17 = i65.a.b(dVar.g(), 44);
        c19659x677e0913.b(str, b17, b17, com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3);
    }

    public static android.graphics.Bitmap f(android.graphics.Bitmap bitmap, int i17, int i18, boolean z17) {
        int ceil = (int) java.lang.Math.ceil(bitmap.getWidth() * (i17 / bitmap.getHeight()));
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ceil, i17, true);
        int i19 = ceil - i18;
        if (i19 < 0) {
            i19 = 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.bxz : com.p314xaae8f345.mm.R.C30861xcebc809e.by8);
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context) {
        try {
            r45.wl6 wl6Var = new r45.wl6();
            wl6Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            int i17 = wl6Var.f470794d;
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", wl6Var.f470795e);
                intent.putExtra("msgUsername", str2);
                intent.putExtra("geta8key_username", str3);
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).cj(context, intent);
            } else if (i17 == 2) {
                qg0.g0 g0Var = (qg0.g0) i95.n0.c(qg0.g0.class);
                r45.nm6 nm6Var = wl6Var.f470796f;
                ((pg0.p3) g0Var).hj(nm6Var.f463051d, nm6Var.f463052e, nm6Var.f463053f, 1007);
            } else if (i17 == 3) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).fj(context, wl6Var.f470797g);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "ThirdC2CRouteInfo type:%s is invalid", java.lang.Integer.valueOf(i17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemAppMsgC2CHoneyPay", e17, "", new java.lang.Object[0]);
        }
    }
}
