package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

@j95.b
/* loaded from: classes11.dex */
public class w extends i95.w implements kv.z, kv.c0, kv.a0 {
    public void Ai(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        if (!((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str) || !Ui(imageView)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.a(imageView, str);
            return;
        }
        hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        sVar.Bi(imageView, str, str2, 0.1f);
    }

    public void Bi(android.widget.ImageView imageView, java.lang.String str, boolean z17) {
        if (((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str) && Ui(imageView) && !z17) {
            hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
            sVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
            sVar.Bi(imageView, str, null, 0.1f);
            return;
        }
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarDrawable", "imageView is null");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.1f, false);
        }
    }

    public void Di(android.widget.ImageView imageView, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.v vVar;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.v)) {
            vVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.v(str, null);
            vVar.f272430f = true;
        } else {
            vVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.v) drawable;
        }
        vVar.b(str);
        imageView.setImageDrawable(vVar);
        imageView.invalidate();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.d(imageView, str);
    }

    public void Ni(android.widget.ImageView imageView, java.lang.String str) {
        if (!((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str) || !Ui(imageView)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.5f, false);
            return;
        }
        hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        sVar.Bi(imageView, str, null, 0.5f);
    }

    public void Ri(android.widget.ImageView imageView, java.lang.String str, float f17) {
        if (!((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str) || !Ui(imageView)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, f17, false);
            return;
        }
        hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        sVar.Bi(imageView, str, null, f17);
    }

    public final boolean Ui(android.widget.ImageView imageView) {
        return (imageView == null || imageView.getScaleType() == android.widget.ImageView.ScaleType.CENTER_CROP) ? false : true;
    }

    public android.graphics.Bitmap Vi(java.lang.String str, int i17, int i18, int i19) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !gm0.j1.b().m()) {
            return null;
        }
        com.p314xaae8f345.mm.p943x351df9c2.z Ai = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai();
        Ai.getClass();
        android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(Ai.j(str, true), i17, i18, 0.0f);
        if (j07 != null) {
            return i19 > 5 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(j07, true, i19) : j07;
        }
        com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = new com.p314xaae8f345.mm.p943x351df9c2.m0();
        m0Var.a(str, new com.p314xaae8f345.mm.p943x351df9c2.f(m0Var));
        return com.p314xaae8f345.mm.p943x351df9c2.g.b(str, false, i19, null);
    }

    public kv.j0 Zi() {
        return com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 aj() {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
    }

    public void bj(java.lang.String str) {
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        if (n07 != null && str.equals(n07.e())) {
            n07.f152068g = 0;
            n07.f152070i = 64;
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(n07);
        }
    }

    public void cj(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = str + "@fb";
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str2);
        if (n07 != null && str2.equals(n07.e()) && 3 == n07.f152063b) {
            return;
        }
        if (n07 == null) {
            n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        }
        n07.f152062a = str2;
        n07.f152063b = 3;
        n07.f152066e = "http://graph.facebook.com/" + str + "/picture";
        n07.f152065d = "http://graph.facebook.com/" + str + "/picture";
        n07.f152067f = 1;
        n07.f152070i = 31;
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(n07);
    }

    public void fj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        java.lang.String str4 = str + "@google";
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str4);
        if (n07 == null) {
            n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        }
        n07.f152062a = str4;
        n07.f152063b = 3;
        n07.f152066e = str2 + "?access_token=" + str3;
        n07.f152065d = str2 + "?access_token=" + str3;
        n07.f152067f = 1;
        n07.f152070i = 31;
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(n07);
    }

    public boolean hj(long j17, int i17) {
        if (i17 != 3) {
            return false;
        }
        return com.p314xaae8f345.mm.p943x351df9c2.g.g(new kk.v(j17) + "@qqim");
    }

    public void wi(android.widget.ImageView imageView, java.lang.String str) {
        Ai(imageView, str, null);
    }
}
