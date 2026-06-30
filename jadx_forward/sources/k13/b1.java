package k13;

/* loaded from: classes10.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384729e;

    public b1(k13.l1 l1Var, java.lang.String str) {
        this.f384728d = l1Var;
        this.f384729e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k13.l1.d(this.f384728d, this.f384729e);
    }
}
