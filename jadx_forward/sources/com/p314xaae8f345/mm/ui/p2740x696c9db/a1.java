package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2740x696c9db.a1 f291800a = new com.p314xaae8f345.mm.ui.p2740x696c9db.a1();

    public static final void a(com.p314xaae8f345.mm.ui.p2740x696c9db.a1 a1Var, android.app.Activity activity, android.widget.TextView textView, java.lang.String str, java.lang.String str2) {
        a1Var.getClass();
        if (activity.isFinishing() || activity.isDestroyed() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        textView.setText(str + '\n' + str2);
    }

    public static final void b(com.p314xaae8f345.mm.ui.p2740x696c9db.a1 a1Var, android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
        a1Var.getClass();
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        int textSize = (int) ((textView.getTextSize() * 140) / 100.0f);
        if (textSize > 0) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.f(textView, textSize);
        }
        textView.setVisibility(0);
    }

    public static final boolean c() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20044xe490dca8()) == 1;
    }

    public static final void d(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17, boolean z18, int i17, int i18, com.p314xaae8f345.mm.ui.p2740x696c9db.s0 onConfirmSave) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirmSave, "onConfirmSave");
        e(activity, msgInfo, z17, z18, i17, i18, onConfirmSave, null);
    }

    public static final void e(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17, boolean z18, int i17, int i18, com.p314xaae8f345.mm.ui.p2740x696c9db.s0 onConfirmSave, java.lang.Runnable runnable) {
        android.widget.TextView textView;
        int i19;
        android.net.Uri uri;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirmSave, "onConfirmSave");
        int i27 = 1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, true);
        java.lang.String str2 = null;
        if (z18) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eh7, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (android.widget.TextView) inflate;
            textView.setText(string);
            int textSize = (int) ((textView.getTextSize() * 140) / 100.0f);
            if (textSize > 0) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.f(textView, textSize);
            }
            if (c()) {
                if (z17) {
                    h90.a[] aVarArr = h90.a.f361204d;
                    i19 = 2;
                } else {
                    h90.a[] aVarArr2 = h90.a.f361204d;
                    i19 = 5;
                }
                jz5.l Ni = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ni(msgInfo, i19, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
                java.lang.Long l17 = (java.lang.Long) Ni.f384367e;
                if (l17 != null) {
                    if (!(l17.longValue() > 0)) {
                        l17 = null;
                    }
                    if (l17 != null) {
                        uri = com.p314xaae8f345.mm.sdk.p2603x2137b148.v6.b(activity, l17.longValue(), android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                        str = (java.lang.String) Ni.f384366d;
                        if (str != null && (true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str))) {
                            str2 = str;
                        }
                        com.p314xaae8f345.mm.ui.p2740x696c9db.r0.c(activity, uri, str2, new com.p314xaae8f345.mm.ui.p2740x696c9db.u0(activity, textView, string));
                    }
                }
                uri = null;
                str = (java.lang.String) Ni.f384366d;
                if (str != null) {
                    str2 = str;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.r0.c(activity, uri, str2, new com.p314xaae8f345.mm.ui.p2740x696c9db.u0(activity, textView, string));
            }
        } else {
            java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.view.View inflate2 = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eh7, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (android.widget.TextView) inflate2;
            textView.setText(string2);
            int textSize2 = (int) ((textView.getTextSize() * 140) / 100.0f);
            if (textSize2 > 0) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.f(textView, textSize2);
            }
            if (c()) {
                if (z17) {
                    h90.a[] aVarArr3 = h90.a.f361204d;
                } else {
                    h90.a[] aVarArr4 = h90.a.f361204d;
                    i27 = 4;
                }
                jz5.l Ni2 = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ni(msgInfo, i27, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
                com.p314xaae8f345.mm.ui.p2740x696c9db.t0 t0Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.t0(activity, textView, string2);
                java.lang.Object obj = Ni2.f384367e;
                if (((java.lang.Long) obj) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number.longValue() > 0) {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.r0.b(activity, number.longValue(), t0Var);
                    }
                }
                java.lang.String str3 = (java.lang.String) Ni2.f384366d;
                if (str3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    t0Var.a(null);
                } else {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.r0.d(activity, str3, t0Var);
                }
            }
        }
        k0Var.s(textView, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2740x696c9db.v0(activity);
        k0Var.C = new com.p314xaae8f345.mm.ui.p2740x696c9db.w0(activity, msgInfo, i17, i18);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2740x696c9db.x0(activity, runnable, onConfirmSave, msgInfo, i17, i18);
        k0Var.v();
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (msgInfo.m124847x74d37ac6() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new g90.l(sVar, msgInfo, i17, i18), "c2c_origin_auto_clean");
    }
}
