package of1;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f426535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f426536h;

    public s0(of1.v0 v0Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f426532d = v0Var;
        this.f426533e = str;
        this.f426534f = str2;
        this.f426535g = bundle;
        this.f426536h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f426533e;
        of1.v0 v0Var = this.f426532d;
        try {
            v0Var.g0().O(str, this.f426534f, nw4.a.a(this.f426535g), this.f426536h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.D1(), "stubCallback.onHandleEnd(), callbackId:" + str + ", exception:" + e17);
        }
    }
}
