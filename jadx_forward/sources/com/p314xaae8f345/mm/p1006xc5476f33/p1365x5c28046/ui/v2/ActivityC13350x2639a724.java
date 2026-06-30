package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI */
/* loaded from: classes15.dex */
public class ActivityC13350x2639a724 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, android.widget.AbsListView.OnScrollListener {
    public static final /* synthetic */ int U = 0;
    public android.view.View A;
    public android.app.ProgressDialog C;
    public r45.ce3 D;
    public byte[] E;
    public java.lang.String H;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f179813J;
    public java.util.ArrayList L;
    public z12.o M;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179815e;

    /* renamed from: f, reason: collision with root package name */
    public int f179816f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179817g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179818h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179820m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179821n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179822o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179823p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179824q;

    /* renamed from: s, reason: collision with root package name */
    public int f179826s;

    /* renamed from: t, reason: collision with root package name */
    public long f179827t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13358x9bfc95b1 f179828u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f179829v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 f179830w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f179831x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f179832y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f179833z;

    /* renamed from: d, reason: collision with root package name */
    public int f179814d = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f179819i = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f179825r = 0;
    public boolean B = true;
    public int F = -1;
    public boolean G = false;
    public java.util.HashMap K = new java.util.HashMap();
    public boolean N = false;
    public boolean P = false;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.v(this);
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d R = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724.AnonymousClass2(com.p314xaae8f345.mm.app.a0.f134821d);
    public final db5.l5 S = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.x(this);
    public final db5.j5 T = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.y(this);

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934> {
        public AnonymousClass2(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 1273581380;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a14934) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724.this;
            if (activityC13350x2639a724.f179830w == null || (n3Var = activityC13350x2639a724.Q) == null) {
                return false;
            }
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.w(this));
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724.T6():void");
    }

    public final void U6(byte[] bArr) {
        this.E = null;
        switch (this.f179825r) {
            case 1:
                gm0.j1.n().f354821b.g(new z12.n(1, this.f179814d, this.f179816f, this.f179818h, this.f179819i, bArr));
                return;
            case 2:
            case 3:
                gm0.j1.n().f354821b.g(new z12.n(2, this.f179814d, this.f179816f, this.f179818h, this.f179819i, bArr));
                return;
            case 4:
                gm0.j1.n().f354821b.g(new z12.n(3, this.f179814d, this.f179816f, this.f179818h, this.f179819i, bArr));
                return;
            case 5:
                gm0.j1.n().f354821b.g(new z12.n(4, this.f179814d, this.f179816f, this.f179818h, this.f179819i, bArr));
                return;
            case 6:
                gm0.j1.n().f354821b.g(new z12.n(5, this.f179814d, this.f179816f, this.f179818h, this.f179819i, bArr));
                return;
            default:
                return;
        }
    }

    public final void V6(java.lang.String str) {
        if (isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.C = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), str, true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s(this));
        }
    }

    public final void W6(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 s0Var = this.f179830w;
        if (s0Var == null || linkedList == null) {
            return;
        }
        if (this.F != -1) {
            if (s0Var.f179931f == null) {
                s0Var.f179931f = new java.util.ArrayList();
            }
            s0Var.f179931f.addAll(linkedList);
            s0Var.notifyDataSetChanged();
            return;
        }
        java.util.List list = s0Var.f179931f;
        if (list == null) {
            s0Var.f179931f = new java.util.ArrayList();
        } else {
            list.clear();
        }
        s0Var.f179931f = linkedList;
        s0Var.notifyDataSetChanged();
    }

    public final void X6(r45.ce3 ce3Var) {
        java.util.LinkedList linkedList;
        if (ce3Var == null || (linkedList = ce3Var.f453031f) == null || linkedList.size() <= 0) {
            mo74407xb0dfae51(1001, false);
            return;
        }
        mo74407xb0dfae51(1001, this.B);
        if (this.f179813J != null) {
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
            this.L.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzs));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.zi0 zi0Var = (r45.zi0) it.next();
                if (zi0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zi0Var.f473615e)) {
                    this.L.add(zi0Var.f473615e);
                    this.K.put(zi0Var.f473615e, java.lang.Integer.valueOf(zi0Var.f473614d));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(this.H);
            this.f179813J.r(arrayList2, this.L);
        }
    }

    public final void Y6(java.lang.String str) {
        if (this.f179832y == null || this.f179833z == null) {
            return;
        }
        int i17 = this.f179825r;
        if (i17 != 4) {
            if (i17 == 5 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f179833z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzn, str));
                this.f179833z.setVisibility(0);
                android.view.View view = this.f179832y;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f179833z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzt, str));
            this.f179833z.setVisibility(0);
            android.view.View view2 = this.f179832y;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f179833z.setText("");
            this.f179833z.setVisibility(8);
            android.view.View view3 = this.f179832y;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a86;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f179825r != 6 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179820m)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572646bz4);
        } else {
            mo54450xbf7c1df6(this.f179820m);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.z(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0(mo55332x76847179(), 3);
        this.f179830w = s0Var;
        s0Var.f179936n = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.a0(this);
        this.f179828u = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13358x9bfc95b1) findViewById(com.p314xaae8f345.mm.R.id.i38);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7v, (android.view.ViewGroup) null);
        this.f179831x = inflate;
        this.f179832y = inflate.findViewById(com.p314xaae8f345.mm.R.id.dby);
        this.f179833z = (android.widget.TextView) this.f179831x.findViewById(com.p314xaae8f345.mm.R.id.deo);
        this.f179828u.addHeaderView(this.f179831x);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7p, (android.view.ViewGroup) null);
        this.A = inflate2;
        this.f179828u.addFooterView(inflate2);
        android.view.View view = this.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179828u.setAdapter((android.widget.ListAdapter) this.f179830w);
        this.f179828u.setOnScrollListener(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c) findViewById(com.p314xaae8f345.mm.R.id.ilm);
        this.f179829v = gestureDetectorOnGestureListenerC21510x15ed9d8c;
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79098x563f5e7a(false);
        this.f179829v.m79090x3b8dba10(this.S);
        this.f179829v.m79078x1c273745(this.T);
        this.f179829v.m79082x1e1922a0(false);
        this.f179829v.m79085xcc8bf2ed(false);
        this.f179829v.m79087xceaf442d(true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = (com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52) findViewById(com.p314xaae8f345.mm.R.id.mik);
        this.I = c22311xa7822c52;
        ((android.widget.TextView) c22311xa7822c52.findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.g9i);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a) this.I.findViewById(com.p314xaae8f345.mm.R.id.cee);
        this.f179813J = c21516xe823d84a;
        c21516xe823d84a.m79140x4a0e4618(com.p314xaae8f345.mm.R.C30861xcebc809e.b4t);
        this.f179813J.m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.H = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzs);
        this.I.m80407x96033f02(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.b0(this));
        this.f179813J.m79124x6c4032e7(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.c0(this));
        mo74404x84f07bce(1001, com.p314xaae8f345.mm.R.C30861xcebc809e.f562260bu4, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.d0(this));
        mo74404x84f07bce(1002, com.p314xaae8f345.mm.R.raw.f80306x8f6ba587, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.r(this));
        mo74407xb0dfae51(1001, false);
        mo74407xb0dfae51(1002, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = this.I;
        if (c22311xa7822c52 == null || c22311xa7822c52.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        this.I.setVisibility(8);
        mo74407xb0dfae51(1001, this.B);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572646bz4);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        z85.r rVar;
        r45.v75 v75Var;
        super.onCreate(bundle);
        boolean z17 = false;
        this.f179814d = getIntent().getIntExtra("uin", 0);
        getIntent().getStringExtra("Select_Conv_User");
        this.f179827t = getIntent().getLongExtra("searchID", 0L);
        this.f179815e = getIntent().getStringExtra(dm.i4.f66865x76d1ec5a);
        java.lang.String stringExtra = getIntent().getStringExtra("tag_id");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                this.f179816f = java.lang.Integer.valueOf(stringExtra).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        this.f179817g = getIntent().getStringExtra("tag_desc");
        this.f179818h = getIntent().getStringExtra("keyword");
        this.f179819i = getIntent().getIntExtra("set_id", 0);
        this.f179820m = getIntent().getStringExtra("set_title");
        this.f179821n = getIntent().getStringExtra("set_iconURL");
        this.f179822o = getIntent().getStringExtra("set_desc");
        this.f179823p = getIntent().getStringExtra("headurl");
        this.f179824q = getIntent().getStringExtra("sns_object_data");
        this.f179825r = getIntent().getIntExtra("pageType", 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179824q)) {
            this.f179819i = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.i(this.f179824q);
            this.f179820m = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.j(this.f179824q);
            this.f179821n = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.g(this.f179824q);
            this.f179822o = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f(this.f179824q);
            this.f179823p = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.h(this.f179824q);
            this.f179825r = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.k(this.f179824q);
        }
        switch (this.f179825r) {
            case 0:
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179818h)) {
                    this.f179825r = 5;
                    this.B = false;
                    this.f179826s = 2;
                    break;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179815e)) {
                    this.f179825r = 2;
                    this.f179826s = 1;
                    break;
                } else if (this.f179814d == 0) {
                    if (this.f179816f == 0) {
                        if (this.f179819i <= 0) {
                            this.f179825r = 1;
                            this.f179826s = 0;
                            break;
                        } else {
                            this.f179825r = 6;
                            this.f179826s = 4;
                            break;
                        }
                    } else {
                        this.f179826s = 3;
                        this.f179825r = 4;
                        break;
                    }
                } else {
                    this.f179825r = 3;
                    this.f179826s = 1;
                    break;
                }
            case 1:
                this.f179826s = 0;
                break;
            case 2:
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179815e)) {
                    this.N = true;
                    break;
                }
                break;
            case 3:
                if (this.f179814d == 0) {
                    this.N = true;
                    break;
                }
                break;
            case 4:
                if (this.f179816f == 0) {
                    this.N = true;
                    break;
                }
                break;
            case 5:
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179818h)) {
                    this.N = true;
                    break;
                }
                break;
            case 6:
                if (this.f179819i == 0) {
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
            intent.putExtra("rawUrl", ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().R());
            intent.putExtra("showShare", false);
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            finish();
        }
        if (this.P) {
            int i17 = this.f179819i;
            java.lang.String str = this.f179820m;
            java.lang.String str2 = this.f179822o;
            java.lang.String str3 = this.f179821n;
            java.lang.String str4 = this.f179823p;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414.class);
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
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724.this.finish();
                }
            });
        }
        mo43517x10010bd5();
        if (this.f179814d == 0 && this.f179825r == 2) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                rVar = f17.f276705j;
            }
            r45.ee3 y07 = rVar.y0(this.f179815e);
            if (y07 == null || (v75Var = y07.f454890d) == null || v75Var.f469497d == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v75Var.f469498e)) {
                z17 = true;
            } else {
                int i18 = y07.f454890d.f469497d;
                this.f179814d = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", java.lang.Integer.valueOf(i18));
            }
        }
        if (z17) {
            this.M = new z12.o(this.f179815e);
            gm0.j1.n().f354821b.g(this.M);
            V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq));
        } else {
            T6();
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, java.lang.Boolean.FALSE);
        gm0.j1.n().f354821b.a(gd1.h.f69799x366c91de, this);
        gm0.j1.n().f354821b.a(239, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(239, this);
        gm0.j1.n().f354821b.q(gd1.h.f69799x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.R.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.R.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v75 v75Var;
        byte[] bArr;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.Q;
        if (mo808xfb85f7b0 != 821) {
            if (mo808xfb85f7b0 == 239) {
                android.app.ProgressDialog progressDialog = this.C;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.C.dismiss();
                }
                if (i18 != 0 || i17 != 0) {
                    mo74407xb0dfae51(1001, false);
                    db5.e1.F(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvw), null, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
                    return;
                }
                r45.ee3 H = ((z12.o) m1Var).H();
                if (H == null || (v75Var = H.f454890d) == null) {
                    return;
                }
                this.f179814d = v75Var.f469497d;
                if (n3Var != null) {
                    n3Var.mo50305x3d8a09a2(1004);
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n3Var.mo50303x856b99f0(1002);
            n3Var.mo50307xb9e94560(1001, 200L);
        }
        if (((i17 == 0 && i18 == 0) || (i17 == 4 && (i18 == 2 || i18 == 3))) && (((bArr = this.E) == null || bArr.length <= 0) && nVar.f550868f != 3)) {
            X6(H2);
        }
        if (i17 != 0 && i17 != 4) {
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0f), 0).show();
            return;
        }
        this.E = nVar.f550870h;
        if (i18 == 0) {
            W6(H2.f453029d);
            this.F = 0;
        } else if (i18 == 2) {
            W6(H2.f453029d);
            this.F = 2;
        } else if (i18 != 3) {
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0f), 0).show();
        } else {
            this.F = -1;
            W6(H2.f453029d);
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
                this.Q.mo50307xb9e94560(1002, 200L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
