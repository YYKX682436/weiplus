package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class o0 implements zg0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f264863a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f264864b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f264865c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h0.f264792d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f264866d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i0.f264820d);

    public static final java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 o0Var, android.content.Context context, java.util.ArrayList arrayList, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.l0(nVar);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        ((sb0.f) jVar).getClass();
        j35.u.k(context, 0, l0Var, strArr, "", "", str, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static final java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 o0Var, android.content.Context context, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        db5.e1.K(context, false, "", str, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4f), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4j), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.m0(nVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n0(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, android.webkit.GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str2, z17, false);
        }
        if (str == null) {
            return;
        }
        java.lang.String y17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d.y(str);
        this.f264863a.put(y17, java.lang.Boolean.valueOf(z17));
        e().G("##allow##".concat(y17), z17);
    }

    public final void d(android.webkit.PermissionRequest permissionRequest, java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
        if (z18) {
            this.f264864b.put(f(permissionRequest, str), java.lang.Boolean.valueOf(z17));
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f264866d).mo141623x754a37bb();
    }

    public final java.lang.String f(android.webkit.PermissionRequest permissionRequest, java.lang.String str) {
        java.lang.String[] resources = permissionRequest.getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        java.lang.String str2 = "";
        for (java.lang.String str3 : resources) {
            if (!(str2 == null || r26.n0.N(str2))) {
                str2 = str2 + '-';
            }
            str2 = str2 + str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str != null ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d.y(str) : null);
        sb6.append('-');
        sb6.append(str2);
        return sb6.toString();
    }

    public void g(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, android.webkit.GeolocationPermissions.Callback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, origin = %s", str4);
        if (str == null || r26.n0.N(str)) {
            if (callback != null) {
                callback.invoke(str4, false, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, url is null");
            return;
        }
        java.lang.String y17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d.y(str);
        java.util.HashMap hashMap = this.f264863a;
        if (hashMap.containsKey(y17)) {
            java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(y17);
            if (bool == null) {
                bool = java.lang.Boolean.TRUE;
            }
            boolean booleanValue = bool.booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt use cache, allow = " + booleanValue);
            if (callback != null) {
                callback.invoke(str4, booleanValue, false);
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long q17 = e().q(y17, 0L);
        long abs = java.lang.Math.abs(currentTimeMillis - q17);
        jz5.g gVar = this.f264865c;
        if (abs < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() * 3600000 && e().f("##allow##".concat(y17))) {
            boolean i18 = e().i("##allow##".concat(y17), true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt less than " + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + " hour(lastShowTime=" + q17 + ", allow=" + i18 + "), do not show alert.");
            if (i18) {
                c(i18, str, str4, callback);
                return;
            }
        }
        e().B(y17, currentTimeMillis);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.j0(context, this, str4, str, callback, str2, i17, str3, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.webkit.PermissionRequest r18, android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0.h(android.webkit.PermissionRequest, android.content.Context, java.lang.String):void");
    }
}
