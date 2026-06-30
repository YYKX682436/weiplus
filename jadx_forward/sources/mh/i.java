package mh;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f407800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f407801e;

    public i(java.lang.String str, long j17, java.lang.Class cls) {
        this.f407800d = j17;
        this.f407801e = cls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "accStatsDecodeCost", null, null, java.lang.String.valueOf(this.f407800d), this.f407801e.getSimpleName());
    }
}
