package a31;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f964g;

    public k(a31.m mVar, java.lang.CharSequence charSequence, int i17, int i18) {
        this.f961d = mVar;
        this.f962e = charSequence;
        this.f963f = i17;
        this.f964g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f961d.k(this.f962e, this.f963f, this.f964g);
    }
}
