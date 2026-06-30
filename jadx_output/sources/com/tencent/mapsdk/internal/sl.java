package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sl extends com.tencent.mapsdk.internal.es {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f51452a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ZoomControls f51453b;

    /* renamed from: e, reason: collision with root package name */
    com.tencent.mapsdk.internal.tr f51456e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51458g;

    /* renamed from: h, reason: collision with root package name */
    android.graphics.Bitmap f51459h;

    /* renamed from: i, reason: collision with root package name */
    android.graphics.Bitmap f51460i;

    /* renamed from: j, reason: collision with root package name */
    android.graphics.Bitmap f51461j;

    /* renamed from: k, reason: collision with root package name */
    android.graphics.Bitmap f51462k;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.LinearLayout f51465n;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sk f51454c = null;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.eu.b f51463l = com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bk.a f51455d = null;

    /* renamed from: m, reason: collision with root package name */
    private int f51464m = 0;

    /* renamed from: com.tencent.mapsdk.internal.sl$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51470b;

        public AnonymousClass4(boolean z17, boolean z18) {
            this.f51469a = z17;
            this.f51470b = z18;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.sl.this.f51453b.setIsZoomInEnabled(this.f51469a);
            com.tencent.mapsdk.internal.sl.this.f51453b.setIsZoomOutEnabled(this.f51470b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sl$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51472a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.values().length];
            f51472a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51472a[com.tencent.mapsdk.internal.eu.b.CENTER_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f51472a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f51472a[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f51472a[com.tencent.mapsdk.internal.eu.b.CENTER_TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f51472a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public sl(android.content.Context context, com.tencent.mapsdk.internal.tr trVar) {
        this.f51452a = context;
        this.f51456e = trVar;
    }

    private void e() {
        if (this.f51465n == null || this.f51453b == null) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f51465n.indexOfChild(this.f51453b) < 0) {
            this.f51465n.addView(this.f51453b, layoutParams);
        } else {
            this.f51465n.updateViewLayout(this.f51453b, layoutParams);
        }
    }

    private void f() {
        com.tencent.mapsdk.internal.tr trVar;
        if (this.f51465n == null || this.f51454c == null || (trVar = this.f51456e) == null || trVar.e_ == 0) {
            return;
        }
        a(((com.tencent.mapsdk.internal.ne) trVar.d_).o());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f51465n.indexOfChild(this.f51454c) >= 0) {
            this.f51465n.updateViewLayout(this.f51454c, layoutParams);
            return;
        }
        android.widget.ZoomControls zoomControls = this.f51453b;
        if (zoomControls == null || this.f51465n.indexOfChild(zoomControls) < 0) {
            this.f51465n.addView(this.f51454c, layoutParams);
            return;
        }
        this.f51465n.removeViewInLayout(this.f51453b);
        this.f51465n.addView(this.f51454c, layoutParams);
        this.f51465n.addView(this.f51453b, layoutParams);
    }

    private boolean g() {
        android.widget.ZoomControls zoomControls = this.f51453b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    private android.widget.FrameLayout.LayoutParams h() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int a17 = com.tencent.mapsdk.internal.kl.a(this.f51452a, 5);
        switch (com.tencent.mapsdk.internal.sl.AnonymousClass5.f51472a[this.f51463l.ordinal()]) {
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
                com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown position:" + this.f51463l);
                return layoutParams;
        }
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return this.f51463l;
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (viewGroup == null) {
            return false;
        }
        android.widget.LinearLayout linearLayout = this.f51465n;
        if (linearLayout == null || linearLayout.getParent() != viewGroup) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.f51452a);
            this.f51465n = linearLayout2;
            linearLayout2.setOrientation(1);
            viewGroup.addView(this.f51465n);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int a17 = com.tencent.mapsdk.internal.kl.a(this.f51452a, 5);
        switch (com.tencent.mapsdk.internal.sl.AnonymousClass5.f51472a[this.f51463l.ordinal()]) {
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
                com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown position:" + this.f51463l);
                break;
        }
        this.f51465n.setGravity(layoutParams.gravity);
        this.f51465n.setLayoutParams(layoutParams);
        if (this.f51458g && this.f51453b == null) {
            a(this.f51452a);
        } else {
            e();
        }
        if (this.f51457f && this.f51454c == null) {
            b(this.f51452a);
        } else {
            f();
        }
        a(com.tencent.mapsdk.internal.v.b(bundle != null ? bundle.getInt(com.tencent.mapsdk.internal.bk.f48976a, -1) : -1));
        this.f51465n.requestLayout();
        return true;
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void c() {
        com.tencent.mapsdk.internal.sk skVar = this.f51454c;
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
        this.f51454c = new com.tencent.mapsdk.internal.sk(context);
        android.graphics.Bitmap b17 = com.tencent.mapsdk.internal.hl.b(com.tencent.mapsdk.internal.hl.b(this.f51452a, "location_enable.png"));
        this.f51454c.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f51454c.setImageBitmap(b17);
        this.f51454c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mapsdk.internal.bk.a aVar = com.tencent.mapsdk.internal.sl.this.f51455d;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        f();
    }

    private void c(boolean z17) {
        this.f51457f = z17;
        if (z17 && this.f51454c == null) {
            b(this.f51452a);
        }
        com.tencent.mapsdk.internal.sk skVar = this.f51454c;
        if (skVar != null) {
            skVar.setVisibility(z17 ? 0 : 8);
        }
    }

    private void b(boolean z17) {
        this.f51458g = z17;
        if (z17 && this.f51453b == null) {
            a(this.f51452a);
        }
        android.widget.ZoomControls zoomControls = this.f51453b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f51453b, this.f51454c};
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
        if (this.f51463l != bVar) {
            this.f51463l = bVar;
            a(this.f51456e.ac(), (android.os.Bundle) null);
        }
    }

    public final void a(android.content.Context context) {
        try {
            android.widget.ZoomControls zoomControls = new android.widget.ZoomControls(context);
            this.f51453b = zoomControls;
            zoomControls.setId(android.view.View.generateViewId());
            this.f51453b.setOnZoomInClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.sl.this.f51456e.e_).f52512o.f50508h.a((java.lang.Runnable) null);
                }
            });
            this.f51453b.setOnZoomOutClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sl.2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.sl.this.f51456e.e_).f52512o.f50508h.b((java.lang.Runnable) null);
                }
            });
            e();
        } catch (java.lang.Exception unused) {
        }
    }

    private void a(boolean z17) {
        if (this.f51454c == null) {
            return;
        }
        if (z17) {
            android.graphics.Bitmap bitmap = this.f51461j;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f51461j = com.tencent.mapsdk.internal.hl.b(com.tencent.mapsdk.internal.hl.b(this.f51452a, "location_state_dark_normal.png"));
            }
            android.graphics.Bitmap bitmap2 = this.f51462k;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f51462k = com.tencent.mapsdk.internal.hl.b(com.tencent.mapsdk.internal.hl.b(this.f51452a, "location_state_dark_selected.png"));
            }
        } else {
            android.graphics.Bitmap bitmap3 = this.f51459h;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                this.f51459h = com.tencent.mapsdk.internal.hl.b(com.tencent.mapsdk.internal.hl.b(this.f51452a, "location_state_normal.png"));
            }
            android.graphics.Bitmap bitmap4 = this.f51460i;
            if (bitmap4 == null || bitmap4.isRecycled()) {
                this.f51460i = com.tencent.mapsdk.internal.hl.b(com.tencent.mapsdk.internal.hl.b(this.f51452a, "location_state_selected.png"));
            }
        }
        this.f51454c.a(this.f51452a, z17 ? this.f51461j : this.f51459h, z17 ? this.f51462k : this.f51460i);
        this.f51454c.setVisibility(this.f51457f ? 0 : 8);
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        this.f51455d = aVar;
    }

    private void a(boolean z17, boolean z18) {
        if (this.f51453b != null) {
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sl.AnonymousClass4(z17, z18));
        }
    }

    @Override // com.tencent.mapsdk.internal.es, com.tencent.mapsdk.internal.eu
    public final android.graphics.Rect a() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.ZoomControls zoomControls = this.f51453b;
        if (zoomControls != null && this.f51454c != null) {
            rect.bottom = java.lang.Math.min(zoomControls.getBottom(), this.f51454c.getBottom());
            rect.right = java.lang.Math.max(this.f51453b.getRight(), this.f51454c.getRight());
            rect.left = java.lang.Math.min(this.f51453b.getLeft(), this.f51454c.getLeft());
            rect.top = java.lang.Math.min(this.f51453b.getTop(), this.f51454c.getTop());
        }
        return rect;
    }
}
