package yf5;

/* loaded from: classes5.dex */
public final class d0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f543395d;

    public d0(yf5.n nVar) {
        this.f543395d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        yf5.n nVar = this.f543395d;
        nVar.f543447a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_launcher_avatar_hardware, (((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)) ? 1 : 0) == 1;
        if (fp.h.c(30) && wo.w0.q() && nVar.f543447a.isHardwareAccelerated() && z17) {
            nVar.f543447a.setLayerType(2, null);
        }
        return true;
    }
}
