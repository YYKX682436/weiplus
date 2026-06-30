package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public abstract class m5 {
    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f a(android.os.Bundle bundle, int i17) {
        java.lang.String string;
        java.lang.String string2 = bundle.getString("SendAppMessageWrapper_AppId");
        if (string2 == null && (string = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059)) != null) {
            string2 = android.net.Uri.parse(string).getQueryParameter("appid");
        }
        if (string2 == null && (string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "_wxapi_payreq_appid")) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        mVar.f67370x28d45f97 = string2;
        if (c01.d9.h() && gm0.j1.a()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().get(mVar, new java.lang.String[0]);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67386xa1e9e82c)) {
                mVar.f67386xa1e9e82c = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
            }
        } else {
            mVar.f67386xa1e9e82c = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f c19589xde7b5e3f = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f();
        c19589xde7b5e3f.f270318d = mVar.f67386xa1e9e82c;
        c19589xde7b5e3f.f270319e = i17;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.mo48425x63aa4ccc(bundle);
        c19589xde7b5e3f.f270320f = req.f32866x7fa0d2de;
        c19589xde7b5e3f.f270321g = mVar.f67384x996f3ea;
        c19589xde7b5e3f.f270322h = bundle.getInt("_wxapi_command_type");
        return c19589xde7b5e3f;
    }

    public static void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f c19589xde7b5e3f) {
        if (c19589xde7b5e3f.f270322h == 1) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
            resp.f32870x7fa0d2de = c19589xde7b5e3f.f270320f;
            resp.f32867xa7c470f2 = c19589xde7b5e3f.f270319e;
            resp.f32869xc3c3c505 = c19589xde7b5e3f.f270321g;
            android.os.Bundle bundle = new android.os.Bundle();
            resp.mo48431x792022dd(bundle);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
            com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
            args.f32706x6a744ba6 = c19589xde7b5e3f.f270318d;
            args.f32701xaddf3082 = bundle;
            args.f32703x5cfee87 = 268435456;
            com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(context, args);
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Resp resp2 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Resp();
        resp2.f32867xa7c470f2 = c19589xde7b5e3f.f270319e;
        resp2.f32870x7fa0d2de = c19589xde7b5e3f.f270320f;
        resp2.f32869xc3c3c505 = c19589xde7b5e3f.f270321g;
        android.os.Bundle bundle2 = new android.os.Bundle();
        resp2.mo48431x792022dd(bundle2);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle2);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args2 = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args2.f32706x6a744ba6 = c19589xde7b5e3f.f270318d;
        args2.f32701xaddf3082 = bundle2;
        args2.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(context, args2);
    }

    public static void c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f c19589xde7b5e3f, boolean z17, boolean z18) {
        if (c19589xde7b5e3f == null) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        boolean d17 = c17 != null ? c17.d("kWXEntryActivity_data_center_can_return_cancel", false) : false;
        if (z17) {
            d(z18, c19589xde7b5e3f.f270319e);
        }
        if (d17 && z18) {
            c19589xde7b5e3f.f270319e = -2;
        }
        b(context, c19589xde7b5e3f);
    }

    public static void d(boolean z17, int i17) {
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        if (c17 != null) {
            java.lang.String f17 = c17.f("kWXEntryActivity_data_center_app_id", "");
            boolean d17 = c17.d("kWXEntryActivity_data_center_can_return_cancel", false);
            int e17 = c17.e("kWXEntryActivity_data_center_msg_type", 0);
            int e18 = c17.e("kWXEntryActivity_data_center_scene", 0);
            if (z17) {
                i17 = -2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15632, f17, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17 ? 0 : -1));
        }
    }
}
