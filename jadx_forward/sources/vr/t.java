package vr;

/* loaded from: classes5.dex */
public final class t implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f520970c;

    public t(java.lang.String str, yz5.l lVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f520968a = str;
        this.f520969b = lVar;
        this.f520970c = interfaceC4987x84e327cb;
    }

    @Override // dr.q
    public void a(boolean z17) {
        yz5.l lVar = this.f520969b;
        if (z17) {
            java.lang.String T = this.f520970c.T();
            lVar.mo146xb9724478(T != null ? T : "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "loadFile failed. md5=" + this.f520968a);
            lVar.mo146xb9724478("");
        }
    }
}
