package vv1;

/* loaded from: classes3.dex */
public class i implements lo.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.k f521951a;

    public i(vv1.k kVar) {
        this.f521951a = kVar;
    }

    @Override // lo.l
    public void a(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f521951a.b(j17, j18);
    }

    @Override // lo.l
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Image", "DownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.k kVar = this.f521951a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "download fail");
            kVar.a();
        } else if (!(kVar.f521938d instanceof wv1.b)) {
            kVar.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
            kVar.l((wv1.b) kVar.f521938d);
        }
    }
}
