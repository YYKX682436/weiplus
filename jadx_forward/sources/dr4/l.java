package dr4;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.q f324190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.o f324191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f324192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dr4.q qVar, dr4.o oVar, int i17) {
        super(0);
        this.f324190d = qVar;
        this.f324191e = oVar;
        this.f324192f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dr4.o oVar = this.f324191e;
        dr4.q qVar = this.f324190d;
        if (qVar != null) {
            rs0.h hVar = oVar.f324218k;
            if ((hVar != null ? hVar.f480825a : null) != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.a(), android.opengl.EGL14.EGL_NO_SURFACE)) {
                    rs0.h hVar2 = oVar.f324218k;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar2 != null ? hVar2.f480826b : null, android.opengl.EGL14.EGL_NO_SURFACE)) {
                        rs0.h hVar3 = oVar.f324218k;
                        android.opengl.EGL14.eglDestroySurface(hVar3 != null ? hVar3.f480825a : null, hVar3 != null ? hVar3.f480826b : null);
                    }
                } else {
                    rs0.h hVar4 = oVar.f324218k;
                    android.opengl.EGL14.eglDestroySurface(hVar4 != null ? hVar4.f480825a : null, qVar.a());
                }
            }
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            qVar.f324263c = EGL_NO_SURFACE;
            rs0.h hVar5 = oVar.f324218k;
            if (hVar5 != null) {
                hVar5.f480826b = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (this.f324192f == 0) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.f324214g, qVar)) {
                    oVar.f324214g = null;
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.f324215h, qVar)) {
                oVar.f324215h = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f324211d, "remove render surface :" + qVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f324211d, "remove a null surface");
        }
        return jz5.f0.f384359a;
    }
}
