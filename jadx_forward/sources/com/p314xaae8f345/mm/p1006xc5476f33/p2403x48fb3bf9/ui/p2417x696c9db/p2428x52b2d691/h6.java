package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class h6 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267766a;

    public h6(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267766a = rVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImage", "publishCallback, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17 && jSONObject == null) {
            return;
        }
        this.f267766a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e(z17, err_msg, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject != null ? jSONObject.toString() : null)));
    }
}
