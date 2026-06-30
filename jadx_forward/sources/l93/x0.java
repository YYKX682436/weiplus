package l93;

/* loaded from: classes10.dex */
public final class x0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6112xd2df7a9 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6112xd2df7a9) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.mx mxVar = event.f136389g;
        java.lang.String str = mxVar.f88909a;
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "com.tencent.mm.plugin.finder", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartActivityEventListener", "startActivity: target class = " + mxVar.f88909a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206618c = c01.id.c();
        }
        java.lang.String str2 = mxVar.f88909a;
        if (str2 != null && str2.equals("com.tencent.mm.plugin.shake.ui.ShakeReportUI")) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206969a = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206970b = "ShakeReportUI";
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206971c) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206973e);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206971c = true;
            }
        }
        return true;
    }
}
