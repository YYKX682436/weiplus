package aw4;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.y f96446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f96447e;

    public x(aw4.y yVar, org.json.JSONObject jSONObject) {
        this.f96446d = yVar;
        this.f96447e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        aw4.q qVar = this.f96446d.f96377d;
        if (qVar == null || (mo9090x86b9ebe3 = qVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject = this.f96447e.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onTeachSearchDataReady", jSONObject);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onTeachSearchDataReady", "onTeachSearchDataReady", jSONObject}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
