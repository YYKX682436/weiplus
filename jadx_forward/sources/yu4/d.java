package yu4;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547401d;

    public d(yu4.k kVar) {
        this.f547401d = kVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        yu4.n nVar = this.f547401d.f547419n;
        if (nVar != null) {
            java.lang.String str = nVar.f547431g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onShow dialog");
            java.lang.String str2 = nVar.f547429e.f471651g;
            if (str2 != null) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                cl0.g gVar = new cl0.g();
                for (java.lang.String str3 : parse.getQueryParameterNames()) {
                    gVar.h(str3, parse.getQueryParameter(str3));
                }
                com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = nVar.f547433i;
                java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
                if (m80970x134c2d56.length() > 0) {
                    gVar.h("query", c22479x68a26381.m80970x134c2d56());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onUiInit " + gVar);
                aw4.m0 m0Var = aw4.n0.f96434a;
                android.content.Context context = nVar.f547428d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                m0Var.c(context, 10);
                xu4.d dVar = nVar.f547434m;
                dVar.getClass();
                av4.j jVar = dVar.f95859a;
                if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
                    return;
                }
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onUiInit", gVar2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onUiInit", "onUiInit", gVar2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        }
    }
}
