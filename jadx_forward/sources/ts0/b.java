package ts0;

/* loaded from: classes10.dex */
public abstract class b implements ts0.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f503052a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f503053b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f503054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f503055d;

    /* renamed from: e, reason: collision with root package name */
    public final us0.c f503056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f503057f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f503058g;

    /* renamed from: h, reason: collision with root package name */
    public ts0.a f503059h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f503060i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f503061j;

    /* renamed from: k, reason: collision with root package name */
    public final di3.g0 f503062k;

    /* renamed from: l, reason: collision with root package name */
    public final ts0.c f503063l;

    /* renamed from: m, reason: collision with root package name */
    public gt0.c f503064m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f503065n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.SurfaceHolder f503066o;

    /* renamed from: p, reason: collision with root package name */
    public int f503067p;

    /* renamed from: q, reason: collision with root package name */
    public android.util.Size f503068q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f503069r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Point f503070s;

    /* renamed from: t, reason: collision with root package name */
    public int f503071t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f503072u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f503073v;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f503052a = context;
        this.f503053b = "MicroMsg.BaseCommonCamera";
        this.f503054c = "MicroMsg.MMSightCameraSetting";
        this.f503055d = 2100;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper, "getMainLooper(...)");
        this.f503056e = new us0.c(mainLooper, context, this);
        this.f503058g = true;
        this.f503059h = ts0.a.f503048d;
        this.f503060i = true;
        this.f503062k = di3.g0.a();
        this.f503063l = ts0.c.f503074a;
        this.f503067p = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
        this.f503071t = -1;
    }

    public android.util.Size C(android.graphics.Point displaySize) {
        java.lang.String str = this.f503053b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displaySize, "displaySize");
        try {
            boolean D = D();
            android.util.Size[] F = F();
            if (F == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size null!!");
                return null;
            }
            di3.s c17 = di3.t.c(F, displaySize, this.f503067p, D);
            if (c17.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size still null!!");
                c17 = di3.t.h(F, new android.graphics.Point(java.lang.Math.min(displaySize.x, displaySize.y), java.lang.Math.max(displaySize.x, displaySize.y)), this.f503055d, D);
            }
            if (c17.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkMore start %s", c17.m124459x9616526c());
                c17.f314290a = c17.f314293d;
                c17.f314291b = c17.f314294e;
                c17.f314292c = c17.f314295f;
            }
            android.graphics.Point point = c17.f314290a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f503070s);
            return size;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return null;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return null;
        }
    }

    public abstract boolean D();

    public final android.graphics.Point E() {
        if (this.f503068q == null) {
            return ai3.d.f(this.f503052a);
        }
        android.util.Size size = this.f503068q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(size);
        int width = size.getWidth();
        android.util.Size size2 = this.f503068q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(size2);
        return new android.graphics.Point(width, size2.getHeight());
    }

    public abstract android.util.Size[] F();

    public boolean G() {
        return this.f503059h == ts0.a.f503049e;
    }

    public void H() {
        us0.c cVar = this.f503056e;
        vs0.l lVar = cVar.f511985f;
        if (lVar != null) {
            lVar.b();
        }
        android.os.HandlerThread handlerThread = cVar.f511983d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public boolean I(int i17) {
        di3.g0 g0Var = this.f503062k;
        java.lang.String str = this.f503053b;
        try {
            boolean D = D();
            android.graphics.Point E = E();
            android.util.Size[] F = F();
            if (F == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size null!!");
                return false;
            }
            di3.s c17 = di3.t.c(F, E, i17, D);
            if (c17.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size still null!!");
                c17 = di3.t.h(F, new android.graphics.Point(java.lang.Math.min(E.x, E.y), java.lang.Math.max(E.x, E.y)), this.f503055d, D);
            }
            if (c17.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkMore start %s", c17.m124459x9616526c());
                c17.f314290a = c17.f314293d;
                c17.f314291b = c17.f314294e;
                c17.f314292c = c17.f314295f;
            }
            android.graphics.Point point = c17.f314290a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            g0Var.f314244c = size.getWidth();
            g0Var.f314243b = size.getHeight();
            android.graphics.Point point2 = c17.f314292c;
            if (point2 != null) {
                this.f503070s = point2;
            }
            J(size.getWidth(), size.getHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f503070s);
            return true;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return false;
        }
    }

    public abstract boolean J(int i17, int i18);

    public final void K() {
        android.content.Context context;
        if (this.f503057f || (context = this.f503052a) == null) {
            return;
        }
        if (!r26.i0.p(android.os.Build.MANUFACTURER, "meizu", true) || zo.e.d()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5838xa0c1aaa7 c5838xa0c1aaa7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5838xa0c1aaa7();
            c5838xa0c1aaa7.f136147g.f88389a = 2;
            c5838xa0c1aaa7.e();
            c5838xa0c1aaa7.f136148h.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 i17 = db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.j4f, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            if (i17 != null) {
                i17.setCancelable(false);
                i17.setCanceledOnTouchOutside(false);
                i17.show();
                this.f503057f = true;
            }
        }
    }

    public abstract void L(android.view.SurfaceHolder surfaceHolder, boolean z17, int i17);

    public boolean M() {
        android.graphics.SurfaceTexture surfaceTexture = this.f503065n;
        java.lang.String str = this.f503053b;
        if (surfaceTexture == null && this.f503066o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, " do you forget override func startPreview");
            return false;
        }
        if (!G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, " now is cpature image and refuse to switchCamera");
            return false;
        }
        mo167002x41012807();
        android.content.Context context = this.f503052a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        c(context, !this.f503058g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "useCpuCrop : " + this.f503060i + " , resolutionLimit: " + this.f503067p);
        android.graphics.SurfaceTexture surfaceTexture2 = this.f503065n;
        if (surfaceTexture2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture2);
            r(surfaceTexture2, this.f503060i, this.f503069r, this.f503067p);
            return this.f503058g;
        }
        android.view.SurfaceHolder surfaceHolder = this.f503066o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceHolder);
        L(surfaceHolder, this.f503060i, this.f503067p);
        return this.f503058g;
    }

    @Override // ts0.r
    public boolean g(yz5.l dataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataCallback, "dataCallback");
        return false;
    }

    @Override // ts0.r
    public boolean x(yz5.l dataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataCallback, "dataCallback");
        return false;
    }
}
