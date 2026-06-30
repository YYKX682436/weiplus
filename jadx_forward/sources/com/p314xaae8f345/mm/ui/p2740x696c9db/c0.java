package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class c0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 f291841a;

    public c0(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 activityC22497x4e26cc91) {
        this.f291841a = activityC22497x4e26cc91;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        boolean z17;
        int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91.f291508p;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 activityC22497x4e26cc91 = this.f291841a;
        activityC22497x4e26cc91.X6();
        android.content.Intent intent = activityC22497x4e26cc91.getIntent();
        activityC22497x4e26cc91.f291510e = intent;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFavoriteUI", "intent is null");
        } else {
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "android.intent.extra.TEXT");
            if (l17 != null && l17.length() != 0) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d(l17));
                c11286x34a5504.f33121x993583fc = l17;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
                req.f32866x7fa0d2de = null;
                req.f33049x38eb0007 = c11286x34a5504;
                int m48467xfb85f7b0 = c11286x34a5504.m48467xfb85f7b0();
                android.os.Bundle bundle = new android.os.Bundle();
                req.mo48427x792022dd(bundle);
                bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
                bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
                bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
                z17 = true;
                if (!c01.d9.h() || gm0.m.r()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
                    com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(activityC22497x4e26cc91, new android.content.Intent(activityC22497x4e26cc91, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class), activityC22497x4e26cc91.getIntent().addFlags(67108864));
                    activityC22497x4e26cc91.finish();
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                    java.lang.String str = com.p314xaae8f345.mm.vfs.w6.q(activityC22497x4e26cc91.f291512g) + "." + com.p314xaae8f345.mm.vfs.w6.n(activityC22497x4e26cc91.f291512g);
                    if (m48467xfb85f7b0 == 1) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, l17, 13);
                    } else {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 13, activityC22497x4e26cc91.f291512g, str, "", "");
                    }
                    am.c4 c4Var = c5303xc75d2f73.f135623g;
                    c4Var.f87856i = activityC22497x4e26cc91;
                    c4Var.f87862o = new com.p314xaae8f345.mm.ui.p2740x696c9db.u(activityC22497x4e26cc91);
                    c4Var.f87863p = new com.p314xaae8f345.mm.ui.p2740x696c9db.v(activityC22497x4e26cc91);
                    activityC22497x4e26cc91.f291511f = c5303xc75d2f73;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(l17);
                    com.p314xaae8f345.mm.p957x53236a1b.c0 c0Var = new com.p314xaae8f345.mm.p957x53236a1b.c0(5, arrayList, activityC22497x4e26cc91.m78512xb8359e85());
                    c01.d9.e().a(837, activityC22497x4e26cc91);
                    gm0.j1.d().g(c0Var);
                    activityC22497x4e26cc91.Z6();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", java.lang.Boolean.valueOf(z17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFavoriteUI", "text is null");
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", java.lang.Boolean.valueOf(z17));
    }
}
