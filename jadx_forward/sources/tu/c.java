package tu;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f503589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f503590g;

    public c(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.app.Dialog dialog) {
        this.f503587d = str;
        this.f503588e = str2;
        this.f503589f = f9Var;
        this.f503590g = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bt3.g2.M(this.f503587d, this.f503588e, this.f503589f, false);
        ((ku5.t0) ku5.t0.f394148d).B(new tu.b(this.f503590g));
    }
}
