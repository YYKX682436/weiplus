package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f273558a;

    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarDrawable", "imageView is null");
        } else {
            b(imageView, str, 0.1f, false);
        }
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.x xVar;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarDrawable", "imageView is null");
            return;
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.x)) {
            xVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.x(str, f17);
            xVar.f272430f = z17;
        } else {
            xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.x) drawable;
            xVar.f273619s = f17;
        }
        xVar.b(str);
        imageView.setImageDrawable(xVar);
        imageView.invalidate();
        d(imageView, str);
        if (imageView instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1) {
            return;
        }
        if (imageView.isClickable() || imageView.isLongClickable()) {
            try {
                imageView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.t(imageView));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarDrawable", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c() {
        iz5.a.g(null, f273558a != null);
        return f273558a;
    }

    public static void d(android.widget.ImageView imageView, java.lang.String str) {
        if (!z65.c.a() || imageView == null || imageView.isLongClickable() || (imageView instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.C19643x4c392e62)) {
            return;
        }
        imageView.setOnLongClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.r(imageView, str));
        if (imageView.isClickable()) {
            return;
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.s(imageView));
    }
}
