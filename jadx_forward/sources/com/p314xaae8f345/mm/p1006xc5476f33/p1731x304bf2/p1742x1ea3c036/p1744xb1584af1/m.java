package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/jsevent/m;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) : null;
        java.lang.String string2 = bundle != null ? bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null;
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
