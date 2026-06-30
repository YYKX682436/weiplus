package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class ed {
    public static java.util.List a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!r01.z.k(str)) {
                linkedList.add(str);
            }
        }
        linkedList.size();
        return linkedList;
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, android.content.Context context, int i17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: context is null");
        } else if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: msg is null");
        } else {
            g(i17 != 128 ? i17 != 256 ? i17 != 512 ? null : a(r01.q3.cj().p1(512)) : a(r01.q3.cj().p1(256)) : a(r01.q3.cj().p1(128)), context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.dd(f9Var, str, i17, context));
        }
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: context is null");
            return;
        }
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: msg is null");
        } else if (c01.d9.b().E()) {
            g(a(r01.q3.cj().p1(64)), context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.cd(f9Var, context));
        } else {
            db5.t7.l(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: sd card is not available");
        }
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, java.lang.String str, boolean z17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: context is null");
            return;
        }
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: msg is null");
        } else if (c01.d9.b().E()) {
            g(a(r01.q3.cj().p1(4)), context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.xc(f9Var, context, z17, str));
        } else {
            db5.t7.l(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: sd card is not available");
        }
    }

    public static void e(java.lang.String str, android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: context is null");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: content is null");
        } else {
            g(a(r01.q3.cj().p1(1)), context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.vc(str, context));
        }
    }

    public static void f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: context is null");
            return;
        }
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: msg is null");
        } else if (c01.d9.b().E()) {
            g(a(r01.q3.cj().p1(8)), context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.zc(f9Var, context));
        } else {
            db5.t7.l(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: sd card is not available");
        }
    }

    public static void g(java.util.List list, android.content.Context context, db5.t4 t4Var) {
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LongClickBrandServiceHelper", "tryShowConnectorDialog: careList is null or empty");
            return;
        }
        android.view.LayoutInflater.from(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tc tcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.tc(context);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.uc ucVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.uc(list);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        ucVar.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var.f293405n = ucVar;
        k0Var.f293414s = t4Var;
        k0Var.f293387d = null;
        k0Var.G = tcVar;
        k0Var.v();
    }
}
