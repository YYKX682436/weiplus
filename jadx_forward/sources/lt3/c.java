package lt3;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402736f;

    public c(int i17, java.lang.String str, int i18) {
        this.f402734d = i17;
        this.f402735e = str;
        this.f402736f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f402742a;
        java.util.Set set = (java.util.Set) lt3.e.f402743b.get(this.f402734d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).d(this.f402735e, this.f402736f);
            }
        }
    }
}
