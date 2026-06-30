package i31;

/* loaded from: classes9.dex */
public final class i extends i31.a {

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f369642c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 f369643d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f369644e;

    /* renamed from: b, reason: collision with root package name */
    public final int f369641b = 1;

    /* renamed from: f, reason: collision with root package name */
    public final j31.a f369645f = new j31.a();

    @Override // i31.c
    public void a(java.lang.String bizUsername, i31.b l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        android.app.Activity activity = this.f369642c;
        if (activity == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) activity.getIntent().getParcelableExtra("key_biz_data");
        this.f369643d = c11162xe78737a3;
        if (c11162xe78737a3 != null) {
            ((m31.j) l17).a(c11162xe78737a3);
            h(this.f369643d, bizUsername);
            i(0);
        } else {
            o31.k kVar = new o31.k(bizUsername, new i31.h(this, l17, bizUsername));
            f31.f fVar = new f31.f(bizUsername, 3);
            fVar.f340810f = kVar;
            fVar.a(f31.b.f340802a);
        }
    }

    @Override // i31.c
    public void b(boolean z17) {
        this.f369644e = true;
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = this.f369643d;
        if (c11162xe78737a3 != null) {
            c11162xe78737a3.f153368e = z17;
        }
        j31.a aVar = this.f369645f;
        aVar.f378890d = z17;
        aVar.getClass();
        aVar.f378893g = "";
        aVar.getClass();
        aVar.f378894h = "";
        aVar.f378892f = 0;
        i(1);
    }

    @Override // i31.c
    public m31.f c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return new m31.g0(activity, new i31.f(this, activity));
    }

    @Override // i31.a
    public void d(android.app.Activity activity) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369642c = activity;
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (str = intent.getStringExtra("service_notify_session_id")) == null) {
            str = "";
        }
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        j31.a aVar = this.f369645f;
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        aVar.f378891e = str2;
        if (android.text.TextUtils.isEmpty(str)) {
            str = aVar.f378891e;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f378889c = str;
        android.content.Intent intent2 = activity.getIntent();
        aVar.f378887a = intent2 != null ? intent2.getIntExtra("key_enter_scene", 0) : 0;
    }

    @Override // i31.a
    public void g(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!this.f369644e || this.f369643d == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_biz_data", this.f369643d);
        activity.setResult(-1, intent);
    }

    public final void h(com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3, java.lang.String str) {
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> list;
        if (c11162xe78737a3 == null) {
            return;
        }
        j31.a aVar = this.f369645f;
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f378888b = str;
        aVar.f378890d = c11162xe78737a3.f153368e;
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a32 = this.f369643d;
        if (c11162xe78737a32 == null || (list = c11162xe78737a32.f153369f) == null) {
            return;
        }
        if (list.isEmpty()) {
            aVar.getClass();
            aVar.f378895i = "[]";
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : list) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("templateTitle", c11159x8f55e6d3.f153335e);
            jSONObject.put("status", c11159x8f55e6d3.f153340m);
            jSONObject.put("templateID", c11159x8f55e6d3.f153336f);
            jSONObject.put("msgType", c11159x8f55e6d3.f153353z);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        try {
            java.lang.String b17 = fp.s0.b(jSONArray2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "encode(...)");
            jSONArray2 = b17;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaSubscribeMsgSettingPagePresenter", e17.toString());
        }
        aVar.getClass();
        aVar.f378895i = jSONArray2;
    }

    public final void i(int i17) {
        j31.e eVar = j31.e.f378925a;
        j31.a reportInfo = this.f369645f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = reportInfo.f378888b;
        objArr[1] = reportInfo.f378889c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f378887a);
        objArr[3] = reportInfo.f378891e;
        objArr[4] = java.lang.Integer.valueOf(reportInfo.f378892f);
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Integer.valueOf(reportInfo.f378890d ? 1 : 0);
        objArr[7] = reportInfo.f378893g;
        objArr[8] = reportInfo.f378894h;
        objArr[9] = i17 > 0 ? "[]" : reportInfo.f378895i;
        fVar.d(35855, objArr);
    }
}
