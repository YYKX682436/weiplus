package ea3;

/* loaded from: classes10.dex */
public class v implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332210a;

    public v(ea3.p pVar) {
        this.f332210a = pVar;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public void mo14305x341c20(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.STORAGE;
        ea3.p pVar = this.f332210a;
        if (!booleanValue) {
            pVar.getClass();
            if (g0Var.f308725d == g0Var.f308725d) {
                pVar.p(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        pVar.getClass();
        if (g0Var.f308725d == g0Var.f308725d) {
            pVar.f332188n = false;
            if (pVar.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: hadMediaStorage");
                pVar.o();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: not hadMediaStorage");
                pVar.p(java.lang.Boolean.TRUE);
            }
        }
    }
}
