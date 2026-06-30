package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/finder/feed/a10;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/xm", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicFeedUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.plugin.finder.feed.a10 {
    public static final java.util.concurrent.ConcurrentHashMap I = new java.util.concurrent.ConcurrentHashMap();
    public android.widget.RelativeLayout A;
    public com.tencent.mm.ui.widget.imageview.WeImageView B;
    public com.tencent.mm.ui.widget.imageview.WeImageView C;
    public android.widget.TextView D;
    public long E;
    public long F;
    public float H;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.r10 f109575u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.x10 f109576v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f109577w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xu2 f109578x;

    /* renamed from: y, reason: collision with root package name */
    public r45.oa1 f109579y;

    /* renamed from: z, reason: collision with root package name */
    public int f109580z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109574t = "Finder.FinderTopicFeedUI";
    public final com.tencent.mm.plugin.finder.feed.ui.cn G = new com.tencent.mm.plugin.finder.feed.ui.cn();

    public static final java.lang.String c7(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        com.tencent.mm.plugin.finder.feed.r10 r10Var = finderTopicFeedUI.f109575u;
        if (r10Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.o03 o03Var = r10Var.f108873t;
        if (o03Var == null) {
            return r10Var.f108868o;
        }
        if (((r45.zi2) o03Var.getCustom(1)) != null) {
            r45.zi2 zi2Var = (r45.zi2) o03Var.getCustom(1);
            return java.lang.String.valueOf(zi2Var != null ? zi2Var.getString(2) : null);
        }
        androidx.appcompat.app.AppCompatActivity context = finderTopicFeedUI.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) o03Var.getCustom(0);
        objArr[0] = finderContact != null ? finderContact.getNickname() : null;
        java.lang.String string = context.getString(com.tencent.mm.R.string.cxs, objArr);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d7(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI r5) {
        /*
            com.tencent.mm.plugin.finder.feed.r10 r0 = r5.f109575u
            r1 = 0
            java.lang.String r2 = "presenter"
            if (r0 == 0) goto L4f
            java.lang.String r0 = r0.f108868o
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L24
            com.tencent.mm.plugin.finder.feed.r10 r0 = r5.f109575u
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.y()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            r0 = 0
            goto L25
        L20:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        L24:
            r0 = 1
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notShare "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", "
            r3.append(r4)
            com.tencent.mm.plugin.finder.feed.r10 r4 = r5.f109575u
            if (r4 == 0) goto L4b
            java.lang.String r1 = r4.f108868o
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r5 = r5.f109574t
            com.tencent.mars.xlog.Log.i(r5, r1)
            return r0
        L4b:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        L4f:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.d7(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        if (intExtra == 1) {
            return 22;
        }
        if (intExtra != 4) {
            return intExtra != 5 ? 26 : 64;
        }
        return 49;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    public void e7(r45.r03 r03Var) {
        java.lang.String str;
        if (r03Var == null || (str = r03Var.getString(18)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            f7();
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) findViewById(com.tencent.mm.R.id.f483236a25);
            com.tencent.mm.plugin.finder.feed.ui.xm xmVar = new com.tencent.mm.plugin.finder.feed.ui.xm(this);
            kotlin.jvm.internal.o.d(appBarLayout);
            xmVar.a(appBarLayout, 0);
            appBarLayout.a(xmVar);
            android.widget.ImageView imageView = (android.widget.ImageView) getContext().findViewById(com.tencent.mm.R.id.cl7);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) getContext().findViewById(com.tencent.mm.R.id.m6e);
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) getContext().findViewById(com.tencent.mm.R.id.cje);
            refreshLoadMoreLayout.setSuperNestedScroll(true);
            float dimension = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
            roundedCornerFrameLayout.b(dimension, dimension, 0.0f, 0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) layoutParams)).topMargin = -((int) dimension);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480497zj);
            imageView.setLayoutParams(layoutParams2);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.f().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d)).c(imageView);
        }
    }

    public final void f7() {
        android.widget.RelativeLayout relativeLayout = this.A;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.C;
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.B;
        if (weImageView2 != null) {
            weImageView2.setIconColor(getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
        }
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
        }
    }

    public final void g7() {
        getController().O0(com.tencent.mm.ui.bk.C());
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_m;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f109575u;
        if (r10Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r10Var.onDetach();
        I.clear();
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f109576v;
        if (x10Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        x10Var.getRecyclerView().V0(this.G);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "26", ml2.y.f328241f, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "26", ml2.y.f328240e, 0, 0L, 0, 112, null);
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f109575u;
        if (r10Var != null) {
            r10Var.s();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }
}
