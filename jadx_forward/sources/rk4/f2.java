package rk4;

/* loaded from: classes11.dex */
public final class f2 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f478173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478176d;

    public f2(boolean z17, rk4.l3 l3Var, java.lang.String str, java.lang.String str2) {
        this.f478173a = z17;
        this.f478174b = l3Var;
        this.f478175c = str;
        this.f478176d = str2;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "launchApplicationWithUrl onLaunchApp launchSuccess: " + z17 + ", launchCancel: " + z18);
        if (z18 || z17) {
            return;
        }
        boolean z19 = this.f478173a;
        rk4.l3 l3Var = this.f478174b;
        if (z19) {
            l3Var.mo92907x301b9a2c(this.f478175c);
        } else {
            l3Var.mo92906x31154900(this.f478176d, -1L);
        }
    }
}
