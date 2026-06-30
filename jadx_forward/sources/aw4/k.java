package aw4;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.l f96424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aw4.l lVar) {
        super(1);
        this.f96424d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        zy2.c5 param = (zy2.c5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        aw4.q i17 = this.f96424d.i();
        if (i17 != null && (mo9090x86b9ebe3 = i17.mo9090x86b9ebe3()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", param.f558900a);
            jSONObject.put("playbackTime", param.f558901b);
            jSONObject.put("isPause", param.f558902c);
            jSONObject.put("playbackRate", java.lang.Float.valueOf(param.f558903d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "onFeedStopPlay " + jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onFeedStopPlay", jSONObject2);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onFeedStopPlay", "onFeedStopPlay", jSONObject2}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
