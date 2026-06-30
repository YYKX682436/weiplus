package qx4;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f448983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f448987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.os.Bundle bundle, java.lang.String str, qx4.d0 d0Var, java.lang.String str2, boolean z17) {
        super(0);
        this.f448983d = bundle;
        this.f448984e = str;
        this.f448985f = d0Var;
        this.f448986g = str2;
        this.f448987h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        org.json.JSONObject f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe32;
        java.lang.String str = this.f448986g;
        java.lang.String str2 = this.f448984e;
        qx4.d0 d0Var = this.f448985f;
        android.os.Bundle bundle = this.f448983d;
        if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
            if (str2 != null && (r26.n0.N(str2) ^ true)) {
                f17 = d0Var.g();
                f17.put("json", str2);
            } else {
                f17 = d0Var.f();
            }
            f17.put("requestId", str);
            f17.put("newQuery", this.f448987h);
            av4.j jVar = d0Var.f95859a;
            if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject = f17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchDataReady", jSONObject);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchDataReady", "onSearchDataReady", jSONObject}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        } else {
            if (str2 != null && (r26.n0.N(str2) ^ true)) {
                f18 = d0Var.g();
                f18.put("widgetId", bundle.getString("widgetId", ""));
                f18.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
            } else {
                f18 = d0Var.f();
            }
            f18.put("requestId", str);
            av4.j jVar2 = d0Var.f95859a;
            if (jVar2 != null && (mo9090x86b9ebe32 = jVar2.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = f18.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchWAWidgetReloadDataFinish", jSONObject2);
                    java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchWAWidgetReloadDataFinish", "onSearchWAWidgetReloadDataFinish", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe32, format2));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
