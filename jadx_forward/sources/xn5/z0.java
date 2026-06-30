package xn5;

/* loaded from: classes13.dex */
public final class z0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.hg7 f537270d;

    public z0(r45.hg7 preloadData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadData, "preloadData");
        this.f537270d = preloadData;
    }

    public void a() {
        r45.hg7 hg7Var = this.f537270d;
        try {
            byte[] mo14344x5f01b1f6 = hg7Var.mo14344x5f01b1f6();
            r45.hg7 hg7Var2 = new r45.hg7();
            hg7Var2.mo11468x92b714fd(mo14344x5f01b1f6);
            java.lang.String str = hg7Var2.f457673d;
            if (str == null) {
                str = "";
            }
            if (xn5.q0.f537235a.b().d().c(str)) {
                java.util.HashMap hashMap = xn5.e1.f537200e;
                java.lang.Object obj = hashMap.get(str);
                if (obj == null) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = xn5.e1.f537196a.e();
                        if (e17 != null) {
                            e17.H(str, mo14344x5f01b1f6);
                        }
                    } catch (java.lang.Exception e18) {
                        xn5.e1 e1Var = xn5.e1.f537196a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X2C.X2CLayoutCachePool", e18, "UpdateLayoutStrategyTask1", new java.lang.Object[0]);
                    }
                    hashMap.put(str, hg7Var2);
                    obj = hg7Var2;
                }
                r45.hg7 hg7Var3 = (r45.hg7) obj;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hg7Var3, hg7Var2)) {
                    boolean z17 = hg7Var3.f457674e.size() < hg7Var2.f457674e.size();
                    boolean a17 = xn5.g1.a(hg7Var3, hg7Var2);
                    if (!z17 && !a17) {
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                            xn5.g1.b(hg7Var3);
                            xn5.g1.b(hg7Var2);
                        }
                    }
                    xn5.e1.f537200e.put(str, hg7Var2);
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e19 = xn5.e1.f537196a.e();
                        if (e19 != null) {
                            e19.H(str, mo14344x5f01b1f6);
                        }
                    } catch (java.lang.Exception e27) {
                        xn5.e1 e1Var2 = xn5.e1.f537196a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X2C.X2CLayoutCachePool", e27, "UpdateLayoutStrategyTask2", new java.lang.Object[0]);
                    }
                    if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                        xn5.g1.b(hg7Var2);
                    }
                } else if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                    xn5.g1.b(hg7Var2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "update strategy " + str + ' ' + hg7Var2.f457674e.size());
            }
        } catch (java.lang.Exception e28) {
            xn5.e1 e1Var3 = xn5.e1.f537196a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X2C.X2CLayoutCachePool", e28, "UpdateLayoutStrategyTask %s", hg7Var.f457673d);
        }
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        a();
        return jz5.f0.f384359a;
    }
}
