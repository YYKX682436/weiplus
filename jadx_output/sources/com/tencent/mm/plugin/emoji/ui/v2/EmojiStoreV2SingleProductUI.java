package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class EmojiStoreV2SingleProductUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, android.widget.AbsListView.OnScrollListener {
    public static final /* synthetic */ int U = 0;
    public android.view.View A;
    public android.app.ProgressDialog C;
    public r45.ce3 D;
    public byte[] E;
    public java.lang.String H;
    public com.tencent.mm.ui.contact.LabelContainerView I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTagPanel f98280J;
    public java.util.ArrayList L;
    public z12.o M;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f98282e;

    /* renamed from: f, reason: collision with root package name */
    public int f98283f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f98284g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f98285h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f98287m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f98288n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f98289o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f98290p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f98291q;

    /* renamed from: s, reason: collision with root package name */
    public int f98293s;

    /* renamed from: t, reason: collision with root package name */
    public long f98294t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.PreViewListGridView f98295u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPullDownView f98296v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.s0 f98297w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f98298x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f98299y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f98300z;

    /* renamed from: d, reason: collision with root package name */
    public int f98281d = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f98286i = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f98292r = 0;
    public boolean B = true;
    public int F = -1;
    public boolean G = false;
    public java.util.HashMap K = new java.util.HashMap();
    public boolean N = false;
    public boolean P = false;
    public final com.tencent.mm.sdk.platformtools.n3 Q = new com.tencent.mm.plugin.emoji.ui.v2.v(this);
    public final com.tencent.mm.sdk.event.IListener R = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.AnonymousClass2(com.tencent.mm.app.a0.f53288d);
    public final db5.l5 S = new com.tencent.mm.plugin.emoji.ui.v2.x(this);
    public final db5.j5 T = new com.tencent.mm.plugin.emoji.ui.v2.y(this);

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmojiSyncTaskEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1273581380;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent) {
            com.tencent.mm.sdk.platformtools.n3 n3Var;
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.this;
            if (emojiStoreV2SingleProductUI.f98297w == null || (n3Var = emojiStoreV2SingleProductUI.Q) == null) {
                return false;
            }
            n3Var.post(new com.tencent.mm.plugin.emoji.ui.v2.w(this));
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        if (r4 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.T6():void");
    }

    public final void U6(byte[] bArr) {
        this.E = null;
        switch (this.f98292r) {
            case 1:
                gm0.j1.n().f273288b.g(new z12.n(1, this.f98281d, this.f98283f, this.f98285h, this.f98286i, bArr));
                return;
            case 2:
            case 3:
                gm0.j1.n().f273288b.g(new z12.n(2, this.f98281d, this.f98283f, this.f98285h, this.f98286i, bArr));
                return;
            case 4:
                gm0.j1.n().f273288b.g(new z12.n(3, this.f98281d, this.f98283f, this.f98285h, this.f98286i, bArr));
                return;
            case 5:
                gm0.j1.n().f273288b.g(new z12.n(4, this.f98281d, this.f98283f, this.f98285h, this.f98286i, bArr));
                return;
            case 6:
                gm0.j1.n().f273288b.g(new z12.n(5, this.f98281d, this.f98283f, this.f98285h, this.f98286i, bArr));
                return;
            default:
                return;
        }
    }

    public final void V6(java.lang.String str) {
        if (isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.C = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), str, true, true, new com.tencent.mm.plugin.emoji.ui.v2.s(this));
        }
    }

    public final void W6(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.emoji.ui.v2.s0 s0Var = this.f98297w;
        if (s0Var == null || linkedList == null) {
            return;
        }
        if (this.F != -1) {
            if (s0Var.f98398f == null) {
                s0Var.f98398f = new java.util.ArrayList();
            }
            s0Var.f98398f.addAll(linkedList);
            s0Var.notifyDataSetChanged();
            return;
        }
        java.util.List list = s0Var.f98398f;
        if (list == null) {
            s0Var.f98398f = new java.util.ArrayList();
        } else {
            list.clear();
        }
        s0Var.f98398f = linkedList;
        s0Var.notifyDataSetChanged();
    }

    public final void X6(r45.ce3 ce3Var) {
        java.util.LinkedList linkedList;
        if (ce3Var == null || (linkedList = ce3Var.f371498f) == null || linkedList.size() <= 0) {
            showOptionMenu(1001, false);
            return;
        }
        showOptionMenu(1001, this.B);
        if (this.f98280J != null) {
            java.util.ArrayList arrayList = this.L;
            if (arrayList == null) {
                this.L = new java.util.ArrayList();
            } else {
                arrayList.clear();
            }
            if (this.K == null) {
                this.K = new java.util.HashMap();
            }
            this.K.clear();
            this.L.add(getString(com.tencent.mm.R.string.bzs));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.zi0 zi0Var = (r45.zi0) it.next();
                if (zi0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(zi0Var.f392082e)) {
                    this.L.add(zi0Var.f392082e);
                    this.K.put(zi0Var.f392082e, java.lang.Integer.valueOf(zi0Var.f392081d));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(this.H);
            this.f98280J.r(arrayList2, this.L);
        }
    }

    public final void Y6(java.lang.String str) {
        if (this.f98299y == null || this.f98300z == null) {
            return;
        }
        int i17 = this.f98292r;
        if (i17 != 4) {
            if (i17 == 5 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f98300z.setText(getString(com.tencent.mm.R.string.bzn, str));
                this.f98300z.setVisibility(0);
                android.view.View view = this.f98299y;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f98300z.setText(getString(com.tencent.mm.R.string.bzt, str));
            this.f98300z.setVisibility(0);
            android.view.View view2 = this.f98299y;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f98300z.setText("");
            this.f98300z.setVisibility(8);
            android.view.View view3 = this.f98299y;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a86;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f98292r != 6 || com.tencent.mm.sdk.platformtools.t8.K0(this.f98287m)) {
            setMMTitle(com.tencent.mm.R.string.f491113bz4);
        } else {
            setMMTitle(this.f98287m);
        }
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.v2.z(this));
        com.tencent.mm.plugin.emoji.ui.v2.s0 s0Var = new com.tencent.mm.plugin.emoji.ui.v2.s0(getContext(), 3);
        this.f98297w = s0Var;
        s0Var.f98403n = new com.tencent.mm.plugin.emoji.ui.v2.a0(this);
        this.f98295u = (com.tencent.mm.plugin.emoji.ui.v2.PreViewListGridView) findViewById(com.tencent.mm.R.id.i38);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a7v, (android.view.ViewGroup) null);
        this.f98298x = inflate;
        this.f98299y = inflate.findViewById(com.tencent.mm.R.id.dby);
        this.f98300z = (android.widget.TextView) this.f98298x.findViewById(com.tencent.mm.R.id.deo);
        this.f98295u.addHeaderView(this.f98298x);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a7p, (android.view.ViewGroup) null);
        this.A = inflate2;
        this.f98295u.addFooterView(inflate2);
        android.view.View view = this.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f98295u.setAdapter((android.widget.ListAdapter) this.f98297w);
        this.f98295u.setOnScrollListener(this);
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = (com.tencent.mm.ui.base.MMPullDownView) findViewById(com.tencent.mm.R.id.ilm);
        this.f98296v = mMPullDownView;
        mMPullDownView.setTopViewVisible(false);
        this.f98296v.setOnBottomLoadDataListener(this.S);
        this.f98296v.setAtBottomCallBack(this.T);
        this.f98296v.setBottomViewVisible(false);
        this.f98296v.setIsBottomShowAll(false);
        this.f98296v.setIsReturnSuperDispatchWhenCancel(true);
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = (com.tencent.mm.ui.contact.LabelContainerView) findViewById(com.tencent.mm.R.id.mik);
        this.I = labelContainerView;
        ((android.widget.TextView) labelContainerView.findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.g9i);
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = (com.tencent.mm.ui.base.MMTagPanel) this.I.findViewById(com.tencent.mm.R.id.cee);
        this.f98280J = mMTagPanel;
        mMTagPanel.setTagSelectedBG(com.tencent.mm.R.drawable.b4t);
        this.f98280J.setTagSelectedTextColorRes(com.tencent.mm.R.color.aaq);
        this.H = getString(com.tencent.mm.R.string.bzs);
        this.I.setOnLabelContainerListener(new com.tencent.mm.plugin.emoji.ui.v2.b0(this));
        this.f98280J.setCallBack(new com.tencent.mm.plugin.emoji.ui.v2.c0(this));
        addIconOptionMenu(1001, com.tencent.mm.R.drawable.f480727bu4, new com.tencent.mm.plugin.emoji.ui.v2.d0(this));
        addIconOptionMenu(1002, com.tencent.mm.R.raw.icons_outlined_share, new com.tencent.mm.plugin.emoji.ui.v2.r(this));
        showOptionMenu(1001, false);
        showOptionMenu(1002, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = this.I;
        if (labelContainerView == null || labelContainerView.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        this.I.setVisibility(8);
        showOptionMenu(1001, this.B);
        setMMTitle(com.tencent.mm.R.string.f491113bz4);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        z85.r rVar;
        r45.v75 v75Var;
        super.onCreate(bundle);
        boolean z17 = false;
        this.f98281d = getIntent().getIntExtra("uin", 0);
        getIntent().getStringExtra("Select_Conv_User");
        this.f98294t = getIntent().getLongExtra("searchID", 0L);
        this.f98282e = getIntent().getStringExtra(dm.i4.COL_ID);
        java.lang.String stringExtra = getIntent().getStringExtra("tag_id");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                this.f98283f = java.lang.Integer.valueOf(stringExtra).intValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        this.f98284g = getIntent().getStringExtra("tag_desc");
        this.f98285h = getIntent().getStringExtra("keyword");
        this.f98286i = getIntent().getIntExtra("set_id", 0);
        this.f98287m = getIntent().getStringExtra("set_title");
        this.f98288n = getIntent().getStringExtra("set_iconURL");
        this.f98289o = getIntent().getStringExtra("set_desc");
        this.f98290p = getIntent().getStringExtra("headurl");
        this.f98291q = getIntent().getStringExtra("sns_object_data");
        this.f98292r = getIntent().getIntExtra("pageType", 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f98291q)) {
            this.f98286i = com.tencent.mm.plugin.emoji.model.EmojiLogic.i(this.f98291q);
            this.f98287m = com.tencent.mm.plugin.emoji.model.EmojiLogic.j(this.f98291q);
            this.f98288n = com.tencent.mm.plugin.emoji.model.EmojiLogic.g(this.f98291q);
            this.f98289o = com.tencent.mm.plugin.emoji.model.EmojiLogic.f(this.f98291q);
            this.f98290p = com.tencent.mm.plugin.emoji.model.EmojiLogic.h(this.f98291q);
            this.f98292r = com.tencent.mm.plugin.emoji.model.EmojiLogic.k(this.f98291q);
        }
        switch (this.f98292r) {
            case 0:
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f98285h)) {
                    this.f98292r = 5;
                    this.B = false;
                    this.f98293s = 2;
                    break;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f98282e)) {
                    this.f98292r = 2;
                    this.f98293s = 1;
                    break;
                } else if (this.f98281d == 0) {
                    if (this.f98283f == 0) {
                        if (this.f98286i <= 0) {
                            this.f98292r = 1;
                            this.f98293s = 0;
                            break;
                        } else {
                            this.f98292r = 6;
                            this.f98293s = 4;
                            break;
                        }
                    } else {
                        this.f98293s = 3;
                        this.f98292r = 4;
                        break;
                    }
                } else {
                    this.f98292r = 3;
                    this.f98293s = 1;
                    break;
                }
            case 1:
                this.f98293s = 0;
                break;
            case 2:
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f98282e)) {
                    this.N = true;
                    break;
                }
                break;
            case 3:
                if (this.f98281d == 0) {
                    this.N = true;
                    break;
                }
                break;
            case 4:
                if (this.f98283f == 0) {
                    this.N = true;
                    break;
                }
                break;
            case 5:
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f98285h)) {
                    this.N = true;
                    break;
                }
                break;
            case 6:
                if (this.f98286i == 0) {
                    this.N = true;
                }
                this.P = true;
                break;
            default:
                this.N = true;
                break;
        }
        if (this.N) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().R());
            intent.putExtra("showShare", false);
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            finish();
        }
        if (this.P) {
            int i17 = this.f98286i;
            java.lang.String str = this.f98287m;
            java.lang.String str2 = this.f98289o;
            java.lang.String str3 = this.f98288n;
            java.lang.String str4 = this.f98290p;
            if (com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI.class);
                intent2.putExtra("set_id", i17);
                intent2.putExtra("set_title", str);
                intent2.putExtra("set_desc", str2);
                intent2.putExtra("set_iconURL", str3);
                intent2.putExtra("headurl", str4);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.this.finish();
                }
            });
        }
        initView();
        if (this.f98281d == 0 && this.f98292r == 2) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                rVar = f17.f195172j;
            }
            r45.ee3 y07 = rVar.y0(this.f98282e);
            if (y07 == null || (v75Var = y07.f373357d) == null || v75Var.f387964d == 0 || com.tencent.mm.sdk.platformtools.t8.K0(v75Var.f387965e)) {
                z17 = true;
            } else {
                int i18 = y07.f373357d.f387964d;
                this.f98281d = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", java.lang.Integer.valueOf(i18));
            }
        }
        if (z17) {
            this.M = new z12.o(this.f98282e);
            gm0.j1.n().f273288b.g(this.M);
            V6(getString(com.tencent.mm.R.string.f490604zq));
        } else {
            T6();
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, java.lang.Boolean.FALSE);
        gm0.j1.n().f273288b.a(gd1.h.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(239, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(239, this);
        gm0.j1.n().f273288b.q(gd1.h.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.R.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.R.alive();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v75 v75Var;
        byte[] bArr;
        int type = m1Var.getType();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.Q;
        if (type != 821) {
            if (type == 239) {
                android.app.ProgressDialog progressDialog = this.C;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.C.dismiss();
                }
                if (i18 != 0 || i17 != 0) {
                    showOptionMenu(1001, false);
                    db5.e1.F(getContext(), getString(com.tencent.mm.R.string.bvw), null, true);
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
                    return;
                }
                r45.ee3 H = ((z12.o) m1Var).H();
                if (H == null || (v75Var = H.f373357d) == null) {
                    return;
                }
                this.f98281d = v75Var.f387964d;
                if (n3Var != null) {
                    n3Var.sendEmptyMessage(1004);
                    return;
                }
                return;
            }
            return;
        }
        android.app.ProgressDialog progressDialog2 = this.C;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.C.dismiss();
        }
        z12.n nVar = (z12.n) m1Var;
        r45.ce3 H2 = nVar.H();
        this.G = false;
        android.view.View view = this.A;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n3Var.removeMessages(1002);
            n3Var.sendEmptyMessageDelayed(1001, 200L);
        }
        if (((i17 == 0 && i18 == 0) || (i17 == 4 && (i18 == 2 || i18 == 3))) && (((bArr = this.E) == null || bArr.length <= 0) && nVar.f469335f != 3)) {
            X6(H2);
        }
        if (i17 != 0 && i17 != 4) {
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.c0f), 0).show();
            return;
        }
        this.E = nVar.f469337h;
        if (i18 == 0) {
            W6(H2.f371496d);
            this.F = 0;
        } else if (i18 == 2) {
            W6(H2.f371496d);
            this.F = 2;
        } else if (i18 != 3) {
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.c0f), 0).show();
        } else {
            this.F = -1;
            W6(H2.f371496d);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1 && this.F == 2 && !(z17 = this.G)) {
            if (!z17) {
                U6(this.E);
                this.G = true;
                this.Q.sendEmptyMessageDelayed(1002, 200L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
