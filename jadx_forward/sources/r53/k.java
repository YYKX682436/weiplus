package r53;

/* loaded from: classes8.dex */
public class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f474206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f474208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f474209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474211f;

    public k(android.os.Bundle bundle, android.content.Context context, q80.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, int i17, java.lang.String str) {
        this.f474206a = bundle;
        this.f474207b = context;
        this.f474208c = f0Var;
        this.f474209d = c15780xf49d6a1c;
        this.f474210e = i17;
        this.f474211f = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, openLiteApp failed ");
        q80.f0 f0Var = this.f474208c;
        if (f0Var != null) {
            f0Var.mo555x2fd71e();
        }
        r53.f.x(this.f474207b, this.f474209d, this.f474210e, this.f474211f);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, openLiteApp success ");
        android.os.Bundle bundle = this.f474206a;
        java.lang.String string = bundle.getString("pageOrientation");
        if (bundle.getBoolean("isHalfScreen") && "portrait".equals(string)) {
            android.content.Context context = this.f474207b;
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "gamelog.util, halfScreen forcePortrait");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).setRequestedOrientation(1);
            }
        }
        q80.f0 f0Var = this.f474208c;
        if (f0Var != null) {
            f0Var.mo556x90b54003();
        }
    }
}
