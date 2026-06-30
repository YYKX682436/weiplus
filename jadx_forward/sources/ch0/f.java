package ch0;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch0.h f122734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f122735e;

    public f(ch0.h hVar, boolean z17) {
        this.f122734d = hVar;
        this.f122735e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f122734d.g(this.f122735e ? 8 : 0);
    }
}
