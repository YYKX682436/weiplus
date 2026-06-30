package of1;

/* loaded from: classes8.dex */
public class f implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.g f426444a;

    public f(of1.g gVar) {
        this.f426444a = gVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HTMLViewScanHelper", "share image to friend fail, imgPath is null");
            return;
        }
        of1.m mVar = this.f426444a.f426449d;
        mVar.getClass();
        try {
            mVar.f426415f.X9(str, ((of1.v0) ((of1.w1) mVar.f426413d).m151222x143f1b92()).U(), null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "sendImgToFriend(path:%s) ipc forMsgRetransmit get exception:%s", str, e17);
        }
    }
}
