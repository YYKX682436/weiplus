package iz3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f377598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377599e;

    public a(long j17, java.lang.String str) {
        this.f377598d = j17;
        this.f377599e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz3.f.f377609b.put(java.lang.Long.valueOf(this.f377598d), this.f377599e);
    }
}
