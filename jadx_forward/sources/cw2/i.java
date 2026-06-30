package cw2;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f305291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f305292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f305293f;

    public i(cw2.o oVar, double d17, boolean z17) {
        this.f305291d = oVar;
        this.f305292e = d17;
        this.f305293f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f305291d.r(this.f305292e, this.f305293f, 1);
    }
}
