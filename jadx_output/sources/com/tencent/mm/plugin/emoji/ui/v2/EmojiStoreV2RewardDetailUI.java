package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes4.dex */
public class EmojiStoreV2RewardDetailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f98261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f98262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f98263f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f98264g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f98265h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f98266i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f98267m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f98268n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f98269o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f98270p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f98271q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f98272r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.p f98273s;

    /* renamed from: t, reason: collision with root package name */
    public r45.xe3 f98274t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f98275u;

    /* renamed from: v, reason: collision with root package name */
    public z12.r f98276v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f98277w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f98278x = -1;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f98279y = new com.tencent.mm.plugin.emoji.ui.v2.n(this);

    public final void T6(boolean z17) {
        if (this.f98277w || this.f98278x == 0) {
            return;
        }
        this.f98276v = new z12.r(this.f98261d, this.f98275u);
        gm0.j1.n().f273288b.g(this.f98276v);
        this.f98277w = true;
        if (z17) {
            this.f98279y.sendEmptyMessageDelayed(1002, 200L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a7z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bz9);
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.v2.o(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488737a80, (android.view.ViewGroup) null);
        this.f98265h = inflate;
        this.f98266i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cvb);
        this.f98267m = (android.widget.TextView) this.f98265h.findViewById(com.tencent.mm.R.id.l7a);
        this.f98268n = (android.widget.TextView) this.f98265h.findViewById(com.tencent.mm.R.id.cvc);
        this.f98269o = (android.widget.TextView) this.f98265h.findViewById(com.tencent.mm.R.id.m2n);
        this.f98270p = findViewById(com.tencent.mm.R.id.m7g);
        this.f98271q = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gyj);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a7p, (android.view.ViewGroup) null);
        this.f98272r = inflate2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f98271q.addHeaderView(this.f98265h);
        this.f98271q.addFooterView(this.f98272r);
        com.tencent.mm.plugin.emoji.ui.v2.p pVar = new com.tencent.mm.plugin.emoji.ui.v2.p(this, this);
        this.f98273s = pVar;
        this.f98271q.setAdapter((android.widget.ListAdapter) pVar);
        this.f98271q.setOnScrollListener(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        z85.v vVar;
        super.onCreate(bundle);
        this.f98261d = getIntent().getStringExtra("extra_id");
        this.f98262e = getIntent().getStringExtra("extra_name");
        this.f98263f = getIntent().getStringExtra("extra_iconurl");
        this.f98264g = getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        initView();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
        synchronized (f17.f195163a) {
            vVar = f17.f195171i;
        }
        java.lang.String str = this.f98261d;
        vVar.getClass();
        r45.xe3 xe3Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
        } else {
            android.database.Cursor D = vVar.f470825d.D("EmotionRewardInfo", new java.lang.String[]{"content"}, "productID=?", new java.lang.String[]{str}, null, null, null, 2);
            if (D != null && D.moveToFirst()) {
                try {
                    r45.xe3 xe3Var2 = new r45.xe3();
                    xe3Var2.parseFrom(D.getBlob(0));
                    xe3Var = xe3Var2;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            if (D != null) {
                D.close();
            }
        }
        this.f98274t = xe3Var;
        this.f98276v = new z12.r(this.f98261d, this.f98275u);
        gm0.j1.n().f273288b.g(this.f98276v);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = this.f98263f;
        b17.h(str2, this.f98266i, y12.f.b(this.f98261d, str2));
        this.f98267m.setText(this.f98262e);
        this.f98268n.setText(this.f98264g);
        r45.xe3 xe3Var3 = this.f98274t;
        if (xe3Var3 != null) {
            this.f98269o.setText(getString(com.tencent.mm.R.string.bz_, java.lang.Integer.valueOf(xe3Var3.f390010e)));
        }
        gm0.j1.n().f273288b.a(299, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(299, this);
        n11.a.b().n(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.view.View view;
        this.f98277w = false;
        android.view.View view2 = this.f98272r;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f98279y;
            n3Var.removeMessages(1002);
            n3Var.sendEmptyMessageDelayed(1001, 200L);
        }
        if (m1Var.getType() != 299) {
            return;
        }
        z12.r rVar = (z12.r) m1Var;
        if (i17 != 0 && i17 != 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "unknow errType:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f98275u = rVar.f469357f;
        com.tencent.mm.modelbase.o oVar = rVar.f469355d;
        if (i18 == 0) {
            this.f98278x = 0;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (((r45.ue3) fVar) != null) {
                this.f98273s.a(((r45.ue3) fVar).f387297e);
                return;
            }
            return;
        }
        boolean z17 = true;
        if (i18 != 2) {
            if (i18 == 3) {
                this.f98278x = 1;
                this.f98275u = null;
                this.f98273s.f98383e = true;
                T6(false);
                return;
            }
            return;
        }
        this.f98278x = 2;
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        if (((r45.ue3) fVar2) != null) {
            this.f98273s.a(((r45.ue3) fVar2).f387297e);
        }
        com.tencent.mm.plugin.emoji.ui.v2.p pVar = this.f98273s;
        if (pVar != null && (view = this.f98265h) != null) {
            int i19 = pVar.f98387i + pVar.f98386h;
            int height = view.getHeight();
            int k17 = i65.a.k(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "item:%d header:%d window:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(k17));
            if (k17 > (i19 * this.f98273s.getCount()) + height) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        T6(false);
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
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f98278x == 0 || this.f98277w) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                T6(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "[onScrollStateChanged] loadMoreData.");
                n11.a.b().n(i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
