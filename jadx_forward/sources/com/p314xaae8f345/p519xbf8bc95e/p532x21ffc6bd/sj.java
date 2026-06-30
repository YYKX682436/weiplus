package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sj extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es {

    /* renamed from: aa, reason: collision with root package name */
    private static final int f132921aa = 6;

    /* renamed from: ad, reason: collision with root package name */
    private static final float f132922ad = 0.7f;

    /* renamed from: ae, reason: collision with root package name */
    private static final float f132923ae = 1.3f;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f132924f = {1000000.0f, 500000.0f, 200000.0f, 100000.0f, 50000.0f, 25000.0f, 20000.0f, 10000.0f, 5000.0f, 2000.0f, 1000.0f, 500.0f, 200.0f, 100.0f, 50.0f, 20.0f, 10.0f, 5.0f, 2.0f, 1.0f};
    private volatile boolean A;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb B;
    private boolean C;
    private android.content.Context D;
    private android.graphics.Bitmap E;
    private android.graphics.Bitmap F;
    private com.tencent.mapsdk.internal.sj.e Z;

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f132926a;

    /* renamed from: ab, reason: collision with root package name */
    private android.widget.LinearLayout f132927ab;

    /* renamed from: af, reason: collision with root package name */
    private android.view.animation.Animation f132929af;

    /* renamed from: ai, reason: collision with root package name */
    private com.tencent.mapsdk.internal.kp.a f132932ai;

    /* renamed from: aj, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132933aj;

    /* renamed from: j, reason: collision with root package name */
    public float f132942j;

    /* renamed from: k, reason: collision with root package name */
    public int f132943k;

    /* renamed from: l, reason: collision with root package name */
    public double f132944l;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f132947o;

    /* renamed from: p, reason: collision with root package name */
    public final int f132948p;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs f132953u;

    /* renamed from: x, reason: collision with root package name */
    private android.graphics.Bitmap f132956x;

    /* renamed from: y, reason: collision with root package name */
    private android.graphics.Rect f132957y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f132958z;

    /* renamed from: v, reason: collision with root package name */
    private final int f132954v = 500;

    /* renamed from: w, reason: collision with root package name */
    private final int f132955w = 1000;
    private com.tencent.mapsdk.internal.eu.b G = com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM;
    private com.tencent.mapsdk.internal.eu.b H = com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM;

    /* renamed from: b, reason: collision with root package name */
    public boolean f132935b = true;

    /* renamed from: c, reason: collision with root package name */
    public float[] f132936c = {-1.0f, -1.0f, -1.0f, -1.0f};
    private int[] I = {-1, -1, -1, -1};

    /* renamed from: J, reason: collision with root package name */
    private int[] f132925J = {-1, -1, -1, -1};
    private int[] K = new int[com.tencent.mapsdk.internal.eu.a.m36713xcee59d22().length];
    private int[] L = new int[com.tencent.mapsdk.internal.eu.a.m36713xcee59d22().length];
    private float[] M = {0.02f, 0.02f, 0.012f, 0.012f};
    private float[] N = {0.022f, 0.022f, 0.0125f, 0.0125f};
    private float[] O = {0.0185f, 0.0185f, 0.0104f, 0.0104f};

    /* renamed from: d, reason: collision with root package name */
    public int f132937d = 0;
    private int P = 0;
    private int Q = 0;
    private int R = 0;
    private int S = 0;
    private int T = 0;
    private final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sn> U = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.graphics.Bitmap> V = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.List<java.lang.String> W = new java.util.concurrent.CopyOnWriteArrayList();
    private java.lang.String X = null;

    /* renamed from: e, reason: collision with root package name */
    public int f132938e = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f132939g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f132940h = "50米";
    private int Y = 26;

    /* renamed from: i, reason: collision with root package name */
    public int f132941i = 109;

    /* renamed from: m, reason: collision with root package name */
    public boolean f132945m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f132946n = false;

    /* renamed from: ac, reason: collision with root package name */
    private final int f132928ac = 18;

    /* renamed from: q, reason: collision with root package name */
    public float f132949q = Float.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.sj.c> f132950r = new java.util.ArrayList();

    /* renamed from: ag, reason: collision with root package name */
    private int f132930ag = -1;

    /* renamed from: ah, reason: collision with root package name */
    private int f132931ah = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f132951s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f132952t = -1;

    /* renamed from: ak, reason: collision with root package name */
    private boolean f132934ak = true;

    /* renamed from: com.tencent.mapsdk.internal.sj$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements android.view.animation.Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(android.view.animation.Animation animation) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.d(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(android.view.animation.Animation animation) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.d(true);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sj$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements java.lang.Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132933aj;
            float f17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132939g;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener = trVar.A;
            if (onScaleViewChangedListener != null) {
                onScaleViewChangedListener.mo36381x92aceca4(f17);
            }
            trVar.f133732n.f130315j.mo36381x92aceca4(f17);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sj$6, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132967a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.m36716xcee59d22().length];
            f132967a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f132967a[com.tencent.mapsdk.internal.eu.b.CENTER_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f132967a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f132967a[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f132967a[com.tencent.mapsdk.internal.eu.b.CENTER_TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f132967a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.ko.g<android.graphics.Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> f132968a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f132969b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f132970c;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar, java.lang.String str, java.lang.String str2) {
            this.f132968a = new java.lang.ref.WeakReference<>(sjVar);
            this.f132969b = str;
            this.f132970c = str2;
        }

        private android.graphics.Bitmap a() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> weakReference = this.f132968a;
            android.graphics.Bitmap bitmap = null;
            if (weakReference != null && (sjVar = weakReference.get()) != null) {
                java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.a(sjVar, this.f132970c));
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] request url[" + this.f132969b + "]...");
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] save to[" + file + "]...");
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35999x798ad123 = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(this.f132969b).m35999x798ad123(file);
                if (m35999x798ad123 != null && m35999x798ad123.mo36017xd4418ac9()) {
                    byte[] bArr = m35999x798ad123.f16977x2eefaa;
                    int length = bArr.length;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        sjVar.V.put(this.f132970c, bitmap);
                    }
                }
            }
            return bitmap;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> weakReference = this.f132968a;
            android.graphics.Bitmap bitmap = null;
            if (weakReference != null && (sjVar = weakReference.get()) != null) {
                java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.a(sjVar, this.f132970c));
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] request url[" + this.f132969b + "]...");
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] save to[" + file + "]...");
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35999x798ad123 = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(this.f132969b).m35999x798ad123(file);
                if (m35999x798ad123 != null && m35999x798ad123.mo36017xd4418ac9()) {
                    byte[] bArr = m35999x798ad123.f16977x2eefaa;
                    int length = bArr.length;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132970c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        sjVar.V.put(this.f132970c, bitmap);
                    }
                }
            }
            return bitmap;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.mapsdk.internal.ko.a<android.graphics.Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> f132971a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f132972b;

        public b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar, java.lang.String str) {
            this.f132971a = new java.lang.ref.WeakReference<>(sjVar);
            this.f132972b = str;
        }

        private void a(android.graphics.Bitmap bitmap) {
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> weakReference;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
            if (bitmap == null || (weakReference = this.f132971a) == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.a(sjVar, this.f132972b)), new java.io.File(sjVar.a(this.f132972b)));
            if (this.f132972b.equals(sjVar.X) || android.text.TextUtils.isEmpty(sjVar.X)) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132972b + "] set from net");
                sjVar.a(bitmap);
            }
            sjVar.W.remove(this.f132972b);
        }

        @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
        /* renamed from: callback */
        public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> weakReference;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap == null || (weakReference = this.f132971a) == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.a(sjVar, this.f132972b)), new java.io.File(sjVar.a(this.f132972b)));
            if (this.f132972b.equals(sjVar.X) || android.text.TextUtils.isEmpty(sjVar.X)) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + this.f132972b + "] set from net");
                sjVar.a(bitmap);
            }
            sjVar.W.remove(this.f132972b);
        }
    }

    /* loaded from: classes13.dex */
    public interface c {
        void a(android.view.View view, android.graphics.Rect rect, boolean z17);

        void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar);

        void b(android.view.View view, android.graphics.Rect rect, boolean z17);

        void c();
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f132973a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f132974b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f132975c = {1, 2};

        private d(java.lang.String str, int i17) {
        }

        private static int[] a() {
            return (int[]) f132975c.clone();
        }
    }

    /* loaded from: classes13.dex */
    public static class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> f132984a;

        public f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar) {
            this.f132984a = new java.lang.ref.WeakReference<>(sjVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj> weakReference = this.f132984a;
            if (weakReference == null || (sjVar = weakReference.get()) == null) {
                return;
            }
            sjVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.k(sjVar), (android.os.Bundle) null);
        }
    }

    public sj(android.content.Context context, final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, int i17) {
        this.f132942j = 1.0f;
        this.D = context;
        this.f132933aj = trVar;
        this.f132948p = i17;
        this.f132942j = context.getResources().getDisplayMetrics().density;
        this.f132926a = new android.widget.ImageView(context);
        this.Z = new com.tencent.mapsdk.internal.sj.e(this.D);
        if (this.f132942j <= 0.0f) {
            this.f132942j = 1.0f;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.D);
        this.f132927ab = linearLayout;
        linearLayout.setOrientation(1);
        this.f132927ab.setGravity(16);
        this.f132927ab.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.sj.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132932ai == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this;
                    sjVar.f132932ai = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kp.a(sjVar.D, null, " ", 0);
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(trVar.f130551f).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.D, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132932ai);
            }
        });
        this.f132927ab.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mapsdk.internal.sj.2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.a(trVar.d_);
            }
        });
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.D);
        this.f132947o = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f132947o.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        this.f132947o.addView(this.Z, layoutParams);
        this.f132947o.setVisibility(8);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f132929af = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f132929af.setStartOffset(500L);
        this.f132929af.setAnimationListener(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass3());
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        this.f132927ab.addView(this.f132926a, layoutParams2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = trVar.f133728j.f133047b;
        if (soVar != null) {
            a(soVar.c());
        }
    }

    private android.view.ViewGroup o() {
        return this.f132933aj.ac();
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
        android.widget.LinearLayout linearLayout = this.f132947o;
        if (linearLayout == null) {
            return layoutParams;
        }
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = this.f132947o.getMeasuredHeight();
        switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass6.f132967a[this.H.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                int[] iArr = this.L;
                int i17 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                layoutParams.bottomMargin = i17;
                int i18 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                layoutParams.leftMargin = i18;
                this.f132952t = (this.P - i17) - measuredHeight;
                this.f132951s = i18;
                return layoutParams;
            case 2:
                layoutParams.gravity = 81;
                int i19 = this.L[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                layoutParams.bottomMargin = i19;
                this.f132952t = (this.P - i19) - measuredHeight;
                this.f132951s = (this.f132937d - measuredWidth) / 2;
                return layoutParams;
            case 3:
                layoutParams.gravity = 85;
                int[] iArr2 = this.L;
                int i27 = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                layoutParams.bottomMargin = i27;
                int i28 = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                layoutParams.rightMargin = i28;
                this.f132952t = (this.P - i27) - measuredHeight;
                this.f132951s = (this.f132937d - i28) - measuredWidth;
                return layoutParams;
            case 4:
                layoutParams.gravity = 51;
                int[] iArr3 = this.L;
                int i29 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                layoutParams.topMargin = i29;
                int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                layoutParams.leftMargin = i37;
                this.f132952t = i29;
                this.f132951s = i37;
                return layoutParams;
            case 5:
                layoutParams.gravity = 49;
                int i38 = this.L[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                layoutParams.topMargin = i38;
                this.f132952t = i38;
                this.f132951s = (this.f132937d - measuredWidth) / 2;
                return layoutParams;
            case 6:
                layoutParams.gravity = 53;
                int[] iArr4 = this.L;
                int i39 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                layoutParams.topMargin = i39;
                int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                layoutParams.rightMargin = i47;
                this.f132952t = i39;
                this.f132951s = (this.f132937d - i47) - measuredWidth;
                return layoutParams;
            default:
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown positionScale:" + this.H);
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
        return this.f132945m;
    }

    private void x() {
        y();
        this.f132947o.startAnimation(this.f132929af);
    }

    private void y() {
        android.widget.LinearLayout linearLayout = this.f132947o;
        if (linearLayout == null || this.f132929af == null) {
            return;
        }
        linearLayout.clearAnimation();
        this.f132929af.reset();
    }

    private void z() {
        java.lang.String str;
        int width = this.f132926a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) java.lang.Math.ceil(width / 4.0f);
        int ceil2 = (int) (java.lang.Math.ceil((this.f132937d * 3.0f) / 8.0f) - (this.f132942j * 6.0f));
        float[] fArr = f132924f;
        int length = fArr.length;
        int i17 = this.f132943k - this.f132948p;
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 >= length) {
            i17 = length - 1;
        }
        float f17 = fArr[i17];
        if (this.f132939g != f17) {
            this.f132939g = f17;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass5());
        }
        float f18 = ceil;
        double d17 = this.f132944l;
        if (d17 != 0.0d) {
            f18 = (float) (f17 / d17);
        }
        int round = java.lang.Math.round(f18);
        this.f132941i = round;
        if (round > ceil2) {
            this.f132941i = ceil2;
        } else if (round < ceil) {
            this.f132941i = ceil;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f132940h = ((int) f17) + str;
    }

    public final boolean k() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.X) || this.X.contains("tencent") || this.X.contains(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.f133009d);
    }

    private android.graphics.Bitmap c(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        try {
            java.io.File file = new java.io.File(a(str));
            if (!file.exists()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) null);
                return null;
            }
            fileInputStream = new java.io.FileInputStream(file);
            try {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                return decodeStream;
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            fileInputStream = null;
        }
    }

    private void n() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f132929af = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f132929af.setStartOffset(500L);
        this.f132929af.setAnimationListener(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass3());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return this.G;
    }

    public final void e() {
        if (!this.f132945m) {
            d(false);
        } else if (this.f132946n) {
            d(true);
            y();
        } else {
            d(true);
            x();
        }
    }

    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.tencent.mapsdk.internal.sj.f(this));
    }

    public final void g() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "clearLogoCache..");
        this.V.clear();
        this.W.clear();
        try {
            java.io.File file = new java.io.File(p());
            if (file.exists()) {
                java.io.File file2 = new java.io.File(q());
                if (file.renameTo(file2)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(file2.getAbsolutePath());
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(file.getAbsolutePath());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void h() {
        if (this.f132937d == 0 || this.P == 0) {
            return;
        }
        float f17 = this.Q;
        float f18 = this.f132942j;
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
        int i28 = this.f132937d;
        if (i28 >= 1080) {
            fArr = this.O;
        } else if (i28 >= 720) {
            fArr = this.N;
        }
        int i29 = com.tencent.mapsdk.internal.eu.a.LEFT.f130946e;
        float f19 = fArr[i29];
        float[] fArr2 = this.f132936c;
        float f27 = fArr2[i29];
        if (f27 >= 0.0f) {
            f19 = f27;
        }
        int[] iArr = this.K;
        iArr[i29] = (int) (i28 * f19);
        if (this.f132934ak) {
            this.f132925J[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e] = i18;
        }
        int[] iArr2 = this.I;
        int i37 = iArr2[i29];
        if (i37 >= 0 && i37 < i28 - i17) {
            iArr[i29] = i37;
        }
        int i38 = com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e;
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
        int i47 = com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e;
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
        int i57 = com.tencent.mapsdk.internal.eu.a.TOP.f130946e;
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
        if (this.f132937d == 0 || this.P == 0) {
            return;
        }
        int measuredHeight = this.f132947o.getMeasuredHeight();
        int measuredWidth = this.f132947o.getMeasuredWidth();
        float[] fArr = this.M;
        int i17 = this.f132937d;
        if (i17 >= 1080) {
            fArr = this.O;
        } else if (i17 >= 720) {
            fArr = this.N;
        }
        int i18 = com.tencent.mapsdk.internal.eu.a.LEFT.f130946e;
        float f17 = fArr[i18];
        float[] fArr2 = this.f132936c;
        float f18 = fArr2[i18];
        if (f18 >= 0.0f) {
            f17 = f18;
        }
        int[] iArr = this.L;
        iArr[i18] = (int) (i17 * f17);
        int[] iArr2 = this.f132925J;
        int i19 = iArr2[i18];
        if (i19 >= 0 && i19 < i17 - measuredWidth) {
            iArr[i18] = i19;
        }
        int i27 = com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e;
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
        int i29 = com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e;
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
        int i39 = com.tencent.mapsdk.internal.eu.a.TOP.f130946e;
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
        android.widget.ImageView imageView = this.f132926a;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
    }

    public final void l() {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f132950r;
        if (list != null) {
            java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    public final void m() {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f132950r;
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
        return this.f132925J[aVar.f130946e];
    }

    public static /* synthetic */ android.view.ViewGroup k(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar) {
        return sjVar.f132933aj.ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f132947o;
        if (linearLayout != null) {
            linearLayout.setVisibility(z17 ? 0 : 8);
            this.f132947o.requestLayout();
            this.f132947o.invalidate();
        }
        com.tencent.mapsdk.internal.sj.e eVar = this.Z;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
        this.f132937d = i17;
        this.P = i18;
        h();
        i();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar;
        if (viewGroup == null) {
            return false;
        }
        if (this.A) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.F);
            android.graphics.Bitmap a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.E, this.D, this.S, this.T);
            this.F = a17;
            this.f132926a.setImageBitmap(a17);
            z17 = true;
        } else {
            z17 = false;
        }
        int i17 = this.S;
        int i18 = this.T;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        if (i17 != 0 && i18 != 0) {
            switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass6.f132967a[this.G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.K;
                    int i19 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.bottomMargin = i19;
                    int i27 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams.leftMargin = i27;
                    this.f132931ah = (this.P - i19) - i18;
                    this.f132930ag = i27;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i28 = this.K[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.bottomMargin = i28;
                    this.f132931ah = (this.P - i28) - i18;
                    this.f132930ag = (this.f132937d - i17) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.K;
                    layoutParams.bottomMargin = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.rightMargin = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c.equals("wechat") && (qsVar = this.f132953u) != null) {
                        int i29 = layoutParams.bottomMargin + (i18 * 2);
                        qsVar.f132585f = i29;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = qsVar.f132580a;
                        if (qqVar != null) {
                            qqVar.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.AnonymousClass1());
                        }
                        android.view.ViewGroup ac6 = qsVar.f132584e.ac();
                        if (ac6 != null) {
                            qsVar.f132586g = ac6.getMeasuredHeight();
                        }
                        M m17 = qsVar.f132584e.e_;
                        if (m17 != 0 && ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t != null && ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q != null) {
                            qsVar.f132586g = (((int) ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q.f131001b) - i29) * 2;
                            qsVar.f();
                        }
                    }
                    this.f132931ah = (this.P - layoutParams.bottomMargin) - i18;
                    this.f132930ag = (this.f132937d - layoutParams.rightMargin) - i17;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.K;
                    int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i37;
                    int i38 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams.leftMargin = i38;
                    this.f132931ah = i37;
                    this.f132930ag = i38;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i39 = this.K[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i39;
                    this.f132931ah = i39;
                    this.f132930ag = (this.f132937d - i17) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.K;
                    int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i47;
                    int i48 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    layoutParams.rightMargin = i48;
                    this.f132931ah = i47;
                    this.f132930ag = (this.f132937d - i48) - i17;
                    break;
                default:
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown position:" + this.G);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.f132927ab) < 0) {
            viewGroup.addView(this.f132927ab, layoutParams);
        } else {
            viewGroup.updateViewLayout(this.f132927ab, layoutParams);
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        android.widget.LinearLayout linearLayout = this.f132947o;
        if (linearLayout != null) {
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = this.f132947o.getMeasuredHeight();
            switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass6.f132967a[this.H.ordinal()]) {
                case 1:
                    layoutParams2.gravity = 83;
                    int[] iArr5 = this.L;
                    int i49 = iArr5[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams2.bottomMargin = i49;
                    int i57 = iArr5[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams2.leftMargin = i57;
                    this.f132952t = (this.P - i49) - measuredHeight;
                    this.f132951s = i57;
                    break;
                case 2:
                    layoutParams2.gravity = 81;
                    int i58 = this.L[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams2.bottomMargin = i58;
                    this.f132952t = (this.P - i58) - measuredHeight;
                    this.f132951s = (this.f132937d - measuredWidth) / 2;
                    break;
                case 3:
                    layoutParams2.gravity = 85;
                    int[] iArr6 = this.L;
                    int i59 = iArr6[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams2.bottomMargin = i59;
                    int i66 = iArr6[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    layoutParams2.rightMargin = i66;
                    this.f132952t = (this.P - i59) - measuredHeight;
                    this.f132951s = (this.f132937d - i66) - measuredWidth;
                    break;
                case 4:
                    layoutParams2.gravity = 51;
                    int[] iArr7 = this.L;
                    int i67 = iArr7[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams2.topMargin = i67;
                    int i68 = iArr7[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams2.leftMargin = i68;
                    this.f132952t = i67;
                    this.f132951s = i68;
                    break;
                case 5:
                    layoutParams2.gravity = 49;
                    int i69 = this.L[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams2.topMargin = i69;
                    this.f132952t = i69;
                    this.f132951s = (this.f132937d - measuredWidth) / 2;
                    break;
                case 6:
                    layoutParams2.gravity = 53;
                    int[] iArr8 = this.L;
                    int i76 = iArr8[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams2.topMargin = i76;
                    int i77 = iArr8[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    layoutParams2.rightMargin = i77;
                    this.f132952t = i76;
                    this.f132951s = (this.f132937d - i77) - measuredWidth;
                    break;
                default:
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown positionScale:" + this.H);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.f132947o) < 0) {
            viewGroup.addView(this.f132947o, layoutParams2);
        } else {
            viewGroup.updateViewLayout(this.f132947o, layoutParams2);
        }
        com.tencent.mapsdk.internal.sj.e eVar = this.Z;
        if (eVar != null) {
            this.f132947o.updateViewLayout(eVar, eVar.getLayoutParams());
            e();
        }
        this.f132926a.setVisibility(this.f132935b ? 0 : 4);
        if (this.f132950r != null) {
            this.f132927ab.requestLayout();
            this.f132947o.requestLayout();
            for (com.tencent.mapsdk.internal.sj.c cVar : this.f132950r) {
                if (this.f132957y != null && !this.A && this.f132958z == this.f132935b) {
                    android.graphics.Rect rect = this.f132957y;
                    int i78 = rect.left;
                    int i79 = this.f132930ag;
                    if (i78 == i79 && rect.top == this.f132931ah && rect.right == i79 + this.f132927ab.getMeasuredWidth() && this.f132957y.bottom == this.f132931ah + this.f132927ab.getMeasuredHeight()) {
                        cVar.b(this.f132947o, new android.graphics.Rect(this.f132951s, this.f132952t, 0, 0), this.f132945m);
                    }
                }
                this.f132958z = this.f132935b;
                int i86 = this.f132930ag;
                android.graphics.Rect rect2 = new android.graphics.Rect(i86, this.f132931ah, this.f132927ab.getMeasuredWidth() + i86, this.f132931ah + this.f132927ab.getMeasuredHeight());
                this.f132957y = rect2;
                cVar.a(this.f132927ab, rect2, this.f132935b);
                cVar.b(this.f132947o, new android.graphics.Rect(this.f132951s, this.f132952t, 0, 0), this.f132945m);
            }
        }
        this.A = !z17 && this.A;
        viewGroup.requestLayout();
        return true;
    }

    /* loaded from: classes13.dex */
    public class e extends android.view.View {

        /* renamed from: b, reason: collision with root package name */
        private static final int f132976b = -16777216;

        /* renamed from: c, reason: collision with root package name */
        private static final int f132977c = -7368817;

        /* renamed from: d, reason: collision with root package name */
        private static final int f132978d = 35;

        /* renamed from: e, reason: collision with root package name */
        private android.graphics.Paint f132980e;

        /* renamed from: f, reason: collision with root package name */
        private android.graphics.Paint f132981f;

        /* renamed from: g, reason: collision with root package name */
        private android.graphics.Paint f132982g;

        /* renamed from: h, reason: collision with root package name */
        private int f132983h;

        public e(android.content.Context context) {
            super(context);
            this.f132983h = f132976b;
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f132980e = paint;
            paint.setAntiAlias(true);
            this.f132980e.setStrokeWidth(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 1.0f);
            this.f132980e.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.f132981f = paint2;
            paint2.setTextSize(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 12.0f);
            this.f132981f.setAntiAlias(true);
            android.graphics.Paint paint3 = new android.graphics.Paint(65);
            this.f132982g = paint3;
            paint3.setStyle(android.graphics.Paint.Style.FILL);
            this.f132982g.setColor(0);
        }

        private void a(android.graphics.Canvas canvas, int i17) {
            int i18 = (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 6.0f);
            int i19 = (i17 / 2) + ((int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 7.0f));
            float measureText = this.f132981f.measureText(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132940h);
            canvas.drawPaint(this.f132982g);
            float f17 = i18;
            float f18 = i19;
            canvas.drawText(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132940h, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i / 2.0f) + f17) - (measureText / 2.0f), f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 6.0f), this.f132981f);
            canvas.drawLine(f17, f18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i + i18, f18, this.f132980e);
            canvas.drawLine(f17, f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 3.0f), f17, f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 0.5f), this.f132980e);
            canvas.drawLine(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i + i18, f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 3.0f), i18 + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i, f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 0.5f), this.f132980e);
        }

        @Override // android.view.View
        public final void draw(android.graphics.Canvas canvas) {
            super.draw(canvas);
            this.f132980e.setColor(this.f132983h);
            this.f132981f.setColor(this.f132983h);
            int height = getHeight();
            int i17 = (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 6.0f);
            int i18 = (height / 2) + ((int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 7.0f));
            float measureText = this.f132981f.measureText(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132940h);
            canvas.drawPaint(this.f132982g);
            float f17 = i17;
            float f18 = i18;
            canvas.drawText(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132940h, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i / 2.0f) + f17) - (measureText / 2.0f), f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 6.0f), this.f132981f);
            canvas.drawLine(f17, f18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i + i17, f18, this.f132980e);
            canvas.drawLine(f17, f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 3.0f), f17, f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 0.5f), this.f132980e);
            canvas.drawLine(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i + i17, f18 - (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 3.0f), i17 + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i, f18 + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 0.5f), this.f132980e);
        }

        @Override // android.view.View
        public final void onMeasure(int i17, int i18) {
            super.onMeasure(i17, i18);
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.round(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132941i + (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j * 12.0f)), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132937d / 2), java.lang.Math.round(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.Y * com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.f132942j));
        }

        private void a(boolean z17) {
            int i17 = z17 ? f132977c : f132976b;
            if (i17 != this.f132983h) {
                this.f132983h = i17;
            }
        }

        public static /* synthetic */ void a(com.tencent.mapsdk.internal.sj.e eVar, boolean z17) {
            int i17 = z17 ? f132977c : f132976b;
            if (i17 != eVar.f132983h) {
                eVar.f132983h = i17;
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
        this.f132946n = !z17;
        e();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void c() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, android.graphics.Bitmap>> it = this.V.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(it.next().getValue());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.E);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.F);
        y();
    }

    private int[] d(int i17, int i18) {
        int[] iArr = new int[2];
        float f17 = this.f132949q;
        if (f17 == Float.MIN_VALUE) {
            int i19 = this.f132938e;
            f17 = i19 != -3 ? i19 != -2 ? i19 != -1 ? i19 != 1 ? 1.0f : 1.2f : 0.8333333f : 0.8f : f132922ad;
        }
        iArr[0] = (int) (i17 * f17);
        iArr[1] = (int) (i18 * f17);
        return iArr;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es
    public final android.view.View[] b() {
        return new android.view.View[]{this.f132927ab, this.f132947o};
    }

    private int b(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.I[aVar.f130946e];
    }

    private void b(boolean z17) {
        this.f132935b = z17;
        android.widget.ImageView imageView = this.f132926a;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 4);
        }
    }

    private int c(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.K[aVar.f130946e];
    }

    private void c(boolean z17) {
        if (this.f132945m != z17) {
            this.f132945m = z17;
            java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f132950r;
            if (list != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b(this.f132947o, new android.graphics.Rect(this.f132951s, this.f132952t, 0, 0), this.f132945m);
                }
            }
        }
        e();
    }

    public final void b(com.tencent.mapsdk.internal.eu.a aVar, int i17) {
        if (this.f132934ak) {
            this.f132934ak = false;
        }
        this.f132925J[aVar.f130946e] = i17;
        i();
    }

    private void b(float f17) {
        if (f17 > f132923ae) {
            f17 = 1.3f;
        }
        if (f17 < f132922ad) {
            f17 = 0.7f;
        }
        this.f132938e = 0;
        this.f132949q = f17;
        h();
    }

    private void c(int i17, int i18) {
        java.lang.String str;
        float[] fArr = f132924f;
        int length = fArr.length;
        int i19 = this.f132943k - this.f132948p;
        if (i19 < 0) {
            i19 = 0;
        }
        if (i19 >= length) {
            i19 = length - 1;
        }
        float f17 = fArr[i19];
        if (this.f132939g != f17) {
            this.f132939g = f17;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass5());
        }
        float f18 = i17;
        double d17 = this.f132944l;
        if (d17 != 0.0d) {
            f18 = (float) (f17 / d17);
        }
        int round = java.lang.Math.round(f18);
        this.f132941i = round;
        if (round > i18) {
            this.f132941i = i18;
        } else if (round < i17) {
            this.f132941i = i17;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f132940h = ((int) f17) + str;
    }

    public final void a(final boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sj.4
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.Z == null) {
                    return;
                }
                com.tencent.mapsdk.internal.sj.e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.this.Z, z17);
            }
        });
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar, boolean z17) {
        if (this.E == null || gbVar.a(this.B) || this.C != z17) {
            this.B = gbVar.m36742x5a5dd5d();
            this.C = z17;
            int i17 = (int) gbVar.f131095c;
            if (i17 > 18) {
                i17 = 18;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sn snVar = null;
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sn snVar2 : this.U) {
                if (i17 >= snVar2.f133022a && i17 <= snVar2.f133023b) {
                    java.lang.Object[] a17 = snVar2.a(gbVar, z17);
                    if (a17 != null) {
                        java.lang.String str = (java.lang.String) a17[0];
                        java.lang.String str2 = (java.lang.String) a17[1];
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17[2];
                        if (bitmap != null) {
                            a(bitmap);
                            this.X = str;
                        } else if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str, this.X)) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + str + "] changed! old=" + this.X + "|dark=" + z17 + "|level=" + i17);
                            android.graphics.Bitmap bitmap2 = this.V.get(str);
                            if (bitmap2 != null) {
                                if (!bitmap2.isRecycled()) {
                                    a(bitmap2);
                                    this.X = str;
                                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + str + "] set from mem cache");
                                    return;
                                }
                                this.V.remove(str);
                            }
                            android.graphics.Bitmap c17 = c(str);
                            if (c17 != null) {
                                this.X = str;
                                this.V.put(str, c17);
                                a(c17);
                                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + str + "] set from file cache");
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
                android.graphics.Bitmap bitmap3 = this.f132956x;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    this.f132956x = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(this.D, "default_tencent_map_logo.png");
                }
                android.graphics.Bitmap bitmap4 = this.f132956x;
                if (bitmap4 != null) {
                    a(bitmap4);
                }
            }
        }
    }

    private void a(java.lang.String str, java.lang.String str2) {
        if (this.W.contains(str2)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + str2 + "] is downloading.");
            return;
        }
        this.W.add(str2);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131755w, "Logo[" + str2 + "] start download..");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.sj.a(this, str, str2)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.sj.b(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        java.lang.String p17 = p();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(p17);
        return p17 + "/" + str;
    }

    public final void a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.U.clear();
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss ssVar = list.get(i17);
            int[] iArr = ssVar.f133063a;
            this.U.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sn(iArr[0], iArr[1], ssVar.f133064b));
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
        if (this.G != bVar) {
            f();
        }
        this.G = bVar;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar) {
        this.f132953u = qsVar;
    }

    private android.widget.FrameLayout.LayoutParams a(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        if (i17 != 0 && i18 != 0) {
            switch (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass6.f132967a[this.G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.K;
                    int i19 = iArr[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.bottomMargin = i19;
                    int i27 = iArr[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams.leftMargin = i27;
                    this.f132931ah = (this.P - i19) - i18;
                    this.f132930ag = i27;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i28 = this.K[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.bottomMargin = i28;
                    this.f132931ah = (this.P - i28) - i18;
                    this.f132930ag = (this.f132937d - i17) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.K;
                    layoutParams.bottomMargin = iArr2[com.tencent.mapsdk.internal.eu.a.BOTTOM.f130946e];
                    layoutParams.rightMargin = iArr2[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c.equals("wechat") && (qsVar = this.f132953u) != null) {
                        int i29 = layoutParams.bottomMargin + (i18 * 2);
                        qsVar.f132585f = i29;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qq qqVar = qsVar.f132580a;
                        if (qqVar != null) {
                            qqVar.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs.AnonymousClass1());
                        }
                        android.view.ViewGroup ac6 = qsVar.f132584e.ac();
                        if (ac6 != null) {
                            qsVar.f132586g = ac6.getMeasuredHeight();
                        }
                        M m17 = qsVar.f132584e.e_;
                        if (m17 != 0 && ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t != null && ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q != null) {
                            qsVar.f132586g = (((int) ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132053t.f133957q.f131001b) - i29) * 2;
                            qsVar.f();
                        }
                    }
                    this.f132931ah = (this.P - layoutParams.bottomMargin) - i18;
                    this.f132930ag = (this.f132937d - layoutParams.rightMargin) - i17;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.K;
                    int i37 = iArr3[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i37;
                    int i38 = iArr3[com.tencent.mapsdk.internal.eu.a.LEFT.f130946e];
                    layoutParams.leftMargin = i38;
                    this.f132931ah = i37;
                    this.f132930ag = i38;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i39 = this.K[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i39;
                    this.f132931ah = i39;
                    this.f132930ag = (this.f132937d - i17) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.K;
                    int i47 = iArr4[com.tencent.mapsdk.internal.eu.a.TOP.f130946e];
                    layoutParams.topMargin = i47;
                    int i48 = iArr4[com.tencent.mapsdk.internal.eu.a.RIGHT.f130946e];
                    layoutParams.rightMargin = i48;
                    this.f132931ah = i47;
                    this.f132930ag = (this.f132937d - i48) - i17;
                    break;
                default:
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Unknown position:" + this.G);
                    break;
            }
        }
        return layoutParams;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final android.graphics.Rect a() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.LinearLayout linearLayout = this.f132927ab;
        if (linearLayout != null) {
            rect.left = linearLayout.getLeft();
            rect.bottom = this.f132927ab.getBottom();
            rect.right = this.f132927ab.getRight();
            rect.top = this.f132927ab.getTop();
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
        this.f132936c[aVar.f130946e] = f17;
        h();
    }

    private float a(com.tencent.mapsdk.internal.eu.a aVar) {
        return this.f132936c[aVar.f130946e];
    }

    public final void a(com.tencent.mapsdk.internal.eu.a aVar, int i17) {
        this.I[aVar.f130946e] = i17;
    }

    private void a(int i17, double d17) {
        java.lang.String str;
        this.f132943k = i17;
        this.f132944l = d17;
        int width = this.f132926a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) java.lang.Math.ceil(width / 4.0f);
        int ceil2 = (int) (java.lang.Math.ceil((this.f132937d * 3.0f) / 8.0f) - (this.f132942j * 6.0f));
        float[] fArr = f132924f;
        int length = fArr.length;
        int i18 = this.f132943k - this.f132948p;
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 >= length) {
            i18 = length - 1;
        }
        float f17 = fArr[i18];
        if (this.f132939g != f17) {
            this.f132939g = f17;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass5());
        }
        float f18 = ceil;
        double d18 = this.f132944l;
        if (d18 != 0.0d) {
            f18 = (float) (f17 / d18);
        }
        int round = java.lang.Math.round(f18);
        this.f132941i = round;
        if (round > ceil2) {
            this.f132941i = ceil2;
        } else if (round < ceil) {
            this.f132941i = ceil;
        }
        if (f17 >= 1000.0f) {
            f17 /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f132940h = ((int) f17) + str;
        f();
    }

    private void a(float f17) {
        if (this.f132939g != f17) {
            this.f132939g = f17;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass5());
        }
    }

    @java.lang.Deprecated
    private void a(int i17) {
        this.f132938e = i17;
        this.f132949q = Float.MIN_VALUE;
        h();
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar) {
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = this.f132950r;
        if (list == null || cVar == null) {
            return;
        }
        list.add(cVar);
    }

    public static /* synthetic */ java.lang.String a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar, java.lang.String str) {
        return sjVar.a(str) + ".tmp";
    }
}
