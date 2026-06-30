package fq1;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f347036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f347037e;

    public c(int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039) {
        this.f347036d = i17;
        this.f347037e = c22624x85d69039;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fq1.e eVar = fq1.e.f347040a;
        int width = this.f347037e.getWidth();
        fq1.e.f347041b.put(java.lang.Integer.valueOf(this.f347036d), java.lang.Integer.valueOf(width));
    }
}
