package yg;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f543643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543644f;

    public n(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, int i17, boolean z17) {
        this.f543644f = abstractC4208x204d5c83;
        this.f543642d = i17;
        this.f543643e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = this.f543644f.getF130123n().m34847xff3f9123(this.f543642d);
        if (m34847xff3f9123 != null) {
            m34847xff3f9123.m34868x1c0e5b23(!this.f543643e);
        }
    }
}
