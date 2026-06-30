package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameWelfareTaskProgressView;", "Landroid/widget/RelativeLayout;", "Lr45/s73;", "getShowingTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView */
/* loaded from: classes10.dex */
public final class C14319xdc54373f extends android.widget.RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f197454r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f197455d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f197456e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f197457f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f197458g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f197459h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f197460i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f197461m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f197462n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f197463o;

    /* renamed from: p, reason: collision with root package name */
    public r45.s73 f197464p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 f197465q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14319xdc54373f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197455d = p3325xe03a0797.p3326xc267989b.z0.b();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ard, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f197459h = viewGroup;
        addView(viewGroup);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nyt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197458g = (android.widget.RelativeLayout) findViewById;
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.arb, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate2;
        this.f197460i = viewGroup2;
        viewGroup2.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.S1));
        c22789xd23e9a9b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        c22789xd23e9a9b.m82584xebcf33cb(1);
        android.content.res.AssetManager assets = context.getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        c22789xd23e9a9b.k(assets, "small_lottery_amin.pag");
        c22789xd23e9a9b.m82583xcde73672(1);
        this.f197461m = c22789xd23e9a9b;
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.ezg);
        this.f197462n = textView;
        if (textView != null) {
            textView.setTextSize(10.0f);
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.gpp);
        viewGroup3.setVisibility(0);
        viewGroup3.addView(c22789xd23e9a9b);
        viewGroup2.setTranslationY(-i65.a.b(context, 16));
        addView(viewGroup2);
        this.f197463o = new java.util.ArrayList();
    }

    public final void a() {
        android.view.ViewGroup viewGroup = this.f197460i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubbleRoot");
            throw null;
        }
        viewGroup.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f197461m;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        android.view.ViewGroup viewGroup2 = this.f197459h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentRoot");
            throw null;
        }
    }

    /* renamed from: getShowingTask, reason: from getter */
    public final r45.s73 getF197464p() {
        return this.f197464p;
    }
}
