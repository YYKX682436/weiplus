package um5;

/* loaded from: classes10.dex */
public abstract class w {

    /* renamed from: c, reason: collision with root package name */
    public int f510727c;

    /* renamed from: d, reason: collision with root package name */
    public int f510728d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f510729e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f510730f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f510731g;

    /* renamed from: h, reason: collision with root package name */
    public um5.y f510732h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f510733i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f510734j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f510735k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Handler f510736l;

    /* renamed from: m, reason: collision with root package name */
    public android.os.HandlerThread f510737m;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f510739o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f510740p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f510741q;

    /* renamed from: s, reason: collision with root package name */
    public long f510743s;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba f510725a = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f510726b = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f510738n = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final um5.x f510742r = new um5.x();

    public abstract java.util.List a(long j17);

    public void b() {
        xm5.b.e(c(), "destroyEGL", new java.lang.Object[0]);
        this.f510735k = true;
        synchronized (this.f510738n) {
            this.f510738n.clear();
        }
        this.f510734j = false;
        android.os.Handler handler = this.f510736l;
        android.os.HandlerThread handlerThread = this.f510737m;
        this.f510737m = null;
        this.f510736l = null;
        if (handler != null) {
            handler.post(new um5.q(this, handlerThread));
        }
    }

    public abstract java.lang.String c();

    public void d() {
        xm5.b.c(c(), "initEGL", new java.lang.Object[0]);
        this.f510735k = false;
        um5.x xVar = this.f510742r;
        xVar.getClass();
        xVar.f510747c = java.lang.System.currentTimeMillis();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("EffectRenderView_EGLRenderThread");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f510736l = handler;
        this.f510737m = handlerThread;
        handler.post(new um5.r(this));
    }

    public final void e(android.view.Surface surface, int i17, int i18) {
        this.f510731g = surface;
        j(i17, i18);
        d();
    }

    public final void f(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f510736l != null) {
            android.os.HandlerThread handlerThread = this.f510737m;
            boolean z17 = false;
            if (handlerThread != null && handlerThread.isAlive()) {
                z17 = true;
            }
            if (z17 && !this.f510735k && this.f510734j) {
                android.os.Handler handler = this.f510736l;
                if (handler != null) {
                    handler.post(new um5.u(callback));
                    return;
                }
                return;
            }
        }
        synchronized (this.f510738n) {
            this.f510738n.add(callback);
        }
    }

    public final void g() {
        xm5.b.c(c(), "release", new java.lang.Object[0]);
        this.f510726b.k();
        this.f510726b = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
    }

    public void h(long j17) {
        int i17;
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049;
        um5.x xVar = this.f510742r;
        xVar.getClass();
        xVar.f510749e = java.lang.System.currentTimeMillis();
        int i18 = this.f510727c;
        if (i18 <= 0 || (i17 = this.f510728d) <= 0) {
            xm5.b.f(c(), "render with size error " + this.f510727c + ", " + this.f510728d, new java.lang.Object[0]);
            this.f510742r.f510752h = true;
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, i18, i17);
        this.f510725a.g(0, 0, this.f510727c, this.f510728d);
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba = this.f510725a;
        int i19 = this.f510727c;
        int i27 = this.f510728d;
        c22965x6f780cba.f296332c = i19;
        c22965x6f780cba.f296333d = i27;
        c22965x6f780cba.g(0, 0, i19, i27);
        if (this.f510729e || this.f510733i == null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = this.f510733i;
            if (c25745xc39450492 != null) {
                c25745xc39450492.m97285x41012807();
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98337x7e2662a9 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669.m98337x7e2662a9(this.f510727c, this.f510728d);
            this.f510733i = m98337x7e2662a9;
            if (m98337x7e2662a9 != null) {
                android.opengl.GLES20.glBindTexture(3553, m98337x7e2662a9.f47890xc35d0376);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, m98337x7e2662a9.f47894x6be2dc6, m98337x7e2662a9.f47883xb7389127, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
            this.f510729e = false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450493 = this.f510733i;
        int i28 = c25745xc39450493 != null ? c25745xc39450493.f47890xc35d0376 : 0;
        if (i28 <= 0) {
            this.f510742r.f510754j = true;
            return;
        }
        java.util.List a17 = a(j17);
        if (a17.isEmpty()) {
            this.f510742r.f510753i = true;
            return;
        }
        this.f510725a.d(a17, i28, j17);
        if (this.f510739o) {
            try {
                android.graphics.Bitmap m98390x2229cd0c = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25862xe58d3f23.m98390x2229cd0c(this.f510733i);
                yz5.l lVar = this.f510740p;
                if (lVar != null) {
                    lVar.mo146xb9724478(m98390x2229cd0c);
                }
            } catch (java.lang.OutOfMemoryError e17) {
                xm5.b.b(c(), "saveBitmap error: " + e17, new java.lang.Object[0]);
                yz5.l lVar2 = this.f510740p;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(null);
                }
            }
            this.f510739o = false;
            this.f510740p = null;
        } else {
            um5.y yVar = this.f510732h;
            if (yVar != null && (c25745xc3945049 = this.f510733i) != null && c25745xc3945049.f47890xc35d0376 > 0) {
                android.opengl.GLES20.glUseProgram(yVar.f510757c);
                com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glUseProgram");
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, c25745xc3945049.f47890xc35d0376);
                android.opengl.GLES20.glUniform1i(yVar.f510760f, 0);
                yVar.f510756b.position(0);
                android.opengl.GLES20.glVertexAttribPointer(yVar.f510758d, 2, 5126, false, 0, (java.nio.Buffer) yVar.f510756b);
                android.opengl.GLES20.glEnableVertexAttribArray(yVar.f510758d);
                yVar.f510755a.position(0);
                android.opengl.GLES20.glVertexAttribPointer(yVar.f510759e, 2, 5126, false, 0, (java.nio.Buffer) yVar.f510755a);
                android.opengl.GLES20.glEnableVertexAttribArray(yVar.f510759e);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, 0);
                android.opengl.GLES20.glDisableVertexAttribArray(yVar.f510758d);
                android.opengl.GLES20.glDisableVertexAttribArray(yVar.f510759e);
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f510730f;
            if (c25779x3338e719 != null) {
                c25779x3338e719.m97641x82211f20();
            }
        }
        yz5.l lVar3 = this.f510741q;
        if (lVar3 != null) {
            lVar3.mo146xb9724478(java.lang.Long.valueOf(j17));
        }
        this.f510743s = j17;
        um5.x xVar2 = this.f510742r;
        xVar2.f510751g++;
        xVar2.f510750f += java.lang.System.currentTimeMillis() - xVar2.f510749e;
    }

    public final void i(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f510739o = true;
        this.f510740p = callback;
        f(new um5.s(this));
    }

    public final void j(int i17, int i18) {
        if (i17 != this.f510727c || i18 != this.f510728d) {
            this.f510729e = true;
        }
        this.f510727c = i17;
        this.f510728d = i18;
    }
}
