package a31;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f82494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f82495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82497g;

    public k(a31.m mVar, java.lang.CharSequence charSequence, int i17, int i18) {
        this.f82494d = mVar;
        this.f82495e = charSequence;
        this.f82496f = i17;
        this.f82497g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f82494d.k(this.f82495e, this.f82496f, this.f82497g);
    }
}
