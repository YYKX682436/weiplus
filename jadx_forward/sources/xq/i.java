package xq;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f537513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq.m f537514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f537515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f537516g;

    public i(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, xq.m mVar, int i17, int i18) {
        this.f537513d = c22624x85d69039;
        this.f537514e = mVar;
        this.f537515f = i17;
        this.f537516g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = xq.b.f537503a;
        android.graphics.RectF a17 = xq.a.f537502a.a(this.f537513d);
        xq.m mVar = this.f537514e;
        mVar.f537531j.set(a17);
        mVar.d(a17.centerX() + this.f537515f + r1.getPaddingLeft(), a17.centerY() + this.f537516g + r1.getPaddingTop(), (int) a17.width());
    }
}
