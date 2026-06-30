package q74;

/* loaded from: classes4.dex */
public class y0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f442104d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f442105e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f442106f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f442107g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f442108h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f442109i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f442110m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f442111n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f442112o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f442113p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f442114q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f442115r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f442116s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f442117t;

    public y0(android.view.View view, q74.w0 w0Var) {
        super(view);
        this.f442104d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n5i);
        this.f442105e = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.n5m);
        this.f442106f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n5k);
        this.f442107g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n5l);
        this.f442108h = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.n5n);
        this.f442109i = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.n1u);
        this.f442110m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f442111n = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f442112o = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f566831h75);
        this.f442113p = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f568524n41);
        this.f442114q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568525n42);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.b0r);
        this.f442115r = frameLayout;
        this.f442116s = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.b0p);
        this.f442117t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b1m);
        frameLayout.setOnClickListener(w0Var);
    }

    public void i(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
        a84.y0.p(this.f442104d, false);
        a84.y0.p(this.f442106f, false);
        a84.y0.p(this.f442109i, false);
        a84.y0.p(this.f442110m, false);
        a84.y0.p(this.f442111n, false);
        a84.y0.p(this.f442113p, false);
        a84.y0.p(this.f442114q, false);
        android.widget.FrameLayout frameLayout = this.f442115r;
        a84.y0.p(frameLayout, false);
        a84.y0.p(this.f442116s, false);
        a84.y0.p(this.f442117t, false);
        frameLayout.setTag(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
    }
}
