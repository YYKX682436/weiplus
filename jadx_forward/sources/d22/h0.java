package d22;

/* loaded from: classes12.dex */
public final class h0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f307378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307379b;

    public h0(d22.k0 k0Var, android.content.Context context) {
        this.f307378a = k0Var;
        this.f307379b = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        d22.k0 k0Var = this.f307378a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f307386j, "OpenLiteApp expose fail");
        k0Var.a(this.f307379b);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f307378a.f307386j, "OpenLiteApp expose success");
    }
}
