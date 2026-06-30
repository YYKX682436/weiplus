package of1;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426541f;

    public t0(of1.v0 v0Var, int i17, java.lang.String str) {
        this.f426539d = v0Var;
        this.f426540e = i17;
        this.f426541f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f426540e;
        of1.v0 v0Var = this.f426539d;
        try {
            v0Var.z0(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.D1(), "stubCallback.setFontSizeCb(" + this.f426541f + '(' + i17 + ")), exception:" + e17);
        }
    }
}
