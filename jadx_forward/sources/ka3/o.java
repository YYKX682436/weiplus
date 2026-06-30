package ka3;

/* loaded from: classes15.dex */
public final class o implements dd1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd.e f387614a;

    public o(bd.e eVar) {
        this.f387614a = eVar;
    }

    @Override // dd1.a
    public void a(org.json.JSONObject params, android.nfc.cardemulation.HostApduService hostService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostService, "hostService");
    }

    @Override // dd1.a
    public void b(org.json.JSONObject resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        ka3.m mVar = ka3.u.f387620r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "getHceStateInfo onServiceCallback=" + resp);
        this.f387614a.a(resp, true, false);
    }
}
