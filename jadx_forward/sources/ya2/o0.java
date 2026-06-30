package ya2;

/* loaded from: classes.dex */
public final class o0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f542050a;

    public o0(yz5.l lVar) {
        this.f542050a = lVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "OpenLiteApp fail");
        yz5.l lVar = this.f542050a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "OpenLiteApp success");
        yz5.l lVar = this.f542050a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
