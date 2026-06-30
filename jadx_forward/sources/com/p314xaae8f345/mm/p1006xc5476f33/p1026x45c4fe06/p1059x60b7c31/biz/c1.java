package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class c1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e1 f161487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f161488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f161489c;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e1 e1Var, org.json.JSONObject jSONObject, boolean z17) {
        this.f161487a = e1Var;
        this.f161488b = jSONObject;
        this.f161489c = z17;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        l81.b1 e17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "checkHasFinishRegisterAndLogin, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e1 e1Var = this.f161487a;
        if (!z17) {
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            e1Var.m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12034xcbb61794(false, err_msg, str));
            return;
        }
        tk.v vVar = tk.w.f501411e;
        org.json.JSONObject jSONObject2 = this.f161488b;
        java.lang.String optString = jSONObject2.optString("mpPublishAction", "openWeApp");
        e17 = e1Var.e(jSONObject2);
        e17.f398570o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.b1(e1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.a1(e1Var);
        tk.v vVar2 = tk.w.f501411e;
        if (u46.l.d(optString, "openImage")) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            m50421x3c6fed6a2 = e1Var.m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a2, "access$getActivityContext(...)");
            ((ox.g) oVar).rj(this.f161489c, m50421x3c6fed6a2, e17, a1Var);
            return;
        }
        tk.o oVar2 = (tk.o) i95.n0.c(tk.o.class);
        m50421x3c6fed6a = e1Var.m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "access$getActivityContext(...)");
        ((ox.g) oVar2).sj(m50421x3c6fed6a, e17, a1Var);
    }
}
