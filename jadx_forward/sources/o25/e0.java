package o25;

/* loaded from: classes9.dex */
public class e0 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424040a;

    public e0(java.lang.String str) {
        this.f424040a = str;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        try {
            new cl0.g().h(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, num);
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeepLinkHelper", e17, "FINDER_OPEN_EVENT json expt", new java.lang.Object[0]);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(this.f424040a);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Resp();
        if (num.intValue() == 400) {
            resp.f32867xa7c470f2 = 400;
            resp.f32950xb32a65a0 = "";
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeepLinkHelper", "can not find app info");
                return;
            }
            resp.mo48431x792022dd(bundle);
            com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
            args.f32706x6a744ba6 = h17.f67386xa1e9e82c;
            args.f32701xaddf3082 = bundle;
            args.f32703x5cfee87 = 268435456;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
            com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
        }
    }
}
