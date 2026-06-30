package nu4;

/* loaded from: classes7.dex */
public abstract class b0 extends mu4.w {

    /* renamed from: J, reason: collision with root package name */
    public static final nu4.k f421774J = new nu4.k(null);
    public static final java.util.Set K = kz5.o1.c("transfer-encoding");
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 L;
    public static final jz5.g M;
    public static final jz5.g N;
    public static final nu4.b P;
    public static final nu4.b Q;
    public static final nu4.b R;
    public static final nu4.b S;
    public static final java.util.Map T;
    public static wu5.c U;
    public static final java.util.HashMap V;
    public final java.lang.String C = "MicroMsg.WebPrefetcherJsEngine";
    public final java.util.concurrent.ConcurrentLinkedDeque D = new java.util.concurrent.ConcurrentLinkedDeque();
    public final jz5.g E = jz5.h.b(nu4.a0.f421773d);
    public final mu4.x0 F;
    public final com.p314xaae8f345.mm.app.s2 G;
    public final java.util.HashMap H;
    public final java.util.concurrent.ConcurrentHashMap I;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__WebPrefetchLocalData__");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
        L = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(M2, 15552000L);
        M = jz5.h.b(nu4.i.f421786d);
        N = jz5.h.b(nu4.j.f421787d);
        P = new nu4.b("wcf://WebPrefetchContent/");
        Q = new nu4.b("wcf://WebPrefetchResource/");
        R = new nu4.b("wcf://WebPrefetchManifest/");
        S = new nu4.b("wcf://WebPrefetchResConfig/");
        T = kz5.c1.k(new jz5.l("js", "application/javascript"), new jz5.l("json", "application/json"));
        V = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu4.b0.<init>():void");
    }

    @Override // mu4.w
    public cl0.g A0(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f412989t).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        cl0.g a17 = ((cl0.g) mo141623x754a37bb).a("client").a(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getJSONObject(...)");
        return a17;
    }

    @Override // mu4.w
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 B0() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3) this.E.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 F0(java.lang.String str, boolean z17) {
        mu4.n nVar = mu4.w.f412985y;
        return mu4.n.b(nVar, nVar.a("prefetcher/" + str + ".wspkg", ku4.z.f394072a.k() == 1, ku4.z.i(str), str), new nu4.l(str, this), null, z17, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:19:0x00a9, B:21:0x00b8, B:26:0x00c4, B:27:0x00db, B:61:0x00c9), top: B:18:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143 A[Catch: Exception -> 0x0163, TryCatch #3 {Exception -> 0x0163, blocks: (B:30:0x010f, B:33:0x0118, B:34:0x0121, B:35:0x012b, B:37:0x0143, B:51:0x0149), top: B:29:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154 A[Catch: Exception -> 0x0161, TryCatch #4 {Exception -> 0x0161, blocks: (B:39:0x0154, B:41:0x0158, B:42:0x015d, B:54:0x014f), top: B:53:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149 A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #3 {Exception -> 0x0163, blocks: (B:30:0x010f, B:33:0x0118, B:34:0x0121, B:35:0x012b, B:37:0x0143, B:51:0x0149), top: B:29:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(java.lang.String r24, nu4.a r25, yz5.l r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu4.b0.G0(java.lang.String, nu4.a, yz5.l):void");
    }

    public final void H0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var, java.lang.String appId, yz5.l lVar) {
        if (appId == null || appId.length() == 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String concat = "_prefetcher_".concat(appId);
        java.util.HashMap hashMap = this.H;
        if (hashMap.containsKey(concat)) {
            java.lang.Object obj = hashMap.get(concat);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = x0(((java.lang.Number) obj).intValue());
            if (x07 != null) {
                if (lVar != null) {
                    lVar.mo146xb9724478(x07);
                    return;
                }
                return;
            }
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.d(u3Var, "/prefetcher.js");
        if (!(d17.length() > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.C, "createPrefetcherJsContext prefetcherJs is empty, appId: ".concat(appId));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r t07 = t0();
        new lu4.v(new nu4.m(concat, appId, this)).a(t07);
        new lu4.q(new nu4.y(this, appId)).a(t07);
        mu4.w.z0(this, t07, "WebPrefetcher#".concat(appId), "prefetcher", null, new mu4.i(appId, A0("prefetcher").mo15073xfb822ef2("idKey")), 8, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) t07).mo14660x738236e6(d17, new nu4.o(this, concat, t07, appId, "/prefetcher.js", lVar));
    }

    public final java.lang.Object I0(nu4.a aVar, java.lang.String str, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        J0(aVar, str, list, new nu4.v(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return a17;
    }

    public final synchronized void J0(nu4.a manifest, java.lang.String func, java.util.List list, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manifest, "manifest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = manifest.f421772g;
        if (str == null) {
            str = nu4.d0.a(nu4.d0.b(manifest) + '-' + manifest.f421767b.f461764e);
        }
        java.lang.String str2 = str;
        if (this.H.containsKey(str2)) {
            C0(str2, func, list, callback);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            c0Var.f391645d = true;
            java.lang.Object computeIfAbsent = this.I.computeIfAbsent(str2, new nu4.w(c0Var));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(computeIfAbsent, "computeIfAbsent(...)");
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) computeIfAbsent;
            if (c0Var.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, "invoke pending create, enqueue: id=" + str2 + " func=" + func);
                concurrentLinkedDeque.add(new nu4.s(this, str2, func, list, callback));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, "invoke create start: id=" + str2 + " func=" + func);
                concurrentLinkedDeque.add(new nu4.t(this, str2, func, list, callback));
                G0(str2, manifest, new nu4.u(this, concurrentLinkedDeque, str2));
            }
        }
    }
}
