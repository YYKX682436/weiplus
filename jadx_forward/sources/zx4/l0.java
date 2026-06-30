package zx4;

/* loaded from: classes8.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f558697a;

    /* renamed from: b, reason: collision with root package name */
    public final zx4.l f558698b = new zx4.l(new zx4.s());

    /* JADX WARN: Code restructure failed: missing block: B:86:0x032e, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.k1.b(200, r12) != r15) goto L148;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x039b: MOVE (r13 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:254:0x0397 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x03a5: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:252:0x03a5 */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0166 A[Catch: all -> 0x01e6, Exception -> 0x01eb, OutOfMemoryError -> 0x01f3, TryCatch #23 {Exception -> 0x01eb, OutOfMemoryError -> 0x01f3, all -> 0x01e6, blocks: (B:150:0x015e, B:152:0x0166, B:153:0x0175), top: B:149:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01b8 A[Catch: all -> 0x01d4, Exception -> 0x01d8, OutOfMemoryError -> 0x01dc, TRY_LEAVE, TryCatch #19 {Exception -> 0x01d8, OutOfMemoryError -> 0x01dc, all -> 0x01d4, blocks: (B:161:0x01a9, B:164:0x01b8), top: B:160:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0206 A[Catch: all -> 0x03b1, Exception -> 0x03b9, OutOfMemoryError -> 0x03c0, TryCatch #20 {Exception -> 0x03b9, OutOfMemoryError -> 0x03c0, all -> 0x03b1, blocks: (B:28:0x01fe, B:30:0x0206, B:31:0x020c, B:126:0x0346), top: B:27:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022f A[Catch: all -> 0x02ed, OutOfMemoryError -> 0x02f0, Exception -> 0x0338, TryCatch #3 {Exception -> 0x0338, blocks: (B:36:0x0220, B:37:0x0229, B:39:0x022f, B:42:0x0239, B:50:0x024b, B:51:0x02c4, B:53:0x02ca, B:58:0x02dc, B:60:0x02e0, B:73:0x02f6, B:75:0x02fa, B:82:0x0306, B:84:0x0307, B:89:0x0310), top: B:35:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ca A[Catch: all -> 0x02ed, OutOfMemoryError -> 0x02f0, Exception -> 0x0338, TRY_LEAVE, TryCatch #3 {Exception -> 0x0338, blocks: (B:36:0x0220, B:37:0x0229, B:39:0x022f, B:42:0x0239, B:50:0x024b, B:51:0x02c4, B:53:0x02ca, B:58:0x02dc, B:60:0x02e0, B:73:0x02f6, B:75:0x02fa, B:82:0x0306, B:84:0x0307, B:89:0x0310), top: B:35:0x0220 }] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x038f -> B:26:0x0393). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x01d1 -> B:134:0x015e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zx4.l0 r30, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 r31, boolean r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.l0.a(zx4.l0, com.tencent.mm.ui.widget.MMWebView, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b3: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:170:0x00b2 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00bc: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:172:0x00bb */
    public static final java.lang.Object b(zx4.l0 r26, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 r27, boolean r28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.l0.b(zx4.l0, com.tencent.mm.ui.widget.MMWebView, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void c(zx4.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        l0Var.getClass();
        db5.t7.i(viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3e), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
        if (z17) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0.p("endCapture", new org.json.JSONObject());
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.J2 = false;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.V7();
    }

    public static java.lang.Object i(zx4.l0 l0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollContentBy");
        }
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        l0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        zx4.k0 k0Var = new zx4.k0(rVar, c22633x83752a59);
        c22633x83752a59.D0(new zx4.j0(rVar, c22633x83752a59, k0Var));
        c22633x83752a59.mo120158xfb86a31b().scrollBy(i17, i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(k0Var, 200L);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public static void j(zx4.l0 l0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollContentTo");
        }
        if ((i19 & 1) != 0) {
            i17 = c22633x83752a59.getScrollX();
        }
        if ((i19 & 2) != 0) {
            i18 = c22633x83752a59.getScrollY();
        }
        l0Var.getClass();
        c22633x83752a59.mo120158xfb86a31b().scrollTo(i17, i18);
    }

    public final java.lang.Object d(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Rect rect, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        c27816xac2547f9.mo120131x81469de8(rect, new zx4.r(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ui6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(new zx4.x(ui6, z17, this));
        if (this.f558697a == null) {
            this.f558697a = new zx4.y(new java.lang.ref.WeakReference(ui6), this);
        }
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Ai(ui6, this.f558697a, java.lang.Boolean.TRUE);
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webViewUI, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUI, "webViewUI");
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(webViewUI.x7())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "not mp article, dismiss.");
            return;
        }
        eq1.o0 a17 = eq1.a.f337318a.a(webViewUI.x7());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6704xcfe28953 c6704xcfe28953 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6704xcfe28953();
        java.lang.String l07 = webViewUI.L1.l0();
        if (l07 == null) {
            l07 = webViewUI.F7();
        }
        c6704xcfe28953.f140434d = c6704xcfe28953.b("url", l07, true);
        c6704xcfe28953.f140435e = a17 != null ? a17.f337381c : 0L;
        c6704xcfe28953.f140436f = a17 != null ? a17.f337379a : 0L;
        c6704xcfe28953.f140437g = a17 != null ? a17.f337380b : 0L;
        c6704xcfe28953.f140438h = j17;
        c6704xcfe28953.k();
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webViewUI, boolean z17, boolean z18, java.lang.String exifInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUI, "webViewUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exifInfo, "exifInfo");
        f(webViewUI, 1L);
        boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(webViewUI.x7());
        zx4.l0 l0Var = new zx4.l0();
        android.graphics.Bitmap m120139x12501425 = webViewUI.f265348f.m120139x12501425();
        if (m120139x12501425 == null) {
            webViewUI.V7();
        } else {
            if (webViewUI.f265400x != null && webViewUI.f265378p1 == null) {
                android.view.View view = new android.view.View(webViewUI.mo55332x76847179());
                webViewUI.f265378p1 = view;
                webViewUI.f265400x.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            webViewUI.f265378p1.bringToFront();
            webViewUI.f265378p1.setBackground(new android.graphics.drawable.BitmapDrawable(webViewUI.getResources(), m120139x12501425));
        }
        webViewUI.J2 = true;
        if (o17) {
            webViewUI.f265377p0.p("startCapture", new org.json.JSONObject());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(webViewUI, webViewUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), webViewUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3f), true, false, zx4.i0.f558684d);
        boolean z19 = o17 || z18;
        zx4.h0 h0Var = new zx4.h0(webViewUI, this, o17, Q, lVar, z17, exifInfo, l0Var);
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(webViewUI);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new zx4.q(webViewUI, l0Var, z19, h0Var, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r7 == true) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.l0.h(com.tencent.mm.plugin.webview.ui.tools.WebViewUI, java.lang.String):void");
    }
}
