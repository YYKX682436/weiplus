package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f295495a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f295496b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f295497c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f295498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f295499e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 f295500f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f295501g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r f295502h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f295503i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f295504j = true;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f295505k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f295506l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f295507m;

    public p0() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f295505k = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.C22896xc0656c0(this, a0Var);
        this.f295506l = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.C22897xc0656c1(this, a0Var);
        this.f295507m = false;
    }

    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 c(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                ((h45.q) i95.n0.c(h45.q.class)).mo24758xc71a7102();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpRemind", "feed %s", com.p314xaae8f345.p347x615374d.gen.AbstractC3389x9db2f425.m27422xcae47df6(jSONObject.toString()));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JumpRemind", e17, "error create", new java.lang.Object[0]);
                return null;
            }
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindquerynew_resp");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 != null) {
            jSONObject = optJSONObject2;
        }
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("jumpRemind");
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind");
        }
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind_info");
        }
        if (optJSONObject3 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0();
        p0Var.f295495a = optJSONObject3.optInt("jump_type");
        p0Var.f295496b = optJSONObject3.optBoolean("is_pop_up_windows");
        p0Var.f295497c = optJSONObject3.optString("wording");
        p0Var.f295498d = optJSONObject3.optString("left_button_wording");
        p0Var.f295499e = optJSONObject3.optString("right_button_wording");
        p0Var.f295501g = optJSONObject3.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("url");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0();
        p0Var.f295500f = o0Var;
        if (optJSONObject4 != null) {
            o0Var.f295488a = optJSONObject4.optInt("type");
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var2 = p0Var.f295500f;
            optJSONObject4.optString("appid");
            o0Var2.getClass();
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var3 = p0Var.f295500f;
            optJSONObject4.optString("app_version");
            o0Var3.getClass();
            p0Var.f295500f.f295489b = optJSONObject4.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            p0Var.f295500f.f295490c = optJSONObject4.optString("button_name");
        }
        return p0Var;
    }

    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 d(r45.q34 q34Var) {
        if (q34Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0();
        p0Var.f295496b = q34Var.f465158e;
        p0Var.f295495a = q34Var.f465157d;
        p0Var.f295497c = q34Var.f465159f;
        p0Var.f295498d = q34Var.f465160g;
        p0Var.f295499e = q34Var.f465161h;
        p0Var.f295501g = q34Var.f465163m;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0();
        p0Var.f295500f = o0Var;
        r45.dn5 dn5Var = q34Var.f465162i;
        if (dn5Var != null) {
            o0Var.f295488a = dn5Var.f454131d;
            java.lang.String str = dn5Var.f454132e;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var2 = p0Var.f295500f;
            java.lang.String str2 = q34Var.f465162i.f454133f;
            o0Var2.getClass();
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var3 = p0Var.f295500f;
            r45.dn5 dn5Var2 = q34Var.f465162i;
            o0Var3.f295489b = dn5Var2.f454134g;
            o0Var3.f295490c = dn5Var2.f454135h;
        }
        return p0Var;
    }

    public void a() {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = this.f295500f;
        if (o0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o0Var.f295489b)) {
            return;
        }
        if (this.f295500f.f295489b.contains("clientversion")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JumpRemind", "url.path contain clientversion");
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var2 = this.f295500f;
        o0Var2.f295489b = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(o0Var2.f295489b, "clientversion=" + o45.wf.f424562g);
    }

    public boolean b() {
        return this.f295495a == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(android.content.Context context) {
        boolean z17 = context instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f295506l;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f295505k;
        if (z17) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s) context).mo66168xd6dc2ea3(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n0(this));
            abstractC20980x9b9ad01d2.mo48813x58998cd();
            abstractC20980x9b9ad01d.mo48813x58998cd();
            this.f295503i = false;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f295500f.f295489b);
            intent.putExtra("showShare", false);
            this.f295502h.mo25209xaf88dc39();
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(context, intent);
            return;
        }
        if (this.f295507m) {
            abstractC20980x9b9ad01d2.mo48813x58998cd();
            abstractC20980x9b9ad01d.mo48813x58998cd();
            this.f295503i = false;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f295500f.f295489b);
            intent2.putExtra("showShare", false);
            this.f295502h.mo25209xaf88dc39();
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(context, intent2);
        }
    }

    public void f() {
        this.f295505k.mo48814x2efc64();
        this.f295506l.mo48814x2efc64();
    }

    public boolean g(android.app.Activity activity, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p pVar) {
        i(activity, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.k0(this, pVar, activity));
        return true;
    }

    public boolean h(android.app.Activity activity, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q qVar) {
        db5.e1.A(activity, this.f295497c, this.f295501g, this.f295499e, this.f295498d, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l0(this, qVar), new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m0(this, qVar));
        return true;
    }

    public boolean i(android.app.Activity activity, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r rVar) {
        this.f295502h = rVar;
        if (this.f295496b) {
            db5.e1.K(activity, this.f295504j, this.f295497c, this.f295501g, this.f295499e, this.f295498d, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i0(this, activity), new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j0(this, activity));
            return true;
        }
        e(activity);
        return true;
    }
}
