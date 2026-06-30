package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class p extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        android.content.Context context;
        java.lang.Object obj;
        android.app.Activity activity;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5299x1312af17 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5299x1312af17) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.a4 a4Var = event.f135621g;
        int p07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p0(a4Var.f87654a, 0);
        int i17 = a4Var.f87655b;
        wr3.m0 m0Var = wr3.n0.f530374e;
        int i18 = a4Var.f87656c;
        m0Var.getClass();
        java.util.Iterator it = ((kz5.h) wr3.n0.f530381o).iterator();
        while (true) {
            context = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wr3.n0) obj).f530382d == i18) {
                break;
            }
        }
        wr3.n0 n0Var = (wr3.n0) obj;
        if (n0Var == null) {
            n0Var = wr3.n0.f530375f;
        }
        int i19 = a4Var.f87657d;
        boolean z17 = a4Var.f87658e;
        boolean z18 = a4Var.f87659f;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            if (j17 != null) {
                context = (android.app.Activity) j17.get();
            }
        } else {
            context = activity;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteProfileMsgEventListener", "delete profile msg, appMsgId: " + p07 + ", idx: " + i17 + ", itemStatus: " + n0Var + ", infoSize: " + i19 + ", showSuccessToast: " + z17 + ", success: " + z18);
        if (z18) {
            yr3.w.f546592a.f(n0Var, p07, i17, java.lang.Integer.valueOf(i19));
            if (z17) {
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkg);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f78820xe93cca5d);
                e4Var.c();
            }
        } else {
            int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572482na5);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var2.c();
        }
        return false;
    }
}
