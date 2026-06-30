package sf4;

/* loaded from: classes4.dex */
public final class d extends y9.i {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f488966n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f488967o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f488968p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f488969q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f488970r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f488971s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f488972t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f488973u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f488974v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f488975w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f488976x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f488977y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f488978z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f488978z = true;
        this.C = true;
        this.E = true;
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwd);
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f488966n = findViewById(com.p314xaae8f345.mm.R.id.nll);
        this.f488967o = findViewById(com.p314xaae8f345.mm.R.id.nlt);
        this.f488968p = findViewById(com.p314xaae8f345.mm.R.id.nlq);
        this.f488969q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nlm);
        this.f488970r = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nlu);
        this.f488971s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nlr);
        this.f488972t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nls);
        this.f488973u = findViewById(com.p314xaae8f345.mm.R.id.nln);
        this.f488973u = findViewById(com.p314xaae8f345.mm.R.id.nln);
        this.f488974v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nlo);
        int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
        android.widget.ImageView imageView = this.f488969q;
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f78955x909c0e1f, color));
        }
        android.widget.ImageView imageView2 = this.f488970r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80286x295a1e83, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
        }
        android.widget.ImageView imageView3 = this.f488974v;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80049xe932fc09, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
        }
        android.view.View view2 = this.f488967o;
        if (view2 != null) {
            view2.setOnClickListener(new sf4.c(this));
        }
        if (this.A && (view = this.f488967o) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f488978z) {
            android.view.View view3 = this.f488966n;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.f488966n;
            if (view4 != null) {
                view4.setOnClickListener(new sf4.a(this));
            }
        } else {
            android.view.View view5 = this.f488966n;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.C) {
            android.view.View view6 = this.f488968p;
            if (view6 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = this.f488968p;
            if (view7 != null) {
                view7.setOnClickListener(new sf4.b(this));
            }
            if (this.B) {
                android.widget.ImageView imageView4 = this.f488971s;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80341x61cc3e9c, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
                }
                android.widget.TextView textView = this.f488972t;
                if (textView != null) {
                    textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlu));
                }
            } else {
                android.widget.ImageView imageView5 = this.f488971s;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80157xebd71a83, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
                }
                android.widget.TextView textView2 = this.f488972t;
                if (textView2 != null) {
                    textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlv));
                }
            }
        } else {
            android.view.View view8 = this.f488968p;
            if (view8 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view8, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.E) {
        }
        android.view.View view9 = this.f488973u;
        if (view9 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view9, arrayList6.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565592cv0);
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }
}
