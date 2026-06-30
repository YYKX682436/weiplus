package ki;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f389629d;

    public g(int i17) {
        this.f389629d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTrimMemory: ");
        int i17 = this.f389629d;
        sb6.append(i17);
        oj.j.b("Matrix.TrimMemoryNotifier", sb6.toString(), new java.lang.Object[0]);
        ki.i iVar = ki.i.f389634c;
        ki.i.a(iVar, ki.i.f389632a, i17);
        ki.i.a(iVar, ki.i.f389633b, i17);
    }
}
