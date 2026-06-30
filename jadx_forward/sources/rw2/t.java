package rw2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f482157a;

    /* renamed from: b, reason: collision with root package name */
    public int f482158b;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f482160d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f482161e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f482162f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f482163g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f482164h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f482165i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f482166j;

    /* renamed from: l, reason: collision with root package name */
    public dk4.a f482168l;

    /* renamed from: m, reason: collision with root package name */
    public is0.c f482169m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f482170n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f482171o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f482172p;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482159c = "MicroMsg.TPTrackThumbRenderer@" + hashCode();

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba f482167k = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();

    static {
        p05.l4.R.b();
    }

    public t(int i17, int i18) {
        this.f482157a = i17;
        this.f482158b = i18;
    }

    public static final void a(rw2.t tVar, long j17) {
        int i17;
        int i18;
        tVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j18 = j17 / 1000000;
        if (java.lang.Math.abs(j18 - tVar.f482172p) > 100) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "renderFrame " + j18 + ' ' + j17);
        is0.c cVar = tVar.f482166j;
        int i19 = cVar != null ? cVar.f375928e : 0;
        if (i19 <= 0) {
            return;
        }
        dk4.a aVar = tVar.f482168l;
        int i27 = aVar != null ? aVar.f316018v : 0;
        int i28 = aVar != null ? aVar.f316019w : 0;
        java.lang.Integer valueOf = aVar != null ? java.lang.Integer.valueOf(aVar.f316007k) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 90) {
                i17 = 1;
            } else if (valueOf != null && valueOf.intValue() == 180) {
                i17 = 2;
            } else if (valueOf != null && valueOf.intValue() == 270) {
                i17 = 3;
            }
            i18 = i17;
            if (i27 > 0 || i28 <= 0) {
            }
            tq5.f fVar = new tq5.f(i19, i27, i28, true, i18);
            fVar.f502795g.setEmpty();
            fVar.f502796h.set(0, 0, i27, i28);
            rm5.o.a(fVar.f502796h, new android.graphics.Rect(0, 0, tVar.f482157a, tVar.f482158b));
            java.util.List c17 = kz5.b0.c(fVar);
            is0.c cVar2 = tVar.f482169m;
            int i29 = cVar2 != null ? cVar2.f375928e : 0;
            if (i29 <= 0) {
                return;
            }
            if (tVar.f482170n) {
                android.opengl.GLES20.glBindTexture(3553, i29);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, tVar.f482157a, tVar.f482158b, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
            tVar.f482167k.d(c17, i29, j18);
            if (tVar.f482171o != null) {
                android.graphics.Bitmap v17 = rs0.i.f480829a.v(i29, tVar.f482157a, tVar.f482158b);
                yz5.p pVar = tVar.f482171o;
                if (pVar != null) {
                    pVar.mo149xb9724478(v17, java.lang.Long.valueOf(tVar.f482172p));
                }
            }
            rs0.h hVar = tVar.f482160d;
            if (hVar != null) {
                rs0.i.f480829a.x(hVar.f480825a, hVar.f480826b);
            }
            tVar.f482170n = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "renderFrame cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        i18 = 0;
        if (i27 > 0) {
        }
    }

    public final void b(final yz5.a call) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        android.os.HandlerThread handlerThread = this.f482161e;
        boolean z17 = false;
        if (handlerThread != null && handlerThread.isAlive()) {
            z17 = true;
        }
        if (!z17 || (n3Var = this.f482162f) == null) {
            return;
        }
        n3Var.mo50293x3498a0(new java.lang.Runnable(call) { // from class: rw2.r

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f482155d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "function");
                this.f482155d = call;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f482155d.mo152xb9724478();
            }
        });
    }
}
