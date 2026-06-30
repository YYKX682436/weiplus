package aw4;

/* loaded from: classes.dex */
public abstract class w extends aw4.l {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(aw4.o imageUIComponent) {
        super(imageUIComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUIComponent, "imageUIComponent");
        this.f96445e = "MicroMsg.WebSearch.WebSearchImageJSApi";
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchAvatarList */
    public java.lang.String m9208x10b448d5(java.lang.String str) {
        aw4.v c17;
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
            av4.j jVar = this.f95859a;
            aw4.o oVar = jVar instanceof aw4.o ? (aw4.o) jVar : null;
            if (oVar != null && (c17 = oVar.c()) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                c17.c(optString);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchImageList */
    public java.lang.String m9209x4092119b(java.lang.String str) {
        aw4.v c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96445e, "getSearchImageList " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("requestType", 0);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
            av4.j jVar = this.f95859a;
            aw4.o oVar = jVar instanceof aw4.o ? (aw4.o) jVar : null;
            if (oVar != null && (c17 = oVar.c()) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                c17.d(optInt, optString);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public final void n(int i17, java.lang.String data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", i17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, data);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchImageListReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchImageListReady", "onSearchImageListReady", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
