package aw2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14754e;

    public i(aw2.n nVar, java.lang.String str) {
        this.f14753d = nVar;
        this.f14754e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14753d.a(this.f14754e, false);
    }
}
