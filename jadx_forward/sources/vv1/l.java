package vv1;

/* loaded from: classes3.dex */
public class l implements lo.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.n f521955a;

    public l(vv1.n nVar) {
        this.f521955a = nVar;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Video", "onDownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.n nVar = this.f521955a;
        if (i17 == 0) {
            nVar.l(nVar.f521958n, str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "download fail");
            nVar.a();
        }
    }
}
