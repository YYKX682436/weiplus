package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sl extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f132985a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ZoomControls f132986b;

    /* renamed from: e, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f132990f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f132991g;

    /* renamed from: h, reason: collision with root package name */
    android.graphics.Bitmap f132992h;

    /* renamed from: i, reason: collision with root package name */
    android.graphics.Bitmap f132993i;

    /* renamed from: j, reason: collision with root package name */
    android.graphics.Bitmap f132994j;

    /* renamed from: k, reason: collision with root package name */
    android.graphics.Bitmap f132995k;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.LinearLayout f132998n;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sk f132987c = null;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.eu.b f132996l = com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bk.a f132988d = null;

    /* renamed from: m, reason: collision with root package name */
    private int f132997m = 0;

    /* renamed from: com.tencent.mapsdk.internal.sl$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f133002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f133003b;

        public AnonymousClass4(boolean z17, boolean z18) {
            this.f133002a = z17;
            this.f133003b = z18;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.this.f132986b.setIsZoomInEnabled(this.f133002a);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.this.f132986b.setIsZoomOutEnabled(this.f133003b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sl$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133005a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.m36716xcee59d22().length];
            f133005a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f133005a[com.tencent.mapsdk.internal.eu.b.CENTER_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f133005a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f133005a[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f133005a[com.tencent.mapsdk.internal.eu.b.CENTER_TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f133005a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public sl(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f132985a = context;
        this.f132989e = trVar;
    }

    private void e() {
        if (this.f132998n == null || this.f132986b == null) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f132998n.indexOfChild(this.f132986b) < 0) {
            this.f132998n.addView(this.f132986b, layoutParams);
        } else {
            this.f132998n.updateViewLayout(this.f132986b, layoutParams);
        }
    }

    private void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        if (this.f132998n == null || this.f132987c == null || (trVar = this.f132989e) == null || trVar.e_ == 0) {
            return;
        }
        a(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) trVar.d_).o());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f132998n.indexOfChild(this.f132987c) >= 0) {
            this.f132998n.updateViewLayout(this.f132987c, layoutParams);
            return;
        }
        android.widget.ZoomControls zoomControls = this.f132986b;
        if (zoomControls == null || this.f132998n.indexOfChild(zoomControls) < 0) {
            this.f132998n.addView(this.f132987c, layoutParams);
            return;
        }
        this.f132998n.removeViewInLayout(this.f132986b);
        this.f132998n.addView(this.f132987c, layoutParams);
        this.f132998n.addView(this.f132986b, layoutParams);
    }

    private boolean g() {
        android.widget.ZoomControls zoomControls = this.f132986b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    private android.widget.FrameLayout.LayoutParams h() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(this.f132985a, 5);
        switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.AnonymousClass5.f133005a[this.f132996l.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a17 * 2;
                layoutParams.leftMargin = a17;
                return layoutParams;
            case 2:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a17;
                return layoutParams;
            case 3:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a17 * 6;
                layoutParams.rightMargin = a17;
                return layoutParams;
            case 4:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a17;
                layoutParams.leftMargin = a17;
                return layoutParams;
            case 5:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a17;
                return layoutParams;
            case 6:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a17;
                layoutParams.rightMargin = a17;
                return layoutParams;
            default:
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown position:" + this.f132996l);
                return layoutParams;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return this.f132996l;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (viewGroup == null) {
            return false;
        }
        android.widget.LinearLayout linearLayout = this.f132998n;
        if (linearLayout == null || linearLayout.getParent() != viewGroup) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.f132985a);
            this.f132998n = linearLayout2;
            linearLayout2.setOrientation(1);
            viewGroup.addView(this.f132998n);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(this.f132985a, 5);
        switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.AnonymousClass5.f133005a[this.f132996l.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a17 * 2;
                layoutParams.leftMargin = a17;
                break;
            case 2:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a17;
                break;
            case 3:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a17 * 6;
                layoutParams.rightMargin = a17;
                break;
            case 4:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a17;
                layoutParams.leftMargin = a17;
                break;
            case 5:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a17;
                break;
            case 6:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a17;
                layoutParams.rightMargin = a17;
                break;
            default:
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown position:" + this.f132996l);
                break;
        }
        this.f132998n.setGravity(layoutParams.gravity);
        this.f132998n.setLayoutParams(layoutParams);
        if (this.f132991g && this.f132986b == null) {
            a(this.f132985a);
        } else {
            e();
        }
        if (this.f132990f && this.f132987c == null) {
            b(this.f132985a);
        } else {
            f();
        }
        a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v.b(bundle != null ? bundle.getInt(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.f130509a, -1) : -1));
        this.f132998n.requestLayout();
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sk skVar = this.f132987c;
        if (skVar != null) {
            skVar.setClickable(false);
            android.graphics.drawable.Drawable background = skVar.getBackground();
            if (background != null) {
                background.setCallback(null);
            }
            skVar.setBackgroundDrawable(null);
        }
    }

    public final void b(android.content.Context context) {
        this.f132987c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sk(context);
        android.graphics.Bitmap b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.f132985a, "location_enable.png"));
        this.f132987c.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f132987c.setImageBitmap(b17);
        this.f132987c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mapsdk.internal.bk.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.this.f132988d;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        f();
    }

    private void c(boolean z17) {
        this.f132990f = z17;
        if (z17 && this.f132987c == null) {
            b(this.f132985a);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sk skVar = this.f132987c;
        if (skVar != null) {
            skVar.setVisibility(z17 ? 0 : 8);
        }
    }

    private void b(boolean z17) {
        this.f132991g = z17;
        if (z17 && this.f132986b == null) {
            a(this.f132985a);
        }
        android.widget.ZoomControls zoomControls = this.f132986b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f132986b, this.f132987c};
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
        if (this.f132996l != bVar) {
            this.f132996l = bVar;
            a(this.f132989e.ac(), (android.os.Bundle) null);
        }
    }

    public final void a(android.content.Context context) {
        try {
            android.widget.ZoomControls zoomControls = new android.widget.ZoomControls(context);
            this.f132986b = zoomControls;
            zoomControls.setId(android.view.View.generateViewId());
            this.f132986b.setOnZoomInClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.this.f132989e.e_).f134045o.f132041h.a((java.lang.Runnable) null);
                }
            });
            this.f132986b.setOnZoomOutClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.this.f132989e.e_).f134045o.f132041h.b((java.lang.Runnable) null);
                }
            });
            e();
        } catch (java.lang.Exception unused) {
        }
    }

    private void a(boolean z17) {
        if (this.f132987c == null) {
            return;
        }
        if (z17) {
            android.graphics.Bitmap bitmap = this.f132994j;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f132994j = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.f132985a, "location_state_dark_normal.png"));
            }
            android.graphics.Bitmap bitmap2 = this.f132995k;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f132995k = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.f132985a, "location_state_dark_selected.png"));
            }
        } else {
            android.graphics.Bitmap bitmap3 = this.f132992h;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                this.f132992h = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.f132985a, "location_state_normal.png"));
            }
            android.graphics.Bitmap bitmap4 = this.f132993i;
            if (bitmap4 == null || bitmap4.isRecycled()) {
                this.f132993i = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.f132985a, "location_state_selected.png"));
            }
        }
        this.f132987c.a(this.f132985a, z17 ? this.f132994j : this.f132992h, z17 ? this.f132995k : this.f132993i);
        this.f132987c.setVisibility(this.f132990f ? 0 : 8);
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        this.f132988d = aVar;
    }

    private void a(boolean z17, boolean z18) {
        if (this.f132986b != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.AnonymousClass4(z17, z18));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final android.graphics.Rect a() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.ZoomControls zoomControls = this.f132986b;
        if (zoomControls != null && this.f132987c != null) {
            rect.bottom = java.lang.Math.min(zoomControls.getBottom(), this.f132987c.getBottom());
            rect.right = java.lang.Math.max(this.f132986b.getRight(), this.f132987c.getRight());
            rect.left = java.lang.Math.min(this.f132986b.getLeft(), this.f132987c.getLeft());
            rect.top = java.lang.Math.min(this.f132986b.getTop(), this.f132987c.getTop());
        }
        return rect;
    }
}
