package q10;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f441033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f441035f;

    public c(boolean z17, java.lang.String str, yz5.p pVar) {
        this.f441033d = z17;
        this.f441034e = str;
        this.f441035f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ku5.t0) ku5.t0.f394148d).B(new q10.b(this.f441033d, this.f441034e, this.f441035f));
    }
}
