package hf2;

/* loaded from: classes10.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f362603a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362604b;

    /* renamed from: c, reason: collision with root package name */
    public qc0.g1 f362605c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f362606d;

    public h0(hf2.x controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f362603a = controller;
        this.f362604b = controller.f362714m + "_Editor";
    }

    public final void a() {
        qc0.g1 g1Var = this.f362605c;
        if (g1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var).d();
        }
        this.f362605c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i17, int i18, java.lang.String pictureFilePath) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pictureFilePath, "pictureFilePath");
        hf2.x xVar = this.f362603a;
        xVar.o7("launchStickerEditorContainer_" + i17);
        jz5.f0 f0Var = null;
        if (i17 == 1) {
            r45.ei0 ei0Var = ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).f380755g;
            java.lang.String str = (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f459362n;
            if (!((str == null || str.length() == 0) ^ true)) {
                str = null;
            }
            if (str == null) {
                str = xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljw);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            xVar.a7("buildStickerEditorInitConfigData_" + i17, str);
        } else if (i17 == 2) {
            java.lang.String source = "buildStickerEditorInitConfigData_" + i17;
            xVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            if (xVar.f362718q == null) {
                xVar.t7(source.concat(" buildDefaultStickerPicItem"), new r45.ei0());
            }
        }
        r45.ee6 b76 = xVar.b7(i17, i18, pictureFilePath);
        android.graphics.Bitmap bitmap = ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).f380756h;
        java.util.LinkedList textItemRestoreDataList = b76.f454905h.f455062d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
        r45.ji0 ji0Var2 = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
        java.lang.String str2 = this.f362604b;
        if (ji0Var2 != null) {
            if (ji0Var2.f459365q == null) {
                ji0Var2.f459365q = new r45.he6();
            }
            ji0Var2.f459365q.f457631d = bitmap != null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchStickerEditorContainer set genExtraConfig:");
            r45.he6 genExtraConfig = ji0Var2.f459365q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genExtraConfig, "genExtraConfig");
            sb6.append(pm0.b0.g(genExtraConfig));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "launchStickerEditorContainer stickerType:" + i17 + ", containerMode:" + i18 + ",pictureFilePath:" + pictureFilePath + ", containerMode:" + i18 + ' ' + je2.g.f380753u.a(b76) + '!');
        qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar.O6(), b76, new qc0.p1(new hf2.y(this), new hf2.z(this), new hf2.a0(this), new hf2.c0(this, i17)));
        if (wi6 != null) {
            this.f362605c = wi6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 c17090xc5b6aeb7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) wi6;
            this.f362606d = c17090xc5b6aeb7;
            android.view.ViewGroup viewGroup = xVar.f362724w;
            if ((viewGroup != null && viewGroup.indexOfChild(c17090xc5b6aeb7) == -1) != false) {
                xVar.e7();
                android.view.View view = this.f362606d;
                if (view != null) {
                    zl2.r4.f555483a.Q2(view);
                }
                if (i17 == 1) {
                    android.view.View view2 = this.f362606d;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "launchStickerEditorContainer", "(IILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "launchStickerEditorContainer", "(IILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup2 = xVar.f362724w;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(this.f362606d);
                    }
                } else {
                    android.view.ViewGroup viewGroup3 = xVar.f362724w;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(this.f362606d, 0);
                    }
                }
                android.view.View view3 = this.f362606d;
                android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = xVar.f362722u.f362693a.y;
                }
            }
            if (bitmap != null) {
                c("launchStickerEditorContainer", bitmap);
            }
            xVar.d7(false);
            xVar.c7(false);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "launchStickerEditorContainer fail,sticker editor container is null!");
            xVar.m7("launchLiveStickerEditorContainer fail");
        }
    }

    public final void c(java.lang.String source, android.graphics.Bitmap bitmap) {
        qc0.g1 g1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String concat = source.concat("_replaceTextBitmap");
        hf2.x xVar = this.f362603a;
        r45.ei0 ei0Var = xVar.f362718q;
        r45.ei0 ei0Var2 = null;
        if (ei0Var != null && (g1Var = this.f362605c) != null) {
            ei0Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var).h(1, ei0Var, bitmap);
        }
        xVar.t7(concat, ei0Var2);
    }
}
