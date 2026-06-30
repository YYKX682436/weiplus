package dr4;

/* loaded from: classes14.dex */
public final class h extends dr4.d2 {
    public dr4.q A;
    public android.util.Size B;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.p f324168w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f324169x;

    /* renamed from: y, reason: collision with root package name */
    public android.media.ImageReader f324170y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f324171z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.p scope) {
        super(true, scope);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f324168w = scope;
    }

    public static final void n(dr4.h hVar, android.util.Size size) {
        boolean z17;
        java.lang.Object obj;
        hVar.getClass();
        if (!vq4.b0.q() || size.getWidth() <= 1 || size.getHeight() <= 1) {
            return;
        }
        android.media.ImageReader imageReader = hVar.f324170y;
        if (imageReader != null) {
            if (imageReader.getWidth() == size.getWidth()) {
                return;
            }
        }
        android.media.ImageReader imageReader2 = hVar.f324170y;
        if (imageReader2 != null) {
            imageReader2.close();
        }
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(size.getWidth(), size.getHeight(), 1, 1);
        if (newInstance == null) {
            return;
        }
        hVar.f324170y = newInstance;
        android.view.Surface surface = newInstance.getSurface();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
        hVar.A = new dr4.q(surface, size.getWidth(), size.getHeight());
        pq4.c l17 = hVar.f324169x ? gq4.v.Bi().l("ENCODE") : gq4.v.Bi().l("CAMERA");
        dr4.q qVar = hVar.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        rs0.h hVar2 = l17 != null ? l17.f439216d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RenderTools", "createSurface:" + qVar);
        if (qVar.b()) {
            synchronized (qVar.f324266f) {
                z17 = qVar.f324265e;
            }
            if (!z17 && (obj = qVar.f324262b) != null && hVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RenderTools", "start createEGLSurface:" + obj.hashCode());
                qVar.f324263c = rs0.i.f480829a.k(hVar2.f480825a, obj);
                qVar.c(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RenderTools", "createSurface finished:" + obj.hashCode() + ", " + qVar.a().hashCode());
            }
        }
        android.media.ImageReader imageReader3 = hVar.f324170y;
        if (imageReader3 != null) {
            imageReader3.setOnImageAvailableListener(new dr4.e(hVar), null);
        }
    }

    public static final void o(dr4.h hVar, java.nio.ByteBuffer byteBuffer, int i17, int i18, boolean z17) {
        int i19;
        hVar.getClass();
        if (z17) {
            i19 = gq4.v.Bi().i(null, 0, 0, i17, i18, 1, true);
        } else {
            if (byteBuffer == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", "send data is null and should not allowed to send");
                return;
            }
            i19 = gq4.v.Bi().i(byteBuffer, byteBuffer.capacity(), 4, i17, i18, 0, false);
        }
        yz5.q qVar = hVar.f324226s;
        if (qVar != null) {
        }
    }

    @Override // dr4.d2, dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        if (c0Var != null) {
            rs0.h hVar = c0Var.f324134d;
            android.opengl.EGLContext eGLContext = hVar != null ? hVar.f480827c : null;
            if (eGLContext != null) {
                this.f324155u = eGLContext;
                m(true);
            }
            dr4.b bVar = new dr4.b(this);
            java.util.ArrayList arrayList = c0Var.f324144n;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
            int i17 = c0Var.f324131a;
            this.f324221n = i17;
            int i18 = c0Var.f324132b;
            this.f324222o = i18;
            dr4.r1 r1Var = this.f324219l;
            if (r1Var != null) {
                r1Var.w(i17, i18);
            }
        }
    }

    @Override // dr4.d2, dr4.o
    public void d(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f324168w.mo149xb9724478(this.f324169x ? "ENCODE" : "CAMERA", new java.lang.Runnable(callback) { // from class: dr4.g

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f324165d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                this.f324165d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f324165d.mo152xb9724478();
            }
        });
    }

    @Override // dr4.o
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", "do release encode surface render ");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f324171z;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        this.f324171z = null;
        android.media.ImageReader imageReader = this.f324170y;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    @Override // dr4.d2, dr4.o
    public void h() {
        d(new dr4.f(this));
    }

    @Override // dr4.d2, dr4.o
    public void l(android.util.Size renderSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        super.l(renderSize);
        this.B = renderSize;
    }

    @Override // dr4.d2
    public void m(boolean z17) {
        vq4.b0 b0Var = vq4.b0.f520803a;
        this.f324169x = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_encode_thread_independence_new, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "encodeThreadProcess:" + this.f324169x);
        if (!this.f324169x) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("encodeVoipHandler");
            this.f324171z = n3Var;
            n3Var.m77789xc5a5549d(false);
        }
        if (this.f324154t) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z17 + ", shareGLContext:" + this.f324155u);
        if (this.f324155u == null) {
            return;
        }
        d(new dr4.d(this));
        this.f324154t = true;
    }
}
