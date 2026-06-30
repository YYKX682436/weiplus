package cm1;

/* loaded from: classes14.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43315e;

    public r(int i17, java.lang.String str) {
        this.f43314d = i17;
        this.f43315e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cm1.t.f43316a.f(new cm1.q(this.f43314d, this.f43315e));
    }
}
