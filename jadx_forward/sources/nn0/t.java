package nn0;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.u f420161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f420162e;

    public t(nn0.u uVar, yz5.a aVar) {
        this.f420161d = uVar;
        this.f420162e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.u uVar = this.f420161d;
        try {
            nn0.b bVar = uVar.A;
            if (bVar != null) {
                bVar.k();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(uVar.f420096d, e17, "CustomGLRenderImp initGLComponentWithoutSurface failed!", new java.lang.Object[0]);
        }
        try {
            nn0.b bVar2 = uVar.A;
            if (bVar2 != null && !uVar.G) {
                int i17 = uVar.N;
                if (i17 == 2) {
                    bVar2.e();
                } else if (i17 == 1) {
                    bVar2.f();
                } else {
                    bVar2.e();
                }
                uVar.G = true;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(uVar.f420096d, e18, "CustomGLRenderImp initProgram failed!", new java.lang.Object[0]);
        }
        if (uVar.f420097e && uVar.N == 2 && uVar.f420112w == null) {
            try {
                uVar.f420112w = new q05.c();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(uVar.f420096d, "create sharpen surface failed!");
                uVar.f420097e = false;
            }
        }
        this.f420162e.mo152xb9724478();
    }
}
