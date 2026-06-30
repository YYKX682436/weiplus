package jt2;

/* loaded from: classes3.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyPrepareResourceResult";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        rs5.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt("result", -2);
        int optInt2 = data.optInt("callbackId", -1);
        rs5.h[] m162980xcee59d22 = rs5.h.m162980xcee59d22();
        int length = m162980xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                hVar = null;
                break;
            }
            hVar = m162980xcee59d22[i17];
            if (hVar.f480897d == optInt) {
                break;
            } else {
                i17++;
            }
        }
        if (hVar == null || optInt2 < 0) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MRJsApiNotifyPrepareResourceResult", "notify prepare resource result with invalid params: " + data, null);
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        it2.x xVar = ((it2.k) eVar).f376044d;
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "notifyPrepareResourceResult: " + hVar + " with id " + optInt2);
        android.util.SparseArray sparseArray = xVar.f376071o;
        yz5.l lVar = (yz5.l) sparseArray.get(optInt2);
        if (lVar != null) {
            lVar.mo146xb9724478(hVar);
        }
        sparseArray.remove(optInt2);
        s().mo146xb9724478(k());
    }
}
