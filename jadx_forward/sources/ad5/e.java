package ad5;

/* loaded from: classes10.dex */
public final class e extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.e f84777a = new ad5.e();

    public e() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pbe;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f79120x221c404a;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f79121x9520e9b4;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        ad5.h hVar;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onFavoriteClicked, payloads is null");
            return;
        }
        ad5.q0 q0Var = ad5.q0.f84833a;
        java.util.Map map = t0Var.f84847a;
        java.lang.Object obj2 = map.get(q0Var);
        if (!(obj2 instanceof java.util.List)) {
            obj2 = null;
        }
        java.util.List list = (java.util.List) obj2;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onFavoriteClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj3 = map.get(ad5.n0.f84822a);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(obj3, 3)) {
            obj3 = null;
        }
        yz5.q qVar = (yz5.q) obj3;
        java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.X(list)).Q0();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next())) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.c();
                return;
            }
        }
        long g17 = ip.c.g();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3 e3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3.f281987a;
        if (e3Var.a(list, g17)) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572766cf1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(g17));
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var2.c();
            return;
        }
        long i19 = ip.c.i();
        if (e3Var.b(list, i19)) {
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var3.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572767cf2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i19));
            e4Var3.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var3.c();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        boolean i28 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.i(context, c5303xc75d2f73, Q0, list, false, false);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (!i28) {
            if (list.size() > 1) {
                java.lang.String string = c4Var.f87859l >= 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.caq) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cap);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                db5.e1.y(context, string, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1), null);
            } else {
                db5.e1.i(context, c4Var.f87859l, 0);
            }
            if (qVar != null) {
                qVar.mo147xb9724478(this, new ad5.h(0, "fillEventInfo failed", 1, null), list);
                return;
            }
            return;
        }
        c4Var.f87856i = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c4Var.f87860m = 45;
        c5303xc75d2f73.e();
        int i29 = c5303xc75d2f73.f135624h.f87966a;
        if (i29 == -2) {
            obj = new ad5.h(0, "fav storage full", 1, null);
        } else {
            if (i29 > 0) {
                hVar = new ad5.h(i29, "fav failed");
            } else if (i29 <= 0) {
                obj = ad5.i.f84800a;
            } else {
                hVar = new ad5.h(i29, "fav unknown error");
            }
            obj = hVar;
        }
        if (qVar != null) {
            qVar.mo147xb9724478(this, obj, list);
        }
    }

    /* renamed from: equals */
    public boolean m1093xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.e)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m1094x8cdac1b() {
        return -1464516037;
    }

    /* renamed from: toString */
    public java.lang.String m1095x9616526c() {
        return "Favorite";
    }
}
