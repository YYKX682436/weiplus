package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGImageView */
/* loaded from: classes13.dex */
public class C29695x390ec2ca extends android.view.View implements org.p3363xbe4143f1.C29686x818ced7d.Listener {
    private volatile int A;
    private volatile int B;
    android.graphics.Paint C;
    private volatile boolean D;
    private volatile boolean E;
    private java.util.concurrent.atomic.AtomicBoolean F;
    private boolean G;

    /* renamed from: a, reason: collision with root package name */
    private org.p3363xbe4143f1.C29686x818ced7d f429305a;

    /* renamed from: b, reason: collision with root package name */
    private float f429306b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f429307c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile org.libpag.c.a f429308d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Object f429309e;

    /* renamed from: f, reason: collision with root package name */
    private volatile android.graphics.Bitmap f429310f;

    /* renamed from: g, reason: collision with root package name */
    private volatile android.graphics.Bitmap f429311g;

    /* renamed from: h, reason: collision with root package name */
    private volatile android.hardware.HardwareBuffer f429312h;

    /* renamed from: i, reason: collision with root package name */
    private volatile android.graphics.Bitmap f429313i;

    /* renamed from: j, reason: collision with root package name */
    private volatile android.hardware.HardwareBuffer f429314j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.Matrix f429315k;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap f429316l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f429317m;

    /* renamed from: n, reason: collision with root package name */
    private org.p3363xbe4143f1.C29687x78413754 f429318n;

    /* renamed from: o, reason: collision with root package name */
    private int f429319o;

    /* renamed from: p, reason: collision with root package name */
    private volatile android.graphics.Matrix f429320p;

    /* renamed from: q, reason: collision with root package name */
    private float f429321q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f429322r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f429323s;

    /* renamed from: t, reason: collision with root package name */
    private int f429324t;

    /* renamed from: u, reason: collision with root package name */
    private int f429325u;

    /* renamed from: v, reason: collision with root package name */
    int f429326v;

    /* renamed from: w, reason: collision with root package name */
    long f429327w;

    /* renamed from: x, reason: collision with root package name */
    private final java.util.ArrayList f429328x;

    /* renamed from: y, reason: collision with root package name */
    private volatile int f429329y;

    /* renamed from: z, reason: collision with root package name */
    private volatile int f429330z;

    /* renamed from: org.libpag.PAGImageView$PAGImageViewListener */
    /* loaded from: classes13.dex */
    public interface PAGImageViewListener {
        /* renamed from: onAnimationCancel */
        void m154824x827d33f(org.p3363xbe4143f1.C29695x390ec2ca c29695x390ec2ca);

        /* renamed from: onAnimationEnd */
        void m154825xbb3aa236(org.p3363xbe4143f1.C29695x390ec2ca c29695x390ec2ca);

        /* renamed from: onAnimationRepeat */
        void m154826x21f9d260(org.p3363xbe4143f1.C29695x390ec2ca c29695x390ec2ca);

        /* renamed from: onAnimationStart */
        void m154827xd7e2f2fd(org.p3363xbe4143f1.C29695x390ec2ca c29695x390ec2ca);

        /* renamed from: onAnimationUpdate */
        void m154828x27addd8e(org.p3363xbe4143f1.C29695x390ec2ca c29695x390ec2ca);
    }

    static {
        b56.a.a("pag");
    }

    public C29695x390ec2ca(android.content.Context context) {
        super(context);
        this.f429306b = 30.0f;
        this.f429307c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f429308d = new org.libpag.c.a();
        this.f429309e = new java.lang.Object();
        this.f429316l = new java.util.concurrent.ConcurrentHashMap();
        this.f429319o = 2;
        this.f429321q = 1.0f;
        this.f429322r = false;
        this.f429323s = false;
        this.f429325u = 0;
        this.f429326v = -1;
        this.f429327w = 0L;
        this.f429328x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }

    /* renamed from: ContentVersion */
    private static native int m154792xee69023f(org.p3363xbe4143f1.C29687x78413754 c29687x78413754);

    @java.lang.Deprecated
    /* renamed from: MaxDiskCache */
    public static long m154793xb8ed4b01() {
        return org.p3363xbe4143f1.C29689x715d3c0f.m154709xed3858a2();
    }

    @java.lang.Deprecated
    /* renamed from: SetMaxDiskCache */
    public static void m154794xaf03c43(long j17) {
        org.p3363xbe4143f1.C29689x715d3c0f.m154712xbe513720(j17);
    }

    private void b() {
        org.p3363xbe4143f1.C29687x78413754 c29687x78413754;
        boolean z17 = false;
        if (this.f429323s) {
            this.f429323s = false;
            z17 = true;
        }
        if (this.f429317m == null && (c29687x78413754 = this.f429318n) != null) {
            int m154792xee69023f = m154792xee69023f(c29687x78413754);
            int i17 = this.f429326v;
            boolean z18 = (i17 < 0 || i17 == m154792xee69023f) ? z17 : true;
            this.f429326v = m154792xee69023f;
            z17 = z18;
        }
        if (z17) {
            this.f429316l.clear();
            if (this.f429308d.a()) {
                return;
            }
            org.p3363xbe4143f1.C29687x78413754 c29687x784137542 = this.f429318n;
            if (c29687x784137542 == null) {
                c29687x784137542 = a(this.f429317m);
            }
            this.f429308d.a(c29687x784137542, this.f429329y, this.f429330z, this.f429306b);
        }
    }

    private void c() {
        boolean z17 = this.D && isShown() && d();
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        if (!z17) {
            this.f429305a.m154657xffd6ec16(0L);
            return;
        }
        org.p3363xbe4143f1.C29687x78413754 c29687x78413754 = this.f429318n;
        this.f429305a.m154657xffd6ec16(c29687x78413754 != null ? c29687x78413754.m154837x89444d94() : this.f429327w);
        this.f429305a.m154661xce0038c9();
    }

    private boolean d() {
        return this.f429329y > 0 && this.f429330z > 0;
    }

    private void e() {
        this.C = new android.graphics.Paint(6);
        this.f429305a = org.p3363xbe4143f1.C29686x818ced7d.a(getContext(), this);
    }

    private void g() {
        int i17 = this.f429319o;
        if (i17 == 0) {
            return;
        }
        this.f429320p = org.p3363xbe4143f1.c.a(i17, this.f429308d.f429360a, this.f429308d.f429361b, this.f429329y, this.f429330z);
    }

    private void h() {
        if (!this.f429308d.b() && this.f429325u == 0 && this.f429329y > 0) {
            f();
        }
        if (this.f429308d.b() && this.f429308d.a()) {
            this.f429325u = this.f429308d.c();
        }
    }

    private void i() {
        synchronized (this.f429309e) {
            this.f429310f = null;
            this.f429311g = null;
            this.f429313i = null;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                if (this.f429312h != null) {
                    this.f429312h.close();
                    this.f429312h = null;
                }
                if (this.f429314j != null) {
                    this.f429314j.close();
                    this.f429314j = null;
                }
            }
        }
    }

    private void j() {
        if (a()) {
            this.f429308d.d();
        }
    }

    /* renamed from: addListener */
    public void m154795x162a7075(org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener pAGImageViewListener) {
        synchronized (this) {
            this.f429328x.add(pAGImageViewListener);
        }
    }

    /* renamed from: cacheAllFramesInMemory */
    public boolean m154796x2ef405eb() {
        return this.f429322r;
    }

    /* renamed from: currentFrame */
    public int m154797x562c7f74() {
        return this.f429324t;
    }

    /* renamed from: currentImage */
    public android.graphics.Bitmap m154798x56547f62() {
        return this.f429310f;
    }

    public void f() {
        synchronized (this.f429308d) {
            if (!this.f429308d.b()) {
                if (this.f429318n == null) {
                    this.f429318n = a(this.f429317m);
                }
                if (this.f429308d.a(this.f429318n, this.f429329y, this.f429330z, this.f429306b) && this.f429317m != null) {
                    this.f429318n = null;
                }
                if (!this.f429308d.b()) {
                    return;
                }
            }
            g();
            this.f429307c.set(false);
        }
    }

    /* renamed from: finalize */
    public void m154799xd764dc1e() {
        super.finalize();
    }

    /* renamed from: flush */
    public boolean m154800x5d03b04() {
        if (!this.f429308d.b()) {
            f();
            if (!this.f429308d.b()) {
                postInvalidate();
                return false;
            }
        }
        if (this.f429308d.a()) {
            this.f429325u = this.f429308d.c();
        }
        int a17 = org.p3363xbe4143f1.c.a(this.f429305a.m154655xc454c22d(), this.f429325u);
        this.f429324t = a17;
        if (!a(a17)) {
            this.E = false;
            return false;
        }
        this.E = false;
        postInvalidate();
        return true;
    }

    /* renamed from: getComposition */
    public org.p3363xbe4143f1.C29687x78413754 m154801xa7d55074() {
        if (this.f429317m != null) {
            return null;
        }
        return this.f429318n;
    }

    /* renamed from: getPath */
    public java.lang.String m154802xfb83cc9b() {
        return this.f429317m;
    }

    /* renamed from: isPlaying */
    public boolean m154803xc00617a4() {
        return this.f429305a.m154653x39e05d35();
    }

    /* renamed from: matrix */
    public android.graphics.Matrix m154804xbf8d97c1() {
        return this.f429320p;
    }

    /* renamed from: numFrames */
    public int m154805x333fdfcc() {
        h();
        return this.f429325u;
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationCancel */
    public void mo154662x827d33f(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429328x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener) it.next()).m154824x827d33f(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationEnd */
    public void mo154663xbb3aa236(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429328x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener) it.next()).m154825xbb3aa236(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationRepeat */
    public void mo154664x21f9d260(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429328x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener) it.next()).m154826x21f9d260(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationStart */
    public void mo154665xd7e2f2fd(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429328x);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener) it.next()).m154827xd7e2f2fd(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationUpdate */
    public void mo154666x27addd8e(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        org.p3363xbe4143f1.C29687x78413754 c29687x78413754;
        if (this.D) {
            if (this.G && (c29687x78413754 = this.f429318n) != null) {
                c29686x818ced7d.m154657xffd6ec16(c29687x78413754.m154837x89444d94());
            }
            m154800x5d03b04();
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.f429328x);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener) it.next()).m154828x27addd8e(this);
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        this.D = true;
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.D = false;
        super.onDetachedFromWindow();
        c();
        this.f429308d.e();
        if (this.f429305a.m154653x39e05d35()) {
            i();
        }
        this.f429316l.clear();
        this.f429326v = -1;
        this.f429323s = false;
        this.f429307c.set(false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f429307c.get() || this.f429310f == null || this.f429310f.isRecycled()) {
            return;
        }
        super.onDraw(canvas);
        int saveCount = canvas.getSaveCount();
        canvas.save();
        android.graphics.Matrix matrix = this.f429315k;
        if (matrix != null) {
            canvas.concat(matrix);
        }
        if (this.f429320p != null) {
            canvas.concat(this.f429320p);
        }
        try {
            canvas.drawBitmap(this.f429310f, 0.0f, 0.0f, this.C);
        } catch (java.lang.Exception unused) {
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f429307c.set(true);
        this.f429308d.e();
        this.A = i17;
        this.B = i18;
        this.f429329y = (int) (this.f429321q * i17);
        this.f429330z = (int) (this.f429321q * i18);
        i();
        this.E = true;
        c();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        c();
    }

    /* renamed from: pause */
    public void m154806x65825f6() {
        this.f429305a.m154650xae7a2e7a();
    }

    /* renamed from: play */
    public void m154807x348b34() {
        this.f429305a.a();
    }

    /* renamed from: removeListener */
    public void m154808xf1335d58(org.p3363xbe4143f1.C29695x390ec2ca.PAGImageViewListener pAGImageViewListener) {
        synchronized (this) {
            this.f429328x.remove(pAGImageViewListener);
        }
    }

    /* renamed from: renderScale */
    public float m154809x9e4c6554() {
        return this.f429321q;
    }

    /* renamed from: repeatCount */
    public int m154810x5dab7c34() {
        return this.f429305a.m154656x5dab7c34();
    }

    /* renamed from: scaleMode */
    public int m154811x900e020d() {
        return this.f429319o;
    }

    /* renamed from: setCacheAllFramesInMemory */
    public void m154812xcb0618ed(boolean z17) {
        this.f429323s = z17 != this.f429322r;
        this.f429322r = z17;
    }

    /* renamed from: setComposition */
    public void m154813x3e3ac3e8(org.p3363xbe4143f1.C29687x78413754 c29687x78413754) {
        m154814x3e3ac3e8(c29687x78413754, 30.0f);
    }

    /* renamed from: setCurrentFrame */
    public void m154815xed680cf6(int i17) {
        int i18;
        h();
        if (this.f429325u == 0 || !this.f429308d.b() || i17 < 0 || i17 >= (i18 = this.f429325u)) {
            return;
        }
        this.f429324t = i17;
        this.f429305a.m154658x3ae760af(org.p3363xbe4143f1.c.a(i17, i18));
        this.f429305a.m154661xce0038c9();
    }

    /* renamed from: setMatrix */
    public void m154816x17d9eec3(android.graphics.Matrix matrix) {
        this.f429320p = matrix;
        this.f429319o = 0;
        if (d()) {
            postInvalidate();
        }
    }

    /* renamed from: setPath */
    public boolean m154817x764e93a7(java.lang.String str) {
        return m154818x764e93a7(str, 30.0f);
    }

    /* renamed from: setPathAsync */
    public void m154820x4398af15(java.lang.String str, org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        m154819x4398af15(str, 30.0f, loadListener);
    }

    /* renamed from: setRenderScale */
    public void m154821xe881f92(float f17) {
        if (this.f429321q == f17) {
            return;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            f17 = 1.0f;
        }
        this.f429321q = f17;
        this.f429329y = (int) (this.A * f17);
        this.f429330z = (int) (this.B * f17);
        g();
        if (f17 < 1.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f429315k = matrix;
            float f18 = 1.0f / f17;
            matrix.setScale(f18, f18);
        }
    }

    /* renamed from: setRepeatCount */
    public void m154822xcde73672(int i17) {
        this.f429305a.m154659xcde73672(i17);
    }

    /* renamed from: setScaleMode */
    public void m154823xebcf33cb(int i17) {
        if (i17 == this.f429319o) {
            return;
        }
        this.f429319o = i17;
        if (!d()) {
            this.f429320p = null;
        } else {
            g();
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, float f17, org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        m154818x764e93a7(str, f17);
        if (loadListener != null) {
            loadListener.m154741xc39c3f65((org.p3363xbe4143f1.C29690xfae77312) this.f429318n);
        }
    }

    /* renamed from: setComposition */
    public void m154814x3e3ac3e8(org.p3363xbe4143f1.C29687x78413754 c29687x78413754, float f17) {
        a((java.lang.String) null, c29687x78413754, f17);
    }

    /* renamed from: setPath */
    public boolean m154818x764e93a7(java.lang.String str, float f17) {
        org.p3363xbe4143f1.C29687x78413754 a17 = a(str);
        a(str, a17, f17);
        return a17 != null;
    }

    /* renamed from: setPathAsync */
    public void m154819x4398af15(final java.lang.String str, final float f17, final org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        org.p3363xbe4143f1.C29685x2fd7f25c.Run(new java.lang.Runnable() { // from class: org.libpag.PAGImageView$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3363xbe4143f1.C29695x390ec2ca.this.a(str, f17, loadListener);
            }
        });
    }

    private org.p3363xbe4143f1.C29687x78413754 a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("assets://")) {
            return org.p3363xbe4143f1.C29690xfae77312.m154715x243906(getContext().getAssets(), str.substring(9));
        }
        return org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str);
    }

    private void a(java.lang.String str, org.p3363xbe4143f1.C29687x78413754 c29687x78413754, float f17) {
        this.f429307c.set(true);
        this.f429308d.e();
        this.f429306b = f17;
        this.f429320p = null;
        i();
        this.f429317m = str;
        this.f429318n = c29687x78413754;
        this.f429324t = 0;
        this.f429305a.m154658x3ae760af(c29687x78413754 == null ? 0.0d : c29687x78413754.m154844x402effa3());
        org.p3363xbe4143f1.C29687x78413754 c29687x784137542 = this.f429318n;
        long m154837x89444d94 = c29687x784137542 == null ? 0L : c29687x784137542.m154837x89444d94();
        this.f429327w = m154837x89444d94;
        if (this.G) {
            this.f429305a.m154657xffd6ec16(m154837x89444d94);
        }
        this.f429305a.m154661xce0038c9();
    }

    private boolean a() {
        if (this.f429308d.b() && this.f429308d.a()) {
            this.f429325u = this.f429308d.c();
        }
        return this.f429316l.size() == this.f429325u;
    }

    public C29695x390ec2ca(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f429306b = 30.0f;
        this.f429307c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f429308d = new org.libpag.c.a();
        this.f429309e = new java.lang.Object();
        this.f429316l = new java.util.concurrent.ConcurrentHashMap();
        this.f429319o = 2;
        this.f429321q = 1.0f;
        this.f429322r = false;
        this.f429323s = false;
        this.f429325u = 0;
        this.f429326v = -1;
        this.f429327w = 0L;
        this.f429328x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }

    private boolean a(int i17) {
        android.hardware.HardwareBuffer hardwareBuffer;
        android.graphics.Bitmap bitmap;
        if (!this.f429308d.b() || this.f429307c.get()) {
            return false;
        }
        b();
        j();
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f429316l.get(java.lang.Integer.valueOf(i17));
        if (bitmap2 != null) {
            this.f429310f = bitmap2;
            return true;
        }
        if (this.f429307c.get() || !this.f429308d.a()) {
            return false;
        }
        if (!this.E && !this.f429308d.a(i17)) {
            return true;
        }
        synchronized (this.f429309e) {
            if (this.f429311g == null || this.f429322r) {
                android.util.Pair a17 = org.p3363xbe4143f1.a.a(this.f429308d.f429360a, this.f429308d.f429361b, false);
                java.lang.Object obj = a17.first;
                if (obj == null) {
                    return false;
                }
                this.f429311g = (android.graphics.Bitmap) obj;
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    this.f429312h = (android.hardware.HardwareBuffer) a17.second;
                }
            }
            if (this.f429311g == null) {
                return false;
            }
            if (!this.f429322r) {
                if (this.f429313i == null) {
                    android.util.Pair a18 = org.p3363xbe4143f1.a.a(this.f429308d.f429360a, this.f429308d.f429361b, false);
                    if (a18.first == null) {
                        return false;
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        this.f429314j = (android.hardware.HardwareBuffer) a18.second;
                    }
                    this.f429313i = (android.graphics.Bitmap) a18.first;
                }
                if (this.F.get()) {
                    bitmap = this.f429311g;
                    hardwareBuffer = this.f429312h;
                } else {
                    bitmap = this.f429313i;
                    hardwareBuffer = this.f429314j;
                }
                this.F.set(!r5.get());
            } else {
                hardwareBuffer = this.f429312h;
                bitmap = this.f429311g;
            }
            if (hardwareBuffer != null) {
                if (!this.f429308d.a(i17, hardwareBuffer)) {
                    return false;
                }
            } else {
                if (!this.f429308d.a(bitmap, i17)) {
                    return false;
                }
                bitmap.prepareToDraw();
            }
            this.f429310f = bitmap;
            if (this.f429322r && this.f429310f != null) {
                this.f429316l.put(java.lang.Integer.valueOf(i17), this.f429310f);
            }
            return true;
        }
    }

    public C29695x390ec2ca(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f429306b = 30.0f;
        this.f429307c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f429308d = new org.libpag.c.a();
        this.f429309e = new java.lang.Object();
        this.f429316l = new java.util.concurrent.ConcurrentHashMap();
        this.f429319o = 2;
        this.f429321q = 1.0f;
        this.f429322r = false;
        this.f429323s = false;
        this.f429325u = 0;
        this.f429326v = -1;
        this.f429327w = 0L;
        this.f429328x = new java.util.ArrayList();
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.G = false;
        e();
    }
}
