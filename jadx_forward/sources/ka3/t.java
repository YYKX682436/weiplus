package ka3;

/* loaded from: classes15.dex */
public final class t implements dd1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka3.u f387618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ka3.i f387619b;

    public t(ka3.u uVar, ka3.i iVar) {
        this.f387618a = uVar;
        this.f387619b = iVar;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "unregister onServiceCallback=" + resp);
        if (ka3.b.a(resp)) {
            ka3.u.a(this.f387618a);
        }
        this.f387619b.a(resp);
    }
}
