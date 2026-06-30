package jt2;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyLoadResult";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        rs5.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt("result", -2);
        rs5.g[] m162977xcee59d22 = rs5.g.m162977xcee59d22();
        int length = m162977xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                gVar = null;
                break;
            }
            gVar = m162977xcee59d22[i17];
            if (gVar.f480889d == optInt) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.String optString = data.optString("errMsg");
        if (gVar == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MRJsApiNotifyLoadResult", "notify load result with invalid params: " + data, null);
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        it2.x xVar = ((it2.k) eVar).f376044d;
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "notify load result " + gVar + " with error " + optString);
        if (gVar != rs5.g.f480887e) {
            xVar.Di(new it2.q(gVar, optString));
        }
        s().mo146xb9724478(k());
    }
}
