package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class DeleteTaskFooterView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f97362o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f97363d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f97364e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f97365f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f97366g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f97367h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97368i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f97369m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.r f97370n;

    public DeleteTaskFooterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97368i = true;
        this.f97369m = false;
        this.f97370n = new r02.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.downloader_app.model.x.f97334c.add(this.f97370n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.downloader_app.model.x.f97334c.remove(this.f97370n);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a3q, (android.view.ViewGroup) this, true);
        this.f97363d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.bsd);
        this.f97364e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bsc);
        this.f97363d.setOnClickListener(new r02.e(this));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.ct7);
        this.f97365f = linearLayout;
        linearLayout.setOnClickListener(new r02.f(this));
        this.f97365f.setClickable(false);
        this.f97366g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484039ct2);
        this.f97367h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ct9);
    }
}
