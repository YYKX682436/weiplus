package su1;

/* loaded from: classes13.dex */
public final class k implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su1.l f494264d;

    public k(su1.l lVar) {
        this.f494264d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.o82 o82Var;
        cl0.g gVar;
        int intValue;
        int intValue2;
        java.lang.String mo15082x48bce8a4;
        int i19;
        int i27;
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.cast.netscene.NetSceneGetScreenCastAuthorization");
        r45.pr1 pr1Var = ((uu1.a) m1Var).f512798e;
        if (pr1Var == null || (o82Var = (r45.o82) pr1Var.m75936x14adae67(2)) == null) {
            return;
        }
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if (oVar != null) {
            java.lang.String m75945x2fec8307 = o82Var.m75945x2fec8307(0);
            this.f494264d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanQrcodeLiveAuthorizationEventListner", "#getRemoteConfig jsonStr=" + m75945x2fec8307);
            pu1.b bVar = new pu1.b();
            if (m75945x2fec8307 != null) {
                try {
                    gVar = new cl0.g(m75945x2fec8307);
                    bVar.f337847d = gVar.optInt("VideoBitRate") * 1000;
                    bVar.f439951o = java.lang.Integer.valueOf(gVar.optInt("port"));
                    java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("CanvasDirection");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
                    java.lang.Integer h17 = r26.h0.h(mo15082x48bce8a42);
                    if (h17 != null) {
                        bVar.f439954r = h17.intValue();
                    }
                    java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("VideoSolution");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a43);
                    java.util.List f07 = r26.n0.f0(mo15082x48bce8a43, new java.lang.String[]{"*"}, false, 0, 6, null);
                    java.lang.Integer h18 = r26.h0.h((java.lang.String) kz5.n0.X(f07));
                    intValue = h18 != null ? h18.intValue() : 0;
                    java.lang.Integer h19 = r26.h0.h((java.lang.String) kz5.n0.i0(f07));
                    intValue2 = h19 != null ? h19.intValue() : 0;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginCast", e17, "isScreenCastCode error", new java.lang.Object[0]);
                }
                if (intValue == 0 || intValue2 == 0) {
                    android.graphics.Point h27 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    if (bVar.f439954r == 0) {
                        int i28 = h27.y;
                        bVar.f337846c = (h27.x / 16) * 16;
                        bVar.f337845b = (i28 / 16) * 16;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h27.x + " amd " + h27.y);
                    } else {
                        int i29 = h27.x;
                        bVar.f337846c = (h27.y / 16) * 16;
                        bVar.f337845b = (i29 / 16) * 16;
                    }
                } else {
                    android.graphics.Point h28 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    if (intValue > intValue2) {
                        i27 = h28.x;
                        i19 = h28.y;
                        h28.x = i19;
                        h28.y = i27;
                        if (i19 > i27) {
                            f17 = intValue;
                            f18 = i27 / (i19 / f17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                            bVar.f337846c = (((int) f18) / 16) * 16;
                            bVar.f337845b = (((int) f17) / 16) * 16;
                        }
                        float f19 = intValue;
                        float f27 = i19 * (i27 / f19);
                        f18 = f19;
                        f17 = f27;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                        bVar.f337846c = (((int) f18) / 16) * 16;
                        bVar.f337845b = (((int) f17) / 16) * 16;
                    } else {
                        i19 = h28.x;
                        i27 = h28.y;
                        if (i19 <= i27) {
                            f17 = intValue2;
                            f18 = i27 * (i19 / f17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                            bVar.f337846c = (((int) f18) / 16) * 16;
                            bVar.f337845b = (((int) f17) / 16) * 16;
                        }
                        float f192 = intValue;
                        float f272 = i19 * (i27 / f192);
                        f18 = f192;
                        f17 = f272;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                        bVar.f337846c = (((int) f18) / 16) * 16;
                        bVar.f337845b = (((int) f17) / 16) * 16;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginCast", e17, "isScreenCastCode error", new java.lang.Object[0]);
                }
                java.lang.String mo15082x48bce8a44 = gVar.mo15082x48bce8a4("VideoFrameRate");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a44, "optString(...)");
                java.lang.Integer h29 = r26.h0.h(mo15082x48bce8a44);
                if (h29 != null) {
                    bVar.f337848e = h29.intValue();
                }
                java.lang.String mo15082x48bce8a45 = gVar.mo15082x48bce8a4("VideoIFrameInterval");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a45, "optString(...)");
                java.lang.Integer h37 = r26.h0.h(mo15082x48bce8a45);
                if (h37 != null) {
                    bVar.f337850g = h37.intValue();
                }
                java.lang.String mo15082x48bce8a46 = gVar.mo15082x48bce8a4("AudioRecordUseAndroidMic");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a46, "optString(...)");
                java.lang.Integer h38 = r26.h0.h(mo15082x48bce8a46);
                pu1.a aVar = bVar.f439952p;
                if (h38 != null) {
                    aVar.f439948a = h38.intValue() == 1;
                }
                java.lang.String mo15082x48bce8a47 = gVar.mo15082x48bce8a4("AudioSampleRate");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a47, "optString(...)");
                java.lang.Integer h39 = r26.h0.h(mo15082x48bce8a47);
                if (h39 != null) {
                    aVar.f439949b = h39.intValue();
                }
                java.lang.String mo15082x48bce8a48 = gVar.mo15082x48bce8a4("AudioChannelCnt");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a48, "optString(...)");
                java.lang.Integer h47 = r26.h0.h(mo15082x48bce8a48);
                if (h47 != null) {
                    aVar.f439950c = h47.intValue();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                cl0.e f28 = gVar.f("ip_list");
                if (f28 != null) {
                    int mo15056xbe0e3ae6 = f28.mo15056xbe0e3ae6();
                    for (int i37 = 0; i37 < mo15056xbe0e3ae6; i37++) {
                        java.lang.String mo15065x48bce8a4 = f28.mo15065x48bce8a4(i37);
                        if (mo15065x48bce8a4 != null) {
                            arrayList.add(mo15065x48bce8a4);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanQrcodeLiveAuthorizationEventListner", "add new ip: " + mo15065x48bce8a4);
                        }
                    }
                }
                if (arrayList.isEmpty() && (mo15082x48bce8a4 = gVar.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54552x8c62eff0)) != null) {
                    arrayList.add(mo15082x48bce8a4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanQrcodeLiveAuthorizationEventListner", "add old ip: " + mo15082x48bce8a4);
                }
                bVar.f439953q = arrayList;
            }
            oVar.f503643a = bVar;
        }
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cast", ".ui.ScreenCastActivity", new android.content.Intent(), null);
    }
}
