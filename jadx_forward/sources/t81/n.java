package t81;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f497902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t81.s f497903e;

    public n(java.util.List list, t81.s sVar) {
        this.f497902d = list;
        this.f497903e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f497902d) {
            if (!(str == null || str.length() == 0)) {
                this.f497903e.d(str);
            }
        }
    }
}
