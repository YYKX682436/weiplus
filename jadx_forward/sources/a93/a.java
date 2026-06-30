package a93;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a93.a f83962a = new a93.a();

    public final void a(android.content.Context context, java.lang.String loginUrl, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginUrl, "loginUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchUtil", "gotoLauncherUI, context:" + context + ", url:" + loginUrl + ", isFinish:" + z17);
        if (!z17) {
            gm0.j1.d().g(new x83.i(loginUrl));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(context, ".ui.LauncherUI", intent, null);
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String path, int i17, java.lang.String sceneNote) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneNote, "sceneNote");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchUtil", "gotoMiniProgram, appId:" + appId + ", path:" + path + ", scene:" + i17 + ", sceneNote:" + sceneNote);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = appId;
        b1Var.f398555f = path;
        b1Var.f398565k = i17;
        b1Var.f398567l = sceneNote;
        b1Var.f398549c = 0;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }

    public final void c(android.content.Context context, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchUtil", "marginAdapter, context:" + context);
        int b17 = com.p314xaae8f345.mm.ui.zk.b(context, i65.a.B(context));
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 8);
        int a18 = com.p314xaae8f345.mm.ui.zk.a(context, 40);
        if (b17 >= 375) {
            a17 = com.p314xaae8f345.mm.ui.zk.a(context, 24);
            a18 = com.p314xaae8f345.mm.ui.zk.a(context, 96);
        }
        if (linearLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = a17;
            layoutParams2.rightMargin = a17;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (linearLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = a18;
            linearLayout2.setLayoutParams(layoutParams4);
        }
    }

    public final void d(android.content.Context context, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchUtil", "context:" + context + ", errCode:errCode, errMsg:" + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            v83.a[] aVarArr = v83.a.f515612d;
            if (i17 == -1) {
                db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7s), "");
                return;
            }
            v83.a[] aVarArr2 = v83.a.f515612d;
            if (i17 == -2) {
                db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7t), "");
                return;
            } else {
                db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7u, java.lang.Integer.valueOf(i17)), "");
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (!r26.i0.y(str, "<", false)) {
            db5.e1.s(context, str, "");
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(context, null, null);
        } else {
            db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.b6u, 0);
        }
    }
}
