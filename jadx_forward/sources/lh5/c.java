package lh5;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setEasterEggAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        lc3.a0 h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        int optInt = data.optInt("status");
        org.json.JSONObject jSONObject = data.getJSONObject("result");
        java.lang.String optString = jSONObject.optString("eggKey");
        java.lang.String optString2 = jSONObject.optString("eggId");
        long optLong = jSONObject.optLong("timeout");
        if (optLong <= 0) {
            optLong = 20000;
        }
        if (optInt > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, hVar.f389610q.f381401b)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: " + optInt + ' ' + optString2);
                        if (optInt == 1) {
                            hVar.f389608o.postDelayed(hVar.f389614u, optLong);
                            kh5.a aVar = hVar.f389609p;
                            if (aVar != null) {
                                jh5.b bVar = hVar.f389610q;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "onStart: %s, %s", bVar.f381401b, bVar.f381400a);
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.o9) aVar).f283602a;
                                n9Var.f283569s = true;
                                n9Var.f283560j = false;
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = n9Var.f283552b;
                                if (c21614x5c06ae16 != null) {
                                    c21614x5c06ae16.e();
                                }
                            }
                        } else if (optInt == 2) {
                            kh5.a aVar2 = hVar.f389609p;
                            if (aVar2 != null) {
                                jh5.b bVar2 = hVar.f389610q;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "onClick: %s, %s", bVar2.f381401b, bVar2.f381400a);
                                b12.k.f98593a.b(4, b12.k.f98600h, "");
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.o9) aVar2).f283602a;
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.a(n9Var2, n9Var2.f283567q, n9Var2.f283565o, n9Var2.f283551a, n9Var2.f283554d);
                            }
                        } else if (optInt != 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: wrong status: " + optInt);
                        } else {
                            hVar.s1();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MEChattingMgr", "[ME]: can't send status change because " + optString2 + " is not " + hVar.f389610q);
                    }
                    h17 = k();
                    s17.mo146xb9724478(h17);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MESetEasterEggStatus", "stevecai: set easter egg status error: " + optInt + ' ' + optString + ' ' + optString2 + ' ' + optLong);
        h17 = h(2, "");
        s17.mo146xb9724478(h17);
    }
}
