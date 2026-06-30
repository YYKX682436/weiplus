package ze5;

/* loaded from: classes5.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.j8 f553792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f553793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(ze5.j8 j8Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b) {
        super(1);
        this.f553792d = j8Var;
        this.f553793e = c22094xdaed490b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        rd5.d dVar;
        we5.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        v11.h m80114x823fefc5;
        v11.e button = (v11.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(button, "button");
        ze5.j8 j8Var = this.f553792d;
        j8Var.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = this.f553793e;
        java.lang.Object tag = c22094xdaed490b.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar != null && (dVar = erVar.f285438a) != null && (f9Var = (aVar = dVar.f475787d).f526833b) != null) {
            yb5.d dVar2 = aVar.f526832a;
            android.app.Activity g17 = dVar2 != null ? dVar2.g() : null;
            if (g17 != null && (m80114x823fefc5 = c22094xdaed490b.m80114x823fefc5()) != null) {
                v11.b bVar = v11.b.f513863e;
                java.lang.String exceptButtonId = button.f513894g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exceptButtonId, "exceptButtonId");
                java.util.List<v11.e> list = m80114x823fefc5.f513926a;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (v11.e eVar : list) {
                    arrayList.add(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f513894g, exceptButtonId) ? eVar.b(bVar) : eVar.b(v11.b.f513864f));
                }
                v11.h hVar = new v11.h(arrayList);
                c22094xdaed490b.h(hVar);
                int ordinal = button.f513888a.ordinal();
                if (ordinal == 0) {
                    j8Var.n0(f9Var.I0(), button.f513890c, button.f513894g, c22094xdaed490b, hVar);
                } else if (ordinal == 1) {
                    java.lang.String str = button.f513892e;
                    if (str.length() > 0) {
                        try {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("rawUrl", str);
                            j45.l.j(g17, "webview", ".ui.tools.WebViewUI", intent, null);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemMarkdownMvvm", e17, "openUrl error", new java.lang.Object[0]);
                        }
                        v11.b bVar2 = v11.b.f513864f;
                        java.util.List<v11.e> list2 = hVar.f513926a;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                        for (v11.e eVar2 : list2) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar2.f513894g, exceptButtonId)) {
                                eVar2 = eVar2.b(bVar2);
                            }
                            arrayList2.add(eVar2);
                        }
                        v11.h hVar2 = new v11.h(arrayList2);
                        c22094xdaed490b.h(hVar2);
                        if (button.f513890c.length() > 0) {
                            j8Var.n0(f9Var.I0(), button.f513890c, button.f513894g, c22094xdaed490b, hVar2);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
