package hc2;

/* loaded from: classes8.dex */
public abstract class i {
    public static final void a(android.app.Activity activity, android.view.View view, android.view.View view2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        android.view.View decorView = activity.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new hc2.g(decorView, activity, view, view2));
    }

    public static final java.lang.String b(android.content.Context context, long j17, int i17) {
        java.lang.String valueOf;
        java.lang.String valueOf2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(j17));
        int i18 = calendar.get(11);
        if (i18 < 10) {
            valueOf = "0" + i18;
        } else {
            valueOf = java.lang.String.valueOf(i18);
        }
        int i19 = calendar.get(12);
        if (i19 < 10) {
            valueOf2 = "0" + i19;
        } else {
            valueOf2 = java.lang.String.valueOf(i19);
        }
        java.lang.String string = context.getResources().getString(i17, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), valueOf, valueOf2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public static final void c(android.app.Activity activity, java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[handleShareJumpErrorDirect] json = " + str);
            cl0.g gVar = new cl0.g(str);
            int mo15072xb58848b9 = gVar.mo15072xb58848b9("link_type");
            if (mo15072xb58848b9 == 1) {
                f(activity, gVar.a("link_h5").mo15082x48bce8a4("link"));
            } else if (mo15072xb58848b9 == 2) {
                cl0.g a17 = gVar.a("link_lite_app");
                java.lang.String mo15082x48bce8a4 = a17.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
                java.lang.String mo15082x48bce8a42 = a17.mo15082x48bce8a4(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
                java.lang.String mo15082x48bce8a43 = a17.mo15082x48bce8a4("query");
                java.lang.String mo15082x48bce8a44 = a17.mo15082x48bce8a4("default_url");
                java.lang.String mo15082x48bce8a45 = a17.mo15082x48bce8a4("ext_info");
                r45.k41 k41Var = new r45.k41();
                k41Var.set(0, mo15082x48bce8a4);
                k41Var.set(1, mo15082x48bce8a42);
                k41Var.set(2, mo15082x48bce8a43);
                k41Var.set(3, mo15082x48bce8a44);
                k41Var.set(4, mo15082x48bce8a45);
                g(activity, k41Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[handleShareJumpErrorDirect] catch exception:" + e17.getMessage());
        }
    }

    public static final void d(android.app.Activity activity, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(errMsg)) {
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[handleShareJumpErrorUi] json = ".concat(errMsg));
            if (new cl0.g(errMsg).mo15072xb58848b9("show_type") != 1) {
                return;
            }
            c(activity, errMsg);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[handleShareJumpErrorUi] catch exception:" + e17.getMessage());
        }
    }

    public static final void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractActivityC21394xb3d2c0cf, "<this>");
        abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        if (z17) {
            return;
        }
        android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.p314xaae8f345.mm.ui.r0.a(abstractActivityC21394xb3d2c0cf, false);
        abstractActivityC21394xb3d2c0cf.m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
    }

    public static final void f(android.app.Activity activity, java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nf.d(new hc2.f(activity)), 800L);
    }

    public static final void g(android.app.Activity activity, r45.k41 k41Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", k41Var.m75945x2fec8307(0));
        bundle.putString("query", k41Var.m75945x2fec8307(2));
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, k41Var.m75945x2fec8307(1));
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559254i);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        java.lang.String m75945x2fec8307 = k41Var.m75945x2fec8307(3);
        if (e1Var.L(activity, bundle, !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0), new hc2.h(activity, k41Var))) {
            return;
        }
        f(activity, k41Var.m75945x2fec8307(3));
    }

    public static final void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=page/agreement/finder_live_user_event");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
