package od3;

/* loaded from: classes7.dex */
public abstract class b extends lc3.b0 implements od3.a {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            s().mo146xb9724478(h(300005, "url is null or nil"));
            return;
        }
        java.lang.String mo151084x30961476 = mo151084x30961476();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo151084x30961476)) {
            s().mo146xb9724478(h(300004, "taskId is null or nil"));
            return;
        }
        java.lang.String instanceName = e().f425864a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (data.optInt("timeout", ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(s07).f380501d) <= 0) {
            s().mo146xb9724478(h(300005, "timeout is invalid"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), mo151084x30961476);
        s().mo146xb9724478(l(hashMap));
        d(data, mo151084x30961476, optString, s07);
    }

    public final void u(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        lc3.h0 h0Var = (lc3.h0) this.f399423a;
        if (h0Var != null) {
            h0Var.C0(event);
        }
    }
}
