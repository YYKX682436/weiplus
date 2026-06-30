package rz3;

/* loaded from: classes15.dex */
public final class i extends rz3.g {

    /* renamed from: g, reason: collision with root package name */
    public final rz3.d f483347g;

    /* renamed from: h, reason: collision with root package name */
    public final sz3.v0 f483348h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f483349i;

    public i(android.content.Context context, java.lang.String session, int i17, int i18, boolean z17, com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 scanView, rz3.c uiCallback, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s loadingViewModel, sz3.q aiImageHandleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanView, "scanView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCallback, "uiCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingViewModel, "loadingViewModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiImageHandleCallback, "aiImageHandleCallback");
        this.f483347g = new rz3.d(session, i17, i18, z17, scanView, uiCallback, loadingViewModel);
        this.f483348h = new sz3.v0(context, aiImageHandleCallback);
    }

    @Override // rz3.a
    public void b(long j17, java.lang.Object obj) {
        sz3.v0 v0Var;
        rz3.h hVar = (rz3.h) obj;
        if (this.f483349i) {
            return;
        }
        if (hVar != null && hVar.f483345a == 1) {
            java.lang.Object obj2 = hVar.f483346b;
            if (obj2 instanceof android.os.Bundle) {
                rz3.d dVar = this.f483347g;
                if (dVar != null) {
                    dVar.b(j17, (android.os.Bundle) obj2);
                    return;
                }
                return;
            }
        }
        if (hVar != null && hVar.f483345a == 2) {
            java.lang.Object obj3 = hVar.f483346b;
            if (!(obj3 instanceof sz3.c1) || (v0Var = this.f483348h) == null) {
                return;
            }
            v0Var.b(j17, (sz3.c1) obj3);
        }
    }

    @Override // rz3.g
    public void c(long j17, boolean z17) {
    }

    @Override // rz3.a
    /* renamed from: destroy */
    public void mo9410x5cd39ffa() {
        this.f483349i = true;
        rz3.d dVar = this.f483347g;
        if (dVar != null) {
            dVar.mo9410x5cd39ffa();
        }
        sz3.v0 v0Var = this.f483348h;
        if (v0Var != null) {
            v0Var.mo9410x5cd39ffa();
        }
    }
}
