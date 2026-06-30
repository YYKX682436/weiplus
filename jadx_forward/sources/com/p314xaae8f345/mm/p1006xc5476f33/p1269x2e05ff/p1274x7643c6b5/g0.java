package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s f174698e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f174698e = sVar;
        this.f174697d = c12886x91aa2b6d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar = this.f174698e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174697d;
        sVar.V(c12886x91aa2b6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = sVar.t0(c12886x91aa2b6d);
        if (t07 == null || t07.f174583h == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(t07 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateCustomViewInMMProcess exitBallInfo exist:%b", objArr);
            return;
        }
        sVar.c(t07);
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(t07.f174579d)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "updateCustomView type:%d", objArr2);
        if (t07.f174579d == 40) {
            android.view.View view = t07.f174583h;
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9) view;
                java.lang.String string = t07.G.getString("coverUrl");
                t07.G.getInt("coverHeight");
                t07.G.getInt("coverWidth");
                float f17 = t07.G.getFloat("aspectRatio");
                boolean z17 = t07.G.getBoolean("onlyCover", false);
                surfaceHolderCallbackC12878x44b43bc9.c(string, 0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.b.a(f17, t07, surfaceHolderCallbackC12878x44b43bc9);
                if (z17) {
                    android.view.TextureView textureView = surfaceHolderCallbackC12878x44b43bc9.f174514g;
                    if (textureView == null) {
                        return;
                    }
                    textureView.setVisibility(8);
                    return;
                }
                android.view.TextureView textureView2 = surfaceHolderCallbackC12878x44b43bc9.f174514g;
                if (textureView2 == null) {
                    return;
                }
                textureView2.setVisibility(0);
            }
        }
    }
}
