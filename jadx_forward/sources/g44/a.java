package g44;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f350336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f350337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f350338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f350339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f350340h;

    public a(android.view.View view, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d, android.widget.TextView textView, float f17) {
        this.f350336d = view;
        this.f350337e = context;
        this.f350338f = c22628xfde5d61d;
        this.f350339g = textView;
        this.f350340h = f17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$resizeBrandName$1");
        android.view.View view = this.f350336d;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int width = view.getWidth();
        android.content.Context context = this.f350337e;
        int b17 = width - (i65.a.b(context, 40) * 2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f350338f;
        int width2 = b17 - c22628xfde5d61d.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = c22628xfde5d61d.getLayoutParams();
        ca4.m0.b(context, this.f350339g, this.f350340h, width2 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r3.rightMargin : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$resizeBrandName$1");
        return true;
    }
}
