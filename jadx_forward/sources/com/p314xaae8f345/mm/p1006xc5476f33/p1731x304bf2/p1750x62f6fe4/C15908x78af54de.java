package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

/* renamed from: com.tencent.mm.plugin.game.media.GameLocalGalleryView */
/* loaded from: classes8.dex */
public class C15908x78af54de extends android.widget.FrameLayout implements t23.m1 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f221577q = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f221578d;

    /* renamed from: e, reason: collision with root package name */
    public i53.i1 f221579e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f221580f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f221581g;

    /* renamed from: h, reason: collision with root package name */
    public int f221582h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f221583i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f221584m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f221585n;

    /* renamed from: o, reason: collision with root package name */
    public int f221586o;

    /* renamed from: p, reason: collision with root package name */
    public long f221587p;

    public C15908x78af54de(android.content.Context context) {
        super(context);
        this.f221584m = false;
        this.f221585n = false;
        this.f221586o = 0;
        this.f221587p = 0L;
        b();
    }

    public void a() {
        i53.i1 i1Var = this.f221579e;
        java.util.ArrayList arrayList = i1Var.f370128e;
        arrayList.clear();
        i53.b1 b1Var = i1Var.f370132i;
        if (b1Var != null) {
            ((i53.z0) b1Var).a(arrayList.size());
        }
        i1Var.f370134n.postDelayed(new i53.f1(i1Var), 500L);
    }

    public final void b() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhg, (android.view.ViewGroup) this, false);
        this.f221578d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.gn6);
        this.f221578d.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16035xb901b58b(getContext(), 4));
        this.f221578d.N(new i53.a1(this));
        i53.i1 i1Var = new i53.i1(this, getContext());
        this.f221579e = i1Var;
        this.f221578d.mo7960x6cab2c8d(i1Var);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gn_);
        this.f221580f = textView;
        textView.setOnClickListener(new i53.x0(this));
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gn8);
        this.f221581g = button;
        button.setOnClickListener(new i53.y0(this));
        this.f221579e.f370132i = new i53.z0(this);
        addView(inflate, -1, -1);
    }

    public final void c(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, i17, i18, this.f221586o, lj0.a.a(7, map));
    }

    /* renamed from: setQueryType */
    public void m64613xf00ea9e0(int i17) {
        this.f221579e.f370130g = i17;
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().g(i17);
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().f496830f = 15;
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().b(this);
        this.f221587p = java.lang.System.currentTimeMillis();
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.x1 k17 = t23.p0.k();
        k17.e("", k17.f496831g, this.f221587p);
    }

    /* renamed from: setSelectLimitCount */
    public void m64614xf58734b2(int i17) {
        this.f221579e.f370131h = i17;
        this.f221582h = i17;
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (this.f221587p == j17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (linkedList != null) {
                arrayList.addAll(linkedList);
            }
            i53.i1 i1Var = this.f221579e;
            if (i1Var != null) {
                i1Var.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i53.e1(i1Var, arrayList));
            }
        }
    }

    public C15908x78af54de(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f221584m = false;
        this.f221585n = false;
        this.f221586o = 0;
        this.f221587p = 0L;
        b();
    }

    public C15908x78af54de(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f221584m = false;
        this.f221585n = false;
        this.f221586o = 0;
        this.f221587p = 0L;
        b();
    }
}
