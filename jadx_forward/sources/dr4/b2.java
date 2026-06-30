package dr4;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f324129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(dr4.d2 d2Var) {
        super(0);
        this.f324129d = d2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        rs0.h hVar;
        android.util.Size A;
        dr4.d2 d2Var = this.f324129d;
        dr4.q qVar = d2Var.f324208a ? d2Var.f324214g : d2Var.f324215h;
        boolean z17 = gq4.v.wi().f447510k;
        if (qVar != null) {
            if (!this.f324129d.f324212e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WindowSurfaceRenderer", "pause rendering now");
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.a(), android.opengl.EGL14.EGL_NO_SURFACE)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WindowSurfaceRenderer", "render error egl surface:" + qVar);
            } else if (z17) {
                dr4.r1 r1Var = this.f324129d.f324219l;
                if (r1Var != null && (A = r1Var.A()) != null) {
                    dr4.r1 r1Var2 = this.f324129d.f324219l;
                    if (r1Var2 != null) {
                        r1Var2.u(A.getWidth(), A.getHeight());
                    }
                    yz5.q qVar2 = this.f324129d.f324226s;
                    if (qVar2 != null) {
                    }
                    dr4.r1 r1Var3 = this.f324129d.f324219l;
                    if (r1Var3 != null) {
                        r1Var3.f429530f = 1;
                    }
                    hVar = this.f324129d.f324218k;
                    if (hVar != null || hVar.f480826b == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WindowSurfaceRenderer", "error cause eGLEnvironment null");
                    } else {
                        android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
                        android.opengl.EGLSurface a17 = qVar.a();
                        android.opengl.EGLSurface a18 = qVar.a();
                        rs0.h hVar2 = this.f324129d.f324218k;
                        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, a17, a18, hVar2 != null ? hVar2.f480827c : null);
                        dr4.r1 r1Var4 = this.f324129d.f324219l;
                        if (r1Var4 != null) {
                            r1Var4.o();
                        }
                        rs0.g gVar = rs0.i.f480829a;
                        rs0.h hVar3 = this.f324129d.f324218k;
                        gVar.x(hVar3 != null ? hVar3.f480825a : null, qVar.a());
                    }
                }
            } else {
                dr4.p pVar = qVar.f324264d;
                int i18 = pVar.f324230a;
                if (i18 == 0 || (i17 = pVar.f324231b) == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WindowSurfaceRenderer", "render size zero");
                } else {
                    dr4.r1 r1Var5 = this.f324129d.f324219l;
                    if (r1Var5 != null) {
                        r1Var5.u(i18, i17);
                    }
                    dr4.d2 d2Var2 = this.f324129d;
                    dr4.r1 r1Var6 = d2Var2.f324219l;
                    if (r1Var6 != null) {
                        r1Var6.f429530f = 2;
                    }
                    yz5.q qVar3 = d2Var2.f324226s;
                    if (qVar3 != null) {
                    }
                    hVar = this.f324129d.f324218k;
                    if (hVar != null) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WindowSurfaceRenderer", "error cause eGLEnvironment null");
                }
            }
        } else if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WindowSurfaceRenderer", "error on render surface null");
        } else {
            dr4.d2 d2Var3 = this.f324129d;
            yz5.q qVar4 = d2Var3.f324226s;
            if (qVar4 != null) {
            }
        }
        return jz5.f0.f384359a;
    }
}
