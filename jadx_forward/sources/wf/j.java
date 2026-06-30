package wf;

/* loaded from: classes7.dex */
public class j implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf.b f527003d;

    public j(wf.b bVar) {
        this.f527003d = bVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        wf.b bVar = this.f527003d;
        xf.b bVar2 = bVar.f526953n;
        if (bVar2 != null) {
            int i17 = bVar.f334030d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.j jVar = new yf1.j(null);
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
                kVar.a(jVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerNetStatus fail", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        if (2006 == i17 || -2301 == i17) {
            this.f527003d.L(new java.lang.Runnable() { // from class: wf.j$$a
                @Override // java.lang.Runnable
                public final void run() {
                    wf.a aVar = wf.j.this.f527003d.f526951i;
                    if (aVar != null) {
                        aVar.n("stop", null);
                    }
                }
            });
        }
        wf.b bVar = this.f527003d;
        xf.b bVar2 = bVar.f526953n;
        if (bVar2 != null) {
            int i18 = bVar.f334030d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.i iVar = new yf1.i(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760));
                kVar.a(iVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerEvent fail", e17);
            }
        }
        wf.b bVar3 = this.f527003d;
        xf.a aVar = bVar3.f526954o;
        if (aVar != null) {
            ((yf1.e) aVar).c(bVar3.f334030d, i17, bundle);
        }
        if (i17 == -2301) {
            wf.b bVar4 = this.f527003d;
            tf.m0 m0Var = bVar4.N;
            if (m0Var != null) {
                m0Var.mo129542xc39f8281();
            } else {
                bVar4.P = 6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f527003d.w(), "onStop, abandonFocus");
            this.f527003d.f526967z.a();
            return;
        }
        if (i17 != 2003) {
            if (i17 == 2006) {
                wf.b bVar5 = this.f527003d;
                tf.m0 m0Var2 = bVar5.N;
                if (m0Var2 != null) {
                    m0Var2.f();
                } else {
                    bVar5.P = 7;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f527003d.w(), "onPlayEnd, abandonFocus");
                this.f527003d.f526967z.a();
                return;
            }
            if (i17 != 2007) {
                return;
            }
            wf.b bVar6 = this.f527003d;
            tf.m0 m0Var3 = bVar6.N;
            if (m0Var3 != null) {
                m0Var3.j();
                return;
            } else {
                bVar6.P = 0;
                return;
            }
        }
        wf.b bVar7 = this.f527003d;
        tf.m0 m0Var4 = bVar7.N;
        if (m0Var4 != null) {
            m0Var4.l();
            wf.b bVar8 = this.f527003d;
            bVar8.N.e(bVar8.Q);
        } else {
            bVar7.P = bVar7.Q ? 2 : 3;
        }
        this.f527003d.w();
        boolean z17 = this.f527003d.H;
        wf.b bVar9 = this.f527003d;
        boolean z18 = bVar9.G;
        if (bVar9.H) {
            return;
        }
        wf.b bVar10 = this.f527003d;
        if (bVar10.G || bVar10.y()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f527003d.w(), "onPlayEvent play, requestFocus");
        if (this.f527003d.f526967z.mo51100x4c4bb389()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f527003d.w(), "onPlayEvent play, can not play");
        wf.b.r(this.f527003d);
    }
}
