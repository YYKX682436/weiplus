package yg0;

@j95.b
/* loaded from: classes.dex */
public final class c4 extends i95.w implements zg0.f3 {
    public int Ai(zg0.s3 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        android.content.Intent intent = params.f554314b;
        int hashCode = intent.hashCode();
        if (params.f554315c) {
            pf5.j0.a(intent, rx4.p2.class);
        } else if (params.f554317e) {
            pf5.j0.a(intent, rx4.r2.class);
        }
        intent.putExtra("key_halfscreen_id", hashCode);
        intent.putExtra("INTENT_KEY_HALFSCREEN_HEIGHT_RATIO", params.f554316d);
        intent.putExtra("INTENT_KEY_HALFSCREEN_ENABLE_DRAG", params.f554317e);
        intent.putExtra("INTENT_KEY_HALFSCREEN_TRANSPARENT_MASK", params.f554320h);
        if (params.f554317e) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_FULLSCREEN_LISTENER", new yg0.y3(params, c0Var, hashCode), new ok5.h());
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_VISIBLE_LISTENER", new yg0.z3(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), c0Var, params), new ok5.h());
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_STATUS_LISTENER", new yg0.a4(hashCode), new ok5.h());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = params.f554318f;
        if (aVar != null) {
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_DRAWER_LISTENER", aVar, new ok5.h());
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f102455a;
        android.content.Context context = params.f554313a;
        dVar.f102457a = context;
        cVar.c(false);
        cVar.e(true);
        dVar.f102460d.x(com.p314xaae8f345.mm.ui.b4.a(context));
        dVar.f102458b = params.f554319g;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI");
        } else {
            dVar.getClass();
            dVar.f102459c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
        }
        if (intent.getBooleanExtra("KHalfScreenSearchUseFlutter", false)) {
            cVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        }
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.class);
        cVar.g();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.p(1000, false, true, 0);
        return hashCode;
    }

    public void Bi(android.content.Context context, android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!z17) {
            j45.l.z(context, intent, null);
            return;
        }
        pf5.j0.a(intent, rx4.q2.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f102455a;
        dVar.f102457a = context;
        cVar.e(true);
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        } else {
            dVar.getClass();
            dVar.f102459c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
        }
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22428x5fcafcd0.class);
        cVar.g();
    }

    public void Di(android.content.Context context, android.content.Intent intent, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!z17) {
            j45.l.n(context, "webview", ".ui.tools.fts.MMFTSSearchTabWebViewUI", intent, i17);
            return;
        }
        pf5.j0.a(intent, rx4.q2.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f102455a;
        dVar.f102457a = context;
        cVar.e(true);
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        } else {
            dVar.getClass();
            dVar.f102459c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
        }
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22428x5fcafcd0.class);
        cVar.h(i17);
    }

    public void wi(android.content.Context context, android.content.Intent intent, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!z17) {
            j45.l.y(context, intent);
            return;
        }
        boolean z19 = false;
        boolean booleanExtra = intent.getBooleanExtra("hideSearchTitle", false);
        if (z18) {
            pf5.j0.a(intent, rx4.q2.class);
        } else if (booleanExtra) {
            pf5.j0.a(intent, rx4.r2.class);
        } else {
            pf5.j0.a(intent, rx4.p2.class);
        }
        if (!z18 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20689xdf2a174f()) == 1) {
            z19 = true;
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f102455a;
        dVar.f102457a = context;
        cVar.c(z19);
        cVar.e(true);
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI");
        } else {
            dVar.getClass();
            dVar.f102459c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
        }
        if (z18) {
            cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22428x5fcafcd0.class);
        } else {
            cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22427xcffdd1da.class);
        }
        cVar.g();
    }
}
