package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp1.u f174691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s f174692f;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, gp1.u uVar) {
        this.f174692f = sVar;
        this.f174690d = c12886x91aa2b6d;
        this.f174691e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174690d;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "flatViewByBallInfo type:%d", objArr);
        if (c12886x91aa2b6d.f174579d == 40) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9(context, null);
            c12886x91aa2b6d.f174583h = surfaceHolderCallbackC12878x44b43bc9;
            if (c12886x91aa2b6d.f174584i == null) {
                c12886x91aa2b6d.f174584i = new android.graphics.Point();
            }
            surfaceHolderCallbackC12878x44b43bc9.m54026xe6095fa6(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.a(this.f174691e, c12886x91aa2b6d));
            surfaceHolderCallbackC12878x44b43bc9.m54025x46265cf(c12886x91aa2b6d);
            c12886x91aa2b6d.f174586n = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo = c12886x91aa2b6d.f174589q;
            ballCollapseInfo.f174615d = false;
            ballCollapseInfo.f174616e = 2000L;
            java.lang.String string = c12886x91aa2b6d.G.getString("coverUrl");
            c12886x91aa2b6d.G.getInt("coverHeight");
            c12886x91aa2b6d.G.getInt("coverWidth");
            float f17 = c12886x91aa2b6d.G.getFloat("aspectRatio");
            surfaceHolderCallbackC12878x44b43bc9.c(string, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.b.a(f17, c12886x91aa2b6d, surfaceHolderCallbackC12878x44b43bc9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar = this.f174692f;
        sVar.V(c12886x91aa2b6d);
        sVar.b(c12886x91aa2b6d);
        sVar.c(c12886x91aa2b6d);
    }
}
