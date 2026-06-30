package vd2;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.u0 f517432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517433e;

    public s0(vd2.u0 u0Var, java.lang.String str) {
        this.f517432d = u0Var;
        this.f517433e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517432d.f517459d, "tryGetTipsBarStorage chatroomId:" + this.f517433e);
        rl2.v wi6 = this.f517432d.wi();
        if ((wi6 != null ? wi6.D0(this.f517433e) : 0) != 0) {
            ((ku5.t0) ku5.t0.f394148d).A(this.f517432d.f517461f);
            rl2.v wi7 = this.f517432d.wi();
            if (wi7 != null) {
                wi7.J0(this.f517433e);
            }
        }
    }
}
