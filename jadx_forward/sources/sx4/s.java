package sx4;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.s3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.t f495189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sx4.t tVar, sx4.r rVar) {
        super(tVar);
        this.f495189e = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.s3, android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebViewClient", "onServiceConnected");
        sx4.t tVar = this.f495189e;
        if (tVar.f269082b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameFloatWebViewClient", "onServiceConnected, activity destroyed");
            return;
        }
        try {
            tVar.f269084d = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t0.d(iBinder);
            tVar.f269084d.rg(tVar.B, tVar.f269082b.hashCode());
            tVar.J();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = tVar.f269084d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = tVar.f269085e;
            ((sx4.p) tVar).C.f495175f = v0Var;
            tVar.L();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameFloatWebViewClient", "addCallback fail, ex = %s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.s3, android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        super.onServiceDisconnected(componentName);
    }
}
