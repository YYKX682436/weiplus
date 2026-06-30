package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveAuthUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderGameLiveAuthUI extends com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI implements com.tencent.mm.modelbase.u0 {
    public boolean A;
    public yl2.g1 B;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f109277w = "Finder.FinderGameLiveAuthUI";

    /* renamed from: x, reason: collision with root package name */
    public int f109278x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109279y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f109280z;

    public FinderGameLiveAuthUI() {
        int i17 = qs5.i.f366434a;
        this.f109278x = 1;
        this.A = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7() {
        java.lang.Class cls;
        android.view.View view;
        java.lang.String str;
        android.widget.TextView textView;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        java.lang.String authProfession;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        com.tencent.mars.xlog.Log.i(this.f109277w, "checkShow, mode:" + this.f109278x + ", account:" + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() + ", checkingPost:" + this.f109280z);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        if (this.f109278x == 1 && !booleanValue) {
            pf5.z zVar = pf5.z.f353948a;
            ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).P6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).f117184o = new com.tencent.mm.plugin.finder.feed.ui.n4(this);
            ((com.tencent.mm.plugin.finder.live.viewmodel.g) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.g.class)).P6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.l) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l.class)).O6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.b) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b.class)).O6();
            return;
        }
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
            pf5.z zVar2 = pf5.z.f353948a;
            ((com.tencent.mm.plugin.finder.live.viewmodel.g) zVar2.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.g.class)).P6();
            com.tencent.mm.plugin.finder.live.viewmodel.l lVar = (com.tencent.mm.plugin.finder.live.viewmodel.l) zVar2.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l.class);
            if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 19) {
                android.view.View view2 = lVar.f117205d;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("root");
                    throw null;
                }
                if (view2.getVisibility() == 8) {
                    com.tencent.mm.plugin.finder.assist.x2.f102672a.b(3);
                }
            }
            android.view.View view3 = lVar.f117205d;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.plugin.finder.live.viewmodel.b) zVar2.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b.class)).O6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar2.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).O6();
            this.f109279y = true;
            return;
        }
        if (this.f109278x != 1) {
            if (this.f109280z) {
                return;
            }
            pf5.z zVar3 = pf5.z.f353948a;
            ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar3.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).P6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar3.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).f117184o = new com.tencent.mm.plugin.finder.feed.ui.p4(this);
            ((com.tencent.mm.plugin.finder.live.viewmodel.g) zVar3.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.g.class)).P6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.l) zVar3.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l.class)).O6();
            ((com.tencent.mm.plugin.finder.live.viewmodel.b) zVar3.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b.class)).O6();
            return;
        }
        pf5.z zVar4 = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.live.viewmodel.g gVar = (com.tencent.mm.plugin.finder.live.viewmodel.g) zVar4.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.g.class);
        android.view.View view4 = gVar.f117099e;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) gVar.findViewById(com.tencent.mm.R.id.f482389d8);
        android.widget.TextView textView2 = (android.widget.TextView) gVar.findViewById(com.tencent.mm.R.id.f17do);
        android.widget.ImageView imageView2 = (android.widget.ImageView) gVar.findViewById(com.tencent.mm.R.id.a86);
        android.widget.TextView textView3 = (android.widget.TextView) gVar.findViewById(com.tencent.mm.R.id.f482393dc);
        android.view.View findViewById = gVar.findViewById(com.tencent.mm.R.id.f482405dp);
        android.view.View findViewById2 = gVar.findViewById(com.tencent.mm.R.id.f482408dr);
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(gVar.getContext()));
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        java.lang.String str2 = "";
        if (b17 != null) {
            cls = com.tencent.mm.plugin.finder.live.viewmodel.b.class;
            view = findViewById;
            str = b17.getAvatarUrl();
        } else {
            cls = com.tencent.mm.plugin.finder.live.viewmodel.b.class;
            view = findViewById;
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context = gVar.getContext();
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
        int authIconType = (b17 == null || (finderAuthInfo2 = b17.field_authInfo) == null) ? 0 : finderAuthInfo2.getAuthIconType();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        kotlin.jvm.internal.o.d(imageView2);
        android.view.View view5 = view;
        zy2.tb.a(m1Var, imageView2, b17 != null ? b17.field_authInfo : null, 0, 4, null);
        if (authIconType == 1) {
            textView = textView3;
            imageView2.setVisibility(0);
            if (b17 != null && (finderAuthInfo = b17.field_authInfo) != null && (authProfession = finderAuthInfo.getAuthProfession()) != null) {
                str2 = authProfession;
            }
            textView.setText(str2);
        } else if (authIconType != 2) {
            imageView2.setVisibility(8);
            textView = textView3;
            textView.setText("");
        } else {
            textView = textView3;
            imageView2.setVisibility(0);
            textView.setText("");
        }
        java.lang.CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        view5.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.e(gVar));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.f(gVar));
        ((com.tencent.mm.plugin.finder.live.viewmodel.l) zVar4.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l.class)).O6();
        ((com.tencent.mm.plugin.finder.live.viewmodel.b) zVar4.a(this).a(cls)).O6();
        ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar4.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).O6();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajq;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.live.viewmodel.g.class, com.tencent.mm.plugin.finder.live.viewmodel.l.class, com.tencent.mm.plugin.finder.live.viewmodel.b.class, com.tencent.mm.plugin.finder.live.viewmodel.k2.class, com.tencent.mm.plugin.finder.live.viewmodel.h.class});
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI, com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        com.tencent.mm.plugin.finder.assist.b3.f102022a.a(findViewById(com.tencent.mm.R.id.gir));
        android.content.Intent intent = getIntent();
        int i17 = qs5.i.f366434a;
        this.f109278x = intent.getIntExtra("KEY_AUTH_MODE", 1);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI, com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(7289, this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.A) {
            if (this.f109279y) {
                d7();
            }
        } else {
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
                d7();
            } else {
                gm0.j1.d().a(7289, this);
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                g92.b.f269769e.M0(8).l();
            }
            this.A = false;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            d7();
        } else {
            db5.t7.makeText(getContext(), com.tencent.mm.R.string.dgq, 0).show();
        }
    }
}
