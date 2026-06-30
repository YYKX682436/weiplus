package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class g9 {
    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            return;
        }
        r53.v vVar = new r53.v();
        vVar.f474236a = true;
        vVar.f474237b = true;
        vVar.f474242g = 0.1f;
        r53.y.a().e(imageView, str, vVar.a(), null);
    }

    public static void b(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingItemAppMsgGameNameCard", "onChattingItemClicked");
        if (v17 != null) {
            c53.a aVar = (c53.a) v17.y(c53.a.class);
            if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f120182g)) {
                if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f120181f)) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", aVar.f120181f);
                j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            q80.d0 d0Var = new q80.d0();
            d0Var.f442182a = aVar.f120182g;
            d0Var.f442183b = aVar.f120183h;
            d0Var.f442184c = aVar.f120184i;
            d0Var.f442187f = aVar.f120185j;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(dVar.g(), d0Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c9(d0Var, aVar, dVar));
        }
    }
}
