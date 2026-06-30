package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qs extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, com.tencent.mapsdk.internal.qt.a {

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f132564k = "VIEW_TAG_HEADER";

    /* renamed from: l, reason: collision with root package name */
    private static final java.lang.String f132565l = "VIEW_TAG_FOOTER";

    /* renamed from: m, reason: collision with root package name */
    private static final float f132566m = 2.7f;

    /* renamed from: n, reason: collision with root package name */
    private static final float f132567n = 44.0f;

    /* renamed from: o, reason: collision with root package name */
    private static final float f132568o = 13.0f;

    /* renamed from: p, reason: collision with root package name */
    private static final float f132569p = 26.0f;

    /* renamed from: q, reason: collision with root package name */
    private static final float f132570q = 9.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f132571r = 37.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f132572s = 4.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f132573t = 45.0f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f132574u = 15.0f;

    /* renamed from: w, reason: collision with root package name */
    private static final int f132575w = -1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f132577y = -1;
    private com.tencent.mapsdk.internal.qs.a A;
    private final android.content.Context B;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 E;
    private java.lang.String F;
    private boolean H;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo I;

    /* renamed from: J, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo f132579J;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq f132580a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f132581b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac f132583d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132584e;

    /* renamed from: f, reason: collision with root package name */
    public int f132585f;

    /* renamed from: g, reason: collision with root package name */
    public int f132586g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qt f132587h;

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qp f132588i;

    /* renamed from: x, reason: collision with root package name */
    private static final int f132576x = android.graphics.Color.parseColor("#333333");

    /* renamed from: z, reason: collision with root package name */
    private static final int f132578z = android.graphics.Color.parseColor("#979797");

    /* renamed from: j, reason: collision with root package name */
    private float f132589j = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    private int f132590v = 0;
    private int C = -1;
    private int D = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f132582c = false;
    private boolean G = false;
    private com.tencent.mapsdk.internal.qs.a.C30909a K = null;

    /* renamed from: com.tencent.mapsdk.internal.qs$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.getLayoutParams();
            marginLayoutParams.bottomMargin = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132585f;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.setLayoutParams(marginLayoutParams);
        }
    }

    /* loaded from: classes13.dex */
    public class a extends android.widget.BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f132595b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> f132596c;

        /* renamed from: com.tencent.mapsdk.internal.qs$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public class C30909a {

            /* renamed from: a, reason: collision with root package name */
            public android.widget.TextView f132597a;

            /* renamed from: b, reason: collision with root package name */
            public android.view.View f132598b;

            public C30909a(android.widget.TextView textView, android.view.View view) {
                this.f132597a = textView;
                this.f132598b = view;
            }
        }

        public a(android.content.Context context, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list) {
            this.f132595b = context;
            this.f132596c = list;
        }

        public final void a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list) {
            this.f132596c = list;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list = this.f132596c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public final java.lang.Object getItem(int i17) {
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list = this.f132596c;
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
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list = this.f132596c;
            if (list == null || list.size() == 0) {
                return null;
            }
            if (view != null) {
                com.tencent.mapsdk.internal.qs.a.C30909a c30909a = (com.tencent.mapsdk.internal.qs.a.C30909a) view.getTag();
                textView = c30909a.f132597a;
                view2 = c30909a.f132598b;
                view3 = view;
            } else {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f132595b);
                view2 = new android.view.View(this.f132595b);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132589j * 26.5d), (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132589j * 26.5d));
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132588i == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132588i = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qp();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132588i.setBounds(0, 0, layoutParams.width, layoutParams.height);
                }
                view2.setBackground(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132588i);
                layoutParams.gravity = 17;
                frameLayout.addView(view2, layoutParams);
                textView = new android.widget.TextView(this.f132595b);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine();
                textView.setGravity(17);
                textView.setTextSize(2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.f132568o);
                int i18 = (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132589j * 10.0d);
                textView.setPadding(0, i18, 0, i18);
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132589j * 37.5f));
                layoutParams2.gravity = 17;
                frameLayout.addView(textView, layoutParams2);
                frameLayout.setTag(new com.tencent.mapsdk.internal.qs.a.C30909a(textView, view2));
                view3 = frameLayout;
            }
            textView.setText(this.f132596c.get(i17).m99474xfb82e301());
            if (i17 != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.C) {
                textView.setTextColor(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.H ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.f132578z : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.f132576x);
                view2.setVisibility(4);
            } else {
                boolean unused = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.H;
                textView.setTextColor(-1);
                view2.setVisibility(0);
            }
            return view3;
        }
    }

    public qs(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        this.f132581b = false;
        this.f132584e = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        this.H = bdVar.o();
        this.B = bdVar.mo36630x76847179().getApplicationContext();
        this.f132581b = true;
    }

    private boolean j() {
        return this.f132581b;
    }

    private void k() {
        boolean o17 = this.f132584e.f133806as.o();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "updateIndoorStyle isDark: cur[" + o17 + "]|old[" + this.H + "]");
        if (o17 != this.H) {
            this.f132580a.m36939xecb3a999(o17);
            this.I.m36938xecb3a999(o17);
            this.f132579J.m36938xecb3a999(o17);
            this.A.notifyDataSetChanged();
            this.H = o17;
        }
    }

    private void l() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.E;
        if (c26034x15ff5647 == null) {
            return;
        }
        int m99465xd84262ca = c26034x15ff5647.m99465xd84262ca();
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865 = this.E.m99469x2328f865();
        if (m99469x2328f865 == null || m99465xd84262ca >= m99469x2328f865.size() || m99465xd84262ca == -1 || m99469x2328f865.get(m99465xd84262ca) == null) {
            return;
        }
        java.lang.String str = this.F;
        if (str != null && this.f132582c && str.equals(this.E.m99466x3935e1d5())) {
            this.f132587h.setItemChecked(m99465xd84262ca, true);
            this.f132582c = false;
        } else {
            this.f132587h.setSelectionFromTop(m99465xd84262ca, ((int) ((this.f132589j * f132571r) + 0.5d)) * 2);
        }
        this.C = m99465xd84262ca;
        this.F = this.E.m99466x3935e1d5();
    }

    private void m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qt qtVar = this.f132587h;
        if (qtVar != null) {
            qtVar.getLayoutParams().width = a(this.A);
            this.f132587h.requestLayout();
        }
    }

    private void n() {
        android.view.ViewGroup ac6 = this.f132584e.ac();
        if (ac6 == null || this.f132580a == null) {
            return;
        }
        int i17 = (this.f132585f * 2) + ((int) (this.f132589j * 16.700000762939453d));
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c.equals("wechat") && ac6.getMeasuredHeight() > this.f132586g) {
            int measuredHeight = ac6.getMeasuredHeight() - this.f132586g;
            int i18 = this.f132585f;
            i17 = ((int) (this.f132589j * 16.700000762939453d)) + i18 + (measuredHeight - i18);
        }
        if (this.D >= 4.0f) {
            this.f132590v = (int) (this.f132589j * 148.5d);
            if (ac6.getMeasuredHeight() > this.f132590v + i17) {
                this.G = false;
                return;
            }
            this.f132590v = (int) (this.f132589j * 111.5d);
            if (ac6.getMeasuredHeight() > i17 + this.f132590v) {
                this.G = false;
                return;
            }
        } else {
            this.f132590v = (int) (((r2 * f132571r) + 0.5d) * this.f132589j);
            if (ac6.getMeasuredHeight() > i17 + this.f132590v) {
                this.G = false;
                return;
            }
        }
        this.G = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void c() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i17, long j17) {
        M m17 = this.f132584e.e_;
        if (m17 == 0) {
            return;
        }
        com.tencent.mapsdk.internal.qs.a.C30909a c30909a = this.K;
        if (c30909a != null) {
            c30909a.f132597a.setTextColor(-16777216);
            this.K.f132598b.setVisibility(4);
        }
        com.tencent.mapsdk.internal.qs.a.C30909a c30909a2 = (com.tencent.mapsdk.internal.qs.a.C30909a) view.getTag();
        c30909a2.f132597a.setTextColor(-1);
        c30909a2.f132598b.setVisibility(0);
        this.K = c30909a2;
        this.C = i17;
        this.f132582c = true;
        m17.mo35483x255ed3b7(i17);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = this.f132580a;
        if (qqVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo qoVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo) qqVar.findViewWithTag(f132564k);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo qoVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo) this.f132580a.findViewWithTag(f132565l);
        if (qoVar == null || qoVar2 == null) {
            return;
        }
        if (i18 == i19) {
            qoVar.m36936x13de7375(false);
        } else {
            if (i17 == 0) {
                qoVar.m36936x13de7375(false);
            } else {
                qoVar.m36936x13de7375(true);
            }
            if (i17 + i18 < i19) {
                qoVar2.m36936x13de7375(true);
                return;
            }
        }
        qoVar2.m36936x13de7375(false);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
    }

    private void b(android.content.Context context) {
        this.f132580a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = (int) (this.f132589j * f132574u);
        layoutParams.bottomMargin = this.f132585f;
        this.f132580a.m36939xecb3a999(this.H);
        this.f132580a.setLayoutParams(layoutParams);
        this.f132580a.setWillNotDraw(false);
        this.f132580a.setOrientation(1);
        this.f132580a.setGravity(1);
        this.f132580a.setVisibility(8);
    }

    public final void e() {
        if (this.f132580a == null) {
            this.A = new com.tencent.mapsdk.internal.qs.a(this.B, new java.util.ArrayList());
            a(this.B);
            this.f132585f = (int) (this.f132589j * f132573t);
            a(this.B, this.A);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132584e;
            if (trVar != null) {
                this.f132583d = trVar.f133732n;
            }
        }
    }

    public final void f() {
        n();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = this.f132580a;
        if (qqVar == null || this.f132587h == null) {
            return;
        }
        if (this.f132581b && !this.G && this.D > 0) {
            qqVar.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qs.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132587h == null) {
                        return;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132587h.getLayoutParams();
                    if (layoutParams.height != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132590v) {
                        layoutParams.height = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132590v;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132587h.setLayoutParams(layoutParams);
                    }
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.getVisibility() != 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.setVisibility(0);
                    }
                }
            });
        } else {
            qqVar.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.qs.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.getVisibility() != 0) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.this.f132580a.setVisibility(8);
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.qt.a
    public final void g() {
        m();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.E;
        if (c26034x15ff5647 != null) {
            int m99465xd84262ca = c26034x15ff5647.m99465xd84262ca();
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865 = this.E.m99469x2328f865();
            if (m99469x2328f865 == null || m99465xd84262ca >= m99469x2328f865.size() || m99465xd84262ca == -1 || m99469x2328f865.get(m99465xd84262ca) == null) {
                return;
            }
            java.lang.String str = this.F;
            if (str != null && this.f132582c && str.equals(this.E.m99466x3935e1d5())) {
                this.f132587h.setItemChecked(m99465xd84262ca, true);
                this.f132582c = false;
            } else {
                this.f132587h.setSelectionFromTop(m99465xd84262ca, ((int) ((this.f132589j * f132571r) + 0.5d)) * 2);
            }
            this.C = m99465xd84262ca;
            this.F = this.E.m99466x3935e1d5();
        }
    }

    private void c(android.content.Context context) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo qoVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo(context);
        this.I = qoVar;
        qoVar.m36938xecb3a999(this.H);
        this.I.setTag(f132564k);
        int i17 = (int) (this.f132589j * 5.900000095367432d);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, (int) (this.f132589j * 3.200000047683716d));
        layoutParams.setMargins(0, i17, 0, i17);
        this.I.setLayoutParams(layoutParams);
        this.f132580a.addView(this.I);
    }

    private void d(android.content.Context context) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo qoVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qo(context);
        this.f132579J = qoVar;
        qoVar.m36938xecb3a999(this.H);
        this.f132579J.setTag(f132565l);
        this.f132579J.setRotation(180.0f);
        int i17 = (int) (this.f132589j * 5.900000095367432d);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, (int) (this.f132589j * 3.200000047683716d));
        layoutParams.setMargins(0, i17, 0, i17);
        this.f132579J.setLayoutParams(layoutParams);
        this.f132580a.addView(this.f132579J);
    }

    private void a(android.content.Context context) {
        this.f132589j = context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    private void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132584e;
        if (trVar == null) {
            return;
        }
        if (z17) {
            this.f132581b = true;
        } else {
            this.f132581b = false;
        }
        boolean z18 = this.f132581b;
        if (trVar != null) {
            if (this.f132580a == null) {
                if (!z18) {
                    return;
                } else {
                    e();
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132584e.e_;
            if (this.f132581b && z18 && (acVar = this.f132583d) != null && acVar.f130311f) {
                a(c4430xc2040f9.f134047q.u());
                return;
            }
            a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647) null);
            if (this.f132580a.getVisibility() != 8) {
                this.f132580a.setVisibility(8);
            }
        }
    }

    private void b(android.content.Context context, com.tencent.mapsdk.internal.qs.a aVar) {
        this.f132587h = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qt(context);
        this.f132587h.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f132587h.setChoiceMode(1);
        this.f132587h.setAdapter((android.widget.ListAdapter) aVar);
        this.f132587h.setOnItemClickListener(this);
        this.f132587h.setVerticalScrollBarEnabled(false);
        this.f132587h.setHorizontalScrollBarEnabled(false);
        this.f132587h.setOverScrollMode(2);
        this.f132587h.setDivider(null);
        this.f132587h.setDividerHeight(0);
        this.f132587h.m36941x77b2b2dd(this);
        this.f132580a.addView(this.f132587h);
        this.f132587h.setOnScrollListener(this);
    }

    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647) {
        if (c26034x15ff5647 == null) {
            this.E = c26034x15ff5647;
            this.D = 0;
            f();
            return;
        }
        if (this.f132580a == null) {
            e();
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff56472 = this.E;
        if (c26034x15ff56472 != null && c26034x15ff56472.m99466x3935e1d5().equals(c26034x15ff5647.m99466x3935e1d5()) && this.E.m99465xd84262ca() == c26034x15ff5647.m99465xd84262ca()) {
            return;
        }
        this.E = c26034x15ff5647;
        this.D = c26034x15ff5647.m99469x2328f865().size();
        a(c26034x15ff5647.m99469x2328f865());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
        if (this.f132580a == null || this.f132587h == null) {
            return;
        }
        f();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f132580a};
    }

    private void b(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar;
        if (this.f132584e == null) {
            return;
        }
        if (this.f132580a == null) {
            if (!z17) {
                return;
            } else {
                e();
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132584e.e_;
        if (this.f132581b && z17 && (acVar = this.f132583d) != null && acVar.f130311f) {
            a(c4430xc2040f9.f134047q.u());
            return;
        }
        a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647) null);
        if (this.f132580a.getVisibility() != 8) {
            this.f132580a.setVisibility(8);
        }
    }

    private void a(android.content.Context context, com.tencent.mapsdk.internal.qs.a aVar) {
        b(context);
        c(context);
        b(context, aVar);
        d(context);
        a(this.f132584e.ac(), (android.os.Bundle) null);
        this.f132580a.setVisibility(8);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = this.f132580a;
        if (qqVar == null || viewGroup == null) {
            return false;
        }
        if (viewGroup.indexOfChild(qqVar) < 0) {
            viewGroup.addView(this.f132580a);
        }
        k();
        m();
        return true;
    }

    private void a(int i17) {
        this.f132585f = i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = this.f132580a;
        if (qqVar != null) {
            qqVar.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.AnonymousClass1());
        }
        android.view.ViewGroup ac6 = this.f132584e.ac();
        if (ac6 != null) {
            this.f132586g = ac6.getMeasuredHeight();
        }
        M m17 = this.f132584e.e_;
        if (m17 == 0 || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t == null || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q == null) {
            return;
        }
        this.f132586g = (((int) ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q.f131001b) - i17) * 2;
        f();
    }

    private void a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list) {
        if (this.f132584e.ac() == null) {
            return;
        }
        f();
        com.tencent.mapsdk.internal.qs.a aVar = this.A;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    private int a(android.widget.Adapter adapter) {
        int i17 = (int) (this.f132589j * 44.5d);
        int count = adapter.getCount();
        android.view.View view = null;
        for (int i18 = 0; i18 < count; i18++) {
            view = adapter.getView(i18, view, this.f132587h);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i17) {
                i17 = measuredWidth;
            }
        }
        return i17;
    }
}
