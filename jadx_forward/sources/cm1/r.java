package cm1;

/* loaded from: classes14.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124848e;

    public r(int i17, java.lang.String str) {
        this.f124847d = i17;
        this.f124848e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cm1.t.f124849a.f(new cm1.q(this.f124847d, this.f124848e));
    }
}
