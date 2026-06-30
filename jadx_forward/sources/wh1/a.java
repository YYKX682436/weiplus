package wh1;

/* loaded from: classes7.dex */
public class a extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh1.e f527450e;

    public a(wh1.e eVar) {
        this.f527450e = eVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandNetworkUploadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        wh1.e eVar = this.f527450e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", eVar.f527474w, java.lang.Integer.valueOf(eVar.f527470s), this.f527450e.f527464m);
        if (this.f527450e.f527462h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out already callback");
        } else {
            this.f527450e.f527462h = true;
            wh1.e eVar2 = this.f527450e;
            ((uh1.b0) eVar2.f527460f).a(eVar2.f527466o, eVar2.f527464m, "fail:time out", 5);
        }
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 6L, 1L, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f527450e.f527476y)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f527450e.f527476y);
    }
}
