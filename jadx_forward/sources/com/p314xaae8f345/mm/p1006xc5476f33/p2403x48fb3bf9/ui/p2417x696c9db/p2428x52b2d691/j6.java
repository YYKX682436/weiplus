package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class j6 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f267812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l6 f267813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f267814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267815e;

    public j6(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l6 l6Var, boolean z17, android.content.Context context) {
        this.f267811a = rVar;
        this.f267812b = jSONObject;
        this.f267813c = l6Var;
        this.f267814d = z17;
        this.f267815e = context;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImage", "checkHasFinishRegisterAndLogin, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267811a;
        if (!z17) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e(false, err_msg, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject != null ? jSONObject.toString() : null)));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h6 h6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h6(rVar);
        tk.v vVar = tk.w.f501411e;
        org.json.JSONObject jSONObject2 = this.f267812b;
        java.lang.String optString = jSONObject2.optString("mpPublishAction", "openImage");
        l81.b1 a17 = this.f267813c.a(jSONObject2);
        a17.f398570o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i6(rVar);
        boolean d17 = u46.l.d(optString, "openImage");
        android.content.Context activity = this.f267815e;
        if (d17) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "$activity");
            ((ox.g) oVar).rj(this.f267814d, activity, a17, h6Var);
        } else {
            tk.o oVar2 = (tk.o) i95.n0.c(tk.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "$activity");
            ((ox.g) oVar2).sj(activity, a17, h6Var);
        }
    }
}
