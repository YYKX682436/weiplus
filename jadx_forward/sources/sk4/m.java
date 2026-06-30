package sk4;

/* loaded from: classes15.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm4.y0 f490517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490518e;

    public m(jm4.y0 y0Var, sk4.p pVar) {
        this.f490517d = y0Var;
        this.f490518e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeListener ");
        jm4.y0 y0Var = this.f490517d;
        sb6.append(y0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", sb6.toString());
        this.f490518e.f490529n.remove(new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(y0Var));
    }
}
