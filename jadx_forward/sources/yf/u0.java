package yf;

/* loaded from: classes7.dex */
public class u0 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542997b;

    public u0(yf.i0 i0Var) {
        this.f542997b = i0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMComplete */
    public void mo29877x552e4ec2(int i17) {
        yf.i0 i0Var = this.f542997b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f542897n;
            int i18 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.k kVar = new bg1.k(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                qVar.a(kVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMComplete fail", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMProgress */
    public void mo29878x3d3ddfb6(long j17, long j18) {
        yf.i0 i0Var = this.f542997b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f542897n;
            int i17 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.l lVar = new bg1.l(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                jSONObject.put("progress", j17);
                jSONObject.put("duration", j18);
                qVar.a(lVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMProgress fail", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMStart */
    public void mo29879x9d54bb79() {
        yf.i0 i0Var = this.f542997b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f542897n;
            int i17 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.m mVar = new bg1.m(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                qVar.a(mVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMStart fail", e17);
            }
        }
    }
}
