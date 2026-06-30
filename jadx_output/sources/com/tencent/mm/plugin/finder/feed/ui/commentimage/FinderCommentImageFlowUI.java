package com.tencent.mm.plugin.finder.feed.ui.commentimage;

@db5.a(dc1.e.CTRL_INDEX)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "ImageRecyclerView", "com/tencent/mm/plugin/finder/feed/ui/commentimage/o", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class FinderCommentImageFlowUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int U = 0;
    public android.view.View A;
    public android.view.View B;
    public com.tencent.mm.plugin.finder.view.FinderCommentFooter C;
    public boolean G;
    public boolean H;
    public android.os.Bundle I;
    public int K;
    public int L;
    public android.graphics.Rect M;
    public android.graphics.Rect N;
    public boolean P;
    public int Q;
    public boolean R;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109777u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f109778v;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f109780x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f109781y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f109782z;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109776t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.commentimage.w0(this));

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.o6 f109779w = new com.tencent.mm.plugin.finder.ui.o6();
    public final com.tencent.mm.plugin.finder.feed.ui.commentimage.o D = new com.tencent.mm.plugin.finder.feed.ui.commentimage.o();
    public final android.content.Intent E = new android.content.Intent();
    public final com.tencent.mm.ui.tools.s4 F = new com.tencent.mm.ui.tools.s4(this);

    /* renamed from: J, reason: collision with root package name */
    public float f109775J = 1.0f;
    public final gd2.n S = new gd2.n(this, new com.tencent.mm.plugin.finder.feed.ui.commentimage.z(this));
    public final com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$commentChangeEventListener$1 T = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentChangeEvent>() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$commentChangeEventListener$1
        {
            super(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this);
            this.__eventId = 449554913;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        @Override // com.tencent.mm.sdk.event.IListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean callback(com.tencent.mm.autogen.events.FinderCommentChangeEvent r8) {
            /*
                r7 = this;
                com.tencent.mm.autogen.events.FinderCommentChangeEvent r8 = (com.tencent.mm.autogen.events.FinderCommentChangeEvent) r8
                java.lang.String r0 = "event"
                kotlin.jvm.internal.o.g(r8, r0)
                r0 = 1
                com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI r1 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this
                r2 = 0
                am.ta r3 = r8.f54263g
                if (r3 == 0) goto L25
                long r3 = r3.f7993a
                int r5 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U
                com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 r5 = r1.d7()
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.O6()
                long r5 = r5.getId()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L25
                r3 = r0
                goto L26
            L25:
                r3 = r2
            L26:
                if (r3 != 0) goto L2a
                r0 = r2
                goto L32
            L2a:
                com.tencent.mm.plugin.finder.feed.ui.commentimage.y r2 = new com.tencent.mm.plugin.finder.feed.ui.commentimage.y
                r2.<init>(r8, r1)
                pm0.v.X(r2)
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    public final void c7() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.C;
        if (finderCommentFooter != null) {
            finderCommentFooter.r();
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.C;
        if (finderCommentFooter2 != null) {
            finderCommentFooter2.w2(0, false);
        }
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "closeCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "closeCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.C;
        if (finderCommentFooter3 != null) {
            finderCommentFooter3.post(new com.tencent.mm.plugin.finder.feed.ui.commentimage.p(this));
        }
    }

    public final com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d7() {
        return (com.tencent.mm.plugin.finder.feed.ui.commentimage.d1) this.f109776t.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r4, r0)
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L4e
            boolean r0 = r3.getF65848t()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r3.getSwipeBackLayout()
            if (r0 == 0) goto L23
            r0.a()
            boolean r0 = r0.f211441v
            if (r0 != r2) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L2e
            java.lang.String r4 = "FinderCommentImageFlowUI"
            java.lang.String r0 = "IS SwipeBack ING, ignore KeyBack Event"
            com.tencent.mars.xlog.Log.w(r4, r0)
            return r2
        L2e:
            int r0 = r4.getAction()
            if (r0 != 0) goto L4e
            android.view.View r4 = r3.B
            if (r4 == 0) goto L44
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L40
            r4 = r2
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 != r2) goto L44
            r1 = r2
        L44:
            if (r1 == 0) goto L4a
            r3.c7()
            goto L4d
        L4a:
            r3.e7()
        L4d:
            return r2
        L4e:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.e7():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        int i17 = this.D.f109878f;
        android.content.Intent intent = this.E;
        if (i17 != -1) {
            so2.y0 y0Var = (so2.y0) kz5.n0.a0(d7().f109827n, i17);
            java.lang.Long valueOf = y0Var != null ? java.lang.Long.valueOf(y0Var.getItemId()) : null;
            long j17 = d7().f109823g;
            if (valueOf == null || j17 != valueOf.longValue()) {
                intent.putExtra("lastViewedCommentIdKey", valueOf);
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if ((extras == null || extras.isEmpty()) ? false : true) {
            setResult(0, intent);
        }
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e68;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        long[] longArrayExtra;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 502) {
            java.lang.Long l17 = null;
            java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            if (intent != null && (longArrayExtra = intent.getLongArrayExtra("SELECT_IMAGES_MODIFIED_TIME")) != null) {
                l17 = kz5.z.N(longArrayExtra);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.C;
            if (finderCommentFooter != null) {
                int i19 = com.tencent.mm.plugin.finder.view.FinderCommentFooter.N1;
                finderCommentFooter.t(str, false, l17);
            }
        }
        if (intent != null && i17 == 501) {
            if (i18 != -1) {
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.C;
                if (finderCommentFooter2 != null) {
                    finderCommentFooter2.getEditText().postDelayed(new com.tencent.mm.plugin.finder.view.u5(finderCommentFooter2), 300L);
                    return;
                }
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
            if (byteArrayExtra != null) {
                try {
                    r45.gb4 gb4Var = new r45.gb4();
                    gb4Var.fromProtobuf(byteArrayExtra);
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.C;
                    if (finderCommentFooter3 != null) {
                        finderCommentFooter3.q(gb4Var);
                    }
                } catch (java.lang.Exception e17) {
                    java.lang.String message = e17.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    com.tencent.mars.xlog.Log.e("FinderCommentImageFlowUI", message);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.ui.tools.f5 f5Var;
        setTheme(com.tencent.mm.R.style.f494208yl);
        super.onCreate(bundle);
        db5.f.c(this, null);
        overridePendingTransition(0, 0);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ofb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setPadding(findViewById.getPaddingLeft(), com.tencent.mm.ui.bk.p(this), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        getWindow().setSoftInputMode(48);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(0);
        }
        this.I = bundle;
        this.B = findViewById(com.tencent.mm.R.id.two);
        this.C = (com.tencent.mm.plugin.finder.view.FinderCommentFooter) findViewById(com.tencent.mm.R.id.eat);
        this.f109782z = findViewById(com.tencent.mm.R.id.vmt);
        this.A = findViewById(com.tencent.mm.R.id.ofb);
        this.f109778v = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById(com.tencent.mm.R.id.m6e);
        this.f109777u = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.u3n);
        this.f109781y = new com.tencent.mm.ui.tools.f5(this);
        java.lang.Object a17 = ok5.d.a(getIntent(), "initCommentsKey");
        java.util.List list = a17 instanceof java.util.List ? (java.util.List) a17 : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((so2.y0) next).f410703d.w0() == 2) {
                arrayList.add(next);
            }
        }
        java.lang.Object a18 = ok5.d.a(getIntent(), "feedObjKey");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a18 instanceof com.tencent.mm.plugin.finder.storage.FinderItem ? (com.tencent.mm.plugin.finder.storage.FinderItem) a18 : null;
        if (finderItem == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageFlowUI", "feed is null, finish this activity.");
            finish();
            return;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("initLastBufferKey");
        com.tencent.mm.protobuf.g gVar = byteArrayExtra != null ? new com.tencent.mm.protobuf.g(byteArrayExtra, 0, byteArrayExtra.length) : null;
        findViewById(com.tencent.mm.R.id.aa9).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.i0(this));
        long longExtra = getIntent().getLongExtra("initCommentIdKey", 0L);
        int intExtra = getIntent().getIntExtra("reasonKey", 0);
        this.M = (android.graphics.Rect) b3.q.a(getIntent(), "commentImageRectKey", android.graphics.Rect.class);
        this.N = (android.graphics.Rect) b3.q.a(getIntent(), "commentDrawerRectKey", android.graphics.Rect.class);
        this.P = getIntent().getBooleanExtra("shouldRunDragAnimationKey", false);
        this.Q = getIntent().getIntExtra("openContextHashKey", 0);
        alive();
        com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d76 = d7();
        android.content.Intent intent = getIntent();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int intExtra2 = intent.getIntExtra("sceneKey", com.tencent.mm.plugin.finder.storage.t70.f127590a.u2());
        r45.vg7 vg7Var = r45.vg7.emFinderGetCommentListSortType_Default;
        d76.getClass();
        if (!d76.f109820d) {
            d76.f109820d = true;
            d76.f109821e = finderItem;
            d76.f109822f = intExtra2;
            d76.f109823g = longExtra;
            d76.f109824h = null;
            d76.f109825i = vg7Var;
            d76.f109827n.clear();
            kz5.h0.u(d76.f109827n, arrayList);
            d76.f109826m = intExtra;
            d76.f109829p = gVar;
            d76.f109830q = true;
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.C;
        if (finderCommentFooter != null) {
            finderCommentFooter.setClickable(true);
        }
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "initCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "initCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.C;
        if (finderCommentFooter2 != null) {
            finderCommentFooter2.setFooterMode(0);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.C;
        if (finderCommentFooter3 != null) {
            finderCommentFooter3.setSwitchSceneListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.a0(this));
        }
        android.view.View view2 = this.B;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.b0(this));
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = this.C;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText = finderCommentFooter4 != null ? (com.tencent.mm.plugin.finder.view.FinderCommentEditText) finderCommentFooter4.findViewById(com.tencent.mm.R.id.c6v) : null;
        if (finderCommentEditText != null) {
            finderCommentEditText.setBackListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.c0(this));
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter5 = this.C;
        if (finderCommentFooter5 != null && (f5Var = this.f109781y) != null) {
            f5Var.f210400e = finderCommentFooter5;
        }
        com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout finderInterceptFrameLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout) findViewById(com.tencent.mm.R.id.u5r);
        if (finderInterceptFrameLayout != null) {
            finderInterceptFrameLayout.setInterceptListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.d0(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109777u;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
            recyclerView2.setHasFixedSize(true);
            this.f109779w.b(recyclerView2);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$initViews$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this;
                    int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
                    com.tencent.mm.plugin.finder.storage.FinderItem O6 = finderCommentImageFlowUI.d7().O6();
                    int i18 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this.d7().f109822f;
                    com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI2 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this;
                    return new rb2.y0(O6, i18, finderCommentImageFlowUI2.S, new com.tencent.mm.plugin.finder.feed.ui.commentimage.e0(finderCommentImageFlowUI2), new com.tencent.mm.plugin.finder.feed.ui.commentimage.f0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this), new com.tencent.mm.plugin.finder.feed.ui.commentimage.g0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.this));
                }
            }, d7().f109827n, true);
            this.f109780x = wxRecyclerAdapter;
            recyclerView2.setAdapter(wxRecyclerAdapter);
            if (recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
                finderRecyclerView.setPageChangeListener(this.D);
                finderRecyclerView.setHorizontalSwipeOptimizationEnabled(false);
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderCommentImageFlowUI", "initViews recyclerView is null");
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f109778v;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.feed.ui.commentimage.h0(this));
        }
        long j17 = d7().f109823g;
        java.util.Iterator it6 = d7().f109827n.iterator();
        int i17 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.y0) it6.next()).getItemId() == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f109777u;
            if (recyclerView3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(recyclerView3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView3.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(recyclerView3, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f109777u;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView4 != null ? recyclerView4.getLayoutManager() : null;
            if (layoutManager2 != null && (recyclerView = this.f109777u) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.v0(this, layoutManager2, i17));
            }
        }
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        kotlinx.coroutines.l.d(b17, g3Var, null, new com.tencent.mm.plugin.finder.feed.ui.commentimage.s(this, null), 2, null);
        kotlinx.coroutines.l.d(v65.m.b(this), g3Var, null, new com.tencent.mm.plugin.finder.feed.ui.commentimage.v(this, null), 2, null);
        kotlinx.coroutines.l.d(v65.m.b(this), g3Var, null, new com.tencent.mm.plugin.finder.feed.ui.commentimage.x(this, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dead();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.C;
        if (finderCommentFooter != null) {
            finderCommentFooter.r();
        }
        if (this.Q != 0) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.l7) ((zy2.b6) c17)).cl(zy2.z5.f477639d, false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.Q == 0 || isFinishing()) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((c61.l7) ((zy2.b6) c17)).Qk(false, this.Q, isFinishing());
        this.R = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q == 0 || !this.R) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((c61.l7) ((zy2.b6) c17)).Qk(true, this.Q, false);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onStart();
        int size = d7().f109827n.size();
        int i17 = d7().f109828o;
        if (!(i17 >= 0 && i17 < size) || (recyclerView = this.f109777u) == null) {
            return;
        }
        int i18 = d7().f109828o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "onStart", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "onStart", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        d7().f109828o = this.D.f109878f;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$ImageRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class ImageRecyclerView extends com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView {
        public final float[] A2;

        /* renamed from: w2, reason: collision with root package name */
        public float f109783w2;

        /* renamed from: x2, reason: collision with root package name */
        public float f109784x2;

        /* renamed from: y2, reason: collision with root package name */
        public java.lang.Float f109785y2;

        /* renamed from: z2, reason: collision with root package name */
        public java.lang.Float f109786z2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageRecyclerView(android.content.Context context, android.util.AttributeSet attrs) {
            super(context, attrs);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
            this.A2 = new float[9];
        }

        @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
            on5.c loadMoreFooter;
            android.view.View view;
            java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f109783w2 = motionEvent.getX();
                this.f109784x2 = motionEvent.getY();
            } else {
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    this.f109785y2 = null;
                    this.f109786z2 = null;
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    this.f109785y2 = java.lang.Float.valueOf(motionEvent.getX() - this.f109783w2);
                    this.f109786z2 = java.lang.Float.valueOf(motionEvent.getY() - this.f109784x2);
                    java.lang.Float f17 = this.f109785y2;
                    kotlin.jvm.internal.o.d(f17);
                    float floatValue = f17.floatValue();
                    java.lang.Float f18 = this.f109786z2;
                    kotlin.jvm.internal.o.d(f18);
                    float floatValue2 = f18.floatValue();
                    getParent().requestDisallowInterceptTouchEvent(canScrollVertically(1));
                    if (motionEvent.getPointerCount() > 1 || java.lang.Math.abs(floatValue) >= java.lang.Math.abs(floatValue2)) {
                        return false;
                    }
                    android.view.ViewParent parent = getParent();
                    com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = parent instanceof com.tencent.mm.view.refreshLayout.WxRefreshLayout ? (com.tencent.mm.view.refreshLayout.WxRefreshLayout) parent : null;
                    if (!kotlin.jvm.internal.o.a((wxRefreshLayout == null || (loadMoreFooter = wxRefreshLayout.getLoadMoreFooter()) == null || (view = loadMoreFooter.getView()) == null) ? null : java.lang.Float.valueOf(view.getTranslationY()), 0.0f)) {
                        return true;
                    }
                    android.view.View childAt = getChildAt(0);
                    com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = childAt != null ? (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) childAt.findViewById(com.tencent.mm.R.id.u76) : null;
                    android.view.View selectedView = finderCommentImageGalleryView != null ? finderCommentImageGalleryView.getSelectedView() : null;
                    com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = selectedView instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) selectedView : null;
                    if (multiTouchImageView2 != null) {
                        android.graphics.Matrix imageMatrix = multiTouchImageView2.getImageMatrix();
                        float[] fArr = this.A2;
                        imageMatrix.getValues(fArr);
                        float scale = multiTouchImageView2.getScale() * multiTouchImageView2.getImageHeight();
                        if (java.lang.Float.isNaN(scale)) {
                            return true;
                        }
                        float f19 = fArr[5];
                        float f27 = scale + f19;
                        if (f19 < 0.0f && f27 > finderCommentImageGalleryView.getHeight()) {
                            return false;
                        }
                        if (floatValue2 > 0.0f && !canScrollVertically(-1)) {
                            return false;
                        }
                        if (java.lang.Math.abs(f19 - 0.0f) >= 0.001d || java.lang.Math.abs(f27 - finderCommentImageGalleryView.getHeight()) >= 0.001d) {
                            if (f19 >= 0.0f && floatValue2 > 0.0f) {
                                android.view.View selectedView2 = finderCommentImageGalleryView.getSelectedView();
                                multiTouchImageView = selectedView2 instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) selectedView2 : null;
                                if (multiTouchImageView != null) {
                                    int height = finderCommentImageGalleryView.getHeight();
                                    rb2.g1 g1Var = finderCommentImageGalleryView.E1;
                                    g1Var.getClass();
                                    android.graphics.Matrix imageMatrix2 = multiTouchImageView.getImageMatrix();
                                    float[] fArr2 = g1Var.f393632a;
                                    imageMatrix2.getValues(fArr2);
                                    float scale2 = multiTouchImageView.getScale() * multiTouchImageView.getImageHeight();
                                    float f28 = height;
                                    multiTouchImageView.c(0.0f, (scale2 < f28 ? (f28 / 2.0f) - (scale2 / 2.0f) : 0.0f) - fArr2[5]);
                                }
                            } else {
                                if (f27 > finderCommentImageGalleryView.getHeight() || floatValue2 >= 0.0f) {
                                    return false;
                                }
                                android.view.View selectedView3 = finderCommentImageGalleryView.getSelectedView();
                                multiTouchImageView = selectedView3 instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) selectedView3 : null;
                                if (multiTouchImageView != null) {
                                    int height2 = finderCommentImageGalleryView.getHeight();
                                    rb2.f1 f1Var = finderCommentImageGalleryView.F1;
                                    f1Var.getClass();
                                    android.graphics.Matrix imageMatrix3 = multiTouchImageView.getImageMatrix();
                                    float[] fArr3 = f1Var.f393627a;
                                    imageMatrix3.getValues(fArr3);
                                    float scale3 = multiTouchImageView.getScale() * multiTouchImageView.getImageHeight();
                                    float f29 = fArr3[5] + scale3;
                                    float f37 = height2;
                                    if (scale3 < f37) {
                                        f37 = (f37 / 2.0f) + (scale3 / 2.0f);
                                    }
                                    multiTouchImageView.c(0.0f, f37 - f29);
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageRecyclerView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
            super(context, attrs, i17);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(attrs, "attrs");
            this.A2 = new float[9];
        }
    }
}
