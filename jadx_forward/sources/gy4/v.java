package gy4;

/* loaded from: classes5.dex */
public final class v extends wm3.n {

    /* renamed from: e, reason: collision with root package name */
    public final ct.j3 f359166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f359166e = (ct.j3) i95.n0.c(ct.j3.class);
    }

    @Override // wm3.n
    public j75.a T6() {
        gy4.d dVar = new gy4.d();
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_yuanbao_webview_scene");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dVar.f359123e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("key_yuanbao_webview_host");
        if (stringExtra2 == null) {
            throw new java.lang.IllegalArgumentException("host is required");
        }
        dVar.f359124f = stringExtra2;
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("key_yuanbao_webview_session_id");
        if (stringExtra3 == null) {
            throw new java.lang.IllegalArgumentException("sessionId is required");
        }
        dVar.f359125g = stringExtra3;
        dVar.f359126h = m158359x1e885992().getBooleanExtra("key_yuanbao_webview_old_protocol", false);
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        qg5.z2 z2Var = (qg5.z2) this.f359166e;
        z2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[setHalfScreenWebViewOpen] value: true");
        z2Var.f444808q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        qg5.z2 z2Var = (qg5.z2) this.f359166e;
        z2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[setHalfScreenWebViewOpen] value: false");
        z2Var.f444808q = false;
    }
}
