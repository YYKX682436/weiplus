package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public abstract class b {
    public static void a(float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9) {
        java.lang.Object[] objArr = {java.lang.Float.valueOf(f17)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "updateCustomView aspectRatio:%f", objArr);
        if (f17 == 1.0f) {
            c12886x91aa2b6d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
            c12886x91aa2b6d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
            android.graphics.Point point = c12886x91aa2b6d.f174584i;
            surfaceHolderCallbackC12878x44b43bc9.d(point.x, point.y);
            return;
        }
        if (f17 > 1.0f) {
            c12886x91aa2b6d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561199c3);
            c12886x91aa2b6d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
            android.graphics.Point point2 = c12886x91aa2b6d.f174584i;
            surfaceHolderCallbackC12878x44b43bc9.d(point2.x, point2.y);
            return;
        }
        c12886x91aa2b6d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
        c12886x91aa2b6d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561199c3);
        android.graphics.Point point3 = c12886x91aa2b6d.f174584i;
        surfaceHolderCallbackC12878x44b43bc9.d(point3.x, point3.y);
    }
}
