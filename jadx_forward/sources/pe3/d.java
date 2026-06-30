package pe3;

/* loaded from: classes7.dex */
public final class d implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.f f435178d;

    public d(pe3.f fVar) {
        this.f435178d = fVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public final java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (obj instanceof se3.b) {
            pe3.f fVar = this.f435178d;
            se3.b bVar = (se3.b) obj;
            fVar.f435185d = hq0.i0.K0(fVar.f435187f, fVar, fVar.m158354x19263085(), "wxf337cbaa27790mb2", bVar.f488444a, bVar.f488445b, false, 32, null);
        } else {
            boolean z17 = obj instanceof se3.c;
            pe3.f fVar2 = this.f435178d;
            if (z17) {
                hq0.e0 e0Var = fVar2.f435185d;
                if (e0Var != null) {
                    ((se3.c) obj).f488446a.c(e0Var);
                }
            } else if (obj instanceof se3.a) {
                int a17 = vp0.b.a(new java.lang.Integer(com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x));
                se3.a aVar = (se3.a) obj;
                fq0.x frameSet = aVar.f488443a.getFrameSet();
                if (frameSet != null) {
                    frameSet.f347015f = a17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377 = aVar.f488443a;
                hq0.e0 e0Var2 = fVar2.f435185d;
                if (e0Var2 != null) {
                    c16462x4c72b377.a(e0Var2);
                }
            } else if (obj instanceof se3.h) {
                java.lang.String str = ((se3.h) obj).f488451a;
                hq0.e0 e0Var3 = fVar2.f435185d;
                if (e0Var3 != null) {
                    cl0.g gVar = new cl0.g();
                    gVar.h("frameSetName", "mock_tl_card_123");
                    e0Var3.a(str, gVar.toString());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
