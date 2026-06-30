package ug4;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f509113f = "MBJsApiPerformLiveAction";

    @Override // lc3.c0
    public java.lang.String f() {
        return "performLiveAction";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.w wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509113f, "action:" + optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            s().mo146xb9724478(h(1, "performLiveAction action null"));
        }
        xg4.p pVar = (xg4.p) this.f399423a;
        if (pVar != null && (wVar = pVar.B) != null) {
            wVar.a(optString, data);
        }
        s().mo146xb9724478(k());
    }
}
