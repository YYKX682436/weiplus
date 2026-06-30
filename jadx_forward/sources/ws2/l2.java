package ws2;

/* loaded from: classes3.dex */
public final class l2 implements ws2.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.SoftReference f530627a;

    public l2(java.lang.ref.SoftReference sReplayMiniView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sReplayMiniView, "sReplayMiniView");
        this.f530627a = sReplayMiniView;
    }

    @Override // ws2.m2
    public void a(boolean z17) {
    }

    @Override // ws2.m2
    public void b(boolean z17) {
    }

    @Override // ws2.m2
    public void c(java.lang.String userId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
    }

    @Override // ws2.m2
    public void d() {
    }

    @Override // ws2.m2
    public void e() {
    }

    @Override // ws2.m2
    public void f(java.lang.String str) {
    }

    @Override // ws2.m2
    public void g(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e m17;
        dt2.t tVar = (dt2.t) this.f530627a.get();
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SeiProcessCallbackMiniProxy", "getMiniView fail!");
        }
        if (tVar == null || (m17 = tVar.m()) == null) {
            return;
        }
        m17.i(z17);
    }

    @Override // ws2.m2
    public boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        dt2.t tVar = (dt2.t) this.f530627a.get();
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SeiProcessCallbackMiniProxy", "getMiniView fail!");
        }
        if (tVar == null) {
            return false;
        }
        tVar.q(3, jSONObject, jSONObject2, jSONObject3, true);
        return false;
    }

    @Override // ws2.m2
    public void i(org.json.JSONArray jSONArray) {
    }

    @Override // ws2.m2
    public void j(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
    }

    @Override // ws2.m2
    public void k() {
    }

    @Override // ws2.m2
    public void l() {
    }

    @Override // ws2.m2
    /* renamed from: statusChange */
    public void mo174392x60d69242(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
    }
}
