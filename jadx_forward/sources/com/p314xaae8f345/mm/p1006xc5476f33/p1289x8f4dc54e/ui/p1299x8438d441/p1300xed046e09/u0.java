package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class u0 extends nu4.c0 {

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f175992c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.o0.f175912d);

    @Override // nu4.c0
    public boolean d(int i17, nu4.a manifest, java.lang.String script, yz5.l onCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manifest, "manifest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCallback, "onCallback");
        if (i17 != 1) {
            return false;
        }
        java.lang.String str = manifest.f421772g;
        if (str == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.m83 m83Var = manifest.f421767b;
            sb6.append(m83Var.f461768i);
            sb6.append('-');
            sb6.append(m83Var.f461764e);
            str = nu4.d0.a(sb6.toString());
        }
        java.util.HashMap hashMap = this.f421778b;
        if (hashMap == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextMap");
            throw null;
        }
        if (hashMap.containsKey(str)) {
            mu4.w c17 = c();
            java.util.HashMap hashMap2 = this.f421778b;
            if (hashMap2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextMap");
                throw null;
            }
            java.lang.Object obj = hashMap2.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) c17.x0(((java.lang.Number) obj).intValue())).mo14660x738236e6(script, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n0(onCallback));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m0(script, onCallback);
        java.lang.String str2 = manifest.f421766a.f460759d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "create domain:" + str2 + '#' + str);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r t07 = c().t0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            e(t07, str, str2);
            mu4.w.z0(c(), t07, "MpWebPrefetcherManifest#" + str, "manifest", null, new mu4.i("__Mp_Prefetcher_FakeAppId", c().A0("manifest").mo15073xfb822ef2("idKey")), 8, null);
            java.util.HashMap hashMap3 = this.f421778b;
            if (hashMap3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextMap");
                throw null;
            }
            hashMap3.put(str, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q) t07).f165565h));
            m0Var.mo146xb9724478(t07);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MpWebPrefetcherJsEngineInterceptor", e17, "create id=" + str, new java.lang.Object[0]);
            return true;
        }
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, java.lang.String str, java.lang.String str2) {
        new lu4.v(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.p0(str, this)).a(tVar);
        new lu4.x(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.q0()).a(tVar);
        new lu4.q(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.s0(this, str2)).a(tVar);
        new lu4.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t0(this)).a(tVar);
    }
}
