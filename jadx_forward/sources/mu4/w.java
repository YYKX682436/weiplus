package mu4;

/* loaded from: classes7.dex */
public abstract class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0 implements lu4.c {
    public static final java.lang.String A;
    public static final jt0.j B;

    /* renamed from: y, reason: collision with root package name */
    public static final mu4.n f412985y = new mu4.n(null);

    /* renamed from: z, reason: collision with root package name */
    public static final jz5.g f412986z = jz5.h.b(mu4.k.f412963d);

    /* renamed from: w, reason: collision with root package name */
    public boolean f412992w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f412987r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f412988s = jz5.h.b(new mu4.q(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f412989t = jz5.h.b(new mu4.v(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f412990u = jz5.h.b(new mu4.u(this));

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f412991v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f412993x = jz5.h.b(mu4.r.f412975d);

    static {
        java.lang.String str = lp0.b.D() + "jsengine/pkg";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DEBUG_PATH", "WebCanvas debug path = " + str);
        A = str;
        B = new jt0.j(1);
    }

    public static /* synthetic */ void E0(mu4.w wVar, cl0.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, mu4.h0 h0Var, boolean z17, java.lang.String str, java.lang.String str2, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str3;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
        }
        boolean z18 = (i17 & 4) != 0 ? false : z17;
        if ((i17 & 8) != 0) {
            java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15074x2fec8307, "getString(...)");
            str3 = mo15074x2fec8307;
        } else {
            str3 = str;
        }
        wVar.D0(gVar, rVar, h0Var, z18, str3, (i17 & 16) != 0 ? "wxfedb0854e2b1820d" : str2, (i17 & 32) != 0 ? null : lVar);
    }

    public static void z0(mu4.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r context, java.lang.String name, java.lang.String str, yz5.l lVar, mu4.i iVar, int i17, java.lang.Object obj) {
        mu4.i iVar2;
        mu4.h0 h0Var;
        mu4.i iVar3;
        java.lang.String str2;
        int i18;
        cl0.g A0;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configClient");
        }
        java.lang.String type = (i17 & 4) != 0 ? "unspecified" : str;
        mu4.i iVar4 = (i17 & 16) != 0 ? null : iVar;
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (wVar.f412992w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebJsEngine", "configClient but engine destroyed");
            return;
        }
        if (iVar4 == null) {
            try {
                iVar2 = new mu4.i("wx97b7aebac2183fd2", ((nu4.b0) wVar).A0(type).mo15073xfb822ef2("idKey"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebJsEngine", e17, "configClient getClientInfo err", new java.lang.Object[0]);
                java.lang.String message = e17.getMessage();
                jx3.f.INSTANCE.d(20821, "ClientInfo", name, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                return;
            }
        } else {
            iVar2 = iVar4;
        }
        mu4.h0 h0Var2 = new mu4.h0(iVar2.f412957b, mu4.g0.f412946f);
        try {
            ((nu4.b0) wVar).F.a(new mu4.k0());
            A0 = wVar.A0(type);
            h0Var2.a(new mu4.d0());
            h0Var = h0Var2;
            iVar3 = iVar2;
            str2 = "MicroMsg.WebJsEngine";
            i18 = 20821;
        } catch (java.lang.Exception e18) {
            e = e18;
            h0Var = h0Var2;
            iVar3 = iVar2;
            str2 = "MicroMsg.WebJsEngine";
            i18 = 20821;
        }
        try {
            E0(wVar, A0, context, h0Var2, false, name, iVar2.f412956a, null, 36, null);
            h0Var.a(new mu4.e0());
            ((nu4.b0) wVar).F.a(new mu4.l0());
        } catch (java.lang.Exception e19) {
            e = e19;
            ((nu4.b0) wVar).F.a(new mu4.i0());
            h0Var.a(new mu4.y());
            java.lang.String str3 = "type=" + type + ", " + e.getMessage();
            jx3.f.INSTANCE.d(i18, iVar3.f412956a, name, str3 != null ? r26.i0.u(str3, ',', '.', false, 4, null) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "configClient engineContext err", new java.lang.Object[0]);
        }
    }

    public abstract cl0.g A0(java.lang.String str);

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 B0();

    public final void C0(java.lang.String target, java.lang.String func, java.util.List list, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invokeMethod('");
        sb6.append(func);
        sb6.append("', { target: '");
        sb6.append(target);
        sb6.append("', data: { params: ");
        sb6.append(list != null ? kz5.n0.g0(list, ",", "[", "]", 0, null, mu4.m.f412966d, 24, null) : "[]");
        sb6.append("}})");
        mo14660x738236e6(sb6.toString(), new mu4.s(callback));
    }

    public final void D0(cl0.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r context, mu4.h0 clientReporter, boolean z17, java.lang.String name, java.lang.String appId, yz5.l lVar) {
        int i17;
        int i18;
        java.lang.String str;
        mu4.h0 h0Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        cl0.e jSONArray;
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientReporter, "clientReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (this.f412992w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebJsEngine", "setup but engine destroyed");
            return;
        }
        java.lang.String str5 = name + " :" + context.o();
        try {
            try {
                context.mo14673x29497b66(new mu4.t(str5, clientReporter, this, context, name, appId));
                new lu4.g(str5).a(context);
                try {
                    boolean has = gVar.has("dependencies");
                    java.util.HashMap hashMap = this.f412987r;
                    if (has && (jSONArray = gVar.getJSONArray("dependencies")) != null) {
                        int mo15056xbe0e3ae6 = jSONArray.mo15056xbe0e3ae6();
                        for (int i19 = 0; i19 < mo15056xbe0e3ae6; i19++) {
                            java.lang.String mo15054x2fec8307 = jSONArray.mo15054x2fec8307(i19);
                            if (hashMap.containsKey(mo15054x2fec8307)) {
                                num = (java.lang.Integer) hashMap.get(mo15054x2fec8307);
                            } else {
                                java.util.HashMap hashMap2 = this.f412991v;
                                num = hashMap2.containsKey(mo15054x2fec8307) ? (java.lang.Integer) hashMap2.get(mo15054x2fec8307) : null;
                            }
                            if (num != null && (x07 = x0(num.intValue())) != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) x07).q0(context, mo15054x2fec8307);
                            }
                        }
                    }
                    try {
                        java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                        if (this.f412992w) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebJsEngine", "setup but engine destroyed");
                            return;
                        }
                        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        java.net.URL url = new java.net.URL("https://ws/lib" + mo15074x2fec8307);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15074x2fec8307);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) context).M(url, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395 + ':' + java.net.URLEncoder.encode(mo15074x2fec8307), java.lang.String.valueOf(((java.lang.Number) ((jz5.n) this.f412990u).mo141623x754a37bb()).intValue()), 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.a(B0(), mo15074x2fec8307), lVar != null ? new mu4.s(lVar) : null);
                        if (z17) {
                            java.lang.String mo15074x2fec83072 = gVar.mo15074x2fec8307(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15074x2fec83072, "getString(...)");
                            hashMap.put(mo15074x2fec83072, java.lang.Integer.valueOf(context.o()));
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJsEngine", "client setup succ " + str5 + " from " + mo15074x2fec8307);
                    } catch (java.lang.Exception e17) {
                        clientReporter.a(new mu4.b0());
                        java.lang.String message = e17.getMessage();
                        jx3.f.INSTANCE.d(20821, appId, name, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebJsEngine", e17, "context setup inject script ".concat(str5), new java.lang.Object[0]);
                        throw e17;
                    }
                } catch (java.lang.Exception e18) {
                    clientReporter.a(new mu4.x());
                    java.lang.String message2 = e18.getMessage();
                    jx3.f.INSTANCE.d(20821, appId, name, message2 != null ? r26.i0.u(message2, ',', '.', false, 4, null) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebJsEngine", e18, "context setup dependencies ".concat(str5), new java.lang.Object[0]);
                    throw e18;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                h0Var = clientReporter;
                str2 = name;
                str4 = appId;
                str = "MicroMsg.WebJsEngine";
                str3 = str5;
                i18 = 20821;
                i17 = 0;
                h0Var.a(new mu4.z());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e, "context setup jsapi " + str3, new java.lang.Object[i17]);
                java.lang.String message3 = e.getMessage();
                jx3.f.INSTANCE.d(i18, str4, str2, message3 != null ? r26.i0.u(message3, ',', '.', false, 4, null) : null);
                throw e;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            i17 = 0;
            i18 = 20821;
            str = "MicroMsg.WebJsEngine";
            h0Var = clientReporter;
            str2 = name;
            str3 = str5;
            str4 = appId;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        this.f412992w = true;
        super.mo14659x5cd39ffa();
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventType, "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJsEngine", "skip dispath");
            return;
        }
        mo14660x738236e6("dispatchEvent('" + eventType + "', " + event + ')', valueCallback);
        if (r26.i0.y(eventType, "touch", false) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventType, "scroll")) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventType, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b
    public cl.p u0(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0) {
        ((et.o) ((mu4.e) i95.n0.c(mu4.e.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n0.b();
        if (c5138xafbea1a0 == null) {
            c5138xafbea1a0 = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0();
        }
        c5138xafbea1a0.f135486k = "WebPrefetcherJsEngine#";
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.e() + "webservice/codecache");
        if (!r6Var.m()) {
            r6Var.J();
        }
        c5138xafbea1a0.f135476a = r6Var.u();
        c5138xafbea1a0.f135479d = null;
        return super.u0(c5138xafbea1a0);
    }
}
