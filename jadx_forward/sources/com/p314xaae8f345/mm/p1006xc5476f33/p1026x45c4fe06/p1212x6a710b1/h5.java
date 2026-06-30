package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class h5 implements o05.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl1.c f171995a;

    public h5(nl1.c cVar) {
        this.f171995a = cVar;
    }

    @Override // o05.j
    public void a(float f17) {
    }

    @Override // o05.j
    public void b(int i17, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        nl1.c cVar = this.f171995a;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w3 w3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w3) cVar;
            if (i17 == 66) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 y3Var = w3Var.f173245a;
                if (y3Var.f173260h != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            if (text instanceof cl0.d) {
                                jSONObject.put("value", ((cl0.d) text).f124379a);
                            } else {
                                jSONObject.put("value", text);
                            }
                            int i18 = y3Var.f173261i;
                            if (i18 != -1) {
                                try {
                                    jSONObject.put("inputId", i18);
                                } catch (org.json.JSONException e17) {
                                    throw new cl0.f(e17);
                                }
                            }
                            y3Var.f173260h.g("onKeyboardConfirm", jSONObject.toString());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "dispatch enter text:%s inputid:%s", text, java.lang.Integer.valueOf(y3Var.f173261i));
                        } catch (org.json.JSONException e18) {
                            throw new cl0.f(e18);
                        }
                    } catch (cl0.f e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "", e19.getMessage());
                    }
                }
            }
        }
    }
}
