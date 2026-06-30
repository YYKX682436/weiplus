package kt;

@j95.b
/* loaded from: classes8.dex */
public class s0 extends i95.w implements lt.r0 {
    public boolean Ai(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str3);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewUtil", "launchBackApp info is null");
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp(bundle);
        resp.f32999xb32a65a0 = str2;
        resp.f32868xb2d5068c = str4;
        resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        resp.f32867xa7c470f2 = i17;
        resp.f32998xd7e6e31a = str;
        resp.f32870x7fa0d2de = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n5.f273326a;
        java.lang.String str5 = h17.f67386xa1e9e82c;
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str5;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
        return true;
    }

    public boolean wi(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appid is null");
            return true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appInfo is null");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount openId is null");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "isSameAccount %s/%s", str2, h17.f67384x996f3ea);
        return str2.equalsIgnoreCase(h17.f67384x996f3ea);
    }
}
