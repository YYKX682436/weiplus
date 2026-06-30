package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class a1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f263675a;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.f263675a = e0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f263675a;
        e0Var.Q = false;
        e0Var.F(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y0(this, str, str2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void c(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f263675a;
        e0Var.Q = false;
        e0Var.F(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z0(this, i17, str, i18, i19, str2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void d(int i17, java.lang.String str) {
        sx4.d0 d0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) this.f263675a).P1;
        if (d0Var.f495120f == 0) {
            d0Var.f495120f = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void e(int i17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f263675a.Q = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void f(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public /* bridge */ /* synthetic */ boolean g(int i17, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void h(int i17, boolean z17, final java.lang.String str, final java.lang.String str2, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f263675a;
        e0Var.Q = false;
        final java.util.Map g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.g(((r45.s83) obj).f467095x);
        if (z17) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) e0Var;
            x0Var.F(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.luggage.e0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0.this;
                    sd.o0 o0Var = e0Var2.f488188i;
                    o0Var.f488174t = false;
                    if (e0Var2.y(str) || e0Var2.T || e0Var2.f263714p0) {
                        return;
                    }
                    java.util.Map map = g17;
                    java.lang.String str3 = str2;
                    if (map == null || map.size() <= 0) {
                        o0Var.j(str3);
                    } else {
                        o0Var.f488166i.mo32266x141096a9(str3, map);
                    }
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onUrlForceRedirect reqUrl = " + str);
            if (!x0Var.f221486e2) {
                x0Var.f221486e2 = true;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("uia", 1000);
                    jSONObject.put("pid", "000");
                    jSONObject.put("url", str);
                } catch (org.json.JSONException unused) {
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(x0Var.f263718s.getContext(), 36, 0, 0, 56, 0, jSONObject.toString());
            }
        }
        e0Var.F(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x0(this, str, str2, g17));
    }
}
