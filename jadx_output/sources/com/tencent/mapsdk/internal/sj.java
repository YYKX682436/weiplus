package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sj extends com.tencent.mapsdk.internal.es {

    /* renamed from: aa, reason: collision with root package name */
    private static final int f51388aa = 6;

    /* renamed from: ad, reason: collision with root package name */
    private static final float f51389ad = 0.7f;

    /* renamed from: ae, reason: collision with root package name */
    private static final float f51390ae = 1.3f;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f51391f = {1000000.0f, 500000.0f, 200000.0f, 100000.0f, 50000.0f, 25000.0f, 20000.0f, 10000.0f, 5000.0f, 2000.0f, 1000.0f, 500.0f, 200.0f, 100.0f, 50.0f, 20.0f, 10.0f, 5.0f, 2.0f, 1.0f};
    private volatile boolean A;
    private com.tencent.mapsdk.internal.gb B;
    private boolean C;
    private android.content.Context D;
    private android.graphics.Bitmap E;
    private android.graphics.Bitmap F;
    private com.tencent.mapsdk.internal.sj.e Z;

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f51393a;

    /* renamed from: ab, reason: collision with root package name */
    private android.widget.LinearLayout f51394ab;

    /* renamed from: af, reason: collision with root package name */
    private android.view.animation.Animation f51396af;

    /* renamed from: ai, reason: collision with root package name */
    private com.tencent.mapsdk.internal.kp.a f51399ai;

    /* renamed from: aj, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f51400aj;

    /* renamed from: j, reason: collision with root package name */
    public float f51409j;

    /* renamed from: k, reason: collision with root package name */
    public int f51410k;

    /* renamed from: l, reason: collision with root package name */
    public double f51411l;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f51414o;

    /* renamed from: p, reason: collision with root package name */
    public final int f51415p;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qs f51420u;

    /* renamed from: x, reason: collision with root package name */
    private android.graphics.Bitmap f51423x;

    /* renamed from: y, reason: collision with root package name */
    private android.graphics.Rect f51424y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f51425z;

    /* renamed from: v, reason: collision with root package name */
    private final int f51421v = 500;

    /* renamed from: w, reason: collision with root package name */
    private final int f51422w = 1000;
    private com.tencent.mapsdk.internal.eu.b G = com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM;
    private com.tencent.mapsdk.internal.eu.b H = com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51402b = true;

    /* renamed from: c, reason: collision with root package name */
    public float[] f51403c = {-1.0f, -1.0f, -1.0f, -1.0f};
    private int[] I = {-1, -1, -1, -1};

    /* renamed from: J, reason: collision with root package name */
    private int[] f51392J = {-1, -1, -1, -1};
    private int[] K = new int[com.tencent.mapsdk.internal.eu.a.values().length];
    private int[] L = new int[com.tencent.mapsdk.internal.eu.a.values().length];
    private float[] M = {0.02f, 0.02f, 0.012f, 0.012f};
    private float[] N = {0.022f, 0.022f, 0.0125f, 0.0125f};
    private float[] O = {0.0185f, 0.0185f, 0.0104f, 0.0104f};

    /* renamed from: d, reason: collision with root package name */
    public int f51404d = 0;
    private int P = 0;
    private int Q = 0;
    private int R = 0;
    private int S = 0;
    private int T = 0;
    private final java.util.List<com.tencent.mapsdk.internal.sn> U = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.graphics.Bitmap> V = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.List<java.lang.String> W = new java.util.concurrent.CopyOnWriteArrayList();
    private java.lang.String X = null;

    /* renamed from: e, reason: collision with root package name */
    public int f51405e = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f51406g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f51407h = "50米";
    private int Y = 26;

    /* renamed from: i, reason: collision with root package name */
    public int f51408i = 109;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51412m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51413n = false;

    /* renamed from: ac, reason: collision with root package name */
    private final int f51395ac = 18;

    /* renamed from: q, reason: collision with root package name */
    public float f51416q = Float.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.sj.c> f51417r = new java.util.ArrayList();

    /* renamed from: ag, reason: collision with root package name */
    private int f51397ag = -1;

    /* renamed from: ah, reason: collision with root package name */
    private int f51398ah = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f51418s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f51419t = -1;

    /* renamed from: ak, reason: collision with root package name */
    private boolean f51401ak = true;

    /* renamed from: com.tencent.mapsdk.internal.sj$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements android.view.animation.Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(android.view.animation.Animation animation) {
            com.tencent.mapsdk.internal.sj.this.d(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(android.view.animation.Animation animation) {
            com.tencent.mapsdk.internal.sj.this.d(true);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sj$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements java.lang.Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.tr trVar = com.tencent.mapsdk.internal.sj.this.f51400aj;
            float f17 = com.tencent.mapsdk.internal.sj.this.f51406g;
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener = trVar.A;
            if (onScaleViewChangedListener != null) {
                onScaleViewChangedListener.onScaleViewChanged(f17);
            }
            trVar.f52199n.f48782j.onScaleViewChanged(f17);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sj$6, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51434a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.values().length];
            f51434a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51434a[com.tencent.mapsdk.internal.eu.b.CENTER_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f51434a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f51434a[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f51434a[com.tencent.mapsdk.internal.eu.b.CENTER_TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f51434a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.ko.g<android.graphics.Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> f51435a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f51436b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f51437c;

        public a(com.tencent.mapsdk.internal.sj sjVar, java.lang.String str, java.lang.String str2) {
            this.f51435a = new java.lang.ref.WeakReference<>(sjVar);
            this.f51436b = str;
            this.f51437c = str2;
        }

        private android.graphics.Bitmap a() {
            com.tencent.mapsdk.internal.sj sjVar;
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> weakReference = this.f51435a;
            android.graphics.Bitmap bitmap = null;
            if (weakReference != null && (sjVar = weakReference.get()) != null) {
                java.io.File file = new java.io.File(com.tencent.mapsdk.internal.sj.a(sjVar, this.f51437c));
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] request url[" + this.f51436b + "]...");
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] save to[" + file + "]...");
                com.tencent.map.tools.net.NetResponse downloadTo = com.tencent.map.tools.net.NetManager.getInstance().builder().url(this.f51436b).downloadTo(file);
                if (downloadTo != null && downloadTo.available()) {
                    byte[] bArr = downloadTo.data;
                    int length = bArr.length;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        sjVar.V.put(this.f51437c, bitmap);
                    }
                }
            }
            return bitmap;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            com.tencent.mapsdk.internal.sj sjVar;
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> weakReference = this.f51435a;
            android.graphics.Bitmap bitmap = null;
            if (weakReference != null && (sjVar = weakReference.get()) != null) {
                java.io.File file = new java.io.File(com.tencent.mapsdk.internal.sj.a(sjVar, this.f51437c));
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] request url[" + this.f51436b + "]...");
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] save to[" + file + "]...");
                com.tencent.map.tools.net.NetResponse downloadTo = com.tencent.map.tools.net.NetManager.getInstance().builder().url(this.f51436b).downloadTo(file);
                if (downloadTo != null && downloadTo.available()) {
                    byte[] bArr = downloadTo.data;
                    int length = bArr.length;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51437c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        sjVar.V.put(this.f51437c, bitmap);
                    }
                }
            }
            return bitmap;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.mapsdk.internal.ko.a<android.graphics.Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> f51438a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f51439b;

        public b(com.tencent.mapsdk.internal.sj sjVar, java.lang.String str) {
            this.f51438a = new java.lang.ref.WeakReference<>(sjVar);
            this.f51439b = str;
        }

        private void a(android.graphics.Bitmap bitmap) {
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> weakReference;
            com.tencent.mapsdk.internal.sj sjVar;
            if (bitmap == null || (weakReference = this.f51438a) == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            com.tencent.mapsdk.internal.ks.a(new java.io.File(com.tencent.mapsdk.internal.sj.a(sjVar, this.f51439b)), new java.io.File(sjVar.a(this.f51439b)));
            if (this.f51439b.equals(sjVar.X) || android.text.TextUtils.isEmpty(sjVar.X)) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51439b + "] set from net");
                sjVar.a(bitmap);
            }
            sjVar.W.remove(this.f51439b);
        }

        @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(java.lang.Object obj) {
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> weakReference;
            com.tencent.mapsdk.internal.sj sjVar;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap == null || (weakReference = this.f51438a) == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            com.tencent.mapsdk.internal.ks.a(new java.io.File(com.tencent.mapsdk.internal.sj.a(sjVar, this.f51439b)), new java.io.File(sjVar.a(this.f51439b)));
            if (this.f51439b.equals(sjVar.X) || android.text.TextUtils.isEmpty(sjVar.X)) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + this.f51439b + "] set from net");
                sjVar.a(bitmap);
            }
            sjVar.W.remove(this.f51439b);
        }
    }

    /* loaded from: classes13.dex */
    public interface c {
        void a(android.view.View view, android.graphics.Rect rect, boolean z17);

        void a(com.tencent.mapsdk.internal.sj sjVar);

        void b(android.view.View view, android.graphics.Rect rect, boolean z17);

        void c();
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f51440a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f51441b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f51442c = {1, 2};

        private d(java.lang.String str, int i17) {
        }

        private static int[] a() {
            return (int[]) f51442c.clone();
        }
    }

    /* loaded from: classes13.dex */
    public static class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> f51451a;

        public f(com.tencent.mapsdk.internal.sj sjVar) {
            this.f51451a = new java.lang.ref.WeakReference<>(sjVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.sj sjVar;
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.sj> weakReference = this.f51451a;
            if (weakReference == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            sjVar.a(com.tencent.mapsdk.internal.sj.k(sjVar), (android.os.Bundle) null);
        }
    }

    public sj(android.content.Context context, final com.tencent.mapsdk.internal.tr trVar, int i17) {
        this.f51409j = 1.0f;
        this.D = context;
        this.f51400aj = trVar;
        this.f51415p = i17;
        this.f51409j = context.getResources().getDisplayMetrics().density;
        this.f51393a = new android.widget.ImageView(context);
        this.Z = new com.tencent.mapsdk.internal.sj.e(this.D);
        if (this.f51409j <= 0.0f) {
            this.f51409j = 1.0f;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.D);
        this.f51394ab = linearLayout;
        linearLayout.setOrientation(1);
        this.f51394ab.setGravity(16);
        this.f51394ab.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sj.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                if (com.tencent.mapsdk.internal.sj.this.f51399ai == null) {
                    com.tencent.mapsdk.internal.sj sjVar = com.tencent.mapsdk.internal.sj.this;
                    sjVar.f51399ai = com.tencent.mapsdk.internal.kp.a(sjVar.D, null, " ", 0);
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(trVar.f49018f).a(com.tencent.mapsdk.internal.sj.this.D, com.tencent.mapsdk.internal.sj.this.f51399ai);
            }
        });
        this.f51394ab.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mapsdk.internal.sj.2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return com.tencent.mapsdk.internal.go.a(trVar.d_);
            }
        });
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.D);
        this.f51414o = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51414o.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        this.f51414o.addView(this.Z, layoutParams);
        this.f51414o.setVisibility(8);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f51396af = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f51396af.setStartOffset(500L);
        this.f51396af.setAnimationListener(new com.tencent.mapsdk.internal.sj.AnonymousClass3());
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        this.f51394ab.addView(this.f51393a, layoutParams2);
        com.tencent.mapsdk.internal.so soVar = trVar.f52195j.f51514b;
        if (soVar != null) {
            a(soVar.c());
        }
    }

    private android.view.ViewGroup o() {
        return this.f51400aj.ac();
    }

    private java.lang.String p() {
        return this.D.getFilesDir().getAbsolutePath() + "/tencentMapSdk/logos";
    }

    private java.lang.String q() {
        return this.D.getFilesDir().getAbsolutePath() + "/tencentMapSdk/oldLogos";
    }

    private void r() {
        this.V.clear();
    }

    private android.widget.FrameLayout.LayoutParams s() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        android.widget.LinearLayout linearLayout = this.f51414o;
        if (linearLayout == null) {
            return layoutParams;
        }
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = this.f51414o.getMeasuredHeight();
        switch (com.tencent.mapsdk.internal.sj.AnonymousClass6.f51434a[this.H.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                int[] iArr = this.L;
                int i17 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                layoutParams.bottomMargin = i17;
                int i18 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                layoutParams.leftMargin = i18;
                this.f51419t = (this.P - i17) - measuredHeight;
                this.f51418s = i18;
                return layoutParams;
            case 2:
                layoutParams.gravity = 81;
                int i19 = this.L[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                layoutParams.bottomMargin = i19;
                this.f51419t = (this.P - i19) - measuredHeight;
                this.f51418s = (this.f51404d - measuredWidth) / 2;
                return layoutParams;
            case 3:
                layoutParams.gravity = 85;
                int[] iArr2 = this.L;
                int i27 = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                layoutParams.bottomMargin = i27;
                int i28 = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                layoutParams.rightMargin = i28;
                this.f51419t = (this.P - i27) - measuredHeight;
                this.f51418s = (this.f51404d - i28) - measuredWidth;
                return layoutParams;
            case 4:
                layoutParams.gravity = 51;
                int[] iArr3 = this.L;
                int i29 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                layoutParams.topMargin = i29;
                int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                layoutParams.leftMargin = i37;
                this.f51419t = i29;
                this.f51418s = i37;
                return layoutParams;
            case 5:
                layoutParams.gravity = 49;
                int i38 = this.L[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                layoutParams.topMargin = i38;
                this.f51419t = i38;
                this.f51418s = (this.f51404d - measuredWidth) / 2;
                return layoutParams;
            case 6:
                layoutParams.gravity = 53;
                int[] iArr4 = this.L;
                int i39 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                layoutParams.topMargin = i39;
                int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                layoutParams.rightMargin = i47;
                this.f51419t = i39;
                this.f51418s = (this.f51404d - i47) - measuredWidth;
                return layoutParams;
            default:
                com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown positionScale:" + this.H);
                return layoutParams;
        }
    }

    private com.tencent.mapsdk.internal.eu.b t() {
        return this.H;
    }

    private void u() {
        h();
    }

    private void v() {
        i();
    }

    private boolean w() {
        return this.f51412m;
    }

    private void x() {
        y();
        this.f51414o.startAnimation(this.f51396af);
    }

    private void y() {
        android.widget.LinearLayout linearLayout = this.f51414o;
        if (linearLayout == null || this.f51396af == null) {
            return;
        }
        linearLayout.clearAnimation();
        this.f51396af.reset();
    }

    private void z() {
        java.lang.String str;
        int width = this.f51393a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) java.lang.Math.ceil(width / 4.0f);
        int ceil2 = (int) (java.lang.Math.ceil((this.f51404d * 3.0f) / 8.0f) - (this.f51409j * 6.0f));
        float[] fArr = f51391f;
        int length = fArr.length;
        int i17 = this.f51410k - this.f51415p;
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 >= length) {
            i17 = length - 1;
        }
        float f17 = fArr[i17];
        if (this.f51406g != f17) {
            this.f51406g = f17;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.AnonymousClass5());
        }
        float f18 = ceil;
        double d17 = this.f51411l;
        if (d17 != 0.0d) {
            f18 = (float) (f17 / d17);
        }
        int round = java.lang.Math.round(f18);
        this.f51408i = round;
        if (round > ceil2) {
            this.f51408i = ceil2;
        } else if (round < ceil) {
            this.f51408i = ceil;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f51407h = ((int) f17) + str;
    }

    public final boolean k() {
        return com.tencent.mapsdk.internal.hr.a(this.X) || this.X.contains("tencent") || this.X.contains(com.tencent.mapsdk.internal.sm.f51476d);
    }

    private android.graphics.Bitmap c(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        try {
            java.io.File file = new java.io.File(a(str));
            if (!file.exists()) {
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) null);
                return null;
            }
            fileInputStream = new java.io.FileInputStream(file);
            try {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream);
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                return decodeStream;
            } catch (java.lang.Throwable unused) {
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            fileInputStream = null;
        }
    }

    private void n() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f51396af = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f51396af.setStartOffset(500L);
        this.f51396af.setAnimationListener(new com.tencent.mapsdk.internal.sj.AnonymousClass3());
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return this.G;
    }

    public final void e() {
        if (!this.f51412m) {
            d(false);
        } else if (this.f51413n) {
            d(true);
            y();
        } else {
            d(true);
            x();
        }
    }

    public final void f() {
        com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.f(this));
    }

    public final void g() {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "clearLogoCache..");
        this.V.clear();
        this.W.clear();
        try {
            java.io.File file = new java.io.File(p());
            if (file.exists()) {
                java.io.File file2 = new java.io.File(q());
                if (file.renameTo(file2)) {
                    com.tencent.mapsdk.internal.kt.c(file2.getAbsolutePath());
                } else {
                    com.tencent.mapsdk.internal.kt.c(file.getAbsolutePath());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void h() {
        if (this.f51404d == 0 || this.P == 0) {
            return;
        }
        float f17 = this.Q;
        float f18 = this.f51409j;
        int i17 = (int) ((f17 * f18) / 3.0f);
        int i18 = (int) ((this.R * f18) / 3.0f);
        int[] d17 = d(i17, i18);
        int i19 = this.S;
        int i27 = d17[0];
        if (i19 != i27 || this.T != d17[1]) {
            this.S = i27;
            this.T = d17[1];
            this.A = true;
        }
        float[] fArr = this.M;
        int i28 = this.f51404d;
        if (i28 >= 1080) {
            fArr = this.O;
        } else if (i28 >= 720) {
            fArr = this.N;
        }
        int i29 = com.tencent.mapsdk.internal.eu.a.LEFT.f49413e;
        float f19 = fArr[i29];
        float[] fArr2 = this.f51403c;
        float f27 = fArr2[i29];
        if (f27 >= 0.0f) {
            f19 = f27;
        }
        int[] iArr = this.K;
        iArr[i29] = (int) (i28 * f19);
        if (this.f51401ak) {
            this.f51392J[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e] = i18;
        }
        int[] iArr2 = this.I;
        int i37 = iArr2[i29];
        if (i37 >= 0 && i37 < i28 - i17) {
            iArr[i29] = i37;
        }
        int i38 = com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e;
        float f28 = fArr[i38];
        float f29 = fArr2[i38];
        if (f29 >= 0.0f) {
            f28 = f29;
        }
        iArr[i38] = (int) (i28 * f28);
        int i39 = iArr2[i38];
        if (i39 >= 0 && i39 < i28 - i17) {
            iArr[i38] = i39;
        }
        int i47 = com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e;
        float f37 = fArr[i47];
        float f38 = fArr2[i47];
        if (f38 >= 0.0f) {
            f37 = f38;
        }
        int i48 = this.P;
        iArr[i47] = (int) (i48 * f37);
        int i49 = iArr2[i47];
        if (i49 >= 0 && i49 < i48 - i18) {
            iArr[i47] = i49;
        }
        int i57 = com.tencent.mapsdk.internal.eu.a.TOP.f49413e;
        float f39 = fArr[i57];
        float f47 = fArr2[i57];
        if (f47 >= 0.0f) {
            f39 = f47;
        }
        iArr[i57] = (int) (i48 * f39);
        int i58 = iArr2[i57];
        if (i58 >= 0 && i58 < i48 - i18) {
            iArr[i57] = i58;
        }
        f();
    }

    public final void i() {
        if (this.f51404d == 0 || this.P == 0) {
            return;
        }
        int measuredHeight = this.f51414o.getMeasuredHeight();
        int measuredWidth = this.f51414o.getMeasuredWidth();
        float[] fArr = this.M;
        int i17 = this.f51404d;
        if (i17 >= 1080) {
            fArr = this.O;
        } else if (i17 >= 720) {
            fArr = this.N;
        }
        int i18 = com.tencent.mapsdk.internal.eu.a.LEFT.f49413e;
        float f17 = fArr[i18];
        float[] fArr2 = this.f51403c;
        float f18 = fArr2[i18];
        if (f18 >= 0.0f) {
            f17 = f18;
        }
        int[] iArr = this.L;
        iArr[i18] = (int) (i17 * f17);
        int[] iArr2 = this.f51392J;
        int i19 = iArr2[i18];
        if (i19 >= 0 && i19 < i17 - measuredWidth) {
            iArr[i18] = i19;
        }
        int i27 = com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e;
        float f19 = fArr[i27];
        float f27 = fArr2[i27];
        if (f27 >= 0.0f) {
            f19 = f27;
        }
        iArr[i27] = (int) (i17 * f19);
        int i28 = iArr2[i27];
        if (i28 >= 0 && i28 < i17 - measuredWidth) {
            iArr[i27] = i28;
        }
        int i29 = com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e;
        float f28 = fArr[i29];
        float f29 = fArr2[i29];
        if (f29 >= 0.0f) {
            f28 = f29;
        }
        int i37 = this.P;
        iArr[i29] = (int) (i37 * f28);
        int i38 = iArr2[i29];
        if (i38 >= 0 && i38 < i37 - measuredHeight) {
            iArr[i29] = i38;
        }
        int i39 = com.tencent.mapsdk.internal.eu.a.TOP.f49413e;
        float f37 = fArr[i39];
        float f38 = fArr2[i39];
        if (f38 >= 0.0f) {
            f37 = f38;
        }
        iArr[i39] = (int) (i37 * f37);
        int i47 = iArr2[i39];
        if (i47 >= 0 && i47 < i37 - measuredHeight) {
            iArr[i39] = i47;
        }
        f();
    }

    public final android.graphics.Bitmap j() {
        android.graphics.drawable.Drawable drawable;
        android.widget.ImageView imageView = this.f51393a;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
    }

    public final void l() {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f51417r;
        if (list != null) {
            java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    public final void m() {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f51417r;
        if (list != null) {
            java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    private java.lang.String b(java.lang.String str) {
        return a(str) + ".tmp";
    }

    private int d(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.f51392J[aVar.f49413e];
    }

    public static /* synthetic */ android.view.ViewGroup k(com.tencent.mapsdk.internal.sj sjVar) {
        return sjVar.f51400aj.ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f51414o;
        if (linearLayout != null) {
            linearLayout.setVisibility(z17 ? 0 : 8);
            this.f51414o.requestLayout();
            this.f51414o.invalidate();
        }
        com.tencent.mapsdk.internal.sj.e eVar = this.Z;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
        this.f51404d = i17;
        this.P = i18;
        h();
        i();
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mapsdk.internal.qs qsVar;
        if (viewGroup == null) {
            return false;
        }
        if (this.A) {
            com.tencent.mapsdk.internal.kt.a(this.F);
            android.graphics.Bitmap a17 = com.tencent.mapsdk.internal.hl.a(this.E, this.D, this.S, this.T);
            this.F = a17;
            this.f51393a.setImageBitmap(a17);
            z17 = true;
        } else {
            z17 = false;
        }
        int i17 = this.S;
        int i18 = this.T;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        if (i17 != 0 && i18 != 0) {
            switch (com.tencent.mapsdk.internal.sj.AnonymousClass6.f51434a[this.G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.K;
                    int i19 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.bottomMargin = i19;
                    int i27 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams.leftMargin = i27;
                    this.f51398ah = (this.P - i19) - i18;
                    this.f51397ag = i27;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i28 = this.K[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.bottomMargin = i28;
                    this.f51398ah = (this.P - i28) - i18;
                    this.f51397ag = (this.f51404d - i17) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.K;
                    layoutParams.bottomMargin = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.rightMargin = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    if (com.tencent.mapsdk.internal.tf.f51581c.equals("wechat") && (qsVar = this.f51420u) != null) {
                        int i29 = layoutParams.bottomMargin + (i18 * 2);
                        qsVar.f51052f = i29;
                        com.tencent.mapsdk.internal.qq qqVar = qsVar.f51047a;
                        if (qqVar != null) {
                            qqVar.post(new com.tencent.mapsdk.internal.qs.AnonymousClass1());
                        }
                        android.view.ViewGroup ac6 = qsVar.f51051e.ac();
                        if (ac6 != null) {
                            qsVar.f51053g = ac6.getMeasuredHeight();
                        }
                        M m17 = qsVar.f51051e.e_;
                        if (m17 != 0 && ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t != null && ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q != null) {
                            qsVar.f51053g = (((int) ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q.f49468b) - i29) * 2;
                            qsVar.f();
                        }
                    }
                    this.f51398ah = (this.P - layoutParams.bottomMargin) - i18;
                    this.f51397ag = (this.f51404d - layoutParams.rightMargin) - i17;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.K;
                    int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i37;
                    int i38 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams.leftMargin = i38;
                    this.f51398ah = i37;
                    this.f51397ag = i38;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i39 = this.K[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i39;
                    this.f51398ah = i39;
                    this.f51397ag = (this.f51404d - i17) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.K;
                    int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i47;
                    int i48 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    layoutParams.rightMargin = i48;
                    this.f51398ah = i47;
                    this.f51397ag = (this.f51404d - i48) - i17;
                    break;
                default:
                    com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown position:" + this.G);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.f51394ab) < 0) {
            viewGroup.addView(this.f51394ab, layoutParams);
        } else {
            viewGroup.updateViewLayout(this.f51394ab, layoutParams);
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        android.widget.LinearLayout linearLayout = this.f51414o;
        if (linearLayout != null) {
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = this.f51414o.getMeasuredHeight();
            switch (com.tencent.mapsdk.internal.sj.AnonymousClass6.f51434a[this.H.ordinal()]) {
                case 1:
                    layoutParams2.gravity = 83;
                    int[] iArr5 = this.L;
                    int i49 = iArr5[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams2.bottomMargin = i49;
                    int i57 = iArr5[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams2.leftMargin = i57;
                    this.f51419t = (this.P - i49) - measuredHeight;
                    this.f51418s = i57;
                    break;
                case 2:
                    layoutParams2.gravity = 81;
                    int i58 = this.L[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams2.bottomMargin = i58;
                    this.f51419t = (this.P - i58) - measuredHeight;
                    this.f51418s = (this.f51404d - measuredWidth) / 2;
                    break;
                case 3:
                    layoutParams2.gravity = 85;
                    int[] iArr6 = this.L;
                    int i59 = iArr6[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams2.bottomMargin = i59;
                    int i66 = iArr6[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    layoutParams2.rightMargin = i66;
                    this.f51419t = (this.P - i59) - measuredHeight;
                    this.f51418s = (this.f51404d - i66) - measuredWidth;
                    break;
                case 4:
                    layoutParams2.gravity = 51;
                    int[] iArr7 = this.L;
                    int i67 = iArr7[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams2.topMargin = i67;
                    int i68 = iArr7[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams2.leftMargin = i68;
                    this.f51419t = i67;
                    this.f51418s = i68;
                    break;
                case 5:
                    layoutParams2.gravity = 49;
                    int i69 = this.L[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams2.topMargin = i69;
                    this.f51419t = i69;
                    this.f51418s = (this.f51404d - measuredWidth) / 2;
                    break;
                case 6:
                    layoutParams2.gravity = 53;
                    int[] iArr8 = this.L;
                    int i76 = iArr8[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams2.topMargin = i76;
                    int i77 = iArr8[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    layoutParams2.rightMargin = i77;
                    this.f51419t = i76;
                    this.f51418s = (this.f51404d - i77) - measuredWidth;
                    break;
                default:
                    com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown positionScale:" + this.H);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.f51414o) < 0) {
            viewGroup.addView(this.f51414o, layoutParams2);
        } else {
            viewGroup.updateViewLayout(this.f51414o, layoutParams2);
        }
        com.tencent.mapsdk.internal.sj.e eVar = this.Z;
        if (eVar != null) {
            this.f51414o.updateViewLayout(eVar, eVar.getLayoutParams());
            e();
        }
        this.f51393a.setVisibility(this.f51402b ? 0 : 4);
        if (this.f51417r != null) {
            this.f51394ab.requestLayout();
            this.f51414o.requestLayout();
            for (com.tencent.mapsdk.internal.sj.c cVar : this.f51417r) {
                if (this.f51424y != null && !this.A && this.f51425z == this.f51402b) {
                    android.graphics.Rect rect = this.f51424y;
                    int i78 = rect.left;
                    int i79 = this.f51397ag;
                    if (i78 == i79 && rect.top == this.f51398ah && rect.right == i79 + this.f51394ab.getMeasuredWidth() && this.f51424y.bottom == this.f51398ah + this.f51394ab.getMeasuredHeight()) {
                        cVar.b(this.f51414o, new android.graphics.Rect(this.f51418s, this.f51419t, 0, 0), this.f51412m);
                    }
                }
                this.f51425z = this.f51402b;
                int i86 = this.f51397ag;
                android.graphics.Rect rect2 = new android.graphics.Rect(i86, this.f51398ah, this.f51394ab.getMeasuredWidth() + i86, this.f51398ah + this.f51394ab.getMeasuredHeight());
                this.f51424y = rect2;
                cVar.a(this.f51394ab, rect2, this.f51402b);
                cVar.b(this.f51414o, new android.graphics.Rect(this.f51418s, this.f51419t, 0, 0), this.f51412m);
            }
        }
        this.A = !z17 && this.A;
        viewGroup.requestLayout();
        return true;
    }

    /* loaded from: classes13.dex */
    public class e extends android.view.View {

        /* renamed from: b, reason: collision with root package name */
        private static final int f51443b = -16777216;

        /* renamed from: c, reason: collision with root package name */
        private static final int f51444c = -7368817;

        /* renamed from: d, reason: collision with root package name */
        private static final int f51445d = 35;

        /* renamed from: e, reason: collision with root package name */
        private android.graphics.Paint f51447e;

        /* renamed from: f, reason: collision with root package name */
        private android.graphics.Paint f51448f;

        /* renamed from: g, reason: collision with root package name */
        private android.graphics.Paint f51449g;

        /* renamed from: h, reason: collision with root package name */
        private int f51450h;

        public e(android.content.Context context) {
            super(context);
            this.f51450h = f51443b;
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f51447e = paint;
            paint.setAntiAlias(true);
            this.f51447e.setStrokeWidth(com.tencent.mapsdk.internal.sj.this.f51409j * 1.0f);
            this.f51447e.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.f51448f = paint2;
            paint2.setTextSize(com.tencent.mapsdk.internal.sj.this.f51409j * 12.0f);
            this.f51448f.setAntiAlias(true);
            android.graphics.Paint paint3 = new android.graphics.Paint(65);
            this.f51449g = paint3;
            paint3.setStyle(android.graphics.Paint.Style.FILL);
            this.f51449g.setColor(0);
        }

        private void a(android.graphics.Canvas canvas, int i17) {
            int i18 = (int) (com.tencent.mapsdk.internal.sj.this.f51409j * 6.0f);
            int i19 = (i17 / 2) + ((int) (com.tencent.mapsdk.internal.sj.this.f51409j * 7.0f));
            float measureText = this.f51448f.measureText(com.tencent.mapsdk.internal.sj.this.f51407h);
            canvas.drawPaint(this.f51449g);
            float f17 = i18;
            float f18 = i19;
            canvas.drawText(com.tencent.mapsdk.internal.sj.this.f51407h, ((com.tencent.mapsdk.internal.sj.this.f51408i / 2.0f) + f17) - (measureText / 2.0f), f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 6.0f), this.f51448f);
            canvas.drawLine(f17, f18, com.tencent.mapsdk.internal.sj.this.f51408i + i18, f18, this.f51447e);
            canvas.drawLine(f17, f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 3.0f), f17, f18 + (com.tencent.mapsdk.internal.sj.this.f51409j * 0.5f), this.f51447e);
            canvas.drawLine(com.tencent.mapsdk.internal.sj.this.f51408i + i18, f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 3.0f), i18 + com.tencent.mapsdk.internal.sj.this.f51408i, f18 + (com.tencent.mapsdk.internal.sj.this.f51409j * 0.5f), this.f51447e);
        }

        @Override // android.view.View
        public final void draw(android.graphics.Canvas canvas) {
            super.draw(canvas);
            this.f51447e.setColor(this.f51450h);
            this.f51448f.setColor(this.f51450h);
            int height = getHeight();
            int i17 = (int) (com.tencent.mapsdk.internal.sj.this.f51409j * 6.0f);
            int i18 = (height / 2) + ((int) (com.tencent.mapsdk.internal.sj.this.f51409j * 7.0f));
            float measureText = this.f51448f.measureText(com.tencent.mapsdk.internal.sj.this.f51407h);
            canvas.drawPaint(this.f51449g);
            float f17 = i17;
            float f18 = i18;
            canvas.drawText(com.tencent.mapsdk.internal.sj.this.f51407h, ((com.tencent.mapsdk.internal.sj.this.f51408i / 2.0f) + f17) - (measureText / 2.0f), f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 6.0f), this.f51448f);
            canvas.drawLine(f17, f18, com.tencent.mapsdk.internal.sj.this.f51408i + i17, f18, this.f51447e);
            canvas.drawLine(f17, f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 3.0f), f17, f18 + (com.tencent.mapsdk.internal.sj.this.f51409j * 0.5f), this.f51447e);
            canvas.drawLine(com.tencent.mapsdk.internal.sj.this.f51408i + i17, f18 - (com.tencent.mapsdk.internal.sj.this.f51409j * 3.0f), i17 + com.tencent.mapsdk.internal.sj.this.f51408i, f18 + (com.tencent.mapsdk.internal.sj.this.f51409j * 0.5f), this.f51447e);
        }

        @Override // android.view.View
        public final void onMeasure(int i17, int i18) {
            super.onMeasure(i17, i18);
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.round(com.tencent.mapsdk.internal.sj.this.f51408i + (com.tencent.mapsdk.internal.sj.this.f51409j * 12.0f)), com.tencent.mapsdk.internal.sj.this.f51404d / 2), java.lang.Math.round(com.tencent.mapsdk.internal.sj.this.Y * com.tencent.mapsdk.internal.sj.this.f51409j));
        }

        private void a(boolean z17) {
            int i17 = z17 ? f51444c : f51443b;
            if (i17 != this.f51450h) {
                this.f51450h = i17;
            }
        }

        public static /* synthetic */ void a(com.tencent.mapsdk.internal.sj.e eVar, boolean z17) {
            int i17 = z17 ? f51444c : f51443b;
            if (i17 != eVar.f51450h) {
                eVar.f51450h = i17;
            }
        }
    }

    public final void b(com.tencent.mapsdk.internal.eu.b bVar) {
        if (this.H != bVar) {
            f();
        }
        this.H = bVar;
    }

    private void e(boolean z17) {
        this.f51413n = !z17;
        e();
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void c() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, android.graphics.Bitmap>> it = this.V.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.kt.a(it.next().getValue());
        }
        com.tencent.mapsdk.internal.kt.a(this.E);
        com.tencent.mapsdk.internal.kt.a(this.F);
        y();
    }

    private int[] d(int i17, int i18) {
        int[] iArr = new int[2];
        float f17 = this.f51416q;
        if (f17 == Float.MIN_VALUE) {
            int i19 = this.f51405e;
            f17 = i19 != -3 ? i19 != -2 ? i19 != -1 ? i19 != 1 ? 1.0f : 1.2f : 0.8333333f : 0.8f : f51389ad;
        }
        iArr[0] = (int) (i17 * f17);
        iArr[1] = (int) (i18 * f17);
        return iArr;
    }

    @Override // com.tencent.mapsdk.internal.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f51394ab, this.f51414o};
    }

    private int b(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.I[aVar.f49413e];
    }

    private void b(boolean z17) {
        this.f51402b = z17;
        android.widget.ImageView imageView = this.f51393a;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 4);
        }
    }

    private int c(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.K[aVar.f49413e];
    }

    private void c(boolean z17) {
        if (this.f51412m != z17) {
            this.f51412m = z17;
            java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f51417r;
            if (list != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b(this.f51414o, new android.graphics.Rect(this.f51418s, this.f51419t, 0, 0), this.f51412m);
                }
            }
        }
        e();
    }

    public final void b(com.tencent.mapsdk.internal.eu.a aVar, int i17) {
        if (this.f51401ak) {
            this.f51401ak = false;
        }
        this.f51392J[aVar.f49413e] = i17;
        i();
    }

    private void b(float f17) {
        if (f17 > f51390ae) {
            f17 = 1.3f;
        }
        if (f17 < f51389ad) {
            f17 = 0.7f;
        }
        this.f51405e = 0;
        this.f51416q = f17;
        h();
    }

    private void c(int i17, int i18) {
        java.lang.String str;
        float[] fArr = f51391f;
        int length = fArr.length;
        int i19 = this.f51410k - this.f51415p;
        if (i19 < 0) {
            i19 = 0;
        }
        if (i19 >= length) {
            i19 = length - 1;
        }
        float f17 = fArr[i19];
        if (this.f51406g != f17) {
            this.f51406g = f17;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.AnonymousClass5());
        }
        float f18 = i17;
        double d17 = this.f51411l;
        if (d17 != 0.0d) {
            f18 = (float) (f17 / d17);
        }
        int round = java.lang.Math.round(f18);
        this.f51408i = round;
        if (round > i18) {
            this.f51408i = i18;
        } else if (round < i17) {
            this.f51408i = i17;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f51407h = ((int) f17) + str;
    }

    public final void a(final boolean z17) {
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sj.4
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.sj.this.Z == null) {
                    return;
                }
                com.tencent.mapsdk.internal.sj.e.a(com.tencent.mapsdk.internal.sj.this.Z, z17);
            }
        });
    }

    public final void a(com.tencent.mapsdk.internal.gb gbVar, boolean z17) {
        if (this.E == null || gbVar.a(this.B) || this.C != z17) {
            this.B = gbVar.clone();
            this.C = z17;
            int i17 = (int) gbVar.f49562c;
            if (i17 > 18) {
                i17 = 18;
            }
            com.tencent.mapsdk.internal.sn snVar = null;
            for (com.tencent.mapsdk.internal.sn snVar2 : this.U) {
                if (i17 >= snVar2.f51489a && i17 <= snVar2.f51490b) {
                    java.lang.Object[] a17 = snVar2.a(gbVar, z17);
                    if (a17 != null) {
                        java.lang.String str = (java.lang.String) a17[0];
                        java.lang.String str2 = (java.lang.String) a17[1];
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17[2];
                        if (bitmap != null) {
                            a(bitmap);
                            this.X = str;
                        } else if (!com.tencent.mapsdk.internal.hr.a(str, this.X)) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + str + "] changed! old=" + this.X + "|dark=" + z17 + "|level=" + i17);
                            android.graphics.Bitmap bitmap2 = this.V.get(str);
                            if (bitmap2 != null) {
                                if (!bitmap2.isRecycled()) {
                                    a(bitmap2);
                                    this.X = str;
                                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + str + "] set from mem cache");
                                    return;
                                }
                                this.V.remove(str);
                            }
                            android.graphics.Bitmap c17 = c(str);
                            if (c17 != null) {
                                this.X = str;
                                this.V.put(str, c17);
                                a(c17);
                                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + str + "] set from file cache");
                                return;
                            }
                            this.X = null;
                            a(str2, str);
                        }
                        snVar = snVar2;
                        break;
                    }
                    snVar = snVar2;
                }
            }
            if (snVar == null) {
                android.graphics.Bitmap bitmap3 = this.f51423x;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    this.f51423x = com.tencent.mapsdk.internal.hl.b(this.D, "default_tencent_map_logo.png");
                }
                android.graphics.Bitmap bitmap4 = this.f51423x;
                if (bitmap4 != null) {
                    a(bitmap4);
                }
            }
        }
    }

    private void a(java.lang.String str, java.lang.String str2) {
        if (this.W.contains(str2)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + str2 + "] is downloading.");
            return;
        }
        this.W.add(str2);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50222w, "Logo[" + str2 + "] start download..");
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.sj.a(this, str, str2)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.sj.b(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        java.lang.String p17 = p();
        com.tencent.mapsdk.internal.kt.a(p17);
        return p17 + "/" + str;
    }

    public final void a(java.util.List<com.tencent.mapsdk.internal.ss> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.U.clear();
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mapsdk.internal.ss ssVar = list.get(i17);
            int[] iArr = ssVar.f51530a;
            this.U.add(new com.tencent.mapsdk.internal.sn(iArr[0], iArr[1], ssVar.f51531b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.graphics.Bitmap bitmap) {
        try {
            this.E = bitmap;
            if (bitmap != null) {
                this.Q = bitmap.getWidth();
                this.R = this.E.getHeight();
                this.A = true;
            }
            h();
            i();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
        if (this.G != bVar) {
            f();
        }
        this.G = bVar;
    }

    private void a(com.tencent.mapsdk.internal.qs qsVar) {
        this.f51420u = qsVar;
    }

    private android.widget.FrameLayout.LayoutParams a(int i17, int i18) {
        com.tencent.mapsdk.internal.qs qsVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        if (i17 != 0 && i18 != 0) {
            switch (com.tencent.mapsdk.internal.sj.AnonymousClass6.f51434a[this.G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.K;
                    int i19 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.bottomMargin = i19;
                    int i27 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams.leftMargin = i27;
                    this.f51398ah = (this.P - i19) - i18;
                    this.f51397ag = i27;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i28 = this.K[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.bottomMargin = i28;
                    this.f51398ah = (this.P - i28) - i18;
                    this.f51397ag = (this.f51404d - i17) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.K;
                    layoutParams.bottomMargin = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f49413e];
                    layoutParams.rightMargin = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    if (com.tencent.mapsdk.internal.tf.f51581c.equals("wechat") && (qsVar = this.f51420u) != null) {
                        int i29 = layoutParams.bottomMargin + (i18 * 2);
                        qsVar.f51052f = i29;
                        com.tencent.mapsdk.internal.qq qqVar = qsVar.f51047a;
                        if (qqVar != null) {
                            qqVar.post(new com.tencent.mapsdk.internal.qs.AnonymousClass1());
                        }
                        android.view.ViewGroup ac6 = qsVar.f51051e.ac();
                        if (ac6 != null) {
                            qsVar.f51053g = ac6.getMeasuredHeight();
                        }
                        M m17 = qsVar.f51051e.e_;
                        if (m17 != 0 && ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t != null && ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q != null) {
                            qsVar.f51053g = (((int) ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50520t.f52424q.f49468b) - i29) * 2;
                            qsVar.f();
                        }
                    }
                    this.f51398ah = (this.P - layoutParams.bottomMargin) - i18;
                    this.f51397ag = (this.f51404d - layoutParams.rightMargin) - i17;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.K;
                    int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i37;
                    int i38 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f49413e];
                    layoutParams.leftMargin = i38;
                    this.f51398ah = i37;
                    this.f51397ag = i38;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i39 = this.K[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i39;
                    this.f51398ah = i39;
                    this.f51397ag = (this.f51404d - i17) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.K;
                    int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f49413e];
                    layoutParams.topMargin = i47;
                    int i48 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f49413e];
                    layoutParams.rightMargin = i48;
                    this.f51398ah = i47;
                    this.f51397ag = (this.f51404d - i48) - i17;
                    break;
                default:
                    com.tencent.mapsdk.core.utils.log.LogUtil.d("Unknown position:" + this.G);
                    break;
            }
        }
        return layoutParams;
    }

    @Override // com.tencent.mapsdk.internal.es, com.tencent.mapsdk.internal.eu
    public final android.graphics.Rect a() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.LinearLayout linearLayout = this.f51394ab;
        if (linearLayout != null) {
            rect.left = linearLayout.getLeft();
            rect.bottom = this.f51394ab.getBottom();
            rect.right = this.f51394ab.getRight();
            rect.top = this.f51394ab.getTop();
        }
        return rect;
    }

    private void a(com.tencent.mapsdk.internal.eu.a aVar, float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        this.f51403c[aVar.f49413e] = f17;
        h();
    }

    private float a(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.f51403c[aVar.f49413e];
    }

    public final void a(com.tencent.mapsdk.internal.eu.a aVar, int i17) {
        this.I[aVar.f49413e] = i17;
    }

    private void a(int i17, double d17) {
        java.lang.String str;
        this.f51410k = i17;
        this.f51411l = d17;
        int width = this.f51393a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) java.lang.Math.ceil(width / 4.0f);
        int ceil2 = (int) (java.lang.Math.ceil((this.f51404d * 3.0f) / 8.0f) - (this.f51409j * 6.0f));
        float[] fArr = f51391f;
        int length = fArr.length;
        int i18 = this.f51410k - this.f51415p;
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 >= length) {
            i18 = length - 1;
        }
        float f17 = fArr[i18];
        if (this.f51406g != f17) {
            this.f51406g = f17;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.AnonymousClass5());
        }
        float f18 = ceil;
        double d18 = this.f51411l;
        if (d18 != 0.0d) {
            f18 = (float) (f17 / d18);
        }
        int round = java.lang.Math.round(f18);
        this.f51408i = round;
        if (round > ceil2) {
            this.f51408i = ceil2;
        } else if (round < ceil) {
            this.f51408i = ceil;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f51407h = ((int) f17) + str;
        f();
    }

    private void a(float f17) {
        if (this.f51406g != f17) {
            this.f51406g = f17;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.AnonymousClass5());
        }
    }

    @java.lang.Deprecated
    private void a(int i17) {
        this.f51405e = i17;
        this.f51416q = Float.MIN_VALUE;
        h();
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar) {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f51417r;
        if (list == null || cVar == null) {
            return;
        }
        list.add(cVar);
    }

    public static /* synthetic */ java.lang.String a(com.tencent.mapsdk.internal.sj sjVar, java.lang.String str) {
        return sjVar.a(str) + ".tmp";
    }
}
