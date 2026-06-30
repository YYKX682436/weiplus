package a93;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a93.a f2429a = new a93.a();

    public final void a(android.content.Context context, java.lang.String loginUrl, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loginUrl, "loginUrl");
        com.tencent.mars.xlog.Log.i("KidsWatchUtil", "gotoLauncherUI, context:" + context + ", url:" + loginUrl + ", isFinish:" + z17);
        if (!z17) {
            gm0.j1.d().g(new x83.i(loginUrl));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(context, ".ui.LauncherUI", intent, null);
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String path, int i17, java.lang.String sceneNote) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(sceneNote, "sceneNote");
        com.tencent.mars.xlog.Log.i("KidsWatchUtil", "gotoMiniProgram, appId:" + appId + ", path:" + path + ", scene:" + i17 + ", sceneNote:" + sceneNote);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = appId;
        b1Var.f317022f = path;
        b1Var.f317032k = i17;
        b1Var.f317034l = sceneNote;
        b1Var.f317016c = 0;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }

    public final void c(android.content.Context context, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("KidsWatchUtil", "marginAdapter, context:" + context);
        int b17 = com.tencent.mm.ui.zk.b(context, i65.a.B(context));
        int a17 = com.tencent.mm.ui.zk.a(context, 8);
        int a18 = com.tencent.mm.ui.zk.a(context, 40);
        if (b17 >= 375) {
            a17 = com.tencent.mm.ui.zk.a(context, 24);
            a18 = com.tencent.mm.ui.zk.a(context, 96);
        }
        if (linearLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = a17;
            layoutParams2.rightMargin = a17;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (linearLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = a18;
            linearLayout2.setLayoutParams(layoutParams4);
        }
    }

    public final void d(android.content.Context context, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("KidsWatchUtil", "context:" + context + ", errCode:errCode, errMsg:" + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            v83.a[] aVarArr = v83.a.f434079d;
            if (i17 == -1) {
                db5.e1.s(context, context.getString(com.tencent.mm.R.string.g7s), "");
                return;
            }
            v83.a[] aVarArr2 = v83.a.f434079d;
            if (i17 == -2) {
                db5.e1.s(context, context.getString(com.tencent.mm.R.string.g7t), "");
                return;
            } else {
                db5.e1.s(context, context.getString(com.tencent.mm.R.string.g7u, java.lang.Integer.valueOf(i17)), "");
                return;
            }
        }
        kotlin.jvm.internal.o.d(str);
        if (!r26.i0.y(str, "<", false)) {
            db5.e1.s(context, str, "");
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(context, null, null);
        } else {
            db5.e1.i(context, com.tencent.mm.R.string.b6u, 0);
        }
    }
}
