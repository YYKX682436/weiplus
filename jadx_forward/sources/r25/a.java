package r25;

/* loaded from: classes7.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f450386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc0.h f450387b;

    public a(q80.d0 d0Var, bc0.h hVar) {
        this.f450386a = d0Var;
        this.f450387b = hVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkLiteAppHandler", "handleLiteApp, startLiteApp failed, appId: " + this.f450386a.f442182a);
        bc0.h hVar = this.f450387b;
        if (hVar != null) {
            ((o25.C29259x380127) hVar).a(false, null);
        }
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkLiteAppHandler", "handleLiteApp, startLiteApp success, appId: " + this.f450386a.f442182a);
        bc0.h hVar = this.f450387b;
        if (hVar != null) {
            ((o25.C29259x380127) hVar).a(true, null);
        }
    }
}
