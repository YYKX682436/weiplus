package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qs extends com.tencent.mapsdk.internal.es implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, com.tencent.mapsdk.internal.qt.a {

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f51031k = "VIEW_TAG_HEADER";

    /* renamed from: l, reason: collision with root package name */
    private static final java.lang.String f51032l = "VIEW_TAG_FOOTER";

    /* renamed from: m, reason: collision with root package name */
    private static final float f51033m = 2.7f;

    /* renamed from: n, reason: collision with root package name */
    private static final float f51034n = 44.0f;

    /* renamed from: o, reason: collision with root package name */
    private static final float f51035o = 13.0f;

    /* renamed from: p, reason: collision with root package name */
    private static final float f51036p = 26.0f;

    /* renamed from: q, reason: collision with root package name */
    private static final float f51037q = 9.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f51038r = 37.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f51039s = 4.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f51040t = 45.0f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f51041u = 15.0f;

    /* renamed from: w, reason: collision with root package name */
    private static final int f51042w = -1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f51044y = -1;
    private com.tencent.mapsdk.internal.qs.a A;
    private final android.content.Context B;
    private com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding E;
    private java.lang.String F;
    private boolean H;
    private com.tencent.mapsdk.internal.qo I;

    /* renamed from: J, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qo f51046J;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qq f51047a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51048b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ac f51050d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.tr f51051e;

    /* renamed from: f, reason: collision with root package name */
    public int f51052f;

    /* renamed from: g, reason: collision with root package name */
    public int f51053g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qt f51054h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qp f51055i;

    /* renamed from: x, reason: collision with root package name */
    private static final int f51043x = android.graphics.Color.parseColor("#333333");

    /* renamed from: z, reason: collision with root package name */
    private static final int f51045z = android.graphics.Color.parseColor("#979797");

    /* renamed from: j, reason: collision with root package name */
    private float f51056j = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    private int f51057v = 0;
    private int C = -1;
    private int D = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51049c = false;
    private boolean G = false;
    private com.tencent.mapsdk.internal.qs.a.C0039a K = null;

    /* renamed from: com.tencent.mapsdk.internal.qs$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) com.tencent.mapsdk.internal.qs.this.f51047a.getLayoutParams();
            marginLayoutParams.bottomMargin = com.tencent.mapsdk.internal.qs.this.f51052f;
            com.tencent.mapsdk.internal.qs.this.f51047a.setLayoutParams(marginLayoutParams);
        }
    }

    /* loaded from: classes13.dex */
    public class a extends android.widget.BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f51062b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> f51063c;

        /* renamed from: com.tencent.mapsdk.internal.qs$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public class C0039a {

            /* renamed from: a, reason: collision with root package name */
            public android.widget.TextView f51064a;

            /* renamed from: b, reason: collision with root package name */
            public android.view.View f51065b;

            public C0039a(android.widget.TextView textView, android.view.View view) {
                this.f51064a = textView;
                this.f51065b = view;
            }
        }

        public a(android.content.Context context, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list) {
            this.f51062b = context;
            this.f51063c = list;
        }

        public final void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list) {
            this.f51063c = list;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list = this.f51063c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public final java.lang.Object getItem(int i17) {
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list = this.f51063c;
            if (list == null) {
                return null;
            }
            return list.get(i17);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i17) {
            return i17;
        }

        @Override // android.widget.Adapter
        public final android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
            android.view.View view2;
            android.widget.TextView textView;
            android.view.View view3;
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list = this.f51063c;
            if (list == null || list.size() == 0) {
                return null;
            }
            if (view != null) {
                com.tencent.mapsdk.internal.qs.a.C0039a c0039a = (com.tencent.mapsdk.internal.qs.a.C0039a) view.getTag();
                textView = c0039a.f51064a;
                view2 = c0039a.f51065b;
                view3 = view;
            } else {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f51062b);
                view2 = new android.view.View(this.f51062b);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) (com.tencent.mapsdk.internal.qs.this.f51056j * 26.5d), (int) (com.tencent.mapsdk.internal.qs.this.f51056j * 26.5d));
                if (com.tencent.mapsdk.internal.qs.this.f51055i == null) {
                    com.tencent.mapsdk.internal.qs.this.f51055i = new com.tencent.mapsdk.internal.qp();
                    com.tencent.mapsdk.internal.qs.this.f51055i.setBounds(0, 0, layoutParams.width, layoutParams.height);
                }
                view2.setBackground(com.tencent.mapsdk.internal.qs.this.f51055i);
                layoutParams.gravity = 17;
                frameLayout.addView(view2, layoutParams);
                textView = new android.widget.TextView(this.f51062b);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine();
                textView.setGravity(17);
                textView.setTextSize(2, com.tencent.mapsdk.internal.qs.f51035o);
                int i18 = (int) (com.tencent.mapsdk.internal.qs.this.f51056j * 10.0d);
                textView.setPadding(0, i18, 0, i18);
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, (int) (com.tencent.mapsdk.internal.qs.this.f51056j * 37.5f));
                layoutParams2.gravity = 17;
                frameLayout.addView(textView, layoutParams2);
                frameLayout.setTag(new com.tencent.mapsdk.internal.qs.a.C0039a(textView, view2));
                view3 = frameLayout;
            }
            textView.setText(this.f51063c.get(i17).getName());
            if (i17 != com.tencent.mapsdk.internal.qs.this.C) {
                textView.setTextColor(com.tencent.mapsdk.internal.qs.this.H ? com.tencent.mapsdk.internal.qs.f51045z : com.tencent.mapsdk.internal.qs.f51043x);
                view2.setVisibility(4);
            } else {
                boolean unused = com.tencent.mapsdk.internal.qs.this.H;
                textView.setTextColor(-1);
                view2.setVisibility(0);
            }
            return view3;
        }
    }

    public qs(com.tencent.mapsdk.internal.bd bdVar) {
        this.f51048b = false;
        this.f51051e = (com.tencent.mapsdk.internal.tr) bdVar.d();
        this.H = bdVar.o();
        this.B = bdVar.getContext().getApplicationContext();
        this.f51048b = true;
    }

    private boolean j() {
        return this.f51048b;
    }

    private void k() {
        boolean o17 = this.f51051e.f52273as.o();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "updateIndoorStyle isDark: cur[" + o17 + "]|old[" + this.H + "]");
        if (o17 != this.H) {
            this.f51047a.setDarkStyle(o17);
            this.I.setDarkStyle(o17);
            this.f51046J.setDarkStyle(o17);
            this.A.notifyDataSetChanged();
            this.H = o17;
        }
    }

    private void l() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.E;
        if (indoorBuilding == null) {
            return;
        }
        int activeLevelIndex = indoorBuilding.getActiveLevelIndex();
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = this.E.getLevels();
        if (levels == null || activeLevelIndex >= levels.size() || activeLevelIndex == -1 || levels.get(activeLevelIndex) == null) {
            return;
        }
        java.lang.String str = this.F;
        if (str != null && this.f51049c && str.equals(this.E.getBuidlingId())) {
            this.f51054h.setItemChecked(activeLevelIndex, true);
            this.f51049c = false;
        } else {
            this.f51054h.setSelectionFromTop(activeLevelIndex, ((int) ((this.f51056j * f51038r) + 0.5d)) * 2);
        }
        this.C = activeLevelIndex;
        this.F = this.E.getBuidlingId();
    }

    private void m() {
        com.tencent.mapsdk.internal.qt qtVar = this.f51054h;
        if (qtVar != null) {
            qtVar.getLayoutParams().width = a(this.A);
            this.f51054h.requestLayout();
        }
    }

    private void n() {
        android.view.ViewGroup ac6 = this.f51051e.ac();
        if (ac6 == null || this.f51047a == null) {
            return;
        }
        int i17 = (this.f51052f * 2) + ((int) (this.f51056j * 16.700000762939453d));
        if (com.tencent.mapsdk.internal.tf.f51581c.equals("wechat") && ac6.getMeasuredHeight() > this.f51053g) {
            int measuredHeight = ac6.getMeasuredHeight() - this.f51053g;
            int i18 = this.f51052f;
            i17 = ((int) (this.f51056j * 16.700000762939453d)) + i18 + (measuredHeight - i18);
        }
        if (this.D >= 4.0f) {
            this.f51057v = (int) (this.f51056j * 148.5d);
            if (ac6.getMeasuredHeight() > this.f51057v + i17) {
                this.G = false;
                return;
            }
            this.f51057v = (int) (this.f51056j * 111.5d);
            if (ac6.getMeasuredHeight() > i17 + this.f51057v) {
                this.G = false;
                return;
            }
        } else {
            this.f51057v = (int) (((r2 * f51038r) + 0.5d) * this.f51056j);
            if (ac6.getMeasuredHeight() > i17 + this.f51057v) {
                this.G = false;
                return;
            }
        }
        this.G = true;
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void c() {
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i17, long j17) {
        M m17 = this.f51051e.e_;
        if (m17 == 0) {
            return;
        }
        com.tencent.mapsdk.internal.qs.a.C0039a c0039a = this.K;
        if (c0039a != null) {
            c0039a.f51064a.setTextColor(-16777216);
            this.K.f51065b.setVisibility(4);
        }
        com.tencent.mapsdk.internal.qs.a.C0039a c0039a2 = (com.tencent.mapsdk.internal.qs.a.C0039a) view.getTag();
        c0039a2.f51064a.setTextColor(-1);
        c0039a2.f51065b.setVisibility(0);
        this.K = c0039a2;
        this.C = i17;
        this.f51049c = true;
        m17.setIndoorFloor(i17);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.qq qqVar = this.f51047a;
        if (qqVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.qo qoVar = (com.tencent.mapsdk.internal.qo) qqVar.findViewWithTag(f51031k);
        com.tencent.mapsdk.internal.qo qoVar2 = (com.tencent.mapsdk.internal.qo) this.f51047a.findViewWithTag(f51032l);
        if (qoVar == null || qoVar2 == null) {
            return;
        }
        if (i18 == i19) {
            qoVar.setActivate(false);
        } else {
            if (i17 == 0) {
                qoVar.setActivate(false);
            } else {
                qoVar.setActivate(true);
            }
            if (i17 + i18 < i19) {
                qoVar2.setActivate(true);
                return;
            }
        }
        qoVar2.setActivate(false);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
    }

    private void b(android.content.Context context) {
        this.f51047a = new com.tencent.mapsdk.internal.qq(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = (int) (this.f51056j * f51041u);
        layoutParams.bottomMargin = this.f51052f;
        this.f51047a.setDarkStyle(this.H);
        this.f51047a.setLayoutParams(layoutParams);
        this.f51047a.setWillNotDraw(false);
        this.f51047a.setOrientation(1);
        this.f51047a.setGravity(1);
        this.f51047a.setVisibility(8);
    }

    public final void e() {
        if (this.f51047a == null) {
            this.A = new com.tencent.mapsdk.internal.qs.a(this.B, new java.util.ArrayList());
            a(this.B);
            this.f51052f = (int) (this.f51056j * f51040t);
            a(this.B, this.A);
            com.tencent.mapsdk.internal.tr trVar = this.f51051e;
            if (trVar != null) {
                this.f51050d = trVar.f52199n;
            }
        }
    }

    public final void f() {
        n();
        com.tencent.mapsdk.internal.qq qqVar = this.f51047a;
        if (qqVar == null || this.f51054h == null) {
            return;
        }
        if (this.f51048b && !this.G && this.D > 0) {
            qqVar.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qs.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.tencent.mapsdk.internal.qs.this.f51047a == null || com.tencent.mapsdk.internal.qs.this.f51054h == null) {
                        return;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = com.tencent.mapsdk.internal.qs.this.f51054h.getLayoutParams();
                    if (layoutParams.height != com.tencent.mapsdk.internal.qs.this.f51057v) {
                        layoutParams.height = com.tencent.mapsdk.internal.qs.this.f51057v;
                        com.tencent.mapsdk.internal.qs.this.f51054h.setLayoutParams(layoutParams);
                    }
                    if (com.tencent.mapsdk.internal.qs.this.f51047a.getVisibility() != 0) {
                        com.tencent.mapsdk.internal.qs.this.f51047a.setVisibility(0);
                    }
                }
            });
        } else {
            qqVar.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qs.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.tencent.mapsdk.internal.qs.this.f51047a == null || com.tencent.mapsdk.internal.qs.this.f51047a.getVisibility() != 0) {
                        return;
                    }
                    com.tencent.mapsdk.internal.qs.this.f51047a.setVisibility(8);
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.qt.a
    public final void g() {
        m();
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.E;
        if (indoorBuilding != null) {
            int activeLevelIndex = indoorBuilding.getActiveLevelIndex();
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = this.E.getLevels();
            if (levels == null || activeLevelIndex >= levels.size() || activeLevelIndex == -1 || levels.get(activeLevelIndex) == null) {
                return;
            }
            java.lang.String str = this.F;
            if (str != null && this.f51049c && str.equals(this.E.getBuidlingId())) {
                this.f51054h.setItemChecked(activeLevelIndex, true);
                this.f51049c = false;
            } else {
                this.f51054h.setSelectionFromTop(activeLevelIndex, ((int) ((this.f51056j * f51038r) + 0.5d)) * 2);
            }
            this.C = activeLevelIndex;
            this.F = this.E.getBuidlingId();
        }
    }

    private void c(android.content.Context context) {
        com.tencent.mapsdk.internal.qo qoVar = new com.tencent.mapsdk.internal.qo(context);
        this.I = qoVar;
        qoVar.setDarkStyle(this.H);
        this.I.setTag(f51031k);
        int i17 = (int) (this.f51056j * 5.900000095367432d);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, (int) (this.f51056j * 3.200000047683716d));
        layoutParams.setMargins(0, i17, 0, i17);
        this.I.setLayoutParams(layoutParams);
        this.f51047a.addView(this.I);
    }

    private void d(android.content.Context context) {
        com.tencent.mapsdk.internal.qo qoVar = new com.tencent.mapsdk.internal.qo(context);
        this.f51046J = qoVar;
        qoVar.setDarkStyle(this.H);
        this.f51046J.setTag(f51032l);
        this.f51046J.setRotation(180.0f);
        int i17 = (int) (this.f51056j * 5.900000095367432d);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, (int) (this.f51056j * 3.200000047683716d));
        layoutParams.setMargins(0, i17, 0, i17);
        this.f51046J.setLayoutParams(layoutParams);
        this.f51047a.addView(this.f51046J);
    }

    private void a(android.content.Context context) {
        this.f51056j = context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    private void a(boolean z17) {
        com.tencent.mapsdk.internal.ac acVar;
        com.tencent.mapsdk.internal.tr trVar = this.f51051e;
        if (trVar == null) {
            return;
        }
        if (z17) {
            this.f51048b = true;
        } else {
            this.f51048b = false;
        }
        boolean z18 = this.f51048b;
        if (trVar != null) {
            if (this.f51047a == null) {
                if (!z18) {
                    return;
                } else {
                    e();
                }
            }
            com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f51051e.e_;
            if (this.f51048b && z18 && (acVar = this.f51050d) != null && acVar.f48778f) {
                a(vectorMap.f52514q.u());
                return;
            }
            a((com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) null);
            if (this.f51047a.getVisibility() != 8) {
                this.f51047a.setVisibility(8);
            }
        }
    }

    private void b(android.content.Context context, com.tencent.mapsdk.internal.qs.a aVar) {
        this.f51054h = new com.tencent.mapsdk.internal.qt(context);
        this.f51054h.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f51054h.setChoiceMode(1);
        this.f51054h.setAdapter((android.widget.ListAdapter) aVar);
        this.f51054h.setOnItemClickListener(this);
        this.f51054h.setVerticalScrollBarEnabled(false);
        this.f51054h.setHorizontalScrollBarEnabled(false);
        this.f51054h.setOverScrollMode(2);
        this.f51054h.setDivider(null);
        this.f51054h.setDividerHeight(0);
        this.f51054h.setOnDataChangedListener(this);
        this.f51047a.addView(this.f51054h);
        this.f51054h.setOnScrollListener(this);
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        if (indoorBuilding == null) {
            this.E = indoorBuilding;
            this.D = 0;
            f();
            return;
        }
        if (this.f51047a == null) {
            e();
        }
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding2 = this.E;
        if (indoorBuilding2 != null && indoorBuilding2.getBuidlingId().equals(indoorBuilding.getBuidlingId()) && this.E.getActiveLevelIndex() == indoorBuilding.getActiveLevelIndex()) {
            return;
        }
        this.E = indoorBuilding;
        this.D = indoorBuilding.getLevels().size();
        a(indoorBuilding.getLevels());
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
        if (this.f51047a == null || this.f51054h == null) {
            return;
        }
        f();
    }

    @Override // com.tencent.mapsdk.internal.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f51047a};
    }

    private void b(boolean z17) {
        com.tencent.mapsdk.internal.ac acVar;
        if (this.f51051e == null) {
            return;
        }
        if (this.f51047a == null) {
            if (!z17) {
                return;
            } else {
                e();
            }
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f51051e.e_;
        if (this.f51048b && z17 && (acVar = this.f51050d) != null && acVar.f48778f) {
            a(vectorMap.f52514q.u());
            return;
        }
        a((com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) null);
        if (this.f51047a.getVisibility() != 8) {
            this.f51047a.setVisibility(8);
        }
    }

    private void a(android.content.Context context, com.tencent.mapsdk.internal.qs.a aVar) {
        b(context);
        c(context);
        b(context, aVar);
        d(context);
        a(this.f51051e.ac(), (android.os.Bundle) null);
        this.f51047a.setVisibility(8);
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mapsdk.internal.qq qqVar = this.f51047a;
        if (qqVar == null || viewGroup == null) {
            return false;
        }
        if (viewGroup.indexOfChild(qqVar) < 0) {
            viewGroup.addView(this.f51047a);
        }
        k();
        m();
        return true;
    }

    private void a(int i17) {
        this.f51052f = i17;
        com.tencent.mapsdk.internal.qq qqVar = this.f51047a;
        if (qqVar != null) {
            qqVar.post(new com.tencent.mapsdk.internal.qs.AnonymousClass1());
        }
        android.view.ViewGroup ac6 = this.f51051e.ac();
        if (ac6 != null) {
            this.f51053g = ac6.getMeasuredHeight();
        }
        M m17 = this.f51051e.e_;
        if (m17 == 0 || ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t == null || ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q == null) {
            return;
        }
        this.f51053g = (((int) ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q.f49468b) - i17) * 2;
        f();
    }

    private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> list) {
        if (this.f51051e.ac() == null) {
            return;
        }
        f();
        com.tencent.mapsdk.internal.qs.a aVar = this.A;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    private int a(android.widget.Adapter adapter) {
        int i17 = (int) (this.f51056j * 44.5d);
        int count = adapter.getCount();
        android.view.View view = null;
        for (int i18 = 0; i18 < count; i18++) {
            view = adapter.getView(i18, view, this.f51054h);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i17) {
                i17 = measuredWidth;
            }
        }
        return i17;
    }
}
