package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderGridGalleryView;", "Landroid/widget/LinearLayout;", "Lt23/m1;", "Le33/i2;", "", "columnNum", "Ljz5/f0;", "setColumnNum", "selectLimit", "setMaxSelectLimit", "Lcom/tencent/mm/plugin/finder/view/na;", "onItemSelectedListener", "setOnItemSelectListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView */
/* loaded from: classes10.dex */
public final class C15291x1a6f20cb extends android.widget.LinearLayout implements t23.m1, e33.i2 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f212636t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f212637d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f212638e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f212639f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f212640g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f212641h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f212642i;

    /* renamed from: m, reason: collision with root package name */
    public e33.j2 f212643m;

    /* renamed from: n, reason: collision with root package name */
    public e60.f1 f212644n;

    /* renamed from: o, reason: collision with root package name */
    public rl5.r f212645o;

    /* renamed from: p, reason: collision with root package name */
    public int f212646p;

    /* renamed from: q, reason: collision with root package name */
    public int f212647q;

    /* renamed from: r, reason: collision with root package name */
    public long f212648r;

    /* renamed from: s, reason: collision with root package name */
    public int f212649s;

    public C15291x1a6f20cb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212637d = "Finder.FinderGridGalleryView";
        this.f212638e = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.cye, com.p314xaae8f345.mm.R.C30867xcad56011.cyg, com.p314xaae8f345.mm.R.C30867xcad56011.cyf};
        this.f212639f = new int[]{1, 2, 3};
        this.f212646p = 4;
        this.f212647q = 1;
        this.f212649s = 9;
        b();
    }

    @Override // e33.i2
    public void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f212637d, "selected  " + i17 + " items");
    }

    public final void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570358ak5, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.jeg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212640g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567546jv1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212642i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jds);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.GridView gridView = (android.widget.GridView) findViewById3;
        this.f212641h = gridView;
        gridView.setNumColumns(this.f212646p);
        android.widget.TextView textView = this.f212640g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaTypeTv");
            throw null;
        }
        textView.setText(this.f212638e[0]);
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.x1 x1Var = new t23.x1();
        this.f212644n = x1Var;
        x1Var.g(this.f212639f[0]);
        e60.f1 f1Var = this.f212644n;
        if (f1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        ((t23.x1) f1Var).b(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f212648r = currentTimeMillis;
        e60.f1 f1Var2 = this.f212644n;
        if (f1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        t23.x1 x1Var2 = (t23.x1) f1Var2;
        x1Var2.e("", x1Var2.f496831g, currentTimeMillis);
        e60.c1 c1Var = (e60.c1) i95.n0.c(e60.c1.class);
        android.content.Context context = getContext();
        ((d60.y) c1Var).getClass();
        e33.b0 b0Var = new e33.b0(false, context, this);
        this.f212643m = b0Var;
        e60.f1 f1Var3 = this.f212644n;
        if (f1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        b0Var.f328667m = ((t23.x1) f1Var3).f496831g;
        b0Var.f328661d = this.f212647q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f212642i;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiSelect");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oa(this));
        android.content.Context context2 = getContext();
        android.widget.TextView textView2 = this.f212640g;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaTypeTv");
            throw null;
        }
        rl5.r rVar = new rl5.r(context2, textView2);
        this.f212645o = rVar;
        rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pa(this);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qa(this);
        android.widget.TextView textView3 = this.f212640g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaTypeTv");
            throw null;
        }
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ra(this));
        android.widget.GridView gridView2 = this.f212641h;
        if (gridView2 != null) {
            gridView2.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sa(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gridView");
            throw null;
        }
    }

    /* renamed from: setColumnNum */
    public final void m62090xdbd5ca0e(int i17) {
        this.f212646p = i17;
        android.widget.GridView gridView = this.f212641h;
        if (gridView != null) {
            gridView.setNumColumns(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gridView");
            throw null;
        }
    }

    /* renamed from: setMaxSelectLimit */
    public final void m62091x4c18951d(int i17) {
        this.f212649s = i17;
    }

    /* renamed from: setOnItemSelectListener */
    public final void m62092x1f522784(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.na onItemSelectedListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemSelectedListener, "onItemSelectedListener");
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ticket ");
        sb6.append(j17);
        sb6.append(" query finished  ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(" medias");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f212637d, sb6.toString());
        if (this.f212648r != j17 || linkedList == null) {
            return;
        }
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ta(this, linkedList));
    }

    public C15291x1a6f20cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212637d = "Finder.FinderGridGalleryView";
        this.f212638e = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.cye, com.p314xaae8f345.mm.R.C30867xcad56011.cyg, com.p314xaae8f345.mm.R.C30867xcad56011.cyf};
        this.f212639f = new int[]{1, 2, 3};
        this.f212646p = 4;
        this.f212647q = 1;
        this.f212649s = 9;
        b();
    }
}
