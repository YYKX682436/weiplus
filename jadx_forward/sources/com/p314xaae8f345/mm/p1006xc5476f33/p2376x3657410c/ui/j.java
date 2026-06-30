package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes8.dex */
public abstract class j {
    public static boolean a(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478 c11303x34488478, com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options options) {
        java.lang.String str2;
        int i17;
        if (options == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33262x3a8e995e)) {
            str2 = str + ".wxapi.WXPayEntryActivity";
        } else {
            str2 = options.f33262x3a8e995e;
        }
        if (options == null || (i17 = options.f33263x54a34142) == -1) {
            i17 = 268435456;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayCallbackHelper", "callback, cbPkg = " + str + ", cbCls = " + str2 + ", cbFlags(hex) = " + java.lang.Integer.toHexString(i17) + ", errCode = " + c11303x34488478.f32867xa7c470f2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32835x21d81efb, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32838xdd45632f);
        c11303x34488478.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str;
        args.f32705x81a4fd92 = str2;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = i17;
        return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(context, args);
    }
}
