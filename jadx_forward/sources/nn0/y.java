package nn0;

/* loaded from: classes14.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.z f420167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f420168e;

    public y(nn0.z zVar, yz5.a aVar) {
        this.f420167d = zVar;
        this.f420168e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.z zVar = this.f420167d;
        try {
            nn0.b bVar = zVar.f420153s;
            if (bVar != null) {
                bVar.k();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(zVar.f420141d, e17, "CustomGLRenderImp initGLComponentWithoutSurface failed!", new java.lang.Object[0]);
        }
        try {
            nn0.b bVar2 = zVar.f420153s;
            if (bVar2 != null && !zVar.f420157w) {
                int i17 = zVar.B;
                if (i17 == 2) {
                    bVar2.e();
                } else if (i17 == 1) {
                    bVar2.f();
                } else {
                    bVar2.e();
                }
                zVar.f420157w = true;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(zVar.f420141d, e18, "CustomGLRenderImp initProgram failed!", new java.lang.Object[0]);
        }
        if (zVar.f420142e && zVar.B == 2 && zVar.f420151q == null) {
            try {
                zVar.f420151q = new q05.c();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(zVar.f420141d, "create sharpen surface failed!");
                zVar.f420142e = false;
            }
        }
        this.f420168e.mo152xb9724478();
    }
}
