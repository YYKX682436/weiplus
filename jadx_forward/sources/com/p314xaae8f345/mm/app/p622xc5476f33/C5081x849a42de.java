package com.p314xaae8f345.mm.app.p622xc5476f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/app/plugin/PocketMoneyUriSpanHandler;", "Lcom/tencent/mm/app/plugin/URISpanHandlerSet$BaseUriSpanHandler;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.app.plugin.PocketMoneyUriSpanHandler */
/* loaded from: classes4.dex */
public final class C5081x849a42de extends com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler {
    @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
    public int[] b() {
        return new int[]{73};
    }

    @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
    public r35.m3 c(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String obj = r26.n0.u0(url).toString();
        if (!r26.i0.A(obj, "native://wcpay/pocketmoney", false, 2, null)) {
            obj = null;
        }
        if (obj != null) {
            return new r35.m3(obj, 73, null);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
    public boolean d(android.view.View view, r35.m3 hrefInfo, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hrefInfo, "hrefInfo");
        if ((hrefInfo.f450728d == 73 ? hrefInfo : null) == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PocketMoneyUriSpanHandler", "handle TYPE_POCKET_MONEY_MANAGER");
        java.lang.String queryParameter = android.net.Uri.parse(hrefInfo.e()).getQueryParameter("paymsgid");
        if (queryParameter != null) {
            if (!(queryParameter.length() == 0)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                dq3.a aVar = new dq3.a();
                aVar.f67248x6e706659 = queryParameter;
                i95.m c17 = i95.n0.c(bq3.l.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((bq3.l) c17).f105114d.get(aVar, new java.lang.String[0]);
                long j17 = aVar.f67247x297eb4f7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PocketMoneyUriSpanHandler", "%s,find msg: %s", hrefInfo.e(), java.lang.Long.valueOf(j17));
                if (j17 > 0) {
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = hrefInfo.f450739o;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(f9Var != null ? f9Var.Q0() : null, j17);
                    if (n17.m124847x74d37ac6() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PocketMoneyUriSpanHandler", "cannot find msg in msg storage!");
                        g().q(false);
                    } else {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372();
                        am.gt gtVar = c5979x79adf372.f136276g;
                        gtVar.f88322b = j17;
                        gtVar.f88321a = n17.Q0();
                        c5979x79adf372.e();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PocketMoneyUriSpanHandler", "handle MSpanConstants.Type.TYPE_POCKET_MONEY_MANAGER, cannot find local msg");
                    g().q(false);
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
    public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
        return false;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 g() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
        u1Var.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
        u1Var.l(com.p314xaae8f345.mm.app.p622xc5476f33.l.f135200a);
        return u1Var;
    }
}
