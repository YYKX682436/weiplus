package wd3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "stopListenToEvent";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiStopListenToEvent", "eventName:" + optString);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4.class))).Di(e().f425864a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.m66569xdce0328(optString));
            s().mo146xb9724478(k());
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiStopListenToEvent", "eventName error");
            s().mo146xb9724478(i(lc3.x.f399470d));
        }
    }
}
