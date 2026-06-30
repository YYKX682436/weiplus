package lt3;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f402728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f402729g;

    public a(int i17, java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        this.f402726d = i17;
        this.f402727e = str;
        this.f402728f = z17;
        this.f402729g = c16991x15ced046;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f402742a;
        java.util.Set set = (java.util.Set) lt3.e.f402743b.get(this.f402726d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).a(this.f402727e, this.f402728f, this.f402729g);
            }
        }
    }
}
