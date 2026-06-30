package lt3;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402732e;

    public b(int i17, java.lang.String str) {
        this.f402731d = i17;
        this.f402732e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f402742a;
        java.util.Set set = (java.util.Set) lt3.e.f402743b.get(this.f402731d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).b(this.f402732e);
            }
        }
    }
}
