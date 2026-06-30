package cw2;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f305309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f305310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f305311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305312g;

    public j(cw2.o oVar, double d17, boolean z17, int i17) {
        this.f305309d = oVar;
        this.f305310e = d17;
        this.f305311f = z17;
        this.f305312g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy*/.r(this.f305310e, this.f305311f, this.f305312g);
    }
}
