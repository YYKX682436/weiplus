package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* loaded from: classes.dex */
public abstract class p extends jd.b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: e, reason: collision with root package name */
    public jd.c f224975e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o f224976f = null;

    @Override // jd.b
    public void b(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (z() != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o();
            this.f224976f = oVar;
            oVar.f224973a = this.f224975e;
            a(str, jSONObject, z17);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
        bundle.putBoolean("isFromView", z17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, getClass(), new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.n(this));
    }

    public android.content.Context c() {
        jd.c cVar = this.f224975e;
        if (cVar == null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.lang.Object m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(cVar.f380557a);
        if (m65361xd4eb96cf != null) {
            if (m65361xd4eb96cf instanceof android.app.Activity) {
                return (android.content.Context) m65361xd4eb96cf;
            }
            if (m65361xd4eb96cf instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
                return ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) m65361xd4eb96cf).mo7430x19263085();
            }
            if (m65361xd4eb96cf instanceof android.view.View) {
                return ((android.view.View) m65361xd4eb96cf).getContext();
            }
            if (m65361xd4eb96cf instanceof com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) {
                return ((com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) m65361xd4eb96cf).f127508q;
            }
        }
        android.content.Context m65325xac4bbec7 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65325xac4bbec7(this.f224975e.f380558b);
        return m65325xac4bbec7 != null ? m65325xac4bbec7 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
    }

    public void d(int i17) {
    }

    public void e(int i17, int i18, android.content.Intent intent) {
    }

    public void f(int i17, int i18, android.content.Intent intent) {
    }

    public void g(int i17, int i18, android.content.Intent intent) {
    }

    public void h(int i17, int i18, android.content.Intent intent) {
    }

    public void i(java.lang.String str, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o();
        this.f224976f = oVar;
        oVar.f224974b = rVar;
        try {
            a(bundle.getString("appId"), new org.json.JSONObject(bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)), bundle.getBoolean("isFromView"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApi", e17, "", new java.lang.Object[0]);
        }
    }

    public void j(int i17, int i18, android.content.Intent intent) {
    }

    public void k(int i17, int i18, android.content.Intent intent) {
    }

    public void l(int i17, int i18, android.content.Intent intent) {
    }

    public void m(int i17, int i18, android.content.Intent intent) {
    }

    public void n(int i17, int i18, android.content.Intent intent) {
    }

    public void o(int i17, int i18, android.content.Intent intent) {
    }

    public void p(int i17, int i18, android.content.Intent intent) {
    }

    public void q(int i17, int i18, android.content.Intent intent) {
    }

    public void r(boolean z17) {
    }

    public void s(boolean z17) {
    }

    public void t() {
    }

    public void u(int i17, int i18, android.content.Intent intent) {
    }

    public void v(int i17, int i18, android.content.Intent intent) {
    }

    public void w(int i17, int i18, android.content.Intent intent) {
    }

    public void x(int i17, int i18, android.content.Intent intent) {
    }

    public void y(int i17, int i18, android.content.Intent intent) {
    }

    public int z() {
        return 0;
    }
}
