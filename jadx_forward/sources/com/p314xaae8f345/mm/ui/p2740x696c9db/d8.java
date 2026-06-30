package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes2.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Float f291888a = java.lang.Float.valueOf(0.7f);

    public static void a(android.view.View view) {
        b(view, f291888a.floatValue());
    }

    public static void b(android.view.View view, float f17) {
        if (view == null || f17 <= 0.0f || f17 >= 1.0f) {
            return;
        }
        view.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.c8(f17));
    }
}
