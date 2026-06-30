package yf;

/* loaded from: classes7.dex */
public class t0 implements com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542995b;

    public t0(yf.i0 i0Var) {
        this.f542995b = i0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onNetStatus */
    public void mo29885x3bee38d0(android.os.Bundle bundle) {
        yf.i0 i0Var = this.f542995b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f542897n;
            int i17 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.p pVar = new bg1.p(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bundle != null) {
                    for (java.lang.String str : bundle.keySet()) {
                        jSONObject2.put(str, bundle.get(str));
                    }
                }
                jSONObject.put("info", jSONObject2);
                qVar.a(pVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherNetStatus fail", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onPushEvent */
    public void mo29886xceec7081(int i17, android.os.Bundle bundle) {
        if (this.f542995b.H()) {
            yf.i0 i0Var = this.f542995b;
            zf.d dVar = i0Var.f542897n;
            int i18 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.o oVar = new bg1.o(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760));
                qVar.a(oVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherEvent fail", e17);
            }
        }
        yf.i0 i0Var2 = this.f542995b;
        zf.c cVar = i0Var2.f542898o;
        if (cVar != null) {
            if (i17 != 1002 && i17 != 1003 && i17 != 1018) {
                if (i17 == -1307) {
                    ((bg1.h) cVar).f(i0Var2, i0Var2.f542899p);
                    return;
                }
                return;
            }
            if (i0Var2.G) {
                return;
            }
            yf.i0 i0Var3 = this.f542995b;
            zf.c cVar2 = i0Var3.f542898o;
            sf.f fVar = i0Var3.f542899p;
            bg1.h hVar = (bg1.h) cVar2;
            hVar.f101427e = true;
            hVar.f101428f = tf1.h.a(fVar);
            hVar.a();
            java.lang.String w17 = i0Var3.w();
            fb1.e.f342369e.F3(fb1.d.f342366h, true, w17);
            java.lang.String mo50271x74292566 = fVar.mo50271x74292566();
            bg1.a aVar = new bg1.a(hVar, w17, i0Var3, fVar);
            hVar.f101430h = aVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(mo50271x74292566, aVar);
            if (hVar.f101425c) {
                xf1.i d17 = hVar.d(fVar);
                if (d17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = tf1.h.a(fVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17.f535770d, "onPushBegin, runtime:%s, LivePusher:%s", a17.f156336n, i0Var3.g());
                    d17.c(a17, 1);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, not voip mode");
            }
            tf.m0 m0Var = hVar.f101432j;
            if (m0Var == null) {
                hVar.f101433k = hVar.f101434l ? 2 : 3;
            } else {
                m0Var.l();
                hVar.f101432j.e(hVar.f101434l);
            }
        }
    }
}
