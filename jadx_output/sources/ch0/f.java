package ch0;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch0.h f41201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41202e;

    public f(ch0.h hVar, boolean z17) {
        this.f41201d = hVar;
        this.f41202e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41201d.g(this.f41202e ? 8 : 0);
    }
}
