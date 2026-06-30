package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1;

/* loaded from: classes.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.os.Bundle data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppIpcEventDispatch", "dispatchEventFromMMProcess");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppIpcEventDispatch", "process alive");
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, data, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1.m.class, null);
            return;
        }
        java.lang.String string = data.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.String string2 = data.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppIpcEventDispatch", "invoke, " + string);
        if (string != null && ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            try {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
                cl0.g gVar = new cl0.g(string2);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l(string, gVar);
            } catch (java.lang.Exception e17) {
                cl0.g gVar2 = new cl0.g();
                try {
                    gVar2.h("error", e17.toString());
                    java.lang.String gVar3 = gVar2.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(gVar3).replaceAll(";");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, "LiteAppIpcEventDispatch,".concat(replaceAll));
                } catch (cl0.f e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppIpcEventDispatch", e18, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppIpcEventDispatch", e17.toString());
            }
        }
    }
}
