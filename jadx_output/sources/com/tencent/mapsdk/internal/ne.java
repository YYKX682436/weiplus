package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ne extends com.tencent.mapsdk.internal.br implements com.tencent.mapsdk.internal.bd, com.tencent.mapsdk.internal.fo, com.tencent.mapsdk.internal.v.a {
    private static final int N = 50;
    private static final int O = 6;
    private static final int Q = 100;
    private static final int R = 100;
    private static final float S = 2.0f;
    public com.tencent.mapsdk.internal.sa A;
    public boolean B;
    public android.graphics.Rect C;
    public int D;
    public int E;
    public com.tencent.tencentmap.mapsdk.maps.CustomRender F;
    public com.tencent.mapsdk.internal.pb G;
    public final com.tencent.mapsdk.internal.re H;
    public final java.util.List<com.tencent.mapsdk.internal.oz> I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bh f50497J;
    public int K;
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener L;
    public com.tencent.mapsdk.internal.fb M;
    private final int P;
    private final java.util.concurrent.LinkedBlockingQueue<com.tencent.mapsdk.internal.ne.a> T;
    private com.tencent.mapsdk.internal.oq U;
    private com.tencent.mapsdk.internal.ll<java.lang.Integer, java.lang.Integer> V;
    private com.tencent.mapsdk.internal.ll<java.lang.Integer, java.util.List<java.lang.Integer>> W;
    private boolean X;
    private boolean Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private int f50498aa;

    /* renamed from: ab, reason: collision with root package name */
    private float f50499ab;

    /* renamed from: ac, reason: collision with root package name */
    private float f50500ac;

    /* renamed from: ad, reason: collision with root package name */
    private boolean f50501ad;

    /* renamed from: ae, reason: collision with root package name */
    private android.graphics.Rect f50502ae;

    /* renamed from: af, reason: collision with root package name */
    private boolean f50503af;

    /* renamed from: ag, reason: collision with root package name */
    private int f50504ag;

    /* renamed from: ah, reason: collision with root package name */
    private java.lang.String f50505ah;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.tk f50506f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.mp f50507g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ad f50508h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mapsdk.internal.rw f50509i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bi f50510j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.nd f50511k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.az f50512l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ey f50513m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.VisualSettings f50514n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f50515o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f50516p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f50517q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.w f50518r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne.f f50519s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.v f50520t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ol f50521u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f50522v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f50523w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mapsdk.internal.om f50524x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne.c f50525y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne.d f50526z;

    /* loaded from: classes13.dex */
    public interface a {
        void a(javax.microedition.khronos.opengles.GL10 gl10);
    }

    /* loaded from: classes6.dex */
    public enum b {
        UnderMainMap(2),
        Under3DBuiding(4),
        UnderHandDraw(6),
        UnderPoi(8),
        UnderToplayer(10),
        AboveToplayer(12);


        /* renamed from: g, reason: collision with root package name */
        public int f50535g;

        b(int i17) {
            this.f50535g = i17;
        }
    }

    /* loaded from: classes13.dex */
    public class d implements com.tencent.mapsdk.internal.fi {

        /* renamed from: a, reason: collision with root package name */
        public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> f50538a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.List<com.tencent.map.lib.models.GeoPoint> f50539b;

        public d() {
            com.tencent.mapsdk.internal.ne.this.a(this);
        }

        private void a() {
            com.tencent.mapsdk.internal.ne.this.b(this);
        }

        private void b() {
            com.tencent.mapsdk.internal.ne.this.f50506f.w();
            this.f50538a = null;
            this.f50539b = null;
        }

        private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2) {
            this.f50538a = list;
            this.f50539b = list2;
            com.tencent.mapsdk.internal.ne.this.f50506f.a(list, list2);
        }

        @Override // com.tencent.mapsdk.internal.fi
        public final void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
            if (language != com.tencent.tencentmap.mapsdk.maps.model.Language.zh) {
                com.tencent.mapsdk.internal.ne.this.f50506f.w();
            } else {
                if (this.f50538a == null || this.f50539b == null) {
                    return;
                }
                com.tencent.mapsdk.internal.ne.this.f50506f.a(this.f50538a, this.f50539b);
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum e {
        DAY,
        NIGHT
    }

    /* loaded from: classes13.dex */
    public class f {

        /* renamed from: b, reason: collision with root package name */
        private final java.util.ArrayList<com.tencent.mapsdk.internal.ne.g> f50545b;

        /* renamed from: c, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ne.g f50546c;

        public /* synthetic */ f(com.tencent.mapsdk.internal.ne neVar, byte b17) {
            this();
        }

        private com.tencent.mapsdk.internal.ne.g d() {
            com.tencent.mapsdk.internal.ne.g gVar;
            synchronized (this.f50545b) {
                gVar = this.f50545b.size() > 0 ? this.f50545b.get(0) : null;
            }
            return gVar;
        }

        public final boolean b() {
            boolean z17;
            synchronized (this.f50545b) {
                java.util.ArrayList<com.tencent.mapsdk.internal.ne.g> arrayList = this.f50545b;
                z17 = arrayList == null || arrayList.isEmpty();
            }
            return z17;
        }

        public final synchronized com.tencent.mapsdk.internal.ne.g c() {
            com.tencent.mapsdk.internal.ne.g d17 = d();
            this.f50546c = d17;
            if (d17 == null) {
                return null;
            }
            if (d17.c()) {
                a(this.f50546c);
                return null;
            }
            com.tencent.mapsdk.internal.ne.this.f50508h.e();
            com.tencent.mapsdk.internal.ne.g gVar = this.f50546c;
            android.graphics.Rect rect = gVar.f50555i;
            int i17 = gVar.f50553g;
            int i18 = gVar.f50554h;
            android.graphics.Rect rect2 = new android.graphics.Rect();
            int a17 = (int) (com.tencent.mapsdk.internal.hs.a(com.tencent.mapsdk.internal.ne.this.getContext()) * 20.0f);
            int width = ((com.tencent.mapsdk.internal.ne.this.f50515o.width() - i17) / 2) + a17;
            rect2.right = width;
            rect2.left = width;
            int height = ((com.tencent.mapsdk.internal.ne.this.f50515o.height() - i18) / 2) + a17;
            rect2.bottom = height;
            rect2.top = height;
            com.tencent.mapsdk.internal.ne.this.f50508h.c(rect, rect2);
            return this.f50546c;
        }

        private f() {
            this.f50545b = new java.util.ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.tencent.mapsdk.internal.ez ezVar, android.graphics.Rect rect, com.tencent.mapsdk.internal.fp fpVar, int i17, int i18) {
            com.tencent.mapsdk.internal.ne.g gVar = new com.tencent.mapsdk.internal.ne.g(com.tencent.mapsdk.internal.ne.this, ezVar, rect, fpVar, i17, i18, (byte) 0);
            synchronized (this.f50545b) {
                this.f50545b.add(gVar);
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b("snapshot addSnapshotRequest");
            com.tencent.mapsdk.internal.ne.this.f50522v = true;
        }

        public final synchronized void a() {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("snapshot cancel");
            synchronized (this.f50545b) {
                this.f50545b.clear();
            }
            com.tencent.mapsdk.internal.ne.g gVar = this.f50546c;
            if (gVar != null) {
                gVar.f50556j = 1;
                gVar.f50551e = 0;
            }
        }

        public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10, com.tencent.mapsdk.internal.nd ndVar) {
            if (com.tencent.mapsdk.internal.ne.this.f50506f == null) {
                return;
            }
            com.tencent.mapsdk.internal.ez ezVar = this.f50546c.f50552f;
            if (ezVar != null) {
                ezVar.a(gl10);
            }
            ndVar.a();
        }

        public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.ne.g gVar = this.f50546c;
            if (gVar != null && !gVar.c()) {
                com.tencent.mapsdk.internal.ne.g gVar2 = this.f50546c;
                a(gl10, gVar2.f50553g, gVar2.f50554h);
                a(this.f50546c);
            }
        }

        private void a(com.tencent.mapsdk.internal.ne.g gVar) {
            if (gVar == null || gVar.a()) {
                return;
            }
            gVar.b();
            synchronized (this.f50545b) {
                this.f50545b.remove(gVar);
            }
            com.tencent.mapsdk.internal.ne.this.f50508h.f();
        }

        private android.graphics.Bitmap a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
            int i19 = i17 * i18;
            int[] iArr = new int[i19];
            int[] iArr2 = new int[i19];
            java.nio.IntBuffer wrap = java.nio.IntBuffer.wrap(iArr);
            wrap.position(0);
            gl10.glReadPixels((com.tencent.mapsdk.internal.ne.this.f50515o.width() - i17) / 2, (com.tencent.mapsdk.internal.ne.this.f50515o.height() - i18) / 2, i17, i18, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
            for (int i27 = 0; i27 < i18; i27++) {
                for (int i28 = 0; i28 < i17; i28++) {
                    int i29 = iArr[(i27 * i17) + i28];
                    iArr2[(((i18 - i27) - 1) * i17) + i28] = (i29 & (-16711936)) | ((i29 << 16) & 16711680) | ((i29 >> 16) & 255);
                }
            }
            try {
                return android.graphics.Bitmap.createBitmap(iArr2, i17, i18, android.graphics.Bitmap.Config.RGB_565);
            } catch (java.lang.OutOfMemoryError unused) {
                return android.graphics.Bitmap.createBitmap(iArr2, i17, i18, android.graphics.Bitmap.Config.RGB_565);
            }
        }
    }

    /* loaded from: classes13.dex */
    public class g {

        /* renamed from: a, reason: collision with root package name */
        public static final int f50547a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f50548b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f50549c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f50550d = 3;

        /* renamed from: e, reason: collision with root package name */
        int f50551e;

        /* renamed from: f, reason: collision with root package name */
        com.tencent.mapsdk.internal.ez f50552f;

        /* renamed from: g, reason: collision with root package name */
        int f50553g;

        /* renamed from: h, reason: collision with root package name */
        int f50554h;

        /* renamed from: i, reason: collision with root package name */
        android.graphics.Rect f50555i;

        /* renamed from: j, reason: collision with root package name */
        int f50556j;

        /* renamed from: l, reason: collision with root package name */
        private com.tencent.mapsdk.internal.fp f50558l;

        public /* synthetic */ g(com.tencent.mapsdk.internal.ne neVar, com.tencent.mapsdk.internal.ez ezVar, android.graphics.Rect rect, com.tencent.mapsdk.internal.fp fpVar, int i17, int i18, byte b17) {
            this(ezVar, rect, fpVar, i17, i18);
        }

        private static /* synthetic */ int b(com.tencent.mapsdk.internal.ne.g gVar) {
            gVar.f50551e = 0;
            return 0;
        }

        private static /* synthetic */ int c(com.tencent.mapsdk.internal.ne.g gVar) {
            int i17 = gVar.f50551e;
            gVar.f50551e = i17 + 1;
            return i17;
        }

        private g(com.tencent.mapsdk.internal.ez ezVar, android.graphics.Rect rect, com.tencent.mapsdk.internal.fp fpVar, int i17, int i18) {
            this.f50551e = 0;
            this.f50552f = ezVar;
            this.f50555i = rect;
            this.f50558l = fpVar;
            this.f50553g = i17;
            this.f50554h = i18;
            this.f50556j = 0;
        }

        private void d() {
            this.f50556j = 1;
            this.f50551e = 0;
        }

        private boolean e() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("is processing:");
            sb6.append(this.f50556j == 3);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(sb6.toString());
            return this.f50556j == 3;
        }

        public final synchronized boolean a() {
            return this.f50556j == 2;
        }

        public final synchronized void b() {
            this.f50556j = 2;
            this.f50551e = 0;
        }

        public final boolean c() {
            return this.f50556j == 1;
        }

        private void a(int i17) {
            this.f50556j = i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ne(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, com.tencent.mapsdk.internal.bo boVar) {
        super(context, tencentMapOptions, boVar);
        this.f50522v = false;
        this.f50523w = true;
        this.X = true;
        this.B = true;
        this.Y = false;
        this.Z = 0;
        this.f50498aa = 0;
        this.f50499ab = 0.5f;
        this.f50500ac = 0.5f;
        this.f50501ad = true;
        this.D = 18;
        this.E = 14;
        this.M = null;
        this.K = boVar.f49018f;
        com.tencent.mapsdk.internal.az azVar = (com.tencent.mapsdk.internal.az) boVar;
        this.f50512l = azVar;
        com.tencent.mapsdk.internal.bh bhVar = new com.tencent.mapsdk.internal.bh(azVar, this);
        this.f50497J = bhVar;
        com.tencent.mapsdk.internal.tk tkVar = new com.tencent.mapsdk.internal.tk(context, this);
        this.f50506f = tkVar;
        com.tencent.mapsdk.internal.v vVar = new com.tencent.mapsdk.internal.v(this);
        this.f50520t = vVar;
        vVar.a(this);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f50515o = rect;
        com.tencent.mapsdk.internal.bi biVar = new com.tencent.mapsdk.internal.bi(bhVar, this);
        this.f50510j = biVar;
        azVar.a(biVar);
        this.H = new com.tencent.mapsdk.internal.re(getContext(), this);
        this.f50513m = new com.tencent.mapsdk.internal.y(this);
        this.f50514n = new com.tencent.mapsdk.internal.z(this);
        com.tencent.mapsdk.internal.ad adVar = new com.tencent.mapsdk.internal.ad(this);
        this.f50508h = adVar;
        tkVar.f51662f = adVar;
        this.f50507g = new com.tencent.mapsdk.internal.mp();
        this.f50511k = new com.tencent.mapsdk.internal.nd(this, tkVar);
        this.f50519s = new com.tencent.mapsdk.internal.ne.f(this, (byte) 0);
        this.T = new java.util.concurrent.LinkedBlockingQueue<>();
        this.I = new java.util.concurrent.CopyOnWriteArrayList();
        if (getContext() != null) {
            this.P = (int) ((getContext().getResources().getDisplayMetrics().density * 6.0f) + 0.5d);
        } else {
            this.P = 6;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        rect.set(0, 0, windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
    }

    private com.tencent.mapsdk.internal.tk S() {
        return this.f50506f;
    }

    private int T() {
        return this.K;
    }

    private boolean U() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() - tkVar.f51668l > 560) {
            tkVar.f51660d.nativeClearDownloadURLCache(tkVar.f51661e);
            tkVar.f51668l = android.os.SystemClock.elapsedRealtime();
        }
        return tkVar.f51660d.nativeGenerateTextures(tkVar.f51661e);
    }

    private com.tencent.mapsdk.internal.lu V() {
        return this.f50521u.d();
    }

    private com.tencent.mapsdk.internal.mp W() {
        return this.f50507g;
    }

    private void X() {
        com.tencent.mapsdk.internal.rw rwVar;
        com.tencent.mapsdk.internal.bu buVar;
        if (this.f50506f == null) {
            return;
        }
        this.f50522v = true;
        this.B = true;
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null && tkVar.f51661e != 0) {
            tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass38());
        }
        h(this.B);
        if (this.f50523w) {
            com.tencent.mapsdk.internal.aa aaVar = this.f50508h.f48818o;
            com.tencent.mapsdk.internal.aa.a aVar = aaVar.f48756d;
            if (aVar != null) {
                aVar.destroy();
            }
            com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(aaVar);
            aaVar.f48756d = aVar2;
            aVar2.start();
            this.f50523w = false;
        } else {
            com.tencent.mapsdk.internal.aa aaVar2 = this.f50508h.f48818o;
            if (aaVar2 != null) {
                aaVar2.b();
            }
        }
        com.tencent.mapsdk.internal.az azVar = this.f50512l;
        if (azVar != null && azVar.getMapRenderView() != null && (buVar = this.f50512l.getMapRenderView().get()) != null) {
            buVar.d();
        }
        if (this.f50516p) {
            this.f50506f.l();
        }
        if (this.f50517q && (rwVar = this.f50509i) != null) {
            rwVar.b();
        }
        com.tencent.mapsdk.internal.sa saVar = this.A;
        if (saVar != null) {
            saVar.f51320g = false;
            saVar.f51322i.sendEmptyMessage(130818);
        }
    }

    private void Y() {
        com.tencent.mapsdk.internal.rw rwVar;
        if (this.f50506f == null) {
            return;
        }
        this.f50522v = false;
        this.B = false;
        h(false);
        com.tencent.mapsdk.internal.sa saVar = this.A;
        if (saVar != null) {
            saVar.f51320g = true;
        }
        com.tencent.mapsdk.internal.aa aaVar = this.f50508h.f48818o;
        if (aaVar != null) {
            aaVar.a();
        }
        this.f50506f.m();
        if (!this.f50517q || (rwVar = this.f50509i) == null) {
            return;
        }
        rwVar.a();
    }

    private void Z() {
        com.tencent.mapsdk.internal.rw rwVar;
        if (!this.f50517q || (rwVar = this.f50509i) == null) {
            return;
        }
        rwVar.a();
    }

    private void aA() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass38());
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Language aB() {
        if (this.f50525y == null) {
            this.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
        return tkVar == null ? com.tencent.tencentmap.mapsdk.maps.model.Language.zh : com.tencent.tencentmap.mapsdk.maps.model.Language.wrap(tkVar.f51660d.nativeGetLanguage(tkVar.f51661e));
    }

    private com.tencent.mapsdk.internal.nd aC() {
        return this.f50511k;
    }

    private com.tencent.mapsdk.internal.sa aD() {
        return this.A;
    }

    private com.tencent.mapsdk.internal.ol aE() {
        return this.f50521u;
    }

    private java.lang.String aF() {
        return this.f50505ah;
    }

    private com.tencent.mapsdk.internal.bh aG() {
        return this.f50497J;
    }

    private java.lang.String aH() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return null;
        }
        return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass51(), (com.tencent.mapsdk.internal.tk.AnonymousClass51) null);
    }

    private java.lang.String aI() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return null;
        }
        return tkVar.a();
    }

    private void aJ() {
        com.tencent.mapsdk.internal.pb pbVar = this.G;
        if (pbVar != null) {
            pbVar.p_();
        }
    }

    private void aK() {
        java.util.List<com.tencent.mapsdk.internal.oz> list = this.I;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.oz> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    private void aL() {
        java.util.List<com.tencent.mapsdk.internal.oz> list = this.I;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.oz> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private com.tencent.mapsdk.internal.re aM() {
        return this.H;
    }

    private void aa() {
        if (this.f50506f == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.ne.1
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.ne.this.f50506f != null) {
                    com.tencent.mapsdk.internal.ne.this.f50507g.a(gl10);
                }
            }
        });
    }

    private com.tencent.mapsdk.internal.w ab() {
        return this.f50518r;
    }

    private void ac() {
        com.tencent.mapsdk.internal.mp mpVar;
        if (this.f50506f == null || (mpVar = this.f50507g) == null) {
            return;
        }
        mpVar.a();
    }

    private android.graphics.Rect ad() {
        return this.C;
    }

    private void ae() {
        this.f50522v = true;
    }

    private int af() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return tkVar.d();
        }
        return -1;
    }

    private void ag() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.c();
        }
    }

    private void ah() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.f();
        }
    }

    private boolean ai() {
        return this.f50517q;
    }

    private void aj() {
        if (this.f50526z == null) {
            this.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = this.f50526z;
        com.tencent.mapsdk.internal.ne.this.f50506f.w();
        dVar.f50538a = null;
        dVar.f50539b = null;
    }

    private boolean ak() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        return tkVar != null && ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass163>) new com.tencent.mapsdk.internal.tk.AnonymousClass163(M()), (com.tencent.mapsdk.internal.tk.AnonymousClass163) 0)).intValue() == 1;
    }

    private java.lang.String[] al() {
        android.graphics.Rect q17 = this.f50508h.q();
        android.graphics.Point[] pointArr = {new android.graphics.Point(q17.centerX(), q17.centerY()), new android.graphics.Point(q17.left, q17.top), new android.graphics.Point(q17.left, q17.bottom), new android.graphics.Point(q17.right, q17.top), new android.graphics.Point(q17.right, q17.bottom)};
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 = 0; i17 < 5; i17++) {
            android.graphics.Point point = pointArr[i17];
            java.lang.String a17 = a(new com.tencent.map.lib.models.GeoPoint(point.y, point.x));
            if (!com.tencent.mapsdk.internal.hr.a(a17)) {
                hashSet.add(a17);
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
    }

    private void am() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.l();
            this.f50516p = true;
        }
    }

    private void an() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.m();
            this.f50516p = false;
        }
    }

    private boolean ao() {
        return this.f50516p;
    }

    private boolean ap() {
        return this.Y;
    }

    private void aq() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass122());
        }
    }

    private void ar() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass123());
        }
    }

    private void as() {
        this.f50519s.a();
    }

    private void at() {
        this.f50522v = true;
    }

    private boolean au() {
        return ((double) this.f50508h.i()) > 1.0E-10d;
    }

    private java.lang.String[] av() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (java.lang.String[]) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass166(), (com.tencent.mapsdk.internal.tk.AnonymousClass166) null);
        }
        return null;
    }

    private void aw() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass104());
        }
    }

    private java.lang.String ax() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass169(), (com.tencent.mapsdk.internal.tk.AnonymousClass169) null);
        }
        return null;
    }

    private android.graphics.Rect ay() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (android.graphics.Rect) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass168(), (com.tencent.mapsdk.internal.tk.AnonymousClass168) null);
        }
        return null;
    }

    @java.lang.Deprecated
    private boolean az() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return tkVar.v();
        }
        return false;
    }

    public static /* synthetic */ boolean e(com.tencent.mapsdk.internal.ne neVar) {
        neVar.f50522v = true;
        return true;
    }

    private void l(boolean z17) {
        this.f50506f.i(z17);
    }

    private void m(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass143(z17));
        }
    }

    private void n(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (0 != tkVar.f51661e) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass180(z17));
        }
    }

    private void o(boolean z17) {
        if (this.f50506f != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setLandMarkEnabled:".concat(java.lang.String.valueOf(z17)));
            this.f50506f.c(z17);
        }
    }

    private void p(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass173(z17));
    }

    @java.lang.Deprecated
    private void q(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.j(z17);
        }
    }

    private void r(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f50508h;
        adVar.G = z17;
        adVar.f48829z.i().b(adVar.G);
    }

    private void s(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.b(z17);
        }
        this.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> B() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mapsdk.internal.ee.class, com.tencent.mapsdk.internal.si.class);
        hashMap.put(com.tencent.mapsdk.internal.cd.class, com.tencent.mapsdk.internal.rk.class);
        return hashMap;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final java.lang.String G() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass47>) new com.tencent.mapsdk.internal.tk.AnonymousClass47(), (com.tencent.mapsdk.internal.tk.AnonymousClass47) "");
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final java.lang.String H() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass48>) new com.tencent.mapsdk.internal.tk.AnonymousClass48(), (com.tencent.mapsdk.internal.tk.AnonymousClass48) "");
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final com.tencent.mapsdk.internal.bs J() {
        return this.f50506f;
    }

    public final void K() {
        com.tencent.mapsdk.internal.rw rwVar;
        if (!this.f50517q || (rwVar = this.f50509i) == null) {
            return;
        }
        rwVar.b();
    }

    public final void L() {
        com.tencent.mapsdk.internal.aa.a aVar;
        java.io.File[] listFiles;
        java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.qz> map;
        com.tencent.mapsdk.internal.re reVar = this.H;
        if (reVar != null && (map = reVar.f51154g) != null && !map.isEmpty()) {
            for (com.tencent.mapsdk.internal.qz qzVar : (com.tencent.mapsdk.internal.qz[]) reVar.f51154g.values().toArray(new com.tencent.mapsdk.internal.qz[reVar.f51154g.keySet().size()])) {
                qzVar.remove();
            }
        }
        android.content.Context context = getContext();
        if (context != null) {
            java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b().getPath() + "/tile/");
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                for (java.io.File file2 : listFiles) {
                    if (currentTimeMillis - file2.lastModified() > java.util.concurrent.TimeUnit.DAYS.toMillis(7L)) {
                        com.tencent.mapsdk.internal.ks.b(file2);
                    }
                }
            }
        }
        a((com.tencent.mapsdk.internal.ox) null);
        this.G = null;
        this.f50508h.b(this);
        this.I.clear();
        com.tencent.mapsdk.internal.ne.d dVar = this.f50526z;
        if (dVar != null) {
            com.tencent.mapsdk.internal.ne.this.b(dVar);
        }
        com.tencent.mapsdk.internal.aa aaVar = this.f50508h.f48818o;
        if (aaVar != null && (aVar = aaVar.f48756d) != null) {
            aVar.destroy();
        }
        this.f50523w = true;
        com.tencent.mapsdk.internal.sa saVar = this.A;
        if (saVar != null) {
            saVar.f51321h = true;
            saVar.f51319f = false;
            saVar.f51322i.sendEmptyMessage(130819);
        }
        com.tencent.mapsdk.internal.bi biVar = this.f50510j;
        if (biVar != null) {
            biVar.b();
        }
        com.tencent.mapsdk.internal.rw rwVar = this.f50509i;
        if (rwVar != null) {
            rwVar.f51287b.removeCallbacksAndMessages(null);
            rwVar.c();
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            com.tencent.mapsdk.internal.lw lwVar = tkVar.f51663g;
            if (lwVar != null) {
                lwVar.b(tkVar.f51664h);
                tkVar.f51663g.a();
            }
            if (tkVar.f51661e != 0) {
                long j17 = tkVar.f51661e;
                synchronized (tkVar.f51669m) {
                    tkVar.f51661e = 0L;
                    tkVar.f51660d.nativeDestroyEngine(j17);
                }
            }
            tkVar.f51666j = null;
            tkVar.f51660d.destory();
        }
    }

    public final java.lang.String M() {
        return a(this.f50508h.A.f52420m);
    }

    public final int[] N() {
        int max = this.f48998a.getMapUserSetting().getMinScaleLevel() != -1 ? java.lang.Math.max(3, this.f48998a.getMapUserSetting().getMinScaleLevel()) : 3;
        int maxScaleLevel = this.f48998a.getMapUserSetting().getMaxScaleLevel();
        int i17 = 22;
        if (maxScaleLevel == -1) {
            com.tencent.mapsdk.internal.az azVar = this.f50512l;
            if (azVar == null || !azVar.C()) {
                com.tencent.mapsdk.internal.az azVar2 = this.f50512l;
                if (azVar2 == null || !azVar2.s().f48778f) {
                    i17 = 20;
                }
            } else {
                i17 = 19;
            }
        } else {
            i17 = java.lang.Math.min(maxScaleLevel, 22);
        }
        e(max);
        return new int[]{i17, max};
    }

    public final com.tencent.mapsdk.internal.bn O() {
        com.tencent.mapsdk.internal.az azVar = this.f50512l;
        if (azVar == null) {
            return null;
        }
        return azVar.getMapContext();
    }

    @java.lang.Deprecated
    public final boolean P() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return tkVar.h();
        }
        return false;
    }

    public final java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> Q() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return null;
        }
        return tkVar.x();
    }

    public final boolean R() {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return false;
        }
        return ((java.lang.Boolean) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass53>) new com.tencent.mapsdk.internal.tk.AnonymousClass53(1), (com.tencent.mapsdk.internal.tk.AnonymousClass53) java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // com.tencent.mapsdk.internal.fo
    public final void d_() {
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.mapsdk.internal.ey f() {
        return this.f50513m;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.tencentmap.mapsdk.maps.VisualSettings g() {
        return this.f50514n;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.mapsdk.internal.v h() {
        return this.f50520t;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.mapsdk.internal.tk i() {
        return this.f50506f;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final android.graphics.Rect j() {
        return this.f50515o;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final float k() {
        if (getContext() == null) {
            return 1.0f;
        }
        return com.tencent.mapsdk.internal.hs.a(getContext());
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener t() {
        return this.f50512l.T();
    }

    public final java.lang.String toString() {
        com.tencent.mapsdk.internal.v vVar = this.f50520t;
        return vVar != null ? vVar.toString() : "";
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener u() {
        return this.f50512l.y();
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener v() {
        return this.f50512l.W();
    }

    private void b(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.T.size() == 0) {
            return;
        }
        boolean z17 = true;
        while (z17) {
            com.tencent.mapsdk.internal.ne.a poll = this.T.poll();
            if (poll != null) {
                try {
                    poll.a(gl10);
                } catch (java.lang.Exception unused) {
                }
            } else {
                z17 = false;
            }
        }
    }

    private void d(int i17, int i18) {
        android.graphics.Rect rect = this.f50515o;
        if (rect != null) {
            rect.set(0, 0, i17, i18);
        }
    }

    private boolean g(int i17) {
        com.tencent.tencentmap.mapsdk.maps.CustomRender customRender;
        if (i17 != com.tencent.mapsdk.internal.ne.b.AboveToplayer.f50535g || (customRender = this.F) == null) {
            return false;
        }
        customRender.onDrawFrame();
        return true;
    }

    private void h(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass113(i17));
    }

    private void i(int i17) {
        com.tencent.mapsdk.internal.ng a17;
        com.tencent.mapsdk.internal.bi biVar = this.f50510j;
        if (biVar == null || (a17 = biVar.a((java.lang.Class<com.tencent.mapsdk.internal.ng>) com.tencent.mapsdk.internal.oc.class, i17)) == null) {
            return;
        }
        a17.remove();
    }

    private void j(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass65(i17));
    }

    private void l(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass164(i17));
        }
    }

    private void t(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass45(z17));
        }
    }

    private void u(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f50508h;
        if (adVar != null) {
            adVar.L = z17;
        }
    }

    private void v(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f50508h;
        if (adVar != null) {
            adVar.M = z17;
        }
    }

    public final boolean a(android.content.Context context, com.tencent.mapsdk.internal.ol olVar, com.tencent.mapsdk.internal.lu luVar, com.tencent.mapsdk.internal.oo ooVar) {
        com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle;
        this.f50521u = olVar;
        com.tencent.mapsdk.internal.oq c17 = olVar.c();
        this.U = c17;
        com.tencent.mapsdk.internal.om e17 = olVar.e();
        this.f50524x = e17;
        this.f50518r = new com.tencent.mapsdk.internal.w(context, this, c17, e17);
        if (this.f50509i == null) {
            com.tencent.mapsdk.internal.rw rwVar = new com.tencent.mapsdk.internal.rw(this, luVar);
            this.f50509i = rwVar;
            com.tencent.mapsdk.internal.az azVar = this.f50512l;
            if (azVar != null) {
                azVar.a(rwVar);
            }
        }
        boolean a17 = a(context, ooVar);
        if (a17) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = this.f48998a;
            if (tencentMapOptions != null && (trafficStyle = tencentMapOptions.getTrafficStyle()) != null) {
                this.f50506f.a(trafficStyle);
            }
            com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
            if (0 != tkVar.f51661e) {
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass148());
            }
            this.f50506f.g(true);
            this.f50506f.h(true);
            this.f50506f.c(20);
            this.f50506f.d(3);
            this.f50508h.a(this);
            int i17 = this.P;
            b(i17, i17);
        }
        return a17;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.mapsdk.internal.ad c() {
        return this.f50508h;
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.mapsdk.internal.bi e() {
        return this.f50510j;
    }

    public final void f(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.g(z17);
        }
    }

    private void c(int i17, int i18) {
        if (this.f50506f == null) {
            return;
        }
        this.f50522v = true;
        this.f50515o.set(0, 0, i17, i18);
        a(0, 0, i17, i18, false);
        this.f50508h.n();
    }

    private void e(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 > 255) {
            i18 = 255;
        }
        int i19 = 255 - i18;
        if (i19 == 0) {
            i19 = 1;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass112(i17, i19));
    }

    private void k(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass174(i17));
    }

    private void m(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass179(i17));
    }

    private void q(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass162(i17));
    }

    private boolean d(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return false;
        }
        return ((java.lang.Boolean) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass117>) new com.tencent.mapsdk.internal.tk.AnonymousClass117(str), (com.tencent.mapsdk.internal.tk.AnonymousClass117) java.lang.Boolean.FALSE)).booleanValue();
    }

    private void f(int i17, int i18) {
        this.E = i17;
        this.D = i18;
    }

    private void h(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass29(i17, i18));
        }
    }

    @java.lang.Deprecated
    private void n(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.f(i17);
            this.f50522v = true;
        }
    }

    @java.lang.Deprecated
    private void o(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.g(i17);
        }
    }

    private static boolean p(int i17) {
        return com.tencent.mapsdk.internal.v.b(i17);
    }

    public final void j(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.l(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final java.lang.Object l() {
        return this.f48998a.getExtSurface();
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final boolean r() {
        return this.f48998a.isMSAA();
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener s() {
        return this.f50512l.S();
    }

    /* loaded from: classes13.dex */
    public class c {

        /* renamed from: b, reason: collision with root package name */
        private java.util.List<com.tencent.mapsdk.internal.fi> f50537b = new java.util.concurrent.CopyOnWriteArrayList();

        public c() {
        }

        private com.tencent.tencentmap.mapsdk.maps.model.Language a() {
            if (com.tencent.mapsdk.internal.ne.this.f50506f != null) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
                return com.tencent.tencentmap.mapsdk.maps.model.Language.wrap(tkVar.f51660d.nativeGetLanguage(tkVar.f51661e));
            }
            return com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
        }

        private void b(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
            if (com.tencent.mapsdk.internal.ne.this.f50506f != null) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
                int languageType = language.getLanguageType();
                if (tkVar.f51661e != 0) {
                    tkVar.f51660d.nativeSetLanguage(tkVar.f51661e, languageType);
                }
                com.tencent.mapsdk.internal.ne.e(com.tencent.mapsdk.internal.ne.this);
                com.tencent.mapsdk.internal.ne.this.f50522v = true;
                a(language);
            }
        }

        public final void a(com.tencent.mapsdk.internal.fi fiVar) {
            if (fiVar == null) {
                return;
            }
            synchronized (this.f50537b) {
                if (!this.f50537b.contains(fiVar)) {
                    this.f50537b.add(fiVar);
                }
            }
        }

        public final void b(com.tencent.mapsdk.internal.fi fiVar) {
            if (fiVar == null) {
                return;
            }
            this.f50537b.remove(fiVar);
        }

        public final synchronized void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
            for (com.tencent.mapsdk.internal.fi fiVar : this.f50537b) {
                if (fiVar != null) {
                    fiVar.a(language);
                }
            }
        }
    }

    private void b(com.tencent.mapsdk.internal.rt rtVar) {
        com.tencent.mapsdk.internal.rw rwVar = this.f50509i;
        if (rwVar != null) {
            rwVar.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass6(rtVar));
        }
    }

    public final void e(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.f(z17);
        }
    }

    public final void g(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.h(z17);
        }
    }

    public final void k(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass44(z17));
        }
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final float p() {
        return this.f48998a.getMapFrameRate();
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final boolean q() {
        return this.f48998a.isOpaque();
    }

    private void f(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass36(str));
        }
    }

    public final void d(boolean z17) {
        if (this.f50506f != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setIndoorEnabled:".concat(java.lang.String.valueOf(z17)));
            this.f50506f.d(z17);
        }
    }

    public final void h(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.k(z17);
    }

    public final void i(boolean z17) {
        if (this.A == null) {
            this.A = new com.tencent.mapsdk.internal.sa(this);
        }
        com.tencent.mapsdk.internal.sa saVar = this.A;
        saVar.f51319f = z17;
        if (z17) {
            saVar.f51322i.sendEmptyMessage(130817);
        } else {
            saVar.f51322i.sendEmptyMessage(130819);
        }
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final int m() {
        return this.f48998a.getExtSurfaceWidth();
    }

    @Override // com.tencent.mapsdk.internal.bn, com.tencent.mapsdk.internal.bd
    public final boolean o() {
        return com.tencent.mapsdk.internal.v.b(this.f50508h.m());
    }

    @java.lang.Deprecated
    private void g(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.b(i17, i18);
        }
    }

    public final void b(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || polygonInfo == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass101(polygonInfo));
    }

    public final void e(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.d(i17);
        }
        com.tencent.mapsdk.internal.v vVar = this.f50520t;
        if (vVar != null) {
            vVar.e(i17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bd
    public final int n() {
        return this.f48998a.getExtSurfaceHeight();
    }

    private int c(com.tencent.mapsdk.internal.fw fwVar) {
        if (this.f50510j == null || fwVar.f49493u == null) {
            return -1;
        }
        com.tencent.mapsdk.internal.oc ocVar = (com.tencent.mapsdk.internal.oc) this.f50510j.a((com.tencent.mapsdk.internal.bi) b(fwVar));
        if (ocVar != null) {
            return ocVar.b();
        }
        return -1;
    }

    private void h(java.lang.String str) {
        com.tencent.mapsdk.internal.om omVar = this.f50524x;
        if (omVar == null) {
            return;
        }
        omVar.a(str);
    }

    public final void f(int i17) {
        com.tencent.mapsdk.internal.ad adVar = this.f50508h;
        if (adVar != null) {
            adVar.b(i17);
        }
        if (i17 == 8) {
            a(com.tencent.mapsdk.internal.ne.e.NIGHT);
        } else {
            a(com.tencent.mapsdk.internal.ne.e.DAY);
        }
    }

    public static com.tencent.mapsdk.internal.oe b(com.tencent.mapsdk.internal.fw fwVar) {
        com.tencent.mapsdk.internal.oe oeVar = new com.tencent.mapsdk.internal.oe(fwVar.f49493u, fwVar.f49474b);
        if (!android.text.TextUtils.isEmpty(fwVar.f49480h)) {
            com.tencent.map.lib.models.SubMarkerInfo subMarkerInfo = new com.tencent.map.lib.models.SubMarkerInfo();
            subMarkerInfo.iconName(fwVar.f49480h);
            subMarkerInfo.iconWidth(fwVar.f49481i);
            subMarkerInfo.iconHeight(fwVar.f49482j);
            subMarkerInfo.avoidAnnotation(true);
            subMarkerInfo.avoidOtherMarker(true);
            oeVar.subMarkerInfo(subMarkerInfo);
        }
        oeVar.iconWidth(fwVar.f49475c);
        oeVar.iconHeight(fwVar.f49476d);
        oeVar.avoidAnnotation(true);
        oeVar.avoidOtherMarker(true);
        float f17 = fwVar.f49479g;
        oeVar.scale(f17, f17);
        oeVar.priority(fwVar.f49490r);
        oeVar.displayLevel(2);
        oeVar.minScaleLevel(fwVar.f49491s);
        oeVar.maxScaleLevel(fwVar.f49492t);
        return oeVar;
    }

    private int g(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass50>) new com.tencent.mapsdk.internal.tk.AnonymousClass50(str), (com.tencent.mapsdk.internal.tk.AnonymousClass50) (-1))).intValue();
    }

    public final void d(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.c(i17);
        }
        com.tencent.mapsdk.internal.v vVar = this.f50520t;
        if (vVar != null) {
            vVar.d(i17);
        }
    }

    private void e(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass156(str));
    }

    public final void c(boolean z17) {
        this.X = z17;
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass143(z17));
        }
    }

    public final void c(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.b(i17);
        }
    }

    public final void c(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.b(str);
        }
    }

    private void a(com.tencent.mapsdk.internal.ne.e eVar) {
        java.lang.String str = "skybox_" + eVar.name().toLowerCase(java.util.Locale.ROOT) + ".png";
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar.f51661e == 0 || tkVar.f51666j == null) {
            return;
        }
        tkVar.f51660d.nativeSetSkyBoxTexture(tkVar.f51661e, str);
    }

    public final void b(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            this.f50505ah = str;
            if (tkVar.f51661e != 0) {
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass42(str));
            }
        }
    }

    private boolean a(android.content.Context context, com.tencent.mapsdk.internal.oo ooVar) {
        java.lang.String c17 = this.U.c();
        java.lang.String a17 = this.U.a();
        java.lang.String b17 = this.U.b();
        try {
            if (!this.f50521u.a()) {
                c17 = this.U.d();
            }
            java.lang.String str = c17;
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "newEngine config:".concat(java.lang.String.valueOf(str)));
            this.f50518r.a();
            return this.f50506f.a(context, ooVar, this.f50518r, str, a17, b17);
        } finally {
            this.f50518r.b();
        }
    }

    private static android.graphics.Point[] b(android.graphics.Rect rect) {
        return new android.graphics.Point[]{new android.graphics.Point(rect.centerX(), rect.centerY()), new android.graphics.Point(rect.left, rect.top), new android.graphics.Point(rect.left, rect.bottom), new android.graphics.Point(rect.right, rect.top), new android.graphics.Point(rect.right, rect.bottom)};
    }

    public final void b(boolean z17) {
        if (this.Y == z17) {
            return;
        }
        this.Y = z17;
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(z17);
        }
    }

    public final void a(com.tencent.mapsdk.internal.oq oqVar) {
        if (oqVar == null) {
            return;
        }
        this.U = oqVar;
        if (this.f50506f != null) {
            java.lang.String c17 = oqVar.c();
            java.lang.String a17 = this.U.a();
            java.lang.String b17 = this.U.b();
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "resetMapPath config:".concat(java.lang.String.valueOf(c17)));
            if (com.tencent.mapsdk.internal.hr.a(b17) || com.tencent.mapsdk.internal.hr.a(a17)) {
                return;
            }
            try {
                this.f50518r.a();
                com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass37(c17, a17, b17));
            } finally {
                this.f50518r.b();
            }
        }
    }

    private void b(java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass103(list));
        }
    }

    private java.lang.String b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass170(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass170) null);
        }
        return null;
    }

    public final void b(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(i17);
        }
    }

    @java.lang.Deprecated
    private void b(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(i17, i18, i19);
    }

    public final void b(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(i17 + 50, i18 + 50);
        }
    }

    public final void a(com.tencent.mapsdk.internal.ne.a aVar) {
        try {
            this.T.put(aVar);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(e17.getMessage(), e17);
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final void b(com.tencent.mapsdk.internal.oz ozVar) {
        if (this.I.isEmpty()) {
            return;
        }
        this.I.remove(ozVar);
    }

    public final void b(com.tencent.mapsdk.internal.fi fiVar) {
        if (this.f50525y == null) {
            this.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        this.f50525y.b(fiVar);
    }

    private void a(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f50515o;
        if (rect2 == null || rect == null) {
            return;
        }
        this.C = rect;
        int width = rect2.width();
        int height = this.f50515o.height();
        int i17 = rect.left;
        int i18 = rect.bottom;
        a(i17, i18, (width - rect.right) - i17, (height - i18) - rect.top, true);
    }

    public final com.tencent.mapsdk.engine.jni.models.TappedElement b(float f17, float f18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return tkVar.a(f17, f18);
        }
        return null;
    }

    private void b(com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.az azVar = this.f50512l;
        if (azVar != null) {
            azVar.b(fbVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean b() {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting mapUserSetting = this.f48998a.getMapUserSetting();
        int pendingMaxScaleLevel = mapUserSetting.getPendingMaxScaleLevel();
        if (pendingMaxScaleLevel != mapUserSetting.getMaxScaleLevel() && this.f50520t.f52409b.f52444m < pendingMaxScaleLevel) {
            mapUserSetting.setMaxZoomLevel(pendingMaxScaleLevel);
            d(pendingMaxScaleLevel);
        }
        int pendingMinScaleLevel = mapUserSetting.getPendingMinScaleLevel();
        if (pendingMinScaleLevel == mapUserSetting.getMinScaleLevel()) {
            return false;
        }
        if (this.f50520t.f52409b.f52444m <= pendingMinScaleLevel) {
            return true;
        }
        mapUserSetting.setMinZoomLevel(pendingMinScaleLevel);
        e(pendingMinScaleLevel);
        return false;
    }

    public final void a(int i17, int i18, int i19, int i27, boolean z17) {
        this.f50506f.a(i17, i18, i19, i27);
        com.tencent.mapsdk.core.utils.log.LogUtil.a(this.K).c(com.tencent.mapsdk.internal.la.a.f50267h, "setViewport, leftBomX: " + i17 + ", leftBomY: " + i18 + ", visibleWidth: " + i19 + ", visibleHeight: " + i27);
        this.Z = i19;
        this.f50498aa = i27;
        if (z17) {
            a(this.f50499ab, this.f50500ac, this.f50501ad);
        }
    }

    public final void a(float f17, float f18, boolean z17) {
        this.f50499ab = f17;
        this.f50500ac = f18;
        double d17 = f17;
        double d18 = f18;
        if (this.f50515o != null) {
            if (this.f50498aa > 0) {
                d18 = 0.5d - (((0.5d - d18) * r2.height()) / this.f50498aa);
            }
            if (this.Z > 0) {
                d17 = 0.5d - (((0.5d - d17) * this.f50515o.width()) / this.Z);
            }
        }
        this.f50506f.a((float) d17, (float) d18, z17);
    }

    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        int i17;
        if (this.f50506f == null) {
            return false;
        }
        java.util.Collection<com.tencent.mapsdk.internal.nh<?>> values = this.f50510j.f48965e.values();
        if (!values.isEmpty()) {
            java.util.Iterator<com.tencent.mapsdk.internal.nh<?>> it = values.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
        this.f50508h.f48818o.g();
        if (this.T.size() != 0) {
            boolean z17 = true;
            while (z17) {
                com.tencent.mapsdk.internal.ne.a poll = this.T.poll();
                if (poll != null) {
                    try {
                        poll.a(gl10);
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    z17 = false;
                }
            }
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass9());
        com.tencent.mapsdk.internal.tk tkVar2 = this.f50506f;
        com.tencent.mapsdk.internal.tk.AnonymousClass10 anonymousClass10 = new com.tencent.mapsdk.internal.tk.AnonymousClass10();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean z18 = ((java.lang.Boolean) tkVar2.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass10>) anonymousClass10, (com.tencent.mapsdk.internal.tk.AnonymousClass10) bool)).booleanValue() || this.f50522v;
        if (z18) {
            com.tencent.mapsdk.internal.ne.g c17 = this.f50519s.c();
            if (c17 == null) {
                this.f50510j.f48963c.f48955j.a(gl10);
            } else if (this.f50519s != null && this.f50506f.h()) {
                this.f50519s.a(gl10, this.f50511k);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mapsdk.internal.tk tkVar3 = this.f50506f;
            ((java.lang.Boolean) tkVar3.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass108>) new com.tencent.mapsdk.internal.tk.AnonymousClass108(), (com.tencent.mapsdk.internal.tk.AnonymousClass108) bool)).booleanValue();
            this.f50522v = false;
            if (!this.f50512l.O()) {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                java.lang.Object c18 = com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.f50259ab, "nativeTotalTime", this.K);
                long longValue = c18 != null ? ((java.lang.Long) c18).longValue() : 0L;
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50259ab, "nativeTime", java.lang.Long.valueOf(elapsedRealtime2), this.K);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50259ab, "nativeTotalTime", java.lang.Long.valueOf(longValue + elapsedRealtime2), this.K);
                com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.la.f50259ab, this.K);
            }
            if (!this.f50519s.b() && c17 != null) {
                if (!c17.c()) {
                    if (!this.f50506f.h() && (i17 = c17.f50551e) < 100) {
                        c17.f50551e = i17 + 1;
                    } else {
                        c17.f50551e = 0;
                        this.f50519s.a(gl10);
                    }
                } else {
                    c17.f50551e = 0;
                }
            }
        }
        com.tencent.mapsdk.internal.nd ndVar = this.f50511k;
        if (ndVar != null) {
            ndVar.a();
        }
        return z18;
    }

    private void a(com.tencent.mapsdk.internal.rt rtVar) {
        com.tencent.mapsdk.internal.rw rwVar = this.f50509i;
        if (rwVar != null) {
            rwVar.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass5(rtVar));
        }
    }

    public final void a(boolean z17) {
        if (this.f50509i == null || this.f50517q == z17) {
            return;
        }
        this.f50517q = z17;
        if (z17) {
            com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
            if (tkVar != null) {
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass122());
            }
            com.tencent.mapsdk.internal.rw rwVar = this.f50509i;
            com.tencent.mapsdk.internal.ne neVar = rwVar.f51286a;
            if (neVar != null) {
                neVar.f50508h.a(rwVar);
                com.tencent.mapsdk.core.utils.log.LogUtil.a(rwVar.f51286a.K).c(com.tencent.mapsdk.internal.la.a.f50266g, "open traffic");
                rwVar.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass1());
                return;
            }
            return;
        }
        com.tencent.mapsdk.internal.tk tkVar2 = this.f50506f;
        if (tkVar2 != null) {
            tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass123());
        }
        this.f50509i.c();
    }

    private void a(int[] iArr, int i17, boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || iArr == null || i17 == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass153(iArr, i17, z17));
    }

    private void a(int[] iArr, int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || iArr == null || i17 == 0) {
            return;
        }
        tkVar.a(iArr, i17);
    }

    public final int a(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || polygonInfo == null) {
            return -1;
        }
        int i17 = 0;
        int intValue = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass57>) new com.tencent.mapsdk.internal.tk.AnonymousClass57(polygonInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass57) 0)).intValue();
        if (this.V == null) {
            this.V = new com.tencent.mapsdk.internal.ll<>();
        }
        if (this.W == null) {
            this.W = new com.tencent.mapsdk.internal.ll<>();
        }
        this.V.a(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(polygonInfo.borderLineId));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            int[] iArr = polygonInfo.holeLineIds;
            if (i17 < iArr.length) {
                arrayList.add(java.lang.Integer.valueOf(iArr[i17]));
                i17++;
            } else {
                this.W.a(java.lang.Integer.valueOf(intValue), arrayList);
                return intValue;
            }
        }
    }

    private void a(int i17, boolean z17) {
        com.tencent.mapsdk.internal.ll<java.lang.Integer, java.lang.Integer> llVar;
        if (this.f50506f == null || (llVar = this.V) == null) {
            return;
        }
        java.lang.Integer a17 = llVar.a((com.tencent.mapsdk.internal.ll<java.lang.Integer, java.lang.Integer>) java.lang.Integer.valueOf(i17));
        int intValue = a17 != null ? a17.intValue() : 0;
        com.tencent.mapsdk.internal.ll<java.lang.Integer, java.util.List<java.lang.Integer>> llVar2 = this.W;
        if (llVar2 != null) {
            java.util.List<java.lang.Integer> a18 = llVar2.a((com.tencent.mapsdk.internal.ll<java.lang.Integer, java.util.List<java.lang.Integer>>) java.lang.Integer.valueOf(i17));
            int[] iArr = new int[0];
            if (a18 != null) {
                iArr = new int[a18.size()];
                for (int i18 = 0; i18 < a18.size(); i18++) {
                    iArr[i18] = a18.get(i18).intValue();
                }
            }
            com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass109(i17, intValue, z17, iArr));
        }
    }

    public final void a(int i17) {
        com.tencent.mapsdk.internal.ll<java.lang.Integer, java.lang.Integer> llVar;
        if (this.f50506f == null || (llVar = this.V) == null) {
            return;
        }
        java.lang.Integer a17 = llVar.a((com.tencent.mapsdk.internal.ll<java.lang.Integer, java.lang.Integer>) java.lang.Integer.valueOf(i17));
        int intValue = a17 != null ? a17.intValue() : 0;
        com.tencent.mapsdk.internal.ll<java.lang.Integer, java.util.List<java.lang.Integer>> llVar2 = this.W;
        if (llVar2 != null) {
            java.util.List<java.lang.Integer> a18 = llVar2.a((com.tencent.mapsdk.internal.ll<java.lang.Integer, java.util.List<java.lang.Integer>>) java.lang.Integer.valueOf(i17));
            int[] iArr = new int[0];
            if (a18 != null) {
                iArr = new int[a18.size()];
                for (int i18 = 0; i18 < a18.size(); i18++) {
                    iArr[i18] = a18.get(i18).intValue();
                }
            }
            com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass110(i17, intValue, iArr));
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Circle a(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        com.tencent.mapsdk.internal.bh bhVar = this.f50497J;
        if (bhVar == null) {
            return null;
        }
        return bhVar.a(circleOptions);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.Polyline a(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        com.tencent.mapsdk.internal.bh bhVar = this.f50497J;
        if (bhVar == null || polylineOptions == null) {
            return null;
        }
        return bhVar.a(polylineOptions);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Marker a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        com.tencent.mapsdk.internal.bh bhVar = this.f50497J;
        if (bhVar == null || markerOptions == null) {
            return null;
        }
        return bhVar.a(markerOptions);
    }

    private int a(int i17, int i18, int i19, int i27, int i28, float f17) {
        if (this.f50506f == null) {
            return -1;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 > 255) {
            i17 = 255;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 > 255) {
            i18 = 255;
        }
        if (i19 < 0) {
            i19 = 0;
        }
        if (i19 > 255) {
            i19 = 255;
        }
        if (i27 < 0) {
            i27 = 0;
        }
        if (i27 > 255) {
            i27 = 255;
        }
        com.tencent.map.lib.models.MaskLayer maskLayer = new com.tencent.map.lib.models.MaskLayer();
        maskLayer.color = new int[]{i17, i18, i19, 255 - i27};
        android.graphics.Rect rect = this.f50515o;
        if (rect != null) {
            maskLayer.width = rect.width();
            maskLayer.height = this.f50515o.height();
        }
        maskLayer.zIndex = f17;
        maskLayer.layer = i28;
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass111>) new com.tencent.mapsdk.internal.tk.AnonymousClass111(maskLayer), (com.tencent.mapsdk.internal.tk.AnonymousClass111) 0)).intValue();
    }

    private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2) {
        if (this.f50526z == null) {
            this.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = this.f50526z;
        dVar.f50538a = list;
        dVar.f50539b = list2;
        com.tencent.mapsdk.internal.ne.this.f50506f.a(list, list2);
    }

    private com.tencent.map.lib.models.AnnocationTextResult a(com.tencent.map.lib.models.AnnocationText annocationText) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        return (com.tencent.map.lib.models.AnnocationTextResult) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass33(annocationText), (com.tencent.mapsdk.internal.tk.AnonymousClass33) null);
    }

    public final void a(com.tencent.mapsdk.internal.fw fwVar) {
        com.tencent.mapsdk.internal.ng<?> a17;
        if (this.f50510j != null) {
            com.tencent.mapsdk.internal.oe b17 = b(fwVar);
            com.tencent.mapsdk.internal.bi biVar = this.f50510j;
            int i17 = fwVar.f49473a;
            com.tencent.mapsdk.internal.nh<?> nhVar = biVar.f48965e.get(b17.getClass());
            if (nhVar == null || (a17 = nhVar.a(i17)) == null) {
                return;
            }
            a17.a((com.tencent.mapsdk.internal.ng<?>) b17);
            nhVar.a(a17);
        }
    }

    private java.util.List<java.lang.Integer> a(android.graphics.Rect rect, int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        return (java.util.List) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass34(rect, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass34) null);
    }

    public final java.lang.String a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        return tkVar == null ? "" : tkVar.a(geoPoint);
    }

    public final void a(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass41(str));
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar, int i17, int i18, com.tencent.mapsdk.internal.fp fpVar) {
        android.graphics.Rect bound = ezVar.getBound(this.f50513m);
        if (bound == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        this.f50519s.a(ezVar, bound, fpVar, i17, i18);
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar, android.graphics.Rect rect, int i17, int i18, com.tencent.mapsdk.internal.fp fpVar) {
        if (ezVar == null || rect == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        this.f50519s.a(ezVar, rect, fpVar, i17, i18);
    }

    private void a(android.graphics.Rect rect, int i17, int i18, com.tencent.mapsdk.internal.fp fpVar) {
        if (rect == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        this.f50519s.a(null, rect, fpVar, i17, i18);
    }

    private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> list) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(list);
        }
    }

    private void a(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass27(i18, i17, i19, i27));
        }
    }

    public final void a(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(geoPoint, f17, f18, z17);
        }
    }

    public final void a(boolean z17, boolean z18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e || tkVar.f51666j == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass146(false, z17, false, z18));
    }

    public final void a(float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(f17);
        }
    }

    private void a(android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(rect, rect2, z17);
        }
    }

    public final void a(java.lang.String[] strArr) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass175(strArr));
    }

    public final int a(java.lang.String str, float f17, float f18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            return tkVar.a(str, f17, f18);
        }
        return 0;
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(str, str2, str3, str4, str5);
        }
    }

    public final void a(float f17, int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(f17, i17, latLng);
        }
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.RectF rectF, boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        android.graphics.Rect rect;
        if (rectF != null && (rect = this.C) != null) {
            rectF.left -= rect.left;
            rectF.top -= rect.top;
            rectF.right -= rect.right;
            rectF.bottom -= rect.bottom;
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            int i17 = this.E;
            int i18 = this.D;
            if (0 == tkVar.f51661e || (neVar = tkVar.f51666j) == null) {
                return;
            }
            neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass6(rectF, geoPoint, i17, i18, z17));
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a(float f17, float f18) {
        if (this.f50520t == null) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting mapUserSetting = this.f48998a.getMapUserSetting();
        int pendingMaxScaleLevel = mapUserSetting.getPendingMaxScaleLevel();
        if (pendingMaxScaleLevel != mapUserSetting.getMaxScaleLevel()) {
            if (f18 <= com.tencent.mapsdk.internal.v.b.a(pendingMaxScaleLevel)) {
                mapUserSetting.setMaxZoomLevel(pendingMaxScaleLevel);
                d(pendingMaxScaleLevel);
            }
            if (f17 > f18) {
                return true;
            }
        }
        int pendingMinScaleLevel = mapUserSetting.getPendingMinScaleLevel();
        if (pendingMinScaleLevel != mapUserSetting.getMinScaleLevel()) {
            if (f18 >= com.tencent.mapsdk.internal.v.b.a(pendingMinScaleLevel)) {
                mapUserSetting.setMinZoomLevel(pendingMinScaleLevel);
                e(pendingMinScaleLevel);
            }
            if (f17 < f18) {
                return true;
            }
        }
        return false;
    }

    private void a(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e || tkVar.f51666j == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass194(i17, i18, i19));
    }

    public final void a(com.tencent.mapsdk.internal.ox oxVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.f51665i = oxVar;
        }
    }

    private void a(com.tencent.mapsdk.internal.oy oyVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.f51660d.setMapCallbackGetGLContext(oyVar);
        }
    }

    public final void a(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass28(i17, i18));
        }
    }

    private void a(int i17, float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar != null) {
            tkVar.a(i17, f17);
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        if (this.f50525y == null) {
            this.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.ne.c cVar = this.f50525y;
        com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
        if (tkVar != null) {
            int languageType = language.getLanguageType();
            if (tkVar.f51661e != 0) {
                tkVar.f51660d.nativeSetLanguage(tkVar.f51661e, languageType);
            }
            com.tencent.mapsdk.internal.ne.this.f50522v = true;
            com.tencent.mapsdk.internal.ne.this.f50522v = true;
            cVar.a(language);
        }
    }

    public final void a(com.tencent.mapsdk.internal.fi fiVar) {
        if (this.f50525y == null) {
            this.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        this.f50525y.a(fiVar);
    }

    public final void a(com.tencent.mapsdk.internal.oz ozVar) {
        java.util.List<com.tencent.mapsdk.internal.oz> list = this.I;
        if (list != null) {
            list.add(ozVar);
        }
    }

    private float a(double d17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.ey eyVar;
        if (geoPoint != null && this.f50520t != null && (eyVar = this.f50513m) != null) {
            double metersPerPixel = eyVar.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d17 / metersPerPixel);
            }
        }
        return 0.0f;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.CustomRender customRender) {
        this.F = customRender;
        this.f50522v = true;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay a(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        if (this.f50506f == null) {
            return null;
        }
        com.tencent.mapsdk.internal.hg hgVar = this.f49000c;
        if (hgVar != null) {
            hgVar.h().a();
        }
        return (com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nl(vectorHeatOverlayOptions));
    }

    public final <V extends com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay> V a(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        if (this.f50506f == null) {
            return null;
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar = this.f49000c;
            if (hgVar != null) {
                hgVar.h().a();
            }
            return (com.tencent.mapsdk.internal.nk) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nl((com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) vectorOverlayProvider));
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar2 = this.f49000c;
            if (hgVar2 != null) {
                hgVar2.i().f49693a++;
            }
            return (com.tencent.mapsdk.internal.nw) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.ny((com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) vectorOverlayProvider));
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar3 = this.f49000c;
            if (hgVar3 != null) {
                hgVar3.j().f49678a++;
            }
            return (com.tencent.mapsdk.internal.nn) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.np((com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) vectorOverlayProvider));
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar4 = this.f49000c;
            if (hgVar4 != null) {
                hgVar4.k().f49690a++;
            }
            return (com.tencent.mapsdk.internal.of) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.oh(this.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) vectorOverlayProvider));
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar5 = this.f49000c;
            if (hgVar5 != null) {
                hgVar5.l().f49685a++;
            }
            return (com.tencent.mapsdk.internal.of) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.oh(this.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) {
            com.tencent.mapsdk.internal.hg hgVar6 = this.f49000c;
            if (hgVar6 != null) {
                hgVar6.m().f49767a++;
            }
            return (com.tencent.mapsdk.internal.oi) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.ok((com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) vectorOverlayProvider));
        }
        if (!(vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider)) {
            return null;
        }
        com.tencent.mapsdk.internal.hg hgVar7 = this.f49000c;
        if (hgVar7 != null) {
            hgVar7.n().f49691a++;
        }
        return (com.tencent.mapsdk.internal.ns) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nr((com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) vectorOverlayProvider));
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        if (this.f50506f == null) {
            return;
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) {
            com.tencent.mapsdk.internal.nk nkVar = (com.tencent.mapsdk.internal.nk) this.f50510j.a(com.tencent.mapsdk.internal.nk.class, ((com.tencent.mapsdk.internal.nk) vectorOverlay).b());
            if (nkVar != null) {
                nkVar.a((com.tencent.mapsdk.internal.nk) new com.tencent.mapsdk.internal.nl((com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) {
            com.tencent.mapsdk.internal.nw nwVar = (com.tencent.mapsdk.internal.nw) this.f50510j.a(com.tencent.mapsdk.internal.nw.class, ((com.tencent.mapsdk.internal.nw) vectorOverlay).b());
            if (nwVar != null) {
                nwVar.a((com.tencent.mapsdk.internal.nw) new com.tencent.mapsdk.internal.ny((com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) {
            com.tencent.mapsdk.internal.nn nnVar = (com.tencent.mapsdk.internal.nn) this.f50510j.a(com.tencent.mapsdk.internal.nn.class, ((com.tencent.mapsdk.internal.nn) vectorOverlay).b());
            if (nnVar != null) {
                nnVar.a((com.tencent.mapsdk.internal.nn) new com.tencent.mapsdk.internal.np((com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) {
            com.tencent.mapsdk.internal.of ofVar = (com.tencent.mapsdk.internal.of) this.f50510j.a(com.tencent.mapsdk.internal.of.class, ((com.tencent.mapsdk.internal.of) vectorOverlay).b());
            if (ofVar != null) {
                ofVar.a((com.tencent.mapsdk.internal.of) new com.tencent.mapsdk.internal.oh(this.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) {
            com.tencent.mapsdk.internal.of ofVar2 = (com.tencent.mapsdk.internal.of) this.f50510j.a(com.tencent.mapsdk.internal.of.class, ((com.tencent.mapsdk.internal.of) vectorOverlay).b());
            if (ofVar2 != null) {
                ofVar2.a((com.tencent.mapsdk.internal.of) new com.tencent.mapsdk.internal.oh(this.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) {
            com.tencent.mapsdk.internal.oi oiVar = (com.tencent.mapsdk.internal.oi) this.f50510j.a(com.tencent.mapsdk.internal.oi.class, ((com.tencent.mapsdk.internal.oi) vectorOverlay).b());
            if (oiVar != null) {
                oiVar.a((com.tencent.mapsdk.internal.oi) new com.tencent.mapsdk.internal.ok((com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) vectorOverlayProvider));
                return;
            } else {
                a(vectorOverlayProvider);
                return;
            }
        }
        if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) {
            com.tencent.mapsdk.internal.ns nsVar = (com.tencent.mapsdk.internal.ns) this.f50510j.a(com.tencent.mapsdk.internal.ns.class, ((com.tencent.mapsdk.internal.ns) vectorOverlay).b());
            if (nsVar != null) {
                nsVar.a((com.tencent.mapsdk.internal.ns) new com.tencent.mapsdk.internal.nr((com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay a(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        if (this.f50506f == null) {
            return null;
        }
        com.tencent.mapsdk.internal.hg hgVar = this.f49000c;
        if (hgVar != null) {
            hgVar.o().f49692a++;
        }
        return (com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nv(this.f50506f.A(), groundOverlayOptions));
    }

    private com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay a(com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions intersectionOverlayOptions) {
        if (this.f50506f == null) {
            return null;
        }
        return (com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay) this.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.ob(intersectionOverlayOptions));
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        com.tencent.mapsdk.internal.az azVar = this.f50512l;
        if (azVar == null) {
            return;
        }
        azVar.a(overSeaTileProvider);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(trafficStyle);
    }

    private void a(com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.az azVar = this.f50512l;
        if (azVar != null) {
            azVar.a(fbVar);
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50506f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(str, str2);
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17) {
        if (this.f50506f == null) {
            return;
        }
        if (latLngBounds != null && !latLngBounds.isEmptySpan()) {
            this.f50506f.a(new double[]{latLngBounds.getLonWest(), latLngBounds.getLatSouth(), latLngBounds.getLonEast(), latLngBounds.getLatNorth()}, new double[]{0.0d, 0.0d, this.Z, this.f50498aa}, i17);
        } else {
            this.f50506f.a((double[]) null, (double[]) null, 0);
        }
    }

    private void a(com.tencent.mapsdk.internal.pb pbVar) {
        this.G = pbVar;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.L = onVectorOverlayClickListener;
    }

    private boolean a(float f17, float f18, com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.tk tkVar;
        if (this.M == null) {
            com.tencent.mapsdk.internal.nh<?> nhVar = this.f50510j.f48965e.get(com.tencent.mapsdk.internal.nr.class);
            if ((nhVar != null ? nhVar.f() : false) && (tkVar = this.f50506f) != null) {
                tkVar.f51660d.scheduleClickOnNextRender(tkVar.f51661e, f17, f18);
                this.M = fbVar;
                return true;
            }
        }
        this.M = null;
        return false;
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a() {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting mapUserSetting = this.f48998a.getMapUserSetting();
        int pendingMinScaleLevel = mapUserSetting.getPendingMinScaleLevel();
        if (pendingMinScaleLevel != mapUserSetting.getMinScaleLevel() && this.f50520t.f52409b.f52444m > pendingMinScaleLevel) {
            mapUserSetting.setMinZoomLevel(pendingMinScaleLevel);
            e(pendingMinScaleLevel);
        }
        int pendingMaxScaleLevel = mapUserSetting.getPendingMaxScaleLevel();
        if (pendingMaxScaleLevel == mapUserSetting.getMaxScaleLevel()) {
            return false;
        }
        if (this.f50520t.f52409b.f52444m >= pendingMaxScaleLevel) {
            return true;
        }
        mapUserSetting.setMaxZoomLevel(pendingMaxScaleLevel);
        d(pendingMaxScaleLevel);
        return false;
    }

    private void a(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> pair;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener;
        if (j17 > 0) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation = this.f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18));
            com.tencent.mapsdk.internal.nh<?> nhVar = this.f50510j.f48965e.get(com.tencent.mapsdk.internal.nr.class);
            if (nhVar != null) {
                pair = nhVar.a(fromScreenLocation, j17, str, str2);
            } else {
                pair = new android.util.Pair<>(null, null);
            }
            java.lang.Object obj = pair.first;
            if (obj != null && (onVectorOverlayClickListener = this.L) != null) {
                onVectorOverlayClickListener.onClicked((com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay) obj, (com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject) pair.second);
            }
        } else {
            this.M.b(f17, f18);
        }
        this.M = null;
    }
}
