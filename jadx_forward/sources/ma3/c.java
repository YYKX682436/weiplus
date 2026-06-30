package ma3;

/* loaded from: classes8.dex */
public final class c implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f406745d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f406746e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f406747f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f406748g;

    public c(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        android.app.Activity activity;
        this.f406745d = c28688xe8dbe4c2;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f406747f = uuid;
        this.f406748g = "";
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        this.f406746e = relativeLayout;
        relativeLayout.setBackgroundColor(-65536);
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "creationParams: %s, token: %s", java.lang.String.valueOf(map), uuid);
        java.lang.Object obj = map != null ? map.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        this.f406748g = (java.lang.String) obj;
        java.lang.Object obj2 = map != null ? map.get("fileExt") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj2;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppXFileView", "fileExt is empty");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean c17 = com.p314xaae8f345.p3210x3857dc.r1.c(str, false, true, 3);
        hashMap.put("extra_param_enable_multi_instance", java.lang.String.valueOf(c17));
        hashMap.put("extra_param_disable_scale", "false");
        hashMap.put("extra_param_enable_receive_view_status_change", "true");
        hashMap.put("extra_param_disable_finish_activity", "true");
        hashMap.put("extra_param_set_max_scale", "3");
        hashMap.put("extra_param_can_download_when_plugin_error", "true");
        hashMap.put("extra_param_open_file_scene", "20");
        hashMap.put("extra_param_enable_view_edge_changed_event", "true");
        if (context instanceof android.content.MutableContextWrapper) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            if (baseContext instanceof android.app.Activity) {
                activity = (android.app.Activity) baseContext;
                com.p314xaae8f345.p3210x3857dc.r1.d(this.f406748g, str, uuid, c17, hashMap, com.p314xaae8f345.p3210x3857dc.q1.ListView, activity, relativeLayout, new ma3.a(this), ma3.b.f406744a);
            }
        }
        activity = null;
        com.p314xaae8f345.p3210x3857dc.r1.d(this.f406748g, str, uuid, c17, hashMap, com.p314xaae8f345.p3210x3857dc.q1.ListView, activity, relativeLayout, new ma3.a(this), ma3.b.f406744a);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        java.lang.String str = this.f406747f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "LiteAppXFileView is dispose!!! %s", str);
        try {
            com.p314xaae8f345.p3210x3857dc.r1.a(str, this.f406748g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppXFileView", "dispose finishReadFile failed", e17);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f406745d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f406746e;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppXFileView", "onMethodCall " + methodCall.f71610xbfc5d0e1 + ", " + methodCall.f71609x86ac7956);
        java.lang.String str = methodCall.f71610xbfc5d0e1;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!str.equals("supportMultiInstance")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppXFileView", "onMethodCall not found method: ".concat(str));
            result.mo65718x5c4d208("", "onMethodCall not found method", null);
            return;
        }
        linkedHashMap.put("result", java.lang.Boolean.FALSE);
        java.lang.Object obj = methodCall.f71609x86ac7956;
        if (obj instanceof java.util.ArrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (arrayList.size() == 2) {
                java.lang.Object obj2 = arrayList.get(0);
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                linkedHashMap.put("result", java.lang.Boolean.valueOf(com.p314xaae8f345.p3210x3857dc.r1.c(str2 != null ? str2 : "", false, true, 3)));
            }
        }
        result.mo65720x90b54003(linkedHashMap);
    }
}
