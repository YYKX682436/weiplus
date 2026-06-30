package ym5;

/* loaded from: classes15.dex */
public final class f0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir.h f544808a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f544809b;

    /* renamed from: c, reason: collision with root package name */
    public float f544810c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 f544811d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.VelocityTracker f544812e;

    /* renamed from: f, reason: collision with root package name */
    public final int f544813f;

    /* renamed from: g, reason: collision with root package name */
    public int f544814g;

    /* renamed from: h, reason: collision with root package name */
    public final int f544815h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.OverScroller f544816i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f544817j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f544818k;

    /* renamed from: l, reason: collision with root package name */
    public final int f544819l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f544820m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f544821n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f544822o;

    /* renamed from: p, reason: collision with root package name */
    public int f544823p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f544824q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f544825r;

    /* renamed from: s, reason: collision with root package name */
    public int f544826s;

    /* renamed from: t, reason: collision with root package name */
    public nr.e f544827t;

    public f0(android.content.Context context, ir.h config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f544808a = config;
        this.f544814g = -1;
        this.f544817j = true;
        this.f544819l = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        this.f544824q = new java.util.LinkedHashSet();
        this.f544825r = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f544813f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f544815h = viewConfiguration.getScaledTouchSlop();
        this.f544816i = new android.widget.OverScroller(context, ym5.z.f545117a);
    }

    public final void a() {
        android.widget.OverScroller overScroller = this.f544816i;
        if (overScroller.computeScrollOffset()) {
            e(overScroller.getCurrY());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var = this.f544811d;
            if (g1Var != null) {
                g1Var.a(this.f544826s);
            }
            if (!overScroller.isFinished()) {
                android.view.View view = this.f544809b;
                if (view != null) {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ym5.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ym5.f0.this.a();
                        }
                    };
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.m(view, runnable);
                    return;
                }
                return;
            }
            int i17 = this.f544826s;
            int i18 = this.f544823p;
            this.f544808a.f375388n = i17 == i18;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var2 = this.f544811d;
            if (g1Var2 != null) {
                g1Var2.b(i17 == i18);
            }
            yz5.a aVar = this.f544820m;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    public void b(int i17, int i18, int i19) {
        int i27 = this.f544819l;
        this.f544823p = (i17 - i27) + i19 > i18 ? ((i17 - i18) - i27) - i19 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelDragIndicator", "determineExtent: parentHeight=" + i17 + ", collapsedHeight=" + i18 + ", inputHeight=" + i19 + ", maxExtendedHeight=" + this.f544823p);
    }

    public boolean c() {
        return this.f544822o || !this.f544816i.isFinished() || this.f544826s > 0;
    }

    public void d() {
        this.f544818k = true;
        android.widget.OverScroller overScroller = this.f544816i;
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        if (this.f544826s != 0) {
            e(0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var = this.f544811d;
            if (g1Var != null) {
                g1Var.b(false);
            }
        }
    }

    public void e(int i17) {
        this.f544826s = i17;
        boolean z17 = i17 == 0;
        if (this.f544825r != z17) {
            java.util.Set set = this.f544824q;
            if (z17) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 c22783x88759141 = (com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141) ((ym5.a0) it.next());
                    c22783x88759141.f294834e = false;
                    c22783x88759141.setContentDescription(c22783x88759141.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.by8));
                    c22783x88759141.notifySubtreeAccessibilityStateChanged(c22783x88759141, c22783x88759141, 4);
                }
            } else {
                java.util.Iterator it6 = set.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 c22783x887591412 = (com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141) ((ym5.a0) it6.next());
                    c22783x887591412.f294834e = true;
                    c22783x887591412.setContentDescription(c22783x887591412.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.by7));
                    c22783x887591412.notifySubtreeAccessibilityStateChanged(c22783x887591412, c22783x887591412, 4);
                }
            }
        }
        this.f544825r = z17;
    }

    public final void f(int i17, int i18) {
        int i19 = i17 - this.f544826s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelDragIndicator", "settle, target: " + i17 + ", duration: " + i18 + ", dy: " + i19);
        android.widget.OverScroller overScroller = this.f544816i;
        overScroller.forceFinished(true);
        overScroller.startScroll(0, this.f544826s, 0, i19, i18);
        android.view.View view = this.f544809b;
        if (view != null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ym5.e0
                @Override // java.lang.Runnable
                public final void run() {
                    ym5.f0.this.a();
                }
            };
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(view, runnable);
        }
    }
}
