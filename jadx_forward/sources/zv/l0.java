package zv;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f557553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f557554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557555g;

    public l0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f557552d = str;
        this.f557553e = i17;
        this.f557554f = i18;
        this.f557555g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
            zv.m0.f557562a.e(this.f557552d, this.f557553e, this.f557554f, this.f557555g);
        }
    }
}
