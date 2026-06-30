package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView */
/* loaded from: classes5.dex */
public class C22287x2d5af6c8 extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f287853n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f287854d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f287855e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f287856f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f287857g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f287858h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f287859i;

    /* renamed from: m, reason: collision with root package name */
    public final int f287860m;

    public C22287x2d5af6c8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f287855e = null;
        this.f287859i = true;
        this.f287860m = 251658241;
        this.f287854d = context;
        a();
        m80402x231a26f4(true);
    }

    /* renamed from: setStatus */
    private void m80402x231a26f4(final boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17;
                long j17;
                final com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c8 = com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.this;
                final boolean z18 = z17;
                int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.f287853n;
                c22287x2d5af6c8.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r01.x cj6 = r01.q3.cj();
                int i19 = c22287x2d5af6c8.f287860m;
                cj6.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("select count(bizinfo.username) from rcontact, bizinfo where rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0  and bizinfo.type = ");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
                sb6.append(i19);
                java.lang.Object[] objArr = {"gh_43f2581f6fd6", "schedule_message", "gh_3dfda90e39d6", "gh_b4af18eac3d5", "gh_f0a92aa7146c", "gh_e087bb5b95e6", "gh_579db1f2cf89", "weixin", "gh_9639b5a92773"};
                java.util.ArrayList arrayList = new java.util.ArrayList(9);
                for (int i27 = 0; i27 < 9; i27++) {
                    java.lang.Object obj = objArr[i27];
                    java.util.Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                cj6.y0(sb6, java.util.Collections.unmodifiableList(arrayList));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoStorage", "getServiceBizCount, %s", sb6.toString());
                android.database.Cursor m145256x1d3f4980 = cj6.m145256x1d3f4980(sb6.toString(), new java.lang.String[0]);
                if (m145256x1d3f4980 != null) {
                    int i28 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getInt(0) : 0;
                    m145256x1d3f4980.close();
                    i17 = i28;
                } else {
                    i17 = 0;
                }
                c22287x2d5af6c8.f287859i = i17 > 0;
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c82 = com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.this;
                        android.view.View view = c22287x2d5af6c82.f287856f;
                        int i29 = c22287x2d5af6c82.f287859i ? 0 : 8;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(java.lang.Integer.valueOf(i29));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/contact/BizContactEntranceView", "lambda$setStatus$0", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/contact/BizContactEntranceView", "lambda$setStatus$0", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        c22287x2d5af6c82.m80403xcd1079b0(z18);
                    }
                });
                if (c22287x2d5af6c8.f287859i) {
                    r01.x cj7 = r01.q3.cj();
                    cj7.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoStorage", "getLastNewBizUpdateTime, sql %s", "select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC");
                    android.database.Cursor m145256x1d3f49802 = cj7.m145256x1d3f4980("select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC", new java.lang.String[0]);
                    if (m145256x1d3f49802 != null) {
                        if (m145256x1d3f49802.moveToFirst()) {
                            j17 = m145256x1d3f49802.getLong(0);
                            m145256x1d3f49802.close();
                            final long p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p1(c01.d9.b().p().l(233473, null), 0L);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(p17));
                            final long j18 = j17;
                            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable(j18, p17) { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.this.f287857g.setVisibility(4);
                                }
                            });
                        } else {
                            m145256x1d3f49802.close();
                        }
                    }
                    j17 = 0;
                    final long p172 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p1(c01.d9.b().p().l(233473, null), 0L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(p172));
                    final long j182 = j17;
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable(j182, p172) { // from class: com.tencent.mm.ui.contact.BizContactEntranceView$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.this.f287857g.setVisibility(4);
                        }
                    });
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(c22287x2d5af6c8.f287859i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        });
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569748kr, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cg7);
        this.f287855e = findViewById;
        this.f287856f = findViewById.findViewById(com.p314xaae8f345.mm.R.id.ajz);
        this.f287858h = (android.widget.LinearLayout) this.f287855e.findViewById(com.p314xaae8f345.mm.R.id.f564957as2);
        android.view.ViewGroup.LayoutParams layoutParams = this.f287856f.getLayoutParams();
        layoutParams.height = (int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561146ao) * i65.a.A(getContext()));
        this.f287856f.setLayoutParams(layoutParams);
        android.view.View view = this.f287855e;
        int i17 = this.f287860m;
        tf5.m.O6(view, i17 == 1 ? 6 : 5);
        this.f287855e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.k0(this));
        this.f287856f.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.l0(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f287856f.findViewById(com.p314xaae8f345.mm.R.id.ajy);
        java.lang.String str = i17 == 0 ? "officialaccounts" : "service_officialaccounts";
        if (((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str)) {
            ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Di((android.widget.ImageView) c21522xf5a6e956.m79176xc2a54588(), str);
        } else {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = (android.widget.ImageView) c21522xf5a6e956.m79176xc2a54588();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.a(imageView, str);
        }
        this.f287857g = (android.widget.TextView) c21522xf5a6e956.findViewById(com.p314xaae8f345.mm.R.id.o_u);
        if (i17 == 1) {
            ((android.widget.TextView) this.f287855e.findViewById(com.p314xaae8f345.mm.R.id.sny)).setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.me9));
        }
    }

    public void b(boolean z17) {
        m80402x231a26f4(z17);
    }

    public void c(boolean z17) {
        android.view.View view = this.f287856f;
        if (view == null || this.f287858h == null) {
            return;
        }
        android.content.Context context = this.f287854d;
        if (!z17) {
            view.setBackground(null);
            this.f287858h.setBackground(com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
        } else {
            int paddingLeft = view.getPaddingLeft();
            this.f287856f.setBackground(com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
            this.f287856f.setPadding(paddingLeft, 0, 0, 0);
            this.f287858h.setBackground(null);
        }
    }

    /* renamed from: setVisible */
    public void m80403xcd1079b0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f287859i));
        android.view.View view = this.f287855e;
        int i17 = (z17 && this.f287859i) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C22287x2d5af6c8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f287855e = null;
        this.f287859i = true;
        this.f287860m = 251658241;
        this.f287854d = context;
        a();
        m80402x231a26f4(true);
    }

    public C22287x2d5af6c8(android.content.Context context, int i17) {
        super(context);
        this.f287855e = null;
        this.f287859i = true;
        this.f287860m = 251658241;
        this.f287854d = context;
        this.f287860m = i17;
        a();
        m80402x231a26f4(true);
    }
}
