package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class h5 implements o05.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl1.c f90462a;

    public h5(nl1.c cVar) {
        this.f90462a = cVar;
    }

    @Override // o05.j
    public void a(float f17) {
    }

    @Override // o05.j
    public void b(int i17, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        nl1.c cVar = this.f90462a;
        if (cVar != null) {
            com.tencent.mm.plugin.appbrand.widget.input.w3 w3Var = (com.tencent.mm.plugin.appbrand.widget.input.w3) cVar;
            if (i17 == 66) {
                com.tencent.mm.plugin.appbrand.widget.input.y3 y3Var = w3Var.f91712a;
                if (y3Var.f91727h != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            if (text instanceof cl0.d) {
                                jSONObject.put("value", ((cl0.d) text).f42846a);
                            } else {
                                jSONObject.put("value", text);
                            }
                            int i18 = y3Var.f91728i;
                            if (i18 != -1) {
                                try {
                                    jSONObject.put("inputId", i18);
                                } catch (org.json.JSONException e17) {
                                    throw new cl0.f(e17);
                                }
                            }
                            y3Var.f91727h.g("onKeyboardConfirm", jSONObject.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "dispatch enter text:%s inputid:%s", text, java.lang.Integer.valueOf(y3Var.f91728i));
                        } catch (org.json.JSONException e18) {
                            throw new cl0.f(e18);
                        }
                    } catch (cl0.f e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "", e19.getMessage());
                    }
                }
            }
        }
    }
}
