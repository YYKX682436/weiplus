package fg1;

/* loaded from: classes7.dex */
public final class g implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public int f343398a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f343399b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b f343400c;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, org.json.JSONObject jSONObject) {
        if (n5Var != null) {
            if (!(n5Var instanceof fg1.e) && !(n5Var instanceof fg1.d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r17 = n5Var.r(jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f343400c;
            if (bVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = bVar.m();
                if (m17 != null) {
                    if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
                        if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5)) {
                            m17.i(r17, null);
                            return;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).i(r17, null);
                            return;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                    e9Var.i(r17, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
                    if (V0 != null) {
                        V0.i(r17, null);
                    }
                }
            }
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f343399b);
        return jSONObject;
    }

    public void c() {
        try {
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            b17.put("type", "DLNA");
            a(new fg1.f(), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoWaiting fail", e17);
        }
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebCastingUserSelect: ");
        try {
            org.json.JSONObject b17 = b();
            b17.put("type", "DLNA");
            b17.put("state", z17 ? ya.b.f77504xbb80cbe3 : "fail");
            a(new uf.f2(), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebCastingUserSelect fail", e17);
        }
    }

    public void e(boolean z17) {
        java.lang.String str = z17 ? ya.b.f77504xbb80cbe3 : "fail";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange: status = ".concat(str));
        try {
            org.json.JSONObject b17 = b();
            b17.put("status", str);
            a(new uf.g2(), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange fail", e17);
        }
    }
}
