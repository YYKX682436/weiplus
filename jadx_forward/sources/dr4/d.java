package dr4;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f324151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dr4.h hVar) {
        super(0);
        this.f324151d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.opengl.EGLSurface eGLSurface;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext create surface");
        dr4.h hVar = this.f324151d;
        if (hVar.f324169x) {
            rs0.g gVar = rs0.i.f480829a;
            android.opengl.EGLContext eGLContext = hVar.f324155u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eGLContext);
            rs0.h m17 = gVar.m(null, null, 1, 1, eGLContext);
            hVar.f324218k = m17;
            pq4.c l17 = gq4.v.Bi().l("ENCODE");
            if (l17 != null) {
                l17.f439216d = m17;
            }
        } else {
            pq4.c l18 = gq4.v.Bi().l("CAMERA");
            hVar.f324218k = l18 != null ? l18.f439216d : null;
        }
        dr4.q qVar = new dr4.q(0, 0, 1, 1);
        hVar.f324217j = qVar;
        rs0.h hVar2 = hVar.f324218k;
        if (hVar2 != null && (eGLSurface = hVar2.f480826b) != null) {
            qVar.f324263c = eGLSurface;
        }
        hVar.f324219l = new dr4.q0(hVar.f324221n, hVar.f324222o, 0, 0, 0, 1, true, 28, null);
        if (vq4.b0.q()) {
            dr4.h.n(hVar, new android.util.Size(hVar.f324221n, hVar.f324222o));
        } else {
            dr4.r1 r1Var = hVar.f324219l;
            if (r1Var != null) {
                r1Var.f429543s = new dr4.c(hVar);
            }
        }
        hVar.B = new android.util.Size(hVar.f324221n, hVar.f324222o);
        return jz5.f0.f384359a;
    }
}
