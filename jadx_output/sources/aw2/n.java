package aw2;

/* loaded from: classes10.dex */
public final class n implements ya2.r1 {

    /* renamed from: d */
    public final com.tencent.mm.ui.MMActivity f14776d;

    /* renamed from: e */
    public final com.tencent.mm.ui.tools.f5 f14777e;

    /* renamed from: f */
    public final java.lang.String f14778f;

    /* renamed from: g */
    public final rx2.p f14779g;

    /* renamed from: h */
    public android.os.Bundle f14780h;

    /* renamed from: i */
    public android.content.Intent f14781i;

    /* renamed from: m */
    public int f14782m;

    /* renamed from: n */
    public final com.tencent.mm.plugin.finder.view.FinderExtendReadingView f14783n;

    /* renamed from: o */
    public com.tencent.mm.ui.widget.dialog.u3 f14784o;

    public n(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.ui.tools.f5 keyboardHeightProvider) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(keyboardHeightProvider, "keyboardHeightProvider");
        this.f14776d = activity;
        this.f14777e = keyboardHeightProvider;
        this.f14778f = "Finder.FinderExtendReadingWidget";
        this.f14783n = (com.tencent.mm.plugin.finder.view.FinderExtendReadingView) activity.findViewById(com.tencent.mm.R.id.dlj);
        this.f14779g = new rx2.p(activity, new aw2.b(this), new aw2.c(this));
    }

    public static void b(aw2.n nVar, java.lang.String link, java.lang.String title, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            z17 = false;
        }
        nVar.getClass();
        kotlin.jvm.internal.o.g(link, "link");
        kotlin.jvm.internal.o.g(title, "title");
        if (!z17) {
            r45.o21 o21Var = new r45.o21();
            o21Var.set(0, link);
            o21Var.set(1, title);
            o21Var.set(3, java.lang.Integer.valueOf(i17));
            android.os.Bundle bundle = nVar.f14780h;
            if (bundle != null) {
                bundle.putByteArray("post_extend_reading", o21Var.toByteArray());
            }
        }
        android.content.Intent intent = nVar.f14781i;
        if (intent != null) {
            intent.putExtra("saveExtendReadingLink", link);
        }
        android.content.Intent intent2 = nVar.f14781i;
        if (intent2 != null) {
            intent2.putExtra("saveExtendReadingTitle", title);
        }
        android.content.Intent intent3 = nVar.f14781i;
        if (intent3 != null) {
            intent3.putExtra("saveExtendReadingStyle", i17);
        }
    }

    public static /* synthetic */ void f(aw2.n nVar, java.lang.String str, java.lang.String str2, int i17, int i18, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        int i27 = i18;
        if ((i19 & 16) != 0) {
            finderJumpInfo = null;
        }
        nVar.e(str, str2, i17, i27, finderJumpInfo);
    }

    public final void a(java.lang.String link, boolean z17) {
        kotlin.jvm.internal.o.g(link, "link");
        if (z17) {
            return;
        }
        this.f14783n.setVerifyingState(link);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f14784o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = this.f14776d.getResources().getString(com.tencent.mm.R.string.cuc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this.f14776d, "", string, true, false, null);
        this.f14784o = Q;
        if (Q != null) {
            Q.show();
        }
        java.util.Map map = db2.z4.f228259a;
        r45.qt2 d17 = xy2.c.d(this.f14776d);
        aw2.e eVar = new aw2.e(this);
        java.lang.String obj = r26.n0.u0(link).toString();
        java.util.Map map2 = db2.z4.f228259a;
        if (map2.containsKey(obj)) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) linkedHashMap.get(obj))) {
                java.lang.Object obj2 = linkedHashMap.get(obj);
                kotlin.jvm.internal.o.d(obj2);
                eVar.K(0, "", obj, obj2, 0, 2, null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify in cache ");
                sb6.append(obj);
                sb6.append(", ");
                java.lang.Object obj3 = linkedHashMap.get(obj);
                kotlin.jvm.internal.o.d(obj3);
                sb6.append((java.lang.String) obj3);
                com.tencent.mars.xlog.Log.i("Finder.FinderExtendReadingVerifier", sb6.toString());
                return;
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new db2.y4(obj, d17, eVar));
    }

    public final void c(r45.m66 cover, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(cover, "cover");
        if (z17) {
            this.f14779g.a();
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cover.getCustom(3);
        java.lang.String wording = finderJumpInfo != null ? finderJumpInfo.getWording() : null;
        if (wording == null || wording.length() == 0) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f14776d;
            ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(mMActivity));
            if (b17 != null) {
                r45.xk b18 = ya2.d.b(b17, true);
                str = b18 != null ? b18.getString(1) : null;
                if (str == null) {
                    str = b17.w0();
                }
            } else {
                str = "";
            }
            wording = mMActivity.getResources().getString(com.tencent.mm.R.string.ewt, str);
        }
        java.lang.String string = cover.getString(1);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cover.getCustom(3);
        java.lang.String str2 = string;
        java.lang.String str3 = wording;
        b(this, str2, str3, 1, false, 8, null);
        f(this, str2, str3, 1, 0, finderJumpInfo2, 8, null);
    }

    public final void d() {
        com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView = this.f14783n;
        android.widget.TextView textView = (android.widget.TextView) finderExtendReadingView.f131055p.findViewById(com.tencent.mm.R.id.dla);
        android.content.Context context = finderExtendReadingView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sr2.o1 o1Var = (sr2.o1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.o1.class);
        boolean z17 = o1Var.T6() && !o1Var.R6();
        mv2.m mVar = mv2.m.f331605a;
        if (z17) {
            android.content.Context context2 = finderExtendReadingView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (mVar.c(xy2.c.e(context2))) {
                textView.setText(finderExtendReadingView.getContext().getString(com.tencent.mm.R.string.lhy));
                return;
            } else {
                textView.setText(finderExtendReadingView.getContext().getString(com.tencent.mm.R.string.lhz));
                return;
            }
        }
        android.content.Context context3 = finderExtendReadingView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        if (mVar.c(xy2.c.e(context3))) {
            textView.setText(finderExtendReadingView.getContext().getString(com.tencent.mm.R.string.f491355li1));
        } else {
            textView.setText(finderExtendReadingView.getContext().getString(com.tencent.mm.R.string.f491356li2));
        }
    }

    public final void e(java.lang.String link, java.lang.String title, int i17, int i18, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        kotlin.jvm.internal.o.g(link, "link");
        kotlin.jvm.internal.o.g(title, "title");
        if (com.tencent.mm.sdk.platformtools.t8.K0(link) || com.tencent.mm.sdk.platformtools.t8.K0(title)) {
            return;
        }
        this.f14782m = i17;
        if (i17 != 2) {
            b(this, link, title, i17, false, 8, null);
            com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView = this.f14783n;
            finderExtendReadingView.getClass();
            finderExtendReadingView.isVerifyState = false;
            finderExtendReadingView.hasSet = true;
            android.view.View view = finderExtendReadingView.f131055p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = finderExtendReadingView.f131056q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = finderExtendReadingView.f131057r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = finderExtendReadingView.f131058s;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = finderExtendReadingView.f131059t;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderExtendReadingView.setTitle(title);
            finderExtendReadingView.setLink(link);
            finderExtendReadingView.setStyle(java.lang.Integer.valueOf(i17));
            finderExtendReadingView.f131061v.setText(title);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderExtendReadingView.f131062w;
            if (i17 == 0) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_link);
                weImageView.setIconColor(i65.a.d(finderExtendReadingView.getContext(), com.tencent.mm.R.color.f478502m));
            } else if (i17 == 1) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_finder_red_envelope);
                weImageView.setIconColor(i65.a.d(finderExtendReadingView.getContext(), com.tencent.mm.R.color.f478997n1));
            }
            finderExtendReadingView.f131058s.setOnClickListener(new com.tencent.mm.plugin.finder.view.l9(finderExtendReadingView, link));
            com.tencent.mm.ui.MMActivity activity = this.f14776d;
            if (i17 == 1) {
                kotlin.jvm.internal.o.g(activity, "activity");
                ((dv2.a1) pf5.z.f353948a.a(activity).a(dv2.a1.class)).f243809g = finderJumpInfo;
            }
            kotlin.jvm.internal.o.g(activity, "activity");
            ((sr2.o1) pf5.z.f353948a.a(activity).a(sr2.o1.class)).W6();
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        rx2.p pVar = this.f14779g;
        pVar.getClass();
        ya2.h.f460484a.b(xy2.c.e(pVar.f400983d));
    }
}
