package wt1;

/* loaded from: classes9.dex */
public class y0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6013xcd7b8625 c6013xcd7b8625 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6013xcd7b8625) abstractC20979x809547d1;
        if (c6013xcd7b8625 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6013xcd7b8625) {
            am.hu huVar = c6013xcd7b8625.f136306g;
            java.lang.String str = huVar.f88400a;
            long j17 = huVar.f88401b;
            java.lang.String str2 = huVar.f88403d;
            xt1.f d17 = lu1.u.d(str);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareCardEventListener", "item == null");
            } else if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareCardEventListener", "cardAppMsg is empty");
            } else {
                ot0.q v17 = ot0.q.v(pt0.f0.Li(c6013xcd7b8625.f136306g.f88402c, j17).j());
                if (v17 != null) {
                    v17.U0 = lu1.u.c(d17);
                    v17.T0 = str;
                    v17.V0 = d17.f538004g;
                    v17.W0 = d17.f538001d;
                    y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                    xt1.q qVar = new xt1.q(v17.f430267z);
                    ((x60.e) fVar).getClass();
                    android.graphics.Bitmap d18 = x51.w0.d(qVar);
                    byte[] a17 = d18 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(d18) : null;
                    vt1.e eVar = (vt1.e) i95.n0.c(vt1.e.class);
                    java.lang.String str3 = v17.f430179d;
                    java.lang.String str4 = d17.f538004g;
                    ((ut1.a) eVar).getClass();
                    ((java.lang.Integer) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(v17, str3, str4, str2, null, a17).first).intValue();
                    return true;
                }
            }
        }
        return false;
    }
}
